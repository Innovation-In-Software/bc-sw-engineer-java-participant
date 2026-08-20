# Lab 40 starter — timed path (~45 minutes)

**Theme:** AppSec — OWASP Dependency-Check, triage, remediation stubs

## Two folders

| Folder | You… |
| ------ | ---- |
| **Course clone** (this `starter/` directory) | Read / copy **from** here |
| **`java-bootcamp`** | Copy Lab 39 **to** `examples/lab40-crm`, merge these stubs, run Maven, commit |

Do **not** grade work inside the course `labs/` tree. IntelliJ stays on `java-bootcamp`.

## Activity card

| | |
| --- | --- |
| **Checkpoint** | **E** |
| **Must prove** | security-scan profile · CSV triage · residual risk |
| **Hard gate** | Pre-lab Pass · Lab 39 CRM in `java-bootcamp` · NVD API key in env |

## Copy into your workspace

1. Copy **your** Lab 39 CRM into `java-bootcamp/examples/lab40-crm`.
2. Merge **this** `starter/` on top (docs + POM snippet). Starter is **not** a full Spring app.

**Windows (PowerShell)** — run from this lab folder in the **course clone**, or set `$courseLab40` to it:

```powershell
$jb = "$env:USERPROFILE\java-bootcamp"
$courseLab40 = "$env:USERPROFILE\bc-sw-engineer-java-participant\labs\Week 5 - DevOps, CI-CD and OpenShift\module-40\lab40"

Copy-Item -Recurse -Force "$jb\examples\lab39-crm" "$jb\examples\lab40-crm"
Copy-Item -Recurse -Force "$courseLab40\starter\*" "$jb\examples\lab40-crm\"
cd "$jb\examples\lab40-crm"
```

**macOS / Linux:**

```bash
JB=~/java-bootcamp
COURSE_LAB40=~/bc-sw-engineer-java-participant/labs/Week\ 5\ -\ DevOps,\ CI-CD\ and\ OpenShift/module-40/lab40

cp -R "$JB/examples/lab39-crm" "$JB/examples/lab40-crm"
cp -R "$COURSE_LAB40/starter/." "$JB/examples/lab40-crm/"
cd "$JB/examples/lab40-crm"
```

Then point the datasource at database **`crm_lab40`** (create it on `crm-postgres`). See [LAB-40-GUIDE.md](../LAB-40-GUIDE.md) Step 1.

## 45-minute checklist

- [ ] Merge `pom-security-scan-snippet.xml` into `examples/lab40-crm/pom.xml` (`-Psecurity-scan`)
- [ ] Pin `<dependency-check.version>10.0.4</dependency-check.version>` in `<properties>`
- [ ] Complete `dependency-check-suppressions.xml` policy header (CVE / owner / expiry)
- [ ] Fill `docs/threat-checklist.md` (OWASP-aligned surfaces for Lab 39 APIs)
- [ ] Run Dependency-Check once with **NVD API key**; triage one finding into `docs/security-findings.csv`
- [ ] Draft residual risks in `docs/security-assessment.md` (no secrets, no key)

## Smoke test

From **`java-bootcamp/examples/lab40-crm`** after merging the profile (Lab 39 has no wrapper — use `mvn`):

```powershell
# Windows — quote -D args
$env:NVD_API_KEY = "paste-your-key-here"
mvn -B -Psecurity-scan dependency-check:check "-DnvdApiKey=$env:NVD_API_KEY" "-DdataDirectory=$pwd\dependency-check-data"
```

```bash
# macOS / Linux
export NVD_API_KEY='paste-your-key-here'
mvn -B -Psecurity-scan dependency-check:check -DnvdApiKey="$NVD_API_KEY" -DdataDirectory="$PWD/dependency-check-data"
```

On Boot **3.3.5**, a red `failBuildOnCVSS=7` is expected if reports were written. Do not lower the threshold in the timed block. Evidence under `~/java-bootcamp/notes/screenshots/lab-40/` (sanitize HTML/JSON; never paste the API key).

## Timed-path Pass criteria

| Criterion | Pass / Fail |
| --------- | ----------- |
| Work is in `java-bootcamp/examples/lab40-crm` (not course `labs/`) | Pass / Fail |
| `-Psecurity-scan` profile present with pin **10.0.4** | Pass / Fail |
| Suppressions file exists with policy note | Pass / Fail |
| Scan produced HTML/JSON (403 gone) | Pass / Fail |
| At least one CSV row with classification (`confirmed` / `false_positive` / `mitigated` / `accepted` / `needs_review`) | Pass / Fail |
| Assessment names residual risk + owner | Pass / Fail |

Continue remaining GUIDE steps as homework / full path if needed (Boot **3.5.16** + `tomcat.version=10.1.57` for a green CVSS-7 gate).

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| NVD 403 | Personal key in env; `-DnvdApiKey`; never commit it |
| Unpinned plugin | Pin `dependency-check.version` to **10.0.4** |
| Build red only on scan | Triage; upgrade Boot/Tomcat on full path — keep the profile |
| `./mvnw` not found | Use `mvn` |
| Bulky HTML in Git | gitignore `target/` and `dependency-check-data/`; keep CSV excerpts |
