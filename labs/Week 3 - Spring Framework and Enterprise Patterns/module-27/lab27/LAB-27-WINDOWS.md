# Lab 27: Transaction Management with AI Assistance — Northstar CRM Transfers — Windows

**OS:** Windows  
**Primary IDE:** IntelliJ IDEA Community Edition  
**Optional IDE:** VS Code  
**Shell:** Windows PowerShell  
**Stack hint:** JDK 21 · Maven 3.9+ · Spring Boot 3.x · IntelliJ  
**Full lab steps:** [LAB-27-GUIDE.md](LAB-27-GUIDE.md)  
**Other OS:** [macOS guide](LAB-27-MACOS.md) · [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md)

## Prerequisites (Windows)

- [Lab 0 (Windows)](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/module-00/lab0/LAB-0-WINDOWS.md) complete (JDK 21, Maven when needed, Git)
- IntelliJ IDEA Community with **Project SDK 21**
- Optional: VS Code + Extension Pack for Java

## Open this lab in IntelliJ (primary)

1. Start **IntelliJ IDEA Community**.
2. **File → Open…** → `%USERPROFILE%\java-bootcamp` (Lab 0 workspace root — same folder every lab).  
   If `examples\lab27-crm` does not exist yet, create it as the lab GUIDE describes; keep the workspace open at `%USERPROFILE%\java-bootcamp`.
3. Trust the project if prompted.
4. **File → Project Structure → Project** → SDK = **21**, language level **21**.
5. Maven labs: open the `pom.xml` under `examples/lab27-crm` so IntelliJ imports the project; wait for indexing.
6. If there is a `src/main/java` tree, confirm it is marked as **Sources Root** (Maven usually does this).
7. **View → Tool Windows → Terminal** (PowerShell) → `cd $env:USERPROFILE\java-bootcamp` then `cd examples\lab27-crm` when ready.

## Optional: VS Code

1. **File → Open Folder…** → `%USERPROFILE%\java-bootcamp` (same Lab 0 workspace).
2. Confirm **Extension Pack for Java** (and Maven for Java when needed) are installed.
3. **Terminal → New Terminal** (PowerShell) → `cd examples\lab27-crm` for this lab’s commands.

## Paths (Windows)

| Item | Windows |
| ---- | ------- |
| Workspace (open in IDE) | `%USERPROFILE%\java-bootcamp` |
| This lab project | `%USERPROFILE%\java-bootcamp\examples\lab27-crm` |
| Evidence / screenshots | `%USERPROFILE%\java-bootcamp\notes\screenshots\lab-27` |
| Shell | PowerShell inside IntelliJ |
| Path style | Backslashes; quote paths with spaces |

```powershell
cd $env:USERPROFILE\java-bootcamp
# Lab 0 layout: evidence at workspace root; code under examples\
New-Item -ItemType Directory -Force -Path notes\screenshots\lab-27 | Out-Null
cd examples\lab27-crm
```

### Commands this lab typically uses

```text
mvn -B test
mvn -B spring-boot:run
```

Verified (2026-08-03): **Tests run: 3** · **BUILD SUCCESS** twice; force-fail `ACC-FORCE-FAIL` → HTTP **409**, MAIN unchanged at **1000.00**; happy MAIN→LOYALTY `50.00` → MAIN **950.00** / LOYALTY **150.00** / `correlationId=lab-request-001`; insufficient funds leaves balances unchanged. `@Transactional` on `TransferService` only.

## Run configurations (IntelliJ)

1. Open the class with `public static void main` (or use the Spring Boot run config when the lab uses Spring).
2. Green ▶ → **Run**.
3. **Run → Edit Configurations…** → set **Working directory** to the project root (`examples/lab27-crm`) when the lab reads relative files (`.env`, `application.properties`, logs).
4. For Maven goals: right-click `pom.xml` → **Maven** → `clean` / `compile` / `test` / `package`, or use the Maven tool window.

## Do the lab

Complete **every step** in **[LAB-27-GUIDE.md](LAB-27-GUIDE.md)**.  
Wherever that guide shows `~/java-bootcamp`, on Windows use `%USERPROFILE%\java-bootcamp`. Prefer IntelliJ for Java editing and runs; use VS Code only if you already prefer it.

## Evidence / screenshots

Save screenshots under `%USERPROFILE%\java-bootcamp\notes\screenshots\lab-27` (Lab 0 workspace layout). Capture IntelliJ (project tree + Run/Terminal) on Windows. Redact passwords, tokens, and kubeconfig contents.

## Pass criteria

_Mark each row **Pass** or **Fail** in your lab notes (GitHub markdown files are not interactive checklists)._

| # | Confirm | Your notes |
| - | ------- | ---------- |
| 1 | Workspace `%USERPROFILE%\java-bootcamp` open in IntelliJ with SDK **21** | Pass / Fail |
| 2 | Lab project under `examples/lab27-crm` as in [LAB-27-GUIDE.md](LAB-27-GUIDE.md) | Pass / Fail |
| 3 | Lab pass criteria / deliverables in the GUIDE are complete | Pass / Fail |
| 4 | Commands above succeed in the IntelliJ terminal (or as the lab specifies) | Pass / Fail |
| 5 | Screenshots (if required) saved under `notes/screenshots/lab-27/` | Pass / Fail |

## Laptop smoke notes (instructor — Monday, August 3, 2026)

Verified on this Windows laptop with IntelliJ Terminal (PowerShell), Temurin **21.0.11**, Maven **3.9.9**, project `%USERPROFILE%\java-bootcamp\examples\lab27-crm`:

| Check | Result |
| ----- | ------ |
| Dual `mvn -B test` | **Tests run: 3**, Failures: **0**, Errors: **0** · **BUILD SUCCESS** twice (`TransferServiceTest`) |
| Seed balances | `ACC-MAIN-1001=1000.00`, `ACC-LOYALTY-1001=100.00`, `ACC-MAIN-1002=250.00` |
| Force-fail `ACC-FORCE-FAIL` | HTTP **409**; MAIN stays **1000.00** (debit rolled back) |
| Happy MAIN→LOYALTY `50.00` | MAIN **950.00**, LOYALTY **150.00**, `correlationId=lab-request-001` |
| Insufficient funds | HTTP **409**; balances unchanged |
| `@Transactional` | On `TransferService.transfer` only (not controller) |
| Docs | `docs/acid-notes.md` + `copilot-notes/ai-tx-review.md` |

Full participant-style walkthrough: `docs/instructor-participant-help/week-3/27-tx-exercises-and-lab27.md` (instructor-only).
