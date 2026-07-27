# Lab 10: GitHub Copilot Fundamentals for Java Developers — Northstar CRM — Windows

**OS:** Windows  
**Primary IDE:** IntelliJ IDEA Community Edition  
**Optional IDE:** VS Code  
**Shell:** Windows PowerShell  
**Stack hint:** JDK 21 · Maven 3.9+ · IntelliJ  
**Full lab steps:** [LAB-10-GUIDE.md](LAB-10-GUIDE.md)  
**Pre-lab exercises (1→6):** [`../exercises/EXERCISES-INDEX.md`](../exercises/EXERCISES-INDEX.md)  
**Other OS:** [macOS guide](LAB-10-MACOS.md) · [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md)

**Verified:** IntelliJ Terminal (PowerShell) + Temurin OpenJDK **21.0.11** + Apache Maven **3.9.9**. Copied `examples\lab9-crm` → `examples\lab10-crm`; added `CustomerStatus`, fleshed-out `Customer` (no JPA), in-memory `CustomerService`, `Main` harness, and `copilot-notes\ai-review-notes.md` (`lab10-001`–`lab10-004`). `mvn -q clean compile` → **BUILD SUCCESS**; `java -cp target\classes com.northstar.crm.Main` prints both sample customers, PROSPECT filter for `CUS-1002`, then ACTIVE after `updateStatus`. Blank/duplicate/unknown ID rules verified. Controllers left as Lab 8/9 stubs with thin UOE methods on the service so Maven still compiles.

## Prerequisites (Windows)

- [Lab 0 (Windows)](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/module-00/lab0/LAB-0-WINDOWS.md) complete (JDK 21, Maven when needed, Git)
- IntelliJ IDEA Community with **Project SDK 21**
- Optional: VS Code + Extension Pack for Java

## Open this lab in IntelliJ (primary)

1. Start **IntelliJ IDEA Community**.
2. **File → Open…** → `%USERPROFILE%\java-bootcamp` (Lab 0 workspace root — same folder every lab).  
   If `examples\lab10-crm` does not exist yet, create it as the lab GUIDE describes; keep the workspace open at `%USERPROFILE%\java-bootcamp`.
3. Trust the project if prompted.
4. **File → Project Structure → Project** → SDK = **21**, language level **21**.
5. Maven labs: open the `pom.xml` under `examples/lab10-crm` so IntelliJ imports the project; wait for indexing.
6. If there is a `src/main/java` tree, confirm it is marked as **Sources Root** (Maven usually does this).
7. **View → Tool Windows → Terminal** (PowerShell) → `cd $env:USERPROFILE\java-bootcamp` then `cd examples\lab10-crm` when ready.

## Optional: VS Code

1. **File → Open Folder…** → `%USERPROFILE%\java-bootcamp` (same Lab 0 workspace).
2. Confirm **Extension Pack for Java** (and Maven for Java when needed) are installed.
3. **Terminal → New Terminal** (PowerShell) → `cd examples\lab10-crm` for this lab’s commands.

## Paths (Windows)

| Item | Windows |
| ---- | ------- |
| Workspace (open in IDE) | `%USERPROFILE%\java-bootcamp` |
| This lab project | `%USERPROFILE%\java-bootcamp\examples\lab10-crm` |
| Evidence / screenshots | `%USERPROFILE%\java-bootcamp\notes\screenshots\lab-10` |
| Shell | PowerShell inside IntelliJ |
| Path style | Backslashes; quote paths with spaces |

```powershell
cd $env:USERPROFILE\java-bootcamp
# Lab 0 layout: evidence at workspace root; code under examples\
New-Item -ItemType Directory -Force -Path notes\screenshots\lab-10 | Out-Null
cd examples\lab10-crm
```

### Commands this lab typically uses

```powershell
cd $env:USERPROFILE\java-bootcamp\examples
Copy-Item -Recurse lab9-crm lab10-crm   # once
cd lab10-crm
mvn -q clean compile
java -cp target\classes com.northstar.crm.Main
```

Verified smoke theme:

```text
All customers: [Customer{customerId='CUS-1001', fullName='Amina Khan', status=ACTIVE}, Customer{customerId='CUS-1002', fullName='Ravi Singh', status=PROSPECT}]
PROSPECT customers: [Customer{customerId='CUS-1002', fullName='Ravi Singh', status=PROSPECT}]
After activation: Optional[Customer{customerId='CUS-1002', fullName='Ravi Singh', status=ACTIVE}]
```

## Run configurations (IntelliJ)

1. Open the class with `public static void main` (or use the Spring Boot run config when the lab uses Spring).
2. Green ▶ → **Run**.
3. **Run → Edit Configurations…** → set **Working directory** to the project root (`examples/lab10-crm`) when the lab reads relative files (`.env`, `application.properties`, logs).
4. For Maven goals: right-click `pom.xml` → **Maven** → `clean` / `compile` / `test` / `package`, or use the Maven tool window.

## Do the lab

Complete **every step** in **[LAB-10-GUIDE.md](LAB-10-GUIDE.md)**.  
Wherever that guide shows `~/java-bootcamp`, on Windows use `%USERPROFILE%\java-bootcamp`. Prefer IntelliJ for Java editing and runs; use VS Code only if you already prefer it.

## Evidence / screenshots

Save screenshots under `%USERPROFILE%\java-bootcamp\notes\screenshots\lab-10` (Lab 0 workspace layout). Capture IntelliJ (project tree + Run/Terminal) on Windows. Redact passwords, tokens, and kubeconfig contents.

## Pass criteria

_Mark each row **Pass** or **Fail** in your lab notes (GitHub markdown files are not interactive checklists)._

| # | Confirm | Your notes |
| - | ------- | ---------- |
| 1 | Workspace `%USERPROFILE%\java-bootcamp` open in IntelliJ with SDK **21** | Pass / Fail |
| 2 | Lab project under `examples/lab10-crm` as in [LAB-10-GUIDE.md](LAB-10-GUIDE.md) | Pass / Fail |
| 3 | Lab pass criteria / deliverables in the GUIDE are complete | Pass / Fail |
| 4 | Commands above succeed in the IntelliJ terminal (or as the lab specifies) | Pass / Fail |
| 5 | Screenshots (if required) saved under `notes/screenshots/lab-10/` | Pass / Fail |
