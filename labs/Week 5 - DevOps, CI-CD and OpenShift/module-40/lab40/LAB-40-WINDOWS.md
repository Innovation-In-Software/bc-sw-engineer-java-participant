# Lab 40: Application Security Testing for the CRM — Dependency-Check, SAST, Remediation — Windows

**OS:** Windows  
**Primary IDE:** IntelliJ IDEA Community Edition  
**Optional IDE:** VS Code  
**Shell:** Windows PowerShell  
**Stack hint:** JDK 21 · Maven 3.9.x · PostgreSQL in `crm-postgres` · IntelliJ  
**Full lab steps:** [LAB-40-GUIDE.md](LAB-40-GUIDE.md)  
**Pre-lab exercises:** [`../exercises/EXERCISES-INDEX.md`](../exercises/EXERCISES-INDEX.md)  
**Other OS:** [macOS guide](LAB-40-MACOS.md) · [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md)  
**Two folders:** [Clone + own repo](../../../CLONE-AND-OWN-REPO-GUIDE.md)


## Prerequisites (Windows)

- [Lab 0 (Windows)](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/module-00/lab0/LAB-0-WINDOWS.md) complete (JDK 21, Maven when needed, Git)
- IntelliJ with **Project SDK 21** — open **`%USERPROFILE%\java-bootcamp`**, not the course clone
- Lab 39 `mvn -B test` green under `examples\lab39-crm`
- Personal NVD API key (free): [request](https://nvd.nist.gov/developers/request-an-api-key) — env only, never `pom.xml`

## Paths (Windows)

| Item | Path |
| ---- | ---- |
| Course clone (read GUIDE / starter) | `%USERPROFILE%\bc-sw-engineer-java-participant\` (adjust if you cloned elsewhere) |
| Your repo (write / run / commit) | `%USERPROFILE%\java-bootcamp` |
| This lab project | `%USERPROFILE%\java-bootcamp\examples\lab40-crm` |
| Evidence / screenshots | `%USERPROFILE%\java-bootcamp\notes\screenshots\lab-40` |
| Shell | Windows PowerShell inside IntelliJ |
| Path style | Backslashes; **quote** every Maven `-D…` |

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path notes\screenshots\lab-40 | Out-Null
cd examples\lab40-crm
```

### Commands this lab typically uses

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\lab40-crm
mvn -B test
mvn -B -Psecurity-scan dependency-check:check "-DnvdApiKey=$env:NVD_API_KEY" "-DdataDirectory=$pwd\dependency-check-data"
mvn -B test "-Dtest=ObjectOwnershipSecurityTest"   # full path only, after adding Spring Security
```

Verified on this laptop (2026-08-11), Temurin 21.0.11, Maven 3.9.9, Dependency-Check **10.0.4**, PostgreSQL 16.14 in `crm-postgres`:

- **Copy Lab 39** from `java-bootcamp\examples\lab39-crm` into `examples\lab40-crm`, then **merge** `starter\*` from the **course clone** lab folder. Do not grade files left under `labs\`.
- Isolated database **`crm_lab40`**. Do not Flyway-migrate Lab 37/38 `crm` or Lab 39 `crm_lab39`.
- Lab 39 has **no** `mvnw` — use `mvn`. Quote Maven `-D…` in PowerShell (`"-Dtest=…"`). Unquoted `-Dtest=` is parsed as a lifecycle phase.
- NVD without a key now returns **403**. Set `$env:NVD_API_KEY` and pass `"-DnvdApiKey=$env:NVD_API_KEY"`. First successful populate can still take tens of minutes; later runs reuse `dependency-check-data\` (~45–55 s).
- Plugin 10.0.4 logged non-fatal `URL CHARACTER VARYING(1000)` errors on CVE-2026-6785 / CVE-2026-6786; the HTML/JSON reports still wrote.
- Sonatype OSS Index returned “Invalid credentials”; keep `<ossindexAnalyzerEnabled>false</ossindexAnalyzerEnabled>` and gate on NVD.
- Spring Boot **3.3.5** (Lab 39 parent) failed `failBuildOnCVSS=7` with **70** High/Critical rows (Tomcat 10.1.31, Spring 6.1.14, …). Last OSS 3.x parent **3.5.16** plus `tomcat.version=10.1.57` cleared reachable Highs. Do **not** lower `failBuildOnCVSS` to greenwash. CLI `-DfailBuildOnCVSS=1` does **not** override the profile XML — edit the pom, observe, restore **7**.
- Lab 39 has **no** Spring Security and **no** `GET /api/customers/{id}`. Timed path = SCA profile + triage. Full-path ownership tests need Security added.
- HTML report is ~1 MB — keep it under `target\` / gitignore; commit CSV + sanitized excerpts under `notes\screenshots\lab-40\`.

### If it fails

| Symptom | Fix |
| -------- | --- |
| NVD 403 | Personal key in `$env:NVD_API_KEY`; pass `"-DnvdApiKey=…"`; wait for email activation |
| NVD download extremely slow | Expected on first populate; wait; reuse `dependency-check-data\` |
| Scan fails only on CVSS ≥ 7 | Boot 3.3.5 baseline — upgrade per GUIDE Step 7; keep the profile |
| PowerShell eats `-Dtest=` | Quote the whole `-D…` argument |
| `./mvnw` not found | Use `mvn` |
| IT talks to the wrong database | Point datasource at `crm_lab40`, not `crm` / `crm_lab39` |
| Work ended up in the course clone | Move to `java-bootcamp`; never push homework to the participant remote |


## Do the lab

Complete every step in **[LAB-40-GUIDE.md](LAB-40-GUIDE.md)**. Wherever the GUIDE shows `~/java-bootcamp`, use `%USERPROFILE%\java-bootcamp`.  
Open/run IntelliJ steps are the same every lab — see [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md).

## Evidence / screenshots

Save under `%USERPROFILE%\java-bootcamp\notes\screenshots\lab-40`. Capture IntelliJ (project tree + Run/Terminal). Redact secrets and NVD keys.

## Pass criteria

_Mark **Pass** or **Fail** in your lab notes._

| # | Confirm | Your notes |
| - | ------- | ---------- |
| 1 | Workspace `%USERPROFILE%\java-bootcamp` open in IntelliJ with SDK **21** | Pass / Fail |
| 2 | Lab project under `examples/lab40-crm` (not the course `labs/` tree) | Pass / Fail |
| 3 | GUIDE deliverables / checkpoints complete | Pass / Fail |
| 4 | Scan command succeeds in producing reports (key set; 403 gone) | Pass / Fail |
| 5 | Screenshots (if required) under `notes/screenshots/lab-40/` | Pass / Fail |
