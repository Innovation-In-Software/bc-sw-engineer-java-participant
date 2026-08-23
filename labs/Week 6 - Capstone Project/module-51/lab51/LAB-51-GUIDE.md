# Lab 51: Capstone Security, CI/CD, and Deployment — Northstar CRM Release Gate

**Module:** 51 — Capstone Security, CI/CD, and Deployment  
**Duration:** ~45 minutes (session block with starter) · Full path: 6–8 Hours (multi-day)

**Primary IDE:** IntelliJ IDEA Community Edition · **Optional IDE:** VS Code

| OS | How-to for this lab |
| -- | ------------------- |
| Windows | [LAB-51-WINDOWS.md](LAB-51-WINDOWS.md) |
| macOS | [LAB-51-MACOS.md](LAB-51-MACOS.md) |

> **Two folders (do not mix):** [Clone the course repo · Commit in your own repo](../../../CLONE-AND-OWN-REPO-GUIDE.md). Read this GUIDE in the **course clone**. Write in **your** `java-bootcamp` repo.

---

## Activity card

| | |
| --- | --- |
| **Time** | ~45 min session · full path 6–8 h |
| **Checkpoint** | **E** (after Ex **1 → 2 → 3 → 4 → 5 → 6**) |
| **Must prove** | Security checklist · Dockerfile TODOs · k8s probes · 401/403 matrix · rollback digest note |
| **Hard gate** | Pre-lab Pass · no secrets in Git · Labs 48–50 tree still intact |

### What you will learn

Make CRM releasable: JWT/RBAC (full path), gated CI, digest-pinned **k3s** deploy, smoke, rollback.

### Enterprise context

Feature-complete without access control, provenance, and recovery is not release-complete.

### Predict

Should `:latest` be the only image identity in evidence?

### Debug

Copied starter `*` over Lab 48–50, used Lab 42 **k3d**, or invented `ghcr.io/…@sha256` as if it replaced Lab 44 **`jarSha256`**?

---

## Two folders

| Folder | You… |
| ------ | ---- |
| Course clone | Read GUIDE / starter |
| `java-bootcamp` | Merge **Dockerfile, k8s/, CI, checklist** into `examples/customer-management-platform/` |

| Item | Course clone | `java-bootcamp` |
| ---- | ------------ | --------------- |
| Starter | `lab51/starter/` (Dockerfile, `k8s/`, `.github/workflows/ci.yml`, `docs/security-deploy-checklist.md`) | same paths under the platform tree |
| Lab 48–50 work | — | **Keep** ADRs, `backend/`, `db/`, frontend if present |

**Do not** `Copy-Item starter\*` over the platform root (that overwrites Lab 48 README/ADRs and can clobber `backend/`). **Do not** `./mvnw`. **Do not** treat Lab 42 **k3d** `lab42` / Host `:8088` as this lab’s cluster.

**Contracts (must match Labs 49–50):**

| Topic | Use | Do not use |
| ----- | --- | ---------- |
| Primary smoke API | `POST /api/v1/interactions` | Invent `GET /api/customers/{id}` as a Week 5 route |
| Anonymous | 401 without Bearer (full path) | Session JWT required |
| Image identity | Pipeline digest **and** Lab 44 **`jarSha256`** | Invented GHCR digest as the only identity |
| Cluster | Training **k3s** (full path) | Defaulting to Lab 42 k3d |

**Session starter has no Spring Security code.** JWT tests, live `kubectl apply`, and image push are **full path**. Session dry-run / `Test-Path` is enough for the block.

**Maven:** `mvn` from `backend/`. Dockerfile installs Maven in the build stage — that is fine; still no wrapper in student commands.

---

## 45-minute session block

1. Open [`starter/README.md`](starter/README.md) in the **course clone**.
2. Copy **Dockerfile**, **`k8s/`**, **`.github/workflows/ci.yml`**, **`docs/security-deploy-checklist.md`** into the platform tree.
3. Fill checklist + Dockerfile/k8s TODOs. Live cluster is **not** required today.
4. Smoke with `Test-Path` / `Select-String` (optional `docker build` / `kubectl --dry-run=client`).
5. Mark session Pass criteria.

