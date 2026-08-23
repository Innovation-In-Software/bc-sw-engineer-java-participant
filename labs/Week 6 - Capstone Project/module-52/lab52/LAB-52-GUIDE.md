# Lab 52: Capstone Final Defense — Northstar CRM Presentation and Technical Defense

**Module:** 52 — Capstone Final Defense  
**Duration:** ~45 minutes (session block with starter) · Full path: 5–6 Hours (multi-day)

**Primary IDE:** IntelliJ IDEA Community Edition · **Optional IDE:** VS Code

| OS | How-to for this lab |
| -- | ------------------- |
| Windows | [LAB-52-WINDOWS.md](LAB-52-WINDOWS.md) |
| macOS | [LAB-52-MACOS.md](LAB-52-MACOS.md) |

> **Two folders (do not mix):** [Clone the course repo · Commit in your own repo](../../../CLONE-AND-OWN-REPO-GUIDE.md). Read this GUIDE in the **course clone**. Write in **your** `java-bootcamp` repo.

---

## Activity card

| | |
| --- | --- |
| **Time** | ~45 min session · full path 5–6 h |
| **Checkpoint** | **E** (after Ex **1 → 2 → 3 → 4 → 5 → 6**) |
| **Must prove** | Slide outline · timed demo script · ≥5 evidence links · deny/fallback beat |
| **Hard gate** | Pre-lab Pass · Labs 48–51 paths listed (**gaps labeled**, not invented) |

### What you will learn

Deliver an evidence-backed CRM defense: narrative, timed demo, Q&A, blameless retro, completion self-check.

### Enterprise context

A lucky happy-path click-through without an evidence index fails professional defense.

### Predict

Panel disputes a security claim — what do you open first?

### Debug

Copied starter `*` over Lab 48–51, or demo curl used `channel` / `POST /api/customers/{id}/interactions`?

---

## Two folders

| Folder | You… |
| ------ | ---- |
| Course clone | Read GUIDE / starter |
| `java-bootcamp` | Merge **`defense/`** into `examples/customer-management-platform/` |

| Item | Course clone | `java-bootcamp` |
| ---- | ------------ | --------------- |
| Starter | `lab52/starter/defense/` | `defense/` under the platform tree |
| Labs 48–51 | — | **Keep** ADRs, `backend/`, SQL, Dockerfile — do not overwrite |

**Do not** `Copy-Item starter\*` over the platform root (starter `README.md` would replace Lab 48 README). Copy **`defense/`** only. **Do not** `./mvnw`. **Do not** `mvn` as the session smoke. **Do not** add new product scope this week.

**Contracts (must match Labs 48–51):**

| Topic | Use | Do not use |
| ----- | --- | ---------- |
| Create API | `POST /api/v1/interactions` | `POST /api/customers/{id}/interactions` |
| Body | `interactionType` CALL/EMAIL/NOTE/MEETING | `channel` / CHAT |
| Customer id | String `CUS-1001` | Week 5 `GET /api/customers/{id}` as if it existed |
| Kafka topic | Lab 49 ADR (e.g. `crm.customer.interactions.v1`) | Invent `crm.customer.events`; Lab 46 was a different CRM |
| Release identity | Lab 51 digest **and** Lab 44 **`jarSha256`** | Invented GHCR digest |
| Cluster | **k3s** if you deployed | Lab 42 k3d `:8088` as “the” capstone cluster |
| JWT 401 | Only if Lab 51 JWT is on | Pretend 401 on the unsecured Lab 49 session stub |

Label **non-claims**: no React (session 50), in-memory repo (session 49), no JWT (session 51), Kafka log stub, no live k3s.

---

## 45-minute session block

1. Open [`starter/README.md`](starter/README.md) in the **course clone**.
2. Copy **`defense/`** into the platform tree.
3. Fill outline, timed demo (Amina + `lab-request-001`), ≥5 evidence rows, deny/fallback.
4. Smoke with `Test-Path` / `Get-ChildItem` — not Maven.
5. Mark session Pass criteria.

| Path | Scope |
| ---- | ----- |
| **Session** | Outline + demo script + ≥5 evidence + deny/fallback |
| **Full** | PDF export · ≥10 Q&A · retro · self-assessment · panel · scrubbed archive |

---

## What you'll submit

| # | Deliverable | Session | Full |
| - | ----------- | ------- | ---- |
| 1 | `defense/slide-outline.md` | Required | Required |
| 2 | `defense/demo-script.md` | Required | Required |
| 3 | `defense/evidence-index.md` (≥5 real paths) | Required | Required |
| 4 | `defense/technical-q-and-a.md` | ≥3 cards | ≥10 cards |
| 5 | `defense/retrospective.md` | Outline OK | Owned actions |
| 6 | `defense/self-assessment.md` | Outline OK | Linked scores |
| 7 | `defense/final-presentation.pdf` | No | Required (or instructor format) |
| 8 | Secrets in pack | Must be **none** | Must be **none** |

---

## Lab Overview

Session: freeze the story + evidence map. Full path: rehearse, deliver, retro, archive.

## Prerequisites

