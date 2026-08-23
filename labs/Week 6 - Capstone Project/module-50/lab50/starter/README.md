# Lab 50 starter — session block (~45 minutes)

**Theme:** Data/API checklist + Flyway SQL (no React in this starter)

## Two folders

| Folder | You… |
| ------ | ---- |
| Course clone (this `starter/`) | Copy **from** here |
| `java-bootcamp` | Merge **`db/`** + **`docs/data-api-checklist.md`** into `examples/customer-management-platform` |

**Do not** `Copy-Item starter\*` over the Lab 48/49 tree. There is **no** `frontend/` here — `npm` is full-path homework.

## Activity card

| | |
| --- | --- |
| **Checkpoint** | **E** |
| **Must prove** | checklist · SQL TODOs · fixtures · durability SELECT |
| **Hard gate** | Lab 49 DTOs (`interactionType`, string `CUS-1001`) |

## Copy

**Windows:**

```powershell
$jb = "$env:USERPROFILE\java-bootcamp"
$course = "$env:USERPROFILE\bc-sw-engineer-java-participant\labs\Week 6 - Capstone Project\module-50\lab50"
$dest = "$jb\examples\customer-management-platform"
New-Item -ItemType Directory -Force -Path "$dest\db\migration","$dest\docs","$jb\notes\screenshots\lab-50" | Out-Null
Copy-Item -Force "$course\starter\db\migration\*" "$dest\db\migration\"
Copy-Item -Force "$course\starter\docs\data-api-checklist.md" "$dest\docs\data-api-checklist.md"
cd $dest
```

**macOS / Linux:**

```bash
DEST=~/java-bootcamp/examples/customer-management-platform
COURSE=~/bc-sw-engineer-java-participant/labs/Week\ 6\ -\ Capstone\ Project/module-50/lab50
mkdir -p "$DEST/db/migration" "$DEST/docs"
cp "$COURSE/starter/db/migration/"* "$DEST/db/migration/"
cp "$COURSE/starter/docs/data-api-checklist.md" "$DEST/docs/data-api-checklist.md"
cd "$DEST"
```

## Session checklist

- [ ] Checklist matches Lab 49 create body (not `channel`)
- [ ] SQL TODOs: CHECK on `interaction_type`, timeline index, FK deferred if no customer table
- [ ] Journey names CUS-1001 / lab-request-001
- [ ] Durability SELECT drafted

## Smoke

```powershell
Test-Path docs\data-api-checklist.md, db\migration\V50__customer_interaction.sql
```

## Pass criteria

| Criterion | Pass / Fail |
| --------- | ----------- |
| Lab 48/49 files still present | Pass / Fail |
| Checklist + SQL aligned to Lab 49 | Pass / Fail |
| Durability SELECT drafted | Pass / Fail |

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Overwrote ADRs | Copy two paths only |
| `channel` / RAW(16) | Follow this SQL stub + Lab 49 |
| `npm` required today | No — session has no frontend |
