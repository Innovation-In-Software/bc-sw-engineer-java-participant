# Lab 50: Capstone Frontend and Persistence — Northstar CRM UI→PostgreSQL Journey — Windows

**OS:** Windows  
**Primary IDE:** IntelliJ IDEA Community Edition  
**Optional IDE:** VS Code  
**Shell:** Windows PowerShell  
**Stack hint:** Session = SQL + docs · Full path = Node 22 + Maven  
**Full lab steps:** [LAB-50-GUIDE.md](LAB-50-GUIDE.md)  
**Pre-lab exercises:** [`../exercises/EXERCISES-INDEX.md`](../exercises/EXERCISES-INDEX.md)  
**Other OS:** [macOS guide](LAB-50-MACOS.md) · [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md)  
**Two folders:** [Clone + own repo](../../../CLONE-AND-OWN-REPO-GUIDE.md)


## Prerequisites (Windows)

- Git; Lab 48–49 tree in `examples\customer-management-platform`
- IntelliJ on **`%USERPROFILE%\java-bootcamp`**
- Node 22 **only** for the full path (starter has **no** `frontend/`)

## Paths (Windows)

| Item | Path |
| ---- | ---- |
| Course clone | `%USERPROFILE%\bc-sw-engineer-java-participant\` |
| Platform tree | `%USERPROFILE%\java-bootcamp\examples\customer-management-platform` |
| Evidence | `%USERPROFILE%\java-bootcamp\notes\screenshots\lab-50` |

### Commands this lab typically uses

**Do not** `Copy-Item starter\*` over the platform root. **Do not** `./mvnw`. **Do not** `npm` on the session path.

```powershell
$jb = "$env:USERPROFILE\java-bootcamp"
$course = "$env:USERPROFILE\bc-sw-engineer-java-participant\labs\Week 6 - Capstone Project\module-50\lab50"
$dest = "$jb\examples\customer-management-platform"

New-Item -ItemType Directory -Force -Path "$dest\db\migration","$dest\docs","$jb\notes\screenshots\lab-50" | Out-Null
Copy-Item -Force "$course\starter\db\migration\*" "$dest\db\migration\"
Copy-Item -Force "$course\starter\docs\data-api-checklist.md" "$dest\docs\data-api-checklist.md"
cd $dest
Select-String -Path db\migration\V50__customer_interaction.sql -Pattern 'interaction_type|correlation_id|CHECK|INDEX'
```

Full path (when `frontend/` exists):

```powershell
cd frontend
npm ci
npm test
npm run build
```

Verified notes (2026-08-22): session is SQL + checklist; Lab 49 fields are `interactionType` / string `CUS-1001`; starter SQL is PostgreSQL VARCHAR/UUID, not Oracle RAW.

### If it fails

| Symptom | Fix |
| --- | --- |
| Overwrote ADRs | Copy `db\` + checklist only |
| `npm` not found on session | Expected — no frontend in starter |
| `channel` / `GET .../CUS-1001` | Use Lab 49 DTO; no per-id GET in Week 5 |


## Do the lab

Complete **[LAB-50-GUIDE.md](LAB-50-GUIDE.md)**.

## Pass criteria

| # | Confirm | Notes |
| - | ------- | ----- |
| 1 | Work in `java-bootcamp` platform tree | Pass / Fail |
| 2 | Session: checklist + V50 SQL (or full-path React) | Pass / Fail |
| 3 | Types match Lab 49 | Pass / Fail |
| 4 | Screenshots under `notes/screenshots/lab-50/` | Pass / Fail |
