# Lab 44: Continuous Delivery and Environment Promotion — Northstar Release Path — Windows

**OS:** Windows  
**Primary IDE:** IntelliJ IDEA Community Edition  
**Optional IDE:** VS Code  
**Shell:** Windows PowerShell  
**Stack hint:** Lab 43 `crm-jar` · `gh` CLI · GitHub Actions on **your** `java-bootcamp` remote · optional Lab 42 k3d · IntelliJ  
**Full lab steps:** [LAB-44-GUIDE.md](LAB-44-GUIDE.md)  
**Pre-lab exercises:** [`../exercises/EXERCISES-INDEX.md`](../exercises/EXERCISES-INDEX.md)  
**Other OS:** [macOS guide](LAB-44-MACOS.md) · [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md)  
**Two folders:** [Clone + own repo](../../../CLONE-AND-OWN-REPO-GUIDE.md)


## Prerequisites (Windows)

- [Lab 0 (Windows)](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/module-00/lab0/LAB-0-WINDOWS.md) complete (JDK 21, Maven, Git)
- IntelliJ with **Project SDK 21** — open **`%USERPROFILE%\java-bootcamp`**, not the course clone
- Lab 43 CRM under `examples\lab43-crm` and a CI run that uploaded **`crm-jar`**
- GitHub Actions enabled on **your** `java-bootcamp` remote
- Optional live promote: Lab 42 k3d cluster still up

## Paths (Windows)

| Item | Path |
| ---- | ---- |
| Course clone (read GUIDE / starter) | `%USERPROFILE%\bc-sw-engineer-java-participant\` (adjust if you cloned elsewhere) |
| Your repo (write / run / commit / push) | `%USERPROFILE%\java-bootcamp` |
| This lab CRM + docs | `%USERPROFILE%\java-bootcamp\examples\lab44-crm` |
| Workflow GitHub actually runs | `%USERPROFILE%\java-bootcamp\.github\workflows\crm-cd.yml` |
| Evidence / screenshots | `%USERPROFILE%\java-bootcamp\notes\screenshots\lab-44` |
| Shell | Windows PowerShell inside IntelliJ |

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path notes\screenshots\lab-44 | Out-Null
cd examples\lab44-crm
```

### Commands this lab typically uses

**Do not** `mvn package` on promote. That is a new artifact, not Lab 43.

```powershell
cd $env:USERPROFILE\java-bootcamp
gh run list --workflow "CRM CI" --limit 5
gh run download <LAB43_RUN_ID> -n crm-jar -D dist\
Get-Content examples\lab44-crm\artifact-manifest.json | ConvertFrom-Json | Out-Null
Get-FileHash dist\*.jar -Algorithm SHA256

# Optional Lab 42 k3d smoke (Host header — not the Ingress hostname as a DNS name)
curl.exe -fsS -H "Host: crm-api.training.example.test" `
  http://127.0.0.1:8088/actuator/health/readiness
curl.exe -fsS -H "Host: crm-api.training.example.test" `
  -H "X-Correlation-Id: lab-request-001" `
  "http://127.0.0.1:8088/api/customers?status=ACTIVE"
```

Verified notes (same CRM baseline as Labs 41–43):

- Copy **Lab 43** from `java-bootcamp\examples\lab43-crm` into `examples\lab44-crm`, then merge starter **docs** and copy `starter\.github\workflows\cd.yml` to **`java-bootcamp\.github\workflows\crm-cd.yml`**. Do not copy starter-only (no `pom.xml`). Do not grade files left under `labs\`.
- Immutable identity is Lab 43 **`jarSha256`** + **`gitCommit`** from `SHA256SUMS`. Do **not** `Get-FileHash` a freshly built `target\*.jar`. Lab 41 `RepoDigests` is empty until you push — **do not invent** `ghcr.io/…@sha256:…`.
- GitHub only auto-runs workflows from the **repository root**. `examples\lab44-crm\.github\workflows\*.yml` is ignored. Root workflow uses `working-directory: examples/lab44-crm` when grepping the manifest.
- `actions/download-artifact` **without** Lab 43 `run-id` does **not** see `crm-jar` from the CI workflow. Use `gh run download` locally, or `run-id` + `github-token` in CD.
- HTTP smoke is **`GET /api/customers`**. There is no `GET /api/customers/{id}`, no `/api/v1/interactions`, no Spring Security (a 401 is not the training failure). On k3d use port **8088** + Host header.
- Isolated DB from Lab 43 is **`crm_lab43`**. User **`crm` / `change-me`**. Do not Flyway-migrate Lab 42’s `crm_lab42` as “prod.”

### If it fails

| Symptom | Fix |
| --- | --- |
| Actions never starts | Workflow must be `java-bootcamp\.github\workflows\crm-cd.yml` |
| Copied starter only | Copy **Lab 43** first (`pom.xml` + `src`) |
| `mvn package` / `./mvnw` on promote | Download `crm-jar`; never rebuild |
| Fake GHCR digest | Use `jarSha256`; leave `imageDigest` null |
| `GET /api/customers/CUS-1001` 404 | List API: **`GET /api/customers?status=ACTIVE`** |
| curl hostname NXDOMAIN | Host header + `http://127.0.0.1:8088` |
| `crm-jar` empty in the CD run | Pass Lab 43 **run-id**; same-run download-artifact cannot see CI |
| Work ended up in the course clone | Move to `java-bootcamp`; never push homework to the participant remote |


## Do the lab

Complete every step in **[LAB-44-GUIDE.md](LAB-44-GUIDE.md)**. Wherever the GUIDE shows `~/java-bootcamp`, use `%USERPROFILE%\java-bootcamp`.

## Evidence / screenshots

Save under `%USERPROFILE%\java-bootcamp\notes\screenshots\lab-44`. Redact tokens and kubeconfig.

## Pass criteria

| # | Confirm | Your notes |
| - | ------- | ---------- |
| 1 | Workspace `%USERPROFILE%\java-bootcamp` open in IntelliJ | Pass / Fail |
| 2 | CRM under `examples/lab44-crm` and workflow at **repo root** | Pass / Fail |
| 3 | GUIDE deliverables / checkpoints complete | Pass / Fail |
| 4 | Commands above succeed (or as the GUIDE specifies) | Pass / Fail |
| 5 | Screenshots (if required) under `notes/screenshots/lab-44/` | Pass / Fail |
