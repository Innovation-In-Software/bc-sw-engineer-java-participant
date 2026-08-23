# Lab 51: Capstone Security, CI/CD, and Deployment — Northstar CRM Release Gate — Windows

**OS:** Windows  
**Primary IDE:** IntelliJ IDEA Community Edition  
**Optional IDE:** VS Code  
**Shell:** Windows PowerShell  
**Stack hint:** Session = docs + Docker/k8s stubs · Full path = Maven + Docker + k3s  
**Full lab steps:** [LAB-51-GUIDE.md](LAB-51-GUIDE.md)  
**Pre-lab exercises:** [`../exercises/EXERCISES-INDEX.md`](../exercises/EXERCISES-INDEX.md)  
**Other OS:** [macOS guide](LAB-51-MACOS.md) · [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md)  
**Two folders:** [Clone + own repo](../../../CLONE-AND-OWN-REPO-GUIDE.md)


## Prerequisites (Windows)

- Git; Lab 48–50 tree in `examples\customer-management-platform`
- IntelliJ on **`%USERPROFILE%\java-bootcamp`**
- Docker / `kubectl` / k3s **only** for the full path

## Paths (Windows)

| Item | Path |
| ---- | ---- |
| Course clone | `%USERPROFILE%\bc-sw-engineer-java-participant\` |
| Platform tree | `%USERPROFILE%\java-bootcamp\examples\customer-management-platform` |
| Evidence | `%USERPROFILE%\java-bootcamp\notes\screenshots\lab-51` |

### Commands this lab typically uses

**Do not** `Copy-Item starter\*` over the platform root. **Do not** `./mvnw`. **Do not** use Lab 42 k3d as the default cluster.

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
Select-String -Path Dockerfile -Pattern 'USER|HEALTHCHECK|FROM eclipse-temurin'
Select-String -Path k8s\deployment.yaml -Pattern 'readinessProbe|livenessProbe'
```

Full path (when Docker / k3s exist):

```powershell
docker build -t crm-api:session-local .
kubectl apply --dry-run=client -f k8s\deployment.yaml
cd backend
mvn -B test
```

Smoke API (full path, app up): **`POST /api/v1/interactions`** — see GUIDE. Use `curl.exe`. Expect 401 without Bearer.

Verified notes (2026-08-22): session is checklist + stubs; identity is digest **and** Lab 44 `jarSha256`; cluster is **k3s**, not Lab 42 k3d `:8088`.

### If it fails

| Symptom | Fix |
| --- | --- |
| Overwrote ADRs / backend | Copy the four starter paths only |
| `./mvnw` | `mvn` from `backend\` |
| `GET .../CUS-1001` 404 | Week 5 has no per-id GET; smoke **POST** interactions |
| Invented GHCR digest | Record a digest you built; keep `jarSha256` |
| k3d muscle memory | Capstone deploy is **k3s** |

## Do the lab

Complete **[LAB-51-GUIDE.md](LAB-51-GUIDE.md)**. Redact tokens in screenshots.

## Pass criteria

| # | Confirm | Notes |
| - | ------- | ----- |
| 1 | Work in `java-bootcamp` platform tree | Pass / Fail |
| 2 | Session: checklist + Dockerfile/k8s TODOs (or full-path JWT/k3s) | Pass / Fail |
| 3 | No secrets in Git | Pass / Fail |
| 4 | Screenshots under `notes/screenshots/lab-51/` | Pass / Fail |