| Path | Scope |
| ---- | ----- |
| **Session** | Checklist + Dockerfile TODOs + k8s probes + 401/403 matrix + rollback digest placeholder |
| **Full** | JWT resource server · GH Actions verify+image · scans · k3s digest pin · smoke · rollback · `docs/security-deploy-demo.md` |

---

## What you'll submit

| # | Deliverable | Session | Full |
| - | ----------- | ------- | ---- |
| 1 | `docs/security-deploy-checklist.md` | Required | Required |
| 2 | Dockerfile (multi-stage, non-root TODO) | TODOs filled or tracked | Built image + digest |
| 3 | `k8s/deployment.yaml` probes | TODOs filled | Applied on k3s |
| 4 | `.github/workflows/ci.yml` | Copied / sketched | Green verify (+ image on `main`) |
| 5 | JWT/RBAC + authz tests | Matrix notes | Required |
| 6 | Digest + rollback note | Placeholder OK | Rehearsed |
| 7 | `docs/security-deploy-demo.md` | Outline | Commands + sanitized evidence |
| 8 | Secrets in Git | Must be **none** | Must be **none** |

---

## Lab Overview

Session: freeze the release gate on paper + stubs. Full path: deny-by-default JWT, one verified artifact, digest-pinned k3s, 401/403/201 smoke, rollback.

## Prerequisites

Labs 48–50 in `examples/customer-management-platform`. Docker/k3s/`kubectl` only on the **full** path.

### Pre-flight

```powershell
Test-Path "$env:USERPROFILE\java-bootcamp\examples\customer-management-platform\backend\pom.xml"
```

## Worked example (session)

```powershell
Select-String -Path Dockerfile -Pattern 'USER|HEALTHCHECK|FROM eclipse-temurin'
Select-String -Path k8s\deployment.yaml -Pattern 'readinessProbe|livenessProbe|sha256'
```

Full-path authz idea (adapt to **your** routes — Lab 49 session is create-only):

```java
@Test
void anonymousCreateUnauthorized() throws Exception {
  mvc.perform(post("/api/v1/interactions")
          .contentType(MediaType.APPLICATION_JSON)
          .content("{\"customerId\":\"CUS-1001\",\"interactionType\":\"NOTE\",\"summary\":\"x\"}"))
      .andExpect(status().isUnauthorized());
}
```

Do **not** copy a `DELETE /api/v1/customers/{id}` test unless you actually added that endpoint. 403 needs a **MANAGER-only** matcher you document (often a method you add in this lab).

---

## Implementation Steps

### Step 1 — Merge starter, threat-model the release

```powershell
$jb = "$env:USERPROFILE\java-bootcamp"
$course = "$env:USERPROFILE\bc-sw-engineer-java-participant\labs\Week 6 - Capstone Project\module-51\lab51"
$dest = "$jb\examples\customer-management-platform"

New-Item -ItemType Directory -Force -Path "$dest\docs","$dest\k8s","$dest\.github\workflows","$jb\notes\screenshots\lab-51" | Out-Null
Copy-Item -Force "$course\starter\Dockerfile" "$dest\Dockerfile"
Copy-Item -Force "$course\starter\k8s\*" "$dest\k8s\"
Copy-Item -Force "$course\starter\.github\workflows\ci.yml" "$dest\.github\workflows\ci.yml"
Copy-Item -Force "$course\starter\docs\security-deploy-checklist.md" "$dest\docs\security-deploy-checklist.md"
```

Fill checklist threat rows. Full path: add `docs/threat-model.md` (tokens, customer records, events, admin; JWT theft; secret in image; `:latest` only).

### Step 2 — Secure HTTP endpoints (full path)

OAuth2 resource server JWT; deny by default; permit actuator **health** only.

| Call | Expect |
| ---- | ------ |
| `POST /api/v1/interactions` no token | **401** |
| AGENT `POST /api/v1/interactions` | **201** (same body as Lab 49) |
| Wrong role on a MANAGER-only route | **403** |
| `GET /api/customers/{id}` | **Not** a Week 5 route — do not fail smoke on it |

Anonymous `/api/customers` (Week 5 list) may 401 after you protect `/api/**` — that is fine. Do not claim a per-id GET existed before.