Labs 48–51 artifacts in the same platform tree (or honest gaps). Presentation tooling on the **full** path.

### Pre-flight

```powershell
Test-Path "$env:USERPROFILE\java-bootcamp\examples\customer-management-platform\docs"
```

## Worked example (session)

```powershell
Get-ChildItem defense\*.md
Select-String -Path defense\demo-script.md,defense\evidence-index.md -Pattern 'CUS-1001|lab-request-001|POST /api/v1/interactions'
```

Demo curl (when API is up — **Lab 49 body**). Session Lab 49 has **no** JWT — omit Bearer unless Lab 51 is wired:

```powershell
curl.exe -sS -X POST http://localhost:8080/api/v1/interactions `
  -H "Content-Type: application/json" `
  -H "X-Correlation-ID: lab-request-001" `
  -d "{\"customerId\":\"CUS-1001\",\"interactionType\":\"NOTE\",\"summary\":\"Defense demo note\",\"correlationId\":\"lab-request-001\"}"
```

401 beat (only after Lab 51 JWT):

```powershell
curl.exe -sS -o NUL -w "%{http_code}" -X POST http://localhost:8080/api/v1/interactions -H "Content-Type: application/json" -d "{}"
```

SQL (if Flyway applied):

```sql
SELECT id, customer_id, interaction_type, correlation_id
FROM customer_interaction
WHERE customer_id = 'CUS-1001' AND correlation_id = 'lab-request-001';
```

Use `crm.customer_interaction` if that is your schema. No `jq` required.

---

## Implementation Steps

### Step 1 — Merge `defense/`, inventory evidence

```powershell
$jb = "$env:USERPROFILE\java-bootcamp"
$course = "$env:USERPROFILE\bc-sw-engineer-java-participant\labs\Week 6 - Capstone Project\module-52\lab52"
$dest = "$jb\examples\customer-management-platform"

New-Item -ItemType Directory -Force -Path "$dest\defense","$jb\notes\screenshots\lab-52" | Out-Null
Copy-Item -Force "$course\starter\defense\*" "$dest\defense\"
```

Fill `evidence-index.md`. Every slide claim gets a path. List **non-claims**. Do not invent a Lab 50 SQL proof or Lab 51 digest you never produced.

### Step 2 — Presentation story

Users → NFRs/ADRs → vertical slice → gates → limitations. Full path: export PDF. Session: outline titles are enough.

### Step 3 — Demo script

Speaker vs operator. Fixtures `CUS-1001` / `lab-request-001`. Create via **POST `/api/v1/interactions`**. Search/timeline: UI **or** curl + SQL if you have no React. Kafka: live topic **or** Lab 49 log stub — say which. 401/403 only if JWT exists; otherwise show Lab 51 notes or label the gap.

### Step 4 — Demo recovery

Fallback screenshots. Spoken line: switch to recorded Lab 50/51 evidence; say what it does **not** prove. No tokens on projector.

### Step 5 — Q&A cards

Claim → evidence path → trade-off → next step. Topics: JWT (if any), Kafka down (per ADR), UI→SQL, rollback digest, `jarSha256`, correlation limits, React is not the security boundary.

### Step 6 — Deliver (full path)

Timebox. Log questions in `defense/feedback-log.md`.

### Step 7 — Blameless retro (full path)

≤5 owned, measurable actions. No blame.

### Step 8 — Self-score and scrub

No JWTs, kubeconfigs, `.env`, real emails. `git status` on **java-bootcamp**.

### Step 9 — Experiments

Kill live API in rehearsal → failover. Peer-check orphan claims.

---

## Checkpoints

**Session:** outline · timed script · ≥5 real paths · deny/fallback · Lab 48–51 files intact · no secrets.

**Full:** PDF · ≥10 Q&A · retro · self-assessment · panel (or scheduled slot) · scrubbed archive.

---

## Failure Experiments

| # | Experiment | Fix |
| - | ---------- | --- |
| 1 | `Copy-Item starter\*` | Copy `defense\*` only |
| 2 | `mvn` / `./mvnw` as smoke | `Get-ChildItem defense\*.md` |
| 3 | `channel` / nested interactions URL | Lab 49 DTO + POST `/api/v1/interactions` |
| 4 | Invented digest / SQL / 401 | Label the gap or finish that lab |
| 5 | JWT on projector | Redact; rotate training token |
| 6 | Blame retro | Rewrite as system conditions |

---

## Troubleshooting

| Symptom | Fix |
| ------- | --- |
| Overwrote ADRs | Copy `defense/` only |
| Demo 404 on GET `/{id}` | Not a Week 5 route; curl POST or seed UI |
| 401 on session stub | Lab 49 has no Spring Security — drop Bearer or finish Lab 51 |
| Work in `labs/` | `java-bootcamp` |
| Kafka required live | Log stub is an honest session claim |

---

## Cleanup

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\customer-management-platform
git status --short
```

Keep sanitized `defense/`.

---

## Reflection

1. Which artifact would you open first under a disputed claim?
2. What did you **not** claim?
3. Which failover line did you rehearse?
