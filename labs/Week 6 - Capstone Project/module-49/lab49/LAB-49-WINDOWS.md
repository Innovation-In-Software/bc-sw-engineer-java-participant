# Lab 49: Capstone Backend and Messaging — Northstar CRM Interaction Slice — Windows

**OS:** Windows  
**Primary IDE:** IntelliJ IDEA Community Edition  
**Optional IDE:** VS Code  
**Shell:** Windows PowerShell  
**Stack hint:** JDK 21 · Maven (`mvn`, no wrapper) · IntelliJ  
**Full lab steps:** [LAB-49-GUIDE.md](LAB-49-GUIDE.md)  
**Pre-lab exercises:** [`../exercises/EXERCISES-INDEX.md`](../exercises/EXERCISES-INDEX.md)  
**Other OS:** [macOS guide](LAB-49-MACOS.md) · [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md)  
**Two folders:** [Clone + own repo](../../../CLONE-AND-OWN-REPO-GUIDE.md)


## Prerequisites (Windows)

- [Lab 0 (Windows)](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/module-00/lab0/LAB-0-WINDOWS.md) complete (JDK 21, Maven, Git)
- IntelliJ — open **`%USERPROFILE%\java-bootcamp`**, SDK 21
- Lab 48 docs already in `examples\customer-management-platform\docs`

## Paths (Windows)

| Item | Path |
| ---- | ---- |
| Course clone (read GUIDE / starter) | `%USERPROFILE%\bc-sw-engineer-java-participant\` |
| Your repo | `%USERPROFILE%\java-bootcamp` |
| This lab backend | `%USERPROFILE%\java-bootcamp\examples\customer-management-platform\backend` |
| Evidence | `%USERPROFILE%\java-bootcamp\notes\screenshots\lab-49` |

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path notes\screenshots\lab-49 | Out-Null
cd examples\customer-management-platform\backend
```

### Commands this lab typically uses

**Do not** `./mvnw`. **Do not** send `Authorization: Bearer` on the session stub. **Do not** copy Lab 41 over this tree.

```powershell
$jb = "$env:USERPROFILE\java-bootcamp"
$courseLab49 = "$env:USERPROFILE\bc-sw-engineer-java-participant\labs\Week 6 - Capstone Project\module-49\lab49"
$dest = "$jb\examples\customer-management-platform"

New-Item -ItemType Directory -Force -Path "$dest\backend","$dest\docs" | Out-Null
Copy-Item -Recurse -Force "$courseLab49\starter\backend\*" "$dest\backend\"
Copy-Item -Force "$courseLab49\starter\docs\build-checklist.md" "$dest\docs\build-checklist.md"
cd "$dest\backend"
mvn -B test
```

Until `InteractionService` TODOs are filled, tests fail with `UnsupportedOperationException` — that is expected.

Session curl (app running, **no** Bearer):

```powershell
curl.exe -i -X POST "http://localhost:8080/api/v1/interactions" `
  -H "Content-Type: application/json" `
  -H "X-Correlation-ID: lab-request-001" `
  -d "{\"customerId\":\"CUS-1001\",\"interactionType\":\"NOTE\",\"summary\":\"Requested address update\",\"correlationId\":\"lab-request-001\"}"
```

Verified notes (2026-08-22):

- Merge **`backend/`** into Lab 48’s `customer-management-platform`. Do not overwrite ADRs with starter `README.md`.
- Session `pom.xml` has web + validation + test only (no JPA/Kafka/Security).
- CAP-12 is **POST /api/v1/interactions**. Customer ids are **strings**.
- Full-path Kafka CLI: `docker exec crm-kafka /opt/kafka/bin/….sh`.

### If it fails

| Symptom | Fix |
| --- | --- |
| `./mvnw` not found | Use `mvn -B test` |
| 401 | Drop Bearer until Lab 51 |
| Overwrote Lab 48 docs | Copy `backend/` only |
| Copied Lab 41 | Start from Lab 48 tree + Lab 49 `backend/` |


## Do the lab

Complete every step in **[LAB-49-GUIDE.md](LAB-49-GUIDE.md)**.

## Evidence / screenshots

Save under `%USERPROFILE%\java-bootcamp\notes\screenshots\lab-49`. Redact secrets.

## Pass criteria

| # | Confirm | Your notes |
| - | ------- | ---------- |
| 1 | Workspace `java-bootcamp` open, SDK 21 | Pass / Fail |
| 2 | Code under `examples/customer-management-platform/backend` | Pass / Fail |
| 3 | Session tests green **or** GUIDE full-path verify | Pass / Fail |
| 4 | No Maven Wrapper required | Pass / Fail |
| 5 | Screenshots under `notes/screenshots/lab-49/` | Pass / Fail |
