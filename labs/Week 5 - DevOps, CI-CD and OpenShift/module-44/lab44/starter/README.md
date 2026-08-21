# Lab 44 starter — timed path (~45 minutes)

**Theme:** Continuous delivery — promote Lab 43 identity, gates, rollback

## Two folders

| Folder | You… |
| ------ | ---- |
| **Course clone** (this `starter/` directory) | Read / copy **from** here |
| **`java-bootcamp`** | Copy **Lab 43** to `examples/lab44-crm`, copy docs here, copy the workflow to the **git root**, commit, push |

Do **not** grade work inside the course `labs/` tree. IntelliJ stays on `java-bootcamp`. Starter is **docs + YAML**, not a Spring app by itself. **Do not copy Lab 42** (YAML only). Copy **Lab 43**, which already is the Lab 41 CRM.

## Activity card

| | |
| --- | --- |
| **Checkpoint** | **E** |
| **Must prove** | `jarSha256` from Lab 43 · plan/checklist · rollback known-good · no secrets · root `crm-cd.yml` |
| **Hard gate** | Pre-lab Pass · Lab 43 `crm-jar` / `SHA256SUMS` · no rebuild on promote |

## Copy into your workspace

**Windows (PowerShell):**

```powershell
$jb = "$env:USERPROFILE\java-bootcamp"
$courseLab44 = "$env:USERPROFILE\bc-sw-engineer-java-participant\labs\Week 5 - DevOps, CI-CD and OpenShift\module-44\lab44"

Copy-Item -Recurse -Force "$jb\examples\lab43-crm" "$jb\examples\lab44-crm"
New-Item -ItemType Directory -Force -Path "$jb\examples\lab44-crm\docs","$jb\.github\workflows" | Out-Null
Copy-Item -Force "$courseLab44\starter\docs\*" "$jb\examples\lab44-crm\docs\"
Copy-Item -Force "$courseLab44\starter\artifact-manifest.json" "$jb\examples\lab44-crm\"
Copy-Item -Force "$courseLab44\starter\.github\workflows\cd.yml" "$jb\.github\workflows\crm-cd.yml"
cd "$jb\examples\lab44-crm"
```

**macOS / Linux:**

```bash
JB=~/java-bootcamp
COURSE_LAB44=~/bc-sw-engineer-java-participant/labs/Week\ 5\ -\ DevOps,\ CI-CD\ and\ OpenShift/module-44/lab44

cp -R "$JB/examples/lab43-crm" "$JB/examples/lab44-crm"
mkdir -p "$JB/examples/lab44-crm/docs" "$JB/.github/workflows"
cp "$COURSE_LAB44/starter/docs/"* "$JB/examples/lab44-crm/docs/"
cp "$COURSE_LAB44/starter/artifact-manifest.json" "$JB/examples/lab44-crm/"
cp "$COURSE_LAB44/starter/.github/workflows/cd.yml" "$JB/.github/workflows/crm-cd.yml"
cd "$JB/examples/lab44-crm"
```

Then fill the manifest from Lab 43 `SHA256SUMS`. See [LAB-44-GUIDE.md](../LAB-44-GUIDE.md) Step 1–2.

## 45-minute checklist

- [ ] Work is in `java-bootcamp/examples/lab44-crm` (Lab 43 copy, not course `labs/`)
- [ ] Workflow installed at **`java-bootcamp/.github/workflows/crm-cd.yml`** (not nested under `examples/`)
- [ ] `artifact-manifest.json` has real `jarSha256` + `gitCommit` (image digest optional / null)
- [ ] `docs/release-plan.md`, `release-checklist.md`, `rollback-runbook.md` filled
- [ ] CD YAML has **no** `mvn` / `./mvnw` and **no** plaintext secrets

## Smoke test

From **`java-bootcamp`**:

```powershell
Get-Content examples\lab44-crm\artifact-manifest.json | ConvertFrom-Json | Out-Null
# Optional: download Lab 43 bits (do not Maven)
# gh run download <LAB43_RUN_ID> -n crm-jar -D dist\
```

Then push **your** `java-bootcamp` remote. Confirm Actions lists **CRM CD** (it runs on `workflow_dispatch` — starting a run is homework, not required for timed Pass).

Evidence under `~/java-bootcamp/notes/screenshots/lab-44/` (redact tokens).

## Timed-path Pass criteria

| Criterion | Pass / Fail |
| --------- | ----------- |
| Work is in `java-bootcamp/examples/lab44-crm` | Pass / Fail |
| `crm-cd.yml` is at the git root | Pass / Fail |
| Manifest `jarSha256` is from Lab 43, not a local rebuild | Pass / Fail |
| Rollback names a prior known-good SHA / Image Id | Pass / Fail |
| CD YAML has no secrets and no Maven | Pass / Fail |

Continue remaining GUIDE steps as homework / full path if needed (live `gh run download`, optional k3d Host-header **`GET /api/customers`**).

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Invalid JSON manifest | Fix commas/quotes; `ConvertFrom-Json` |
| Only `:latest` or a fake GHCR digest | Paste Lab 43 `SHA256SUMS`; leave image null |
| Nested `cd.yml` only | Copy to **repo root** `crm-cd.yml` |
| Copied starter only | Copy **Lab 43** first |
| Secrets in `crm-cd.yml` | GitHub Environments / secret **names** only |
| `mvn package` to “match” staging | Stop; download `crm-jar` |
