# Lab 43: GitHub CI/CD Pipeline for the CRM — Northstar Delivery Gates — macOS

**OS:** macOS  
**Primary IDE:** IntelliJ IDEA Community Edition  
**Optional IDE:** VS Code  
**Shell:** macOS Terminal (zsh)  
**Stack hint:** JDK 21 · Maven 3.9.x · GitHub Actions on **your** `java-bootcamp` remote · IntelliJ  
**Full lab steps:** [LAB-43-GUIDE.md](LAB-43-GUIDE.md)  
**Pre-lab exercises:** [`../exercises/EXERCISES-INDEX.md`](../exercises/EXERCISES-INDEX.md)  
**Other OS:** [Windows guide](LAB-43-WINDOWS.md) · [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md)  
**Two folders:** [Clone + own repo](../../../CLONE-AND-OWN-REPO-GUIDE.md)


## Prerequisites (macOS)

- [Lab 0 (macOS)](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/module-00/lab0/LAB-0-MACOS.md) complete (JDK 21, Maven, Git)
- IntelliJ with **Project SDK 21** — open **`~/java-bootcamp`**, not the course clone
- Lab 41 project under `examples/lab41-crm`
- GitHub Actions enabled on **your** `java-bootcamp` remote

## Paths (macOS)

| Item | Path |
| ---- | ---- |
| Course clone (read GUIDE / starter) | `~/bc-sw-engineer-java-participant/` (adjust if you cloned elsewhere) |
| Your repo (write / run / commit / push) | `~/java-bootcamp` |
| This lab CRM | `~/java-bootcamp/examples/lab43-crm` |
| Workflow GitHub actually runs | `~/java-bootcamp/.github/workflows/crm-ci.yml` |
| Evidence / screenshots | `~/java-bootcamp/notes/screenshots/lab-43` |
| Shell | macOS Terminal inside IntelliJ |

```bash
cd ~/java-bootcamp
mkdir -p notes/screenshots/lab-43
cd examples/lab43-crm
```

### Commands this lab typically uses

```bash
cd ~/java-bootcamp/examples/lab43-crm
mvn -B -ntp clean verify \
  -Dspring.datasource.url=jdbc:postgresql://localhost:5432/crm_lab43 \
  -Dspring.datasource.username=crm \
  -Dspring.datasource.password=change-me
mvn -B -ntp -DskipTests package
sha256sum target/*.jar
```

Same verification notes as Windows (2026-08-11): copy **Lab 41** (not Lab 42), install workflow at **repo root** `crm-ci.yml`, database **`crm_lab43`**, user **`crm`**, command **`mvn`**, no `anonymousReadIs401`, glob the real JAR name. Details: [LAB-43-WINDOWS.md](LAB-43-WINDOWS.md) and [LAB-43-GUIDE.md](LAB-43-GUIDE.md).

### If it fails

| Symptom | Fix |
| --- | --- |
| Actions never starts | Workflow must be `~/java-bootcamp/.github/workflows/crm-ci.yml` |
| `pom.xml` not found in CI | `working-directory` + `cache-dependency-path` |
| `./mvnw` not found | Use `mvn` |
| Copied Lab 42 / starter only | Copy **Lab 41** first |
| Work ended up in the course clone | Move to `~/java-bootcamp` |


## Do the lab

Complete every step in **[LAB-43-GUIDE.md](LAB-43-GUIDE.md)**. GUIDE paths already use `~/java-bootcamp`.

## Evidence / screenshots

Save under `~/java-bootcamp/notes/screenshots/lab-43`. Redact secrets and NVD keys.

## Pass criteria

| # | Confirm | Your notes |
| - | ------- | ---------- |
| 1 | Workspace `~/java-bootcamp` open in IntelliJ | Pass / Fail |
| 2 | CRM under `examples/lab43-crm` and workflow at **repo root** | Pass / Fail |
| 3 | GUIDE deliverables / checkpoints complete | Pass / Fail |
| 4 | Commands above succeed (or as the GUIDE specifies) | Pass / Fail |
| 5 | Screenshots (if required) under `notes/screenshots/lab-43/` | Pass / Fail |
