# Lab 32: Resilience4j for CRM Outbound Calls — Northstar Account Profile — Windows

**OS:** Windows  
**Primary IDE:** IntelliJ IDEA Community Edition  
**Optional IDE:** VS Code  
**Shell:** Windows PowerShell  
**Stack hint:** JDK 21 · Maven 3.9+ · Node 22 (React labs) · shared Kafka/PostgreSQL from Week 4 · IntelliJ  
**Full lab steps:** [LAB-32-GUIDE.md](LAB-32-GUIDE.md)  
**Other OS:** [macOS guide](LAB-32-MACOS.md) · [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md)

## Prerequisites (Windows)

- [Lab 0 (Windows)](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/module-00/lab0/LAB-0-WINDOWS.md) complete (JDK 21, Maven when needed, Git)
- IntelliJ IDEA Community with **Project SDK 21**
- Optional: VS Code + Extension Pack for Java
- Instructor shared Kafka / PostgreSQL credentials when this lab needs them ([FINAL-SETUP](../../../FINAL-SETUP-README.md))

## Open this lab in IntelliJ (primary)

1. Start **IntelliJ IDEA Community**.
2. **File → Open…** → `%USERPROFILE%\java-bootcamp\examples\lab32-crm`  
   If the folder does not exist yet, create it under `examples` as the lab steps describe, then open it.
3. Trust the project if prompted.
4. **File → Project Structure → Project** → SDK = **21**, language level **21**.
5. Maven labs: open the `pom.xml` so IntelliJ imports the project; wait for indexing.
6. If there is a `src/main/java` tree, confirm it is marked as **Sources Root** (Maven usually does this).
7. **View → Tool Windows → Terminal** (PowerShell) → `cd $env:USERPROFILE\java-bootcamp` then `cd examples\lab32-crm` when ready.

## Optional: VS Code

1. **File → Open Folder…** → the same project folder.
2. Confirm **Extension Pack for Java** (and Maven for Java) are installed.
3. **Terminal → New Terminal** (PowerShell).

## Paths (Windows)

| Item | Windows |
| ---- | ------- |
| Workspace | `%USERPROFILE%\java-bootcamp` |
| This lab project | `%USERPROFILE%\java-bootcamp\examples\lab32-crm` |
| Shell | PowerShell inside IntelliJ |
| Path style | Backslashes; quote paths with spaces |

```powershell
cd $env:USERPROFILE\java-bootcamp
# after creating the project:
cd examples\lab32-crm
```

### Commands this lab typically uses

```text
mvn clean compile
mvn -q -DskipTests package   # when the lab says so
```

## Run configurations (IntelliJ)

1. Open the class with `public static void main` (or use the Spring Boot run config when the lab uses Spring).
2. Green ▶ → **Run**.
3. **Run → Edit Configurations…** → set **Working directory** to the project root (`examples/lab32-crm`) when the lab reads relative files (`.env`, `application.properties`, logs).
4. For Maven goals: right-click `pom.xml` → **Maven** → `clean` / `compile` / `test` / `package`, or use the Maven tool window.

## Do the lab

Complete **every step** in **[LAB-32-GUIDE.md](LAB-32-GUIDE.md)**.  
Wherever that guide shows `~/java-bootcamp`, on Windows use `%USERPROFILE%\java-bootcamp`. Prefer IntelliJ for Java editing and runs; use VS Code only if you already prefer it.

## Evidence / screenshots

Capture IntelliJ (project tree + Run/Terminal) on Windows. Redact passwords, tokens, and kubeconfig contents.

## Done when

- [ ] Project opens in IntelliJ with SDK **21**
- [ ] Lab checklist / deliverables in [LAB-32-GUIDE.md](LAB-32-GUIDE.md) are complete
- [ ] Commands above succeed in the IntelliJ terminal (or as the lab specifies)
- [ ] Screenshots (if required) show Windows + IntelliJ
