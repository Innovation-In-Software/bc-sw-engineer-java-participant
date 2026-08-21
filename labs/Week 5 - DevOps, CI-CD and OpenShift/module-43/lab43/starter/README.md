# Lab 43 starter — timed path (~45 minutes)

**Theme:** GitHub Actions CI — verify, reports, package-once checksum

## Two folders

| Folder | You… |
| ------ | ---- |
| **Course clone** (this `starter/` directory) | Read / copy **from** here |
| **`java-bootcamp`** | Copy **Lab 41** to `examples/lab43-crm`, copy docs here, copy the workflow to the **git root**, commit, push |

Do **not** grade work inside the course `labs/` tree. IntelliJ stays on `java-bootcamp`. Starter is **not** a Spring app. **Do not copy Lab 42** (YAML only).

## Activity card

| | |
| --- | --- |
| **Checkpoint** | **E** |
| **Must prove** | triggers · no skipTests · package SHA · secrets location in runbook |
| **Hard gate** | Pre-lab Pass · Lab 41 CRM in `java-bootcamp` · Actions enabled |

## Copy into your workspace

**Windows (PowerShell):**

```powershell
$jb = "$env:USERPROFILE\java-bootcamp"
$courseLab43 = "$env:USERPROFILE\bc-sw-engineer-java-participant\labs\Week 5 - DevOps, CI-CD and OpenShift\module-43\lab43"

Copy-Item -Recurse -Force "$jb\examples\lab41-crm" "$jb\examples\lab43-crm"
New-Item -ItemType Directory -Force -Path "$jb\examples\lab43-crm\docs","$jb\.github\workflows" | Out-Null
Copy-Item -Force "$courseLab43\starter\docs\*" "$jb\examples\lab43-crm\docs\"
Copy-Item -Force "$courseLab43\starter\.github\workflows\ci.yml" "$jb\.github\workflows\crm-ci.yml"
cd "$jb\examples\lab43-crm"
```

**macOS / Linux:**

```bash
JB=~/java-bootcamp
COURSE_LAB43=~/bc-sw-engineer-java-participant/labs/Week\ 5\ -\ DevOps,\ CI-CD\ and\ OpenShift/module-43/lab43

cp -R "$JB/examples/lab41-crm" "$JB/examples/lab43-crm"
mkdir -p "$JB/examples/lab43-crm/docs" "$JB/.github/workflows"
cp "$COURSE_LAB43/starter/docs/"* "$JB/examples/lab43-crm/docs/"
cp "$COURSE_LAB43/starter/.github/workflows/ci.yml" "$JB/.github/workflows/crm-ci.yml"
cd "$JB/examples/lab43-crm"
```

Then create database **`crm_lab43`**. See [LAB-43-GUIDE.md](../LAB-43-GUIDE.md) Step 1–2.

## 45-minute checklist

- [ ] Work is in `java-bootcamp/examples/lab43-crm` (Lab 41 copy, not course `labs/`)
- [ ] Workflow installed at **`java-bootcamp/.github/workflows/crm-ci.yml`** (not nested under `examples/`)
- [ ] `mvn -B clean verify` locally (no `mvnw`, no skipTests on verify)
- [ ] Package job gated to `main` / `v*`; artifact paths repo-relative
- [ ] Fill `docs/ci-runbook.md` (secret **names** only)

## Smoke test

From **`java-bootcamp/examples/lab43-crm`**:

```powershell
mvn -B -ntp clean verify
```

Then push **your** `java-bootcamp` remote and confirm Actions runs **CRM CI**.

Evidence under `~/java-bootcamp/notes/screenshots/lab-43/` (redact tokens).

## Timed-path Pass criteria

| Criterion | Pass / Fail |
| --------- | ----------- |
| Work is in `java-bootcamp/examples/lab43-crm` | Pass / Fail |
| `crm-ci.yml` is at the git root | Pass / Fail |
| Verify job runs `mvn` without skipTests | Pass / Fail |
| Package job gated to main/tags | Pass / Fail |
| Runbook explains secret storage (names only) | Pass / Fail |

Continue remaining GUIDE steps as homework (live PR, break/restore a real test, `crm-jar` on `main`).

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Actions never runs | Enable Actions; workflow must be at repo root |
| Verify skips tests | Remove `-DskipTests` from verify |
| Package on every PR | Gate package job to main/tags |
| Token in YAML | Move to Actions secrets |
| Copied Lab 42 | Copy Lab 41 — Lab 42 has no `pom.xml` |