### Step 3 — Harden application (full path)

CORS allowlist; redact Authorization from logs; do **not** `management.endpoints.web.exposure.include=*`; document CSRF-off for bearer APIs.

### Step 4 — Run security gates (full path)

`mvn -B verify` from `backend/`. Scans (Trivy, gitleaks, Dependency-Check) are optional unless your instructor requires them — document exceptions with owner + expiry.

### Step 5 — Build and publish once (full path)

```powershell
docker build -t "crm-api:$VERSION-$GIT_SHA" .
docker image inspect "crm-api:$VERSION-$GIT_SHA" --format='{{index .RepoDigests 0}}'
```

Record **digest**. Registry may be training GHCR **or** local-only — do **not** invent `ghcr.io/you@sha256:…` if you never pushed. Keep Lab 44 **`jarSha256`** as the JAR identity.

### Step 6 — Delivery pipeline

Starter CI: job **`verify`** (`mvn -B clean verify` in `backend/`) and **`image`** (`docker build -t crm-api:${GITHUB_SHA} .` from **platform root** on `main`). No secrets in YAML.

### Step 7 — Deploy and verify (full path, k3s)

Pin `image: …@sha256:…`. Probes on `/actuator/health/readiness` and `/liveness` port **8080** (cluster Service, not Lab 42 `:8088`).

Windows smoke when the API is reachable:

```powershell
curl.exe -sS -o NUL -w "%{http_code}" "$env:CRM_URL/api/v1/interactions"
# expect 401
curl.exe -sS -o NUL -w "%{http_code}" -X POST "$env:CRM_URL/api/v1/interactions" `
  -H "Authorization: Bearer $env:SMOKE_TOKEN" `
  -H "Content-Type: application/json" `
  -H "X-Correlation-ID: release-smoke-001" `
  -d "{\"customerId\":\"CUS-1001\",\"interactionType\":\"NOTE\",\"summary\":\"Lab 51 smoke\",\"correlationId\":\"lab-request-001\"}"
# expect 201 when JWT + seed customer exist
```

Redact tokens in screenshots.

### Step 8 — Prove recovery

Redeploy previous digest (`kubectl rollout undo` or `kubectl set image …@sha256:…`). Document forward-only Flyway if rollback cannot reverse SQL.

### Step 9 — Evidence

`docs/security-deploy-demo.md`: tag, digest, `jarSha256`, pipeline id, smoke, rollback. `git status` on **java-bootcamp**. No kubeconfig / `.env` committed.

---

## Checkpoints

**Session:** checklist filled; Dockerfile non-root TODO tracked; probes in YAML; 401/403 matrix written; Lab 48–50 files intact; no secrets.

**Full:** JWT tests green; digest-pinned k3s; 401 + authenticated POST; rollback rehearsal; sanitized demo.md.

---

## Failure Experiments

| # | Experiment | Fix |
| - | ---------- | --- |
| 1 | `Copy-Item starter\*` | Copy the four paths only |
| 2 | `./mvnw` | `mvn` from `backend/` |
| 3 | k3d / `:8088` as capstone | Lab 51 is **k3s**; Service port 8080 |
| 4 | Invented GHCR digest | Record a digest you actually built; keep **`jarSha256`** |
| 5 | Smoke `GET /api/customers/CUS-1001` | Use **POST** `/api/v1/interactions` |
| 6 | `:latest` only | Pin digest |
| 7 | Secret in Dockerfile | `secretRef` name only |

---

## Troubleshooting

| Symptom | Fix |
| ------- | --- |
| Overwrote ADRs / backend | Copy specific files only |
| 401 with “valid” token | Issuer/JWKS mismatch |
| ImagePullBackOff | Wrong digest / missing pull secret |
| Probe never ready | Path/port vs actuator |
| Work in `labs/` | `java-bootcamp` |
| Session `kubectl apply` fails | Dry-run is enough today |

---

## Cleanup

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\customer-management-platform
git status --short
```

Keep pipeline, manifests, digest notes. Lab 52 defense uses them.

---

## Reflection

1. What proves the running bits are the intended digest?
2. Why is anonymous **401** different from wrong-role **403**?
3. What must not appear in Git or CI logs?
