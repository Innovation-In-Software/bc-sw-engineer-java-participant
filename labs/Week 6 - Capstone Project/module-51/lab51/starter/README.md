# Lab 51 starter — session block (~45 minutes)

**Theme:** Security/deploy checklist + Dockerfile & k8s stubs (no JWT code in this starter)

## Two folders

| Folder | You… |
| ------ | ---- |
| Course clone (this `starter/`) | Copy **from** here |
| `java-bootcamp` | Merge **Dockerfile**, **`k8s/`**, **`.github/workflows/ci.yml`**, **`docs/security-deploy-checklist.md`** into `examples/customer-management-platform` |

**Do not** `Copy-Item starter\*` over the Lab 48–50 tree. Live k3s / JWT tests are full-path homework.

## Activity card

| | |
| --- | --- |
| **Checkpoint** | **E** |
| **Must prove** | checklist · non-root Dockerfile TODOs · probes · 401/403 matrix · rollback digest note |
| **Hard gate** | No secrets in Git · Lab 48–50 files still present |

## Copy

**Windows:**

```powershell
$jb = "$env:USERPROFILE\java-bootcamp"
$course = "$env:USERPROFILE\bc-sw-engineer-java-participant\labs\Week 6 - Capstone Project\module-51\lab51"
$dest = "$jb\examples\customer-management-platform"
New-Item -ItemType Directory -Force -Path "$dest\docs","$dest\k8s","$dest\.github\workflows","$jb\notes\screenshots\lab-51" | Out-Null
Copy-Item -Force "$course\starter\Dockerfile" "$dest\Dockerfile"
Copy-Item -Force "$course\starter\k8s\*" "$dest\k8s\"
Copy-Item -Force "$course\starter\.github\workflows\ci.yml" "$dest\.github\workflows\ci.yml"
Copy-Item -Force "$course\starter\docs\security-deploy-checklist.md" "$dest\docs\security-deploy-checklist.md"
cd $dest
```

**macOS / Linux:**

```bash
DEST=~/java-bootcamp/examples/customer-management-platform
COURSE=~/bc-sw-engineer-java-participant/labs/Week\ 6\ -\ Capstone\ Project/module-51/lab51
mkdir -p "$DEST/docs" "$DEST/k8s" "$DEST/.github/workflows"
cp "$COURSE/starter/Dockerfile" "$DEST/Dockerfile"
cp "$COURSE/starter/k8s/"* "$DEST/k8s/"
cp "$COURSE/starter/.github/workflows/ci.yml" "$DEST/.github/workflows/ci.yml"
cp "$COURSE/starter/docs/security-deploy-checklist.md" "$DEST/docs/security-deploy-checklist.md"
cd "$DEST"
```

## Session checklist

- [ ] Threat + gate rows in `docs/security-deploy-checklist.md`
- [ ] Dockerfile TODOs: non-root, multi-stage (Maven in image is OK; student commands still use `mvn`)
- [ ] k8s probes + digest placeholder (training registry — **not** a required GHCR URL)
- [ ] Smoke matrix: anonymous **POST** `/api/v1/interactions` → 401; wrong role → 403; AGENT create → 201
- [ ] Rollback: previous digest placeholder (keep Lab 44 **`jarSha256`**)

## Smoke

```powershell
Test-Path Dockerfile, k8s\deployment.yaml, .github\workflows\ci.yml, docs\security-deploy-checklist.md
Select-String -Path Dockerfile -Pattern 'USER|HEALTHCHECK|TODO'
```

Optional: `docker build -t crm-api:session-local .` (needs Lab 49 `backend/` beside this Dockerfile). Optional: `kubectl apply --dry-run=client -f k8s/deployment.yaml`.

## Pass criteria

| Criterion | Pass / Fail |
| --------- | ----------- |
| Lab 48–50 files still present | Pass / Fail |
| Checklist covers deny-by-default + secret hygiene | Pass / Fail |
| Dockerfile / k8s TODOs addressed or tracked | Pass / Fail |
| 401/403 matrix uses POST interactions (not Week 5 per-id GET) | Pass / Fail |

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Overwrote ADRs | Copy four paths only |
| `./mvnw` | `mvn` from `backend/` |
| k3d / `:8088` | Lab 51 cluster is **k3s**; probes on 8080 |
| Invented GHCR digest | Placeholder until you build; keep `jarSha256` |
| JWT required today | Park — full path |
