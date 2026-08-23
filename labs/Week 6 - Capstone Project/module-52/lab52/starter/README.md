# Lab 52 starter — session block (~45 minutes)

**Theme:** Defense slide outline + demo script + evidence index (docs only)

## Two folders

| Folder | You… |
| ------ | ---- |
| Course clone (this `starter/defense/`) | Copy **from** here |
| `java-bootcamp` | Merge **`defense/`** into `examples/customer-management-platform` |

**Do not** `Copy-Item starter\*` over the Lab 48–51 tree (this folder’s `README.md` would overwrite Lab 48 README). **Do not** `mvn` today.

## Activity card

| | |
| --- | --- |
| **Checkpoint** | **E** |
| **Must prove** | outline · timed demo · ≥5 evidence · deny/fallback |
| **Hard gate** | Labs 48–51 paths listed; gaps **labeled** |

## Copy

**Windows:**

```powershell
$jb = "$env:USERPROFILE\java-bootcamp"
$course = "$env:USERPROFILE\bc-sw-engineer-java-participant\labs\Week 6 - Capstone Project\module-52\lab52"
$dest = "$jb\examples\customer-management-platform"
New-Item -ItemType Directory -Force -Path "$dest\defense","$jb\notes\screenshots\lab-52" | Out-Null
Copy-Item -Force "$course\starter\defense\*" "$dest\defense\"
cd $dest
```

**macOS / Linux:**

```bash
DEST=~/java-bootcamp/examples/customer-management-platform
COURSE=~/bc-sw-engineer-java-participant/labs/Week\ 6\ -\ Capstone\ Project/module-52/lab52
mkdir -p "$DEST/defense"
cp "$COURSE/starter/defense/"* "$DEST/defense/"
cd "$DEST"
```

## Session checklist

- [ ] `defense/slide-outline.md` titles/speakers
- [ ] Timed `defense/demo-script.md` (Amina + `lab-request-001` + POST `/api/v1/interactions`)
- [ ] ≥5 real paths in `defense/evidence-index.md`
- [ ] ≥3 Q&A cards
- [ ] Fallback if live infra fails
- [ ] Non-claims listed (no React / no JWT / Kafka stub / no k3s as applicable)

## Smoke

```powershell
Get-ChildItem defense\*.md
Test-Path defense\slide-outline.md, defense\demo-script.md, defense\evidence-index.md
```

## Pass criteria

| Criterion | Pass / Fail |
| --------- | ----------- |
| Lab 48–51 files still present | Pass / Fail |
| Outline + timed script with fixtures | Pass / Fail |
| Evidence index has real relative paths | Pass / Fail |
| Deny/fallback documented without inventing 401 | Pass / Fail |

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Overwrote ADRs | Copy `defense\*` only |
| `channel` / nested URL | Lab 49 create body |
| Invented digest | Label Lab 51 gap |
| `mvn` / `./mvnw` | Docs-only smoke |
