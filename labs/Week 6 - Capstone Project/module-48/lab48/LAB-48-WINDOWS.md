# Lab 48: Capstone Planning and Architecture — Northstar CRM Executable Plan — Windows

**OS:** Windows  
**Primary IDE:** IntelliJ IDEA Community Edition  
**Optional IDE:** VS Code  
**Shell:** Windows PowerShell  
**Stack hint:** Markdown planning · Git · IntelliJ (JDK/Maven **not** required today)  
**Full lab steps:** [LAB-48-GUIDE.md](LAB-48-GUIDE.md)  
**Pre-lab exercises:** [`../exercises/EXERCISES-INDEX.md`](../exercises/EXERCISES-INDEX.md)  
**Other OS:** [macOS guide](LAB-48-MACOS.md) · [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md)  
**Two folders:** [Clone + own repo](../../../CLONE-AND-OWN-REPO-GUIDE.md)


## Prerequisites (Windows)

- [Lab 0 (Windows)](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/module-00/lab0/LAB-0-WINDOWS.md) complete (Git)
- IntelliJ — open **`%USERPROFILE%\java-bootcamp`**, not the course clone

## Paths (Windows)

| Item | Path |
| ---- | ---- |
| Course clone (read GUIDE / starter) | `%USERPROFILE%\bc-sw-engineer-java-participant\` |
| Your repo (write / commit / push) | `%USERPROFILE%\java-bootcamp` |
| This lab plan | `%USERPROFILE%\java-bootcamp\examples\customer-management-platform` |
| Evidence / screenshots | `%USERPROFILE%\java-bootcamp\notes\screenshots\lab-48` |
| Shell | Windows PowerShell inside IntelliJ |

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path notes\screenshots\lab-48 | Out-Null
cd examples\customer-management-platform
```

### Commands this lab typically uses

**Do not** `mvn` / `./mvnw`. There is **no** `pom.xml` in the Lab 48 starter. **Do not** copy Lab 41–47 CRM here.

```powershell
$jb = "$env:USERPROFILE\java-bootcamp"
$courseLab48 = "$env:USERPROFILE\bc-sw-engineer-java-participant\labs\Week 6 - Capstone Project\module-48\lab48"

New-Item -ItemType Directory -Force -Path "$jb\examples\customer-management-platform" | Out-Null
Copy-Item -Recurse -Force "$courseLab48\starter\*" "$jb\examples\customer-management-platform\"
cd "$jb\examples\customer-management-platform"

Get-ChildItem docs\architecture, docs\adrs
Test-Path docs\architecture\context.md, docs\adrs\_ADR-TEMPLATE.md, docs\backlog.md
Select-String -Path docs\*.md, docs\architecture\*.md, docs\adrs\*.md -Pattern 'CUS-1001|CAP-12' | Select-Object -First 15
```

Verified notes (2026-08-22):

- Seed is **starter docs**. Target folder is **`customer-management-platform`**, not `lab48-crm`.
- Session smoke is file presence + fixture strings. Full path is more ADRs/NFRs, still no Maven.
- CAP-12 is **`POST /api/v1/interactions`** (Lab 49). Week 5 has **no** `GET /api/customers/{id}`.
- Lab 51 deploy is **k3s**. Lab 42 **k3d** `:8088` is not the default capstone cluster.

### If it fails

| Symptom | Fix |
| --- | --- |
| `pom.xml` / `mvn` not found | Docs lab — use `Test-Path` |
| Copied Lab 41–47 | Copy **starter** into `customer-management-platform` |
| Work ended up in the course clone | Move to `java-bootcamp` |
| `Get-ChildItem` cannot find docs | Copy did not run, or wrong cwd |


## Do the lab

Complete every step in **[LAB-48-GUIDE.md](LAB-48-GUIDE.md)**. Wherever the GUIDE shows `~/java-bootcamp`, use `%USERPROFILE%\java-bootcamp`.

## Evidence / screenshots

Save under `%USERPROFILE%\java-bootcamp\notes\screenshots\lab-48`. Redact secrets.

## Pass criteria

| # | Confirm | Your notes |
| - | ------- | ---------- |
| 1 | Workspace `%USERPROFILE%\java-bootcamp` open in IntelliJ | Pass / Fail |
| 2 | Plan under `examples/customer-management-platform` (starter, not Lab 41) | Pass / Fail |
| 3 | GUIDE session or full-path checkpoints complete | Pass / Fail |
| 4 | Commands above succeed (no Maven) | Pass / Fail |
| 5 | Screenshots under `notes/screenshots/lab-48/` | Pass / Fail |
