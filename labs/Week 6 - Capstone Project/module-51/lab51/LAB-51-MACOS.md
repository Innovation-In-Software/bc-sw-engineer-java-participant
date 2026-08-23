# Lab 51: Capstone Security, CI/CD, and Deployment — Northstar CRM Release Gate — macOS

**OS:** macOS  
**Primary IDE:** IntelliJ IDEA Community Edition  
**Optional IDE:** VS Code  
**Shell:** macOS Terminal (zsh)  
**Stack hint:** Session = docs + Docker/k8s stubs · Full path = Maven + Docker + k3s  
**Full lab steps:** [LAB-51-GUIDE.md](LAB-51-GUIDE.md)  
**Pre-lab exercises:** [`../exercises/EXERCISES-INDEX.md`](../exercises/EXERCISES-INDEX.md)  
**Other OS:** [Windows guide](LAB-51-WINDOWS.md) · [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md)  
**Two folders:** [Clone + own repo](../../../CLONE-AND-OWN-REPO-GUIDE.md)


## Prerequisites (macOS)

- Git; Lab 48–50 tree in `examples/customer-management-platform`
- IntelliJ on **`~/java-bootcamp`**
- Docker / `kubectl` / k3s **only** for the full path

## Paths (macOS)

| Item | Path |
| ---- | ---- |
| Course clone | `~/bc-sw-engineer-java-participant/` |
| Platform tree | `~/java-bootcamp/examples/customer-management-platform` |
| Evidence | `~/java-bootcamp/notes/screenshots/lab-51` |

### Commands this lab typically uses

**Do not** `cp -R starter/.` over the platform root. **Do not** `./mvnw`. **Do not** use Lab 42 k3d as the default cluster.

```bash
JB=~/java-bootcamp
COURSE=~/bc-sw-engineer-java-participant/labs/Week\ 6\ -\ Capstone\ Project/module-51/lab51
DEST="$JB/examples/customer-management-platform"

mkdir -p "$DEST/docs" "$DEST/k8s" "$DEST/.github/workflows" "$JB/notes/screenshots/lab-51"
cp "$COURSE/starter/Dockerfile" "$DEST/Dockerfile"
cp "$COURSE/starter/k8s/"* "$DEST/k8s/"
cp "$COURSE/starter/.github/workflows/ci.yml" "$DEST/.github/workflows/ci.yml"
cp "$COURSE/starter/docs/security-deploy-checklist.md" "$DEST/docs/security-deploy-checklist.md"
cd "$DEST"
grep -E 'USER|HEALTHCHECK|FROM eclipse-temurin' Dockerfile
grep -E 'readinessProbe|livenessProbe' k8s/deployment.yaml
```

Full path: `docker build -t crm-api:session-local .` · `kubectl apply --dry-run=client -f k8s/deployment.yaml` · `cd backend && mvn -B test`. Same notes as Windows: [LAB-51-WINDOWS.md](LAB-51-WINDOWS.md).

### If it fails

| Symptom | Fix |
| --- | --- |
| Overwrote ADRs / backend | Copy the four starter paths only |
| `./mvnw` | `mvn` from `backend/` |
| Per-id GET 404 | Smoke **POST** `/api/v1/interactions` |
| Invented GHCR digest | Digest you built + Lab 44 `jarSha256` |
| k3d muscle memory | Capstone deploy is **k3s** |

## Do the lab

Complete **[LAB-51-GUIDE.md](LAB-51-GUIDE.md)**. Redact tokens.

## Pass criteria

| # | Confirm | Notes |
| - | ------- | ----- |
| 1 | Work in `~/java-bootcamp` platform tree | Pass / Fail |
| 2 | Session stubs or full-path JWT/k3s | Pass / Fail |
| 3 | No secrets in Git | Pass / Fail |
| 4 | Screenshots under `notes/screenshots/lab-51/` | Pass / Fail |
