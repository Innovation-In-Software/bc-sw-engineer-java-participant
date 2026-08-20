# Lab 40: Application Security Testing for the CRM — Dependency-Check, SAST, Remediation — macOS

**OS:** macOS  
**Primary IDE:** IntelliJ IDEA Community Edition  
**Optional IDE:** VS Code  
**Shell:** macOS Terminal (zsh)  
**Stack hint:** JDK 21 · Maven 3.9.x · PostgreSQL in `crm-postgres` · IntelliJ  
**Full lab steps:** [LAB-40-GUIDE.md](LAB-40-GUIDE.md)  
**Pre-lab exercises:** [`../exercises/EXERCISES-INDEX.md`](../exercises/EXERCISES-INDEX.md)  
**Other OS:** [Windows guide](LAB-40-WINDOWS.md) · [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md)  
**Two folders:** [Clone + own repo](../../../CLONE-AND-OWN-REPO-GUIDE.md)


## Prerequisites (macOS)

- [Lab 0 (macOS)](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/module-00/lab0/LAB-0-MACOS.md) complete (JDK 21, Maven when needed, Git)
- IntelliJ with **Project SDK 21** — open **`~/java-bootcamp`**, not the course clone
- Lab 39 `mvn -B test` green under `examples/lab39-crm`
- Personal NVD API key (free): [request](https://nvd.nist.gov/developers/request-an-api-key) — env only, never `pom.xml`

## Paths (macOS)

| Item | Path |
| ---- | ---- |
| Course clone (read GUIDE / starter) | `~/bc-sw-engineer-java-participant/` (adjust if you cloned elsewhere) |
| Your repo (write / run / commit) | `~/java-bootcamp` |
| This lab project | `~/java-bootcamp/examples/lab40-crm` |
| Evidence / screenshots | `~/java-bootcamp/notes/screenshots/lab-40` |
| Shell | macOS Terminal inside IntelliJ |
| Path style | Forward slashes |

```bash
cd ~/java-bootcamp
mkdir -p notes/screenshots/lab-40
cd examples/lab40-crm
```

### Commands this lab typically uses

```bash
cd ~/java-bootcamp/examples/lab40-crm
mvn -B test
mvn -B -Psecurity-scan dependency-check:check -DnvdApiKey="$NVD_API_KEY" -DdataDirectory="$PWD/dependency-check-data"
mvn -B test -Dtest=ObjectOwnershipSecurityTest   # full path only, after adding Spring Security
```

Same verification notes as Windows (2026-08-11): Dependency-Check **10.0.4**, copy **Lab 39** then merge **starter** from the course clone, database **`crm_lab40`**, NVD **403** without a key, Boot **3.3.5** fails `failBuildOnCVSS=7` until parent **3.5.16** + `tomcat.version=10.1.57`. Lab 39 has **no** `mvnw` and **no** Spring Security. Details: [LAB-40-WINDOWS.md](LAB-40-WINDOWS.md) verified bullets and [LAB-40-GUIDE.md](LAB-40-GUIDE.md) Steps 1–8.

### If it fails

| Symptom | Fix |
| -------- | --- |
| NVD 403 | `export NVD_API_KEY=…` then pass `-DnvdApiKey="$NVD_API_KEY"` |
| `./mvnw` not found | Use `mvn` |
| Scan fails only on CVSS ≥ 7 | Upgrade Boot/Tomcat (GUIDE Step 7); keep the profile |
| Wrong database | `jdbc:postgresql://localhost:5432/crm_lab40` |
| Work ended up in the course clone | Move to `~/java-bootcamp`; never push homework to the participant remote |


## Do the lab

Complete every step in **[LAB-40-GUIDE.md](LAB-40-GUIDE.md)**. GUIDE paths already use `~/java-bootcamp`.  
Open/run IntelliJ steps are the same every lab — see [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md).

## Evidence / screenshots

Save under `~/java-bootcamp/notes/screenshots/lab-40`. Capture IntelliJ (project tree + Run/Terminal). Redact secrets and NVD keys.

## Pass criteria

_Mark **Pass** or **Fail** in your lab notes._

| # | Confirm | Your notes |
| - | ------- | ---------- |
| 1 | Workspace `~/java-bootcamp` open in IntelliJ with SDK **21** | Pass / Fail |
| 2 | Lab project under `examples/lab40-crm` (not the course `labs/` tree) | Pass / Fail |
| 3 | GUIDE deliverables / checkpoints complete | Pass / Fail |
| 4 | Scan command succeeds in producing reports (key set; 403 gone) | Pass / Fail |
| 5 | Screenshots (if required) under `notes/screenshots/lab-40/` | Pass / Fail |
