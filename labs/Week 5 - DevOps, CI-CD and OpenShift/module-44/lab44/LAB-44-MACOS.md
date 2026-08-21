# Lab 44: Continuous Delivery and Environment Promotion — Northstar Release Path — macOS

**OS:** macOS  
**Primary IDE:** IntelliJ IDEA Community Edition  
**Optional IDE:** VS Code  
**Shell:** macOS Terminal (zsh)  
**Stack hint:** Lab 43 `crm-jar` · `gh` CLI · GitHub Actions on **your** `java-bootcamp` remote · optional Lab 42 k3d · IntelliJ  
**Full lab steps:** [LAB-44-GUIDE.md](LAB-44-GUIDE.md)  
**Pre-lab exercises:** [`../exercises/EXERCISES-INDEX.md`](../exercises/EXERCISES-INDEX.md)  
**Other OS:** [Windows guide](LAB-44-WINDOWS.md) · [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md)  
**Two folders:** [Clone + own repo](../../../CLONE-AND-OWN-REPO-GUIDE.md)


## Prerequisites (macOS)

- [Lab 0 (macOS)](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/module-00/lab0/LAB-0-MACOS.md) complete (JDK 21, Maven, Git)
- IntelliJ with **Project SDK 21** — open **`~/java-bootcamp`**, not the course clone
- Lab 43 CRM under `examples/lab43-crm` and a CI run that uploaded **`crm-jar`**
- GitHub Actions enabled on **your** `java-bootcamp` remote
- Optional live promote: Lab 42 k3d cluster still up

## Paths (macOS)

| Item | Path |
| ---- | ---- |
| Course clone (read GUIDE / starter) | `~/bc-sw-engineer-java-participant/` (adjust if you cloned elsewhere) |
| Your repo (write / run / commit / push) | `~/java-bootcamp` |
| This lab CRM + docs | `~/java-bootcamp/examples/lab44-crm` |
| Workflow GitHub actually runs | `~/java-bootcamp/.github/workflows/crm-cd.yml` |
| Evidence / screenshots | `~/java-bootcamp/notes/screenshots/lab-44` |
| Shell | macOS Terminal inside IntelliJ |

```bash
cd ~/java-bootcamp
mkdir -p notes/screenshots/lab-44
cd examples/lab44-crm
```

### Commands this lab typically uses

**Do not** `mvn package` on promote. That is a new artifact, not Lab 43.

```bash
cd ~/java-bootcamp
gh run list --workflow "CRM CI" --limit 5
gh run download <LAB43_RUN_ID> -n crm-jar -D dist/
python3 -c "import json; json.load(open('examples/lab44-crm/artifact-manifest.json'))"
sha256sum dist/*.jar

# Optional Lab 42 k3d smoke (Host header — not the Ingress hostname as a DNS name)
curl -fsS -H "Host: crm-api.training.example.test" \
  http://127.0.0.1:8088/actuator/health/readiness
curl -fsS -H "Host: crm-api.training.example.test" \
  -H "X-Correlation-Id: lab-request-001" \
  "http://127.0.0.1:8088/api/customers?status=ACTIVE"
```

Same verification notes as Windows: copy **Lab 43** (not starter-only), install workflow at **repo root** `crm-cd.yml`, promote **`jarSha256`** from Lab 43 `SHA256SUMS` (image digest optional), smoke **`GET /api/customers`**, never rebuild with Maven. Details: [LAB-44-WINDOWS.md](LAB-44-WINDOWS.md) and [LAB-44-GUIDE.md](LAB-44-GUIDE.md).

### If it fails

| Symptom | Fix |
| --- | --- |
| Actions never starts | Workflow must be `~/java-bootcamp/.github/workflows/crm-cd.yml` |
| Copied starter only | Copy **Lab 43** first |
| `mvn package` / `./mvnw` on promote | Download `crm-jar`; never rebuild |
| Fake GHCR digest | Use `jarSha256`; leave `imageDigest` null |
| `GET /api/customers/CUS-1001` 404 | List API: **`GET /api/customers?status=ACTIVE`** |
| curl hostname NXDOMAIN | Host header + `http://127.0.0.1:8088` |
| Work ended up in the course clone | Move to `~/java-bootcamp` |


## Do the lab

Complete every step in **[LAB-44-GUIDE.md](LAB-44-GUIDE.md)**. GUIDE paths already use `~/java-bootcamp`.

## Evidence / screenshots

Save under `~/java-bootcamp/notes/screenshots/lab-44`. Redact tokens and kubeconfig.

## Pass criteria

| # | Confirm | Your notes |
| - | ------- | ---------- |
| 1 | Workspace `~/java-bootcamp` open in IntelliJ | Pass / Fail |
| 2 | CRM under `examples/lab44-crm` and workflow at **repo root** | Pass / Fail |
| 3 | GUIDE deliverables / checkpoints complete | Pass / Fail |
| 4 | Commands above succeed (or as the GUIDE specifies) | Pass / Fail |
| 5 | Screenshots (if required) under `notes/screenshots/lab-44/` | Pass / Fail |
