# Lab 52: Capstone Final Defense — Northstar CRM Presentation and Technical Defense — Windows

**OS:** Windows  
**Primary IDE:** IntelliJ IDEA Community Edition  
**Optional IDE:** VS Code  
**Shell:** Windows PowerShell  
**Stack hint:** Session = `defense/` markdown · Full path = PDF + panel  
**Full lab steps:** [LAB-52-GUIDE.md](LAB-52-GUIDE.md)  
**Pre-lab exercises:** [`../exercises/EXERCISES-INDEX.md`](../exercises/EXERCISES-INDEX.md)  
**Other OS:** [macOS guide](LAB-52-MACOS.md) · [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md)  
**Two folders:** [Clone + own repo](../../../CLONE-AND-OWN-REPO-GUIDE.md)


## Prerequisites (Windows)

- Git; Lab 48–51 tree in `examples\customer-management-platform`
- IntelliJ on **`%USERPROFILE%\java-bootcamp`**
- No Maven required for the session block

## Paths (Windows)

| Item | Path |
| ---- | ---- |
| Course clone | `%USERPROFILE%\bc-sw-engineer-java-participant\` |
| Platform tree | `%USERPROFILE%\java-bootcamp\examples\customer-management-platform` |
| Evidence | `%USERPROFILE%\java-bootcamp\notes\screenshots\lab-52` |

### Commands this lab typically uses

**Do not** `Copy-Item starter\*` over the platform root. **Do not** `./mvnw`. **Do not** `mvn` as smoke.

```powershell
$jb = "$env:USERPROFILE\java-bootcamp"
$course = "$env:USERPROFILE\bc-sw-engineer-java-participant\labs\Week 6 - Capstone Project\module-52\lab52"
$dest = "$jb\examples\customer-management-platform"

New-Item -ItemType Directory -Force -Path "$dest\defense","$jb\notes\screenshots\lab-52" | Out-Null
Copy-Item -Force "$course\starter\defense\*" "$dest\defense\"
cd $dest
Get-ChildItem defense\*.md
Select-String -Path defense\*.md -Pattern 'CUS-1001|lab-request-001|POST /api/v1/interactions'
```

Verified notes (2026-08-22): session is docs-only; create API is POST `/api/v1/interactions` with `interactionType`; gaps in Labs 48–51 must be labeled, not invented.

### If it fails

| Symptom | Fix |
| --- | --- |
| Overwrote Lab 48 README | Copy `defense\*` only |
| `mvn` required today | No — session smoke is `Get-ChildItem` |
| `channel` / nested URL | Lab 49 DTO |
| Invented 401/digest | Finish Lab 51 or list a non-claim |

## Do the lab

Complete **[LAB-52-GUIDE.md](LAB-52-GUIDE.md)**. Redact tokens.

## Pass criteria

| # | Confirm | Notes |
| - | ------- | ----- |
| 1 | Work in `java-bootcamp` platform tree | Pass / Fail |
| 2 | Session: outline + script + ≥5 evidence (or full pack) | Pass / Fail |
| 3 | No secrets in `defense/` | Pass / Fail |
| 4 | Screenshots under `notes/screenshots/lab-52/` | Pass / Fail |
