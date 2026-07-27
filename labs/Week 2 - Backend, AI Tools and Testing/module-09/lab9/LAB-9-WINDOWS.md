# Lab 9: Maven Build and Dependencies — Northstar CRM Build Lab — Windows

**OS:** Windows  
**Primary IDE:** IntelliJ IDEA Community Edition  
**Optional IDE:** VS Code  
**Shell:** Windows PowerShell  
**Stack hint:** JDK 21 · Maven 3.9+ · IntelliJ  
**Full lab steps:** [LAB-9-GUIDE.md](LAB-9-GUIDE.md)  
**Pre-lab exercises (1→6):** [`../exercises/EXERCISES-INDEX.md`](../exercises/EXERCISES-INDEX.md)  
**Other OS:** [macOS guide](LAB-9-MACOS.md) · [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md)

**Verified:** IntelliJ Terminal (PowerShell) + Temurin OpenJDK **21.0.11** + Apache Maven **3.9.9**. Copied `examples\lab8-crm` → `examples\lab9-crm`, expanded POM (Spring/JUnit placeholders, Surefire, jar `Main-Class`, `dev`/`test`/`prod` profiles). Lifecycle `validate`→`install` and `mvn -B verify` → **BUILD SUCCESS**; `PlaceholderTest` Tests run: **1**; `java -jar target\customer-service.jar` prints the CRM skeleton banner; default profile **`dev`**.

## Prerequisites (Windows)

- [Lab 0 (Windows)](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/module-00/lab0/LAB-0-WINDOWS.md) complete (JDK 21, Maven when needed, Git)
- IntelliJ IDEA Community with **Project SDK 21**
- Optional: VS Code + Extension Pack for Java

## Open this lab in IntelliJ (primary)

1. Start **IntelliJ IDEA Community**.
2. **File → Open…** → `%USERPROFILE%\java-bootcamp` (Lab 0 workspace root — same folder every lab).  
   If `examples\lab9-crm` does not exist yet, create it as the lab GUIDE describes; keep the workspace open at `%USERPROFILE%\java-bootcamp`.
3. Trust the project if prompted.
4. **File → Project Structure → Project** → SDK = **21**, language level **21**.
5. Maven labs: open the `pom.xml` under `examples/lab9-crm` so IntelliJ imports the project; wait for indexing.
6. If there is a `src/main/java` tree, confirm it is marked as **Sources Root** (Maven usually does this).
7. **View → Tool Windows → Terminal** (PowerShell) → `cd $env:USERPROFILE\java-bootcamp` then `cd examples\lab9-crm` when ready.

## Optional: VS Code

1. **File → Open Folder…** → `%USERPROFILE%\java-bootcamp` (same Lab 0 workspace).
2. Confirm **Extension Pack for Java** (and Maven for Java when needed) are installed.
3. **Terminal → New Terminal** (PowerShell) → `cd examples\lab9-crm` for this lab’s commands.

## Paths (Windows)

| Item | Windows |
| ---- | ------- |
| Workspace (open in IDE) | `%USERPROFILE%\java-bootcamp` |
| This lab project | `%USERPROFILE%\java-bootcamp\examples\lab9-crm` |
| Evidence / screenshots | `%USERPROFILE%\java-bootcamp\notes\screenshots\lab-9` |
| Shell | PowerShell inside IntelliJ |
| Path style | Backslashes; quote paths with spaces |

```powershell
cd $env:USERPROFILE\java-bootcamp\examples
Copy-Item -Recurse lab8-crm lab9-crm
New-Item -ItemType Directory -Force -Path ..\notes\screenshots\lab-9 | Out-Null
cd lab9-crm
```

### Commands this lab typically uses

From `examples\lab9-crm` in the IntelliJ Terminal (PowerShell):

```powershell
mvn -q validate
mvn -q test
mvn -q clean package
java -jar target\customer-service.jar
mvn -B verify
mvn dependency:tree
mvn help:active-profiles
```

## Run configurations (IntelliJ)

1. Open the class with `public static void main` (or use the Spring Boot run config when the lab uses Spring).
2. Green ▶ → **Run**.
3. **Run → Edit Configurations…** → set **Working directory** to the project root (`examples/lab9-crm`) when the lab reads relative files (`.env`, `application.properties`, logs).
4. For Maven goals: right-click `pom.xml` → **Maven** → `clean` / `compile` / `test` / `package`, or use the Maven tool window.

## Do the lab

Complete **every step** in **[LAB-9-GUIDE.md](LAB-9-GUIDE.md)**.  
Wherever that guide shows `~/java-bootcamp`, on Windows use `%USERPROFILE%\java-bootcamp`. Prefer IntelliJ for Java editing and runs; use VS Code only if you already prefer it.

## Evidence / screenshots

Save screenshots under `%USERPROFILE%\java-bootcamp\notes\screenshots\lab-9` (Lab 0 workspace layout). Capture IntelliJ (project tree + Run/Terminal) on Windows. Redact passwords, tokens, and kubeconfig contents.

## Pass criteria

_Mark each row **Pass** or **Fail** in your lab notes (GitHub markdown files are not interactive checklists)._

| # | Confirm | Your notes |
| - | ------- | ---------- |
| 1 | Workspace `%USERPROFILE%\java-bootcamp` open in IntelliJ with SDK **21** | Pass / Fail |
| 2 | Lab project under `examples/lab9-crm` as in [LAB-9-GUIDE.md](LAB-9-GUIDE.md) | Pass / Fail |
| 3 | Lab pass criteria / deliverables in the GUIDE are complete | Pass / Fail |
| 4 | Commands above succeed in the IntelliJ terminal (or as the lab specifies) | Pass / Fail |
| 5 | Screenshots (if required) saved under `notes/screenshots/lab-9/` | Pass / Fail |

### Verified smoke commands (participant laptop)

**Verified result (Temurin 21.0.11 / Maven 3.9.9):** `target\customer-service.jar` exists; `java -jar` prints Lab 8 Main banner; Surefire runs `PlaceholderTest`; default active profile is `dev`; artifact installed under `~\.m2\repository\com\northstar\customer-service\0.1.0-SNAPSHOT\`. Finish Lab 8 first if `lab8-crm` is missing.

