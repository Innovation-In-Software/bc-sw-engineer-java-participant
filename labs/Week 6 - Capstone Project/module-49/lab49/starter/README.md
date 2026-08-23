# Lab 49 starter — session block (~45 minutes)

**Theme:** In-memory interaction slice (`InteractionService` TODOs)

## Two folders

| Folder | You… |
| ------ | ---- |
| **Course clone** (this `starter/` directory) | Read / copy **from** here |
| **`java-bootcamp`** | Merge **`backend/`** into `examples/customer-management-platform` (Lab 48 tree) |

Do **not** copy starter `README.md` over Lab 48 ADRs. Do **not** copy Lab 41. Do **not** use `lab49-crm` as the default.

## Activity card

| | |
| --- | --- |
| **Checkpoint** | **E** |
| **Must prove** | Service TODOs · `mvn -B test` · CUS-1001 · event V1 sketch |
| **Hard gate** | Pre-lab Pass · Lab 48 CAP-12 |

## Copy into your workspace

**Windows (PowerShell):**

```powershell
$jb = "$env:USERPROFILE\java-bootcamp"
$courseLab49 = "$env:USERPROFILE\bc-sw-engineer-java-participant\labs\Week 6 - Capstone Project\module-49\lab49"
$dest = "$jb\examples\customer-management-platform"

New-Item -ItemType Directory -Force -Path "$dest\backend","$dest\docs","$jb\notes\screenshots\lab-49" | Out-Null
Copy-Item -Recurse -Force "$courseLab49\starter\backend\*" "$dest\backend\"
Copy-Item -Force "$courseLab49\starter\docs\build-checklist.md" "$dest\docs\build-checklist.md"
cd "$dest\backend"
```

**macOS / Linux:**

```bash
JB=~/java-bootcamp
COURSE_LAB49=~/bc-sw-engineer-java-participant/labs/Week\ 6\ -\ Capstone\ Project/module-49/lab49
DEST="$JB/examples/customer-management-platform"

mkdir -p "$DEST/docs" "$DEST/backend" "$JB/notes/screenshots/lab-49"
cp -R "$COURSE_LAB49/starter/backend/." "$DEST/backend/"
cp "$COURSE_LAB49/starter/docs/build-checklist.md" "$DEST/docs/build-checklist.md"
cd "$DEST/backend"
```

## 45-minute session checklist

- [ ] Work is in `java-bootcamp/.../backend` (Lab 48 docs still present)
- [ ] Fill `InteractionService` TODOs (no `UnsupportedOperationException`)
- [ ] Known customers `CUS-1001` / `CUS-1002`; reject `CUS-9999`
- [ ] Correlation: header > body > `lab-request-001`
- [ ] `mvn -B test`

## Smoke test

```powershell
mvn -B test
```

Tests are red until TODOs are filled. No `./mvnw`. No Bearer token. Evidence under `notes/screenshots/lab-49/`.

## Timed-path Pass criteria

| Criterion | Pass / Fail |
| --------- | ----------- |
| Lab 48 tree kept; `backend/` merged | Pass / Fail |
| Service TODOs filled | Pass / Fail |
| `mvn -B test` green | Pass / Fail |
| Fixtures in code or test | Pass / Fail |

Full path: Flyway, Kafka, DLT, `docs/backend-demo.md` — see GUIDE.

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| `UnsupportedOperationException` | Fill `InteractionService` |
| `./mvnw` missing | `mvn -B test` |
| 401 on curl | Omit Authorization (Lab 51) |
| Overwrote ADRs | Copy `backend/` only |
