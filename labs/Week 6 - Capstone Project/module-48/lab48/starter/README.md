# Lab 48 starter — session block (~45 minutes)

**Theme:** Capstone planning templates (context, ADRs, backlog, risks)

## Two folders

| Folder | You… |
| ------ | ---- |
| **Course clone** (this `starter/` directory) | Read / copy **from** here |
| **`java-bootcamp`** | Copy **this starter** to `examples/customer-management-platform`, fill TODOs, commit, push |

Do **not** grade work inside the course `labs/` tree. IntelliJ stays on `java-bootcamp`.

**This starter is docs-only** (no `pom.xml`). **Do not** copy Lab 31 / 41–47 CRM into this folder. Week 6 lives here for Labs 49–52.

## Activity card

| | |
| --- | --- |
| **Checkpoint** | **E** |
| **Must prove** | context + fixtures · ≥1 ADR · backlog/risk seeds |
| **Hard gate** | Pre-lab Pass · docs before Lab 49 code |

## Copy into your workspace

**Windows (PowerShell):**

```powershell
$jb = "$env:USERPROFILE\java-bootcamp"
$courseLab48 = "$env:USERPROFILE\bc-sw-engineer-java-participant\labs\Week 6 - Capstone Project\module-48\lab48"

New-Item -ItemType Directory -Force -Path "$jb\examples\customer-management-platform","$jb\notes\screenshots\lab-48" | Out-Null
Copy-Item -Recurse -Force "$courseLab48\starter\*" "$jb\examples\customer-management-platform\"
cd "$jb\examples\customer-management-platform"
```

**macOS / Linux:**

```bash
JB=~/java-bootcamp
COURSE_LAB48=~/bc-sw-engineer-java-participant/labs/Week\ 6\ -\ Capstone\ Project/module-48/lab48

mkdir -p "$JB/examples/customer-management-platform" "$JB/notes/screenshots/lab-48"
cp -R "$COURSE_LAB48/starter/." "$JB/examples/customer-management-platform/"
cd "$JB/examples/customer-management-platform"
```

If the platform tree already exists, merge carefully — do not overwrite filled ADRs without a backup.

## 45-minute session checklist

- [ ] Work is in `java-bootcamp/examples/customer-management-platform` (not course `labs/`, not `lab48-crm`)
- [ ] Fill product outcome + actors in `docs/architecture/context.md`
- [ ] Sketch C4 context (trust boundaries) in the stub
- [ ] Draft **one** ADR (PostgreSQL or Kafka)
- [ ] Sketch 3 vertical backlog rows (include CAP-12 / `CUS-1001`)
- [ ] Note 2 scored risks in `docs/risk-register.md`

## Smoke test

```powershell
Test-Path docs\architecture\context.md, docs\adrs\_ADR-TEMPLATE.md, docs\backlog.md
Select-String -Path docs\architecture\context.md, docs\backlog.md -Pattern 'CUS-1001|CAP-12'
```

No Maven. Evidence under `~/java-bootcamp/notes/screenshots/lab-48/` (redact secrets).

## Timed-path Pass criteria

| Criterion | Pass / Fail |
| --------- | ----------- |
| Work is in `java-bootcamp/examples/customer-management-platform` | Pass / Fail |
| `context.md` names outcome + Amina/Ravi fixtures | Pass / Fail |
| ≥1 ADR filled (Status + Decision + Consequences) | Pass / Fail |
| Backlog includes CAP-12 for `CUS-1001` | Pass / Fail |

Continue remaining GUIDE steps (all 5 ADRs, NFRs, team plan, full risk register) as homework.

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Overwriting existing ADRs | Backup before copy; merge |
| `mvn` fails | Docs-only — no `pom.xml` |
| Copied Lab 41 | Copy **this starter** |
| Planned `GET /api/customers/{id}` | CAP-12 is **POST /api/v1/interactions** (Lab 49) |
| Secret in ADR | Remove; rotate if real |
