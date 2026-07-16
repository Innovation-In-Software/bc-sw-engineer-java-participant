# Lab 33: React Components for the CRM Dashboard — macOS

**OS:** macOS  
**Primary IDE:** IntelliJ IDEA Community Edition  
**Optional IDE:** VS Code  
**Shell:** macOS Terminal (zsh)  
**Stack hint:** JDK 21 · Maven 3.9+ · Node 22 (React labs) · shared Kafka/PostgreSQL from Week 4 · IntelliJ  
**Full lab steps:** [LAB-33-GUIDE.md](LAB-33-GUIDE.md)  
**Other OS:** [Windows guide](LAB-33-WINDOWS.md) · [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md)

## Prerequisites (macOS)

- [Lab 0 (macOS)](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/module-00/lab0/LAB-0-MACOS.md) complete (JDK 21, Maven when needed, Git)
- IntelliJ IDEA Community with **Project SDK 21**
- Optional: VS Code + Extension Pack for Java
- Node.js **22** LTS + npm (`node -v`, `npm -v`)
- Instructor shared Kafka / PostgreSQL credentials when this lab needs them ([FINAL-SETUP](../../../FINAL-SETUP-README.md))

## Open this lab in IntelliJ (primary)

1. Start **IntelliJ IDEA Community**.
2. **File → Open…** → `~/java-bootcamp/examples/lab33-crm`  
   If the folder does not exist yet, create it under `examples` as the lab steps describe, then open it.
3. Trust the project if prompted.
4. **File → Project Structure → Project** → SDK = **21**, language level **21**.
5. Maven labs: open the `pom.xml` so IntelliJ imports the project; wait for indexing.
6. If there is a `src/main/java` tree, confirm it is marked as **Sources Root** (Maven usually does this).
7. **View → Tool Windows → Terminal** → `cd ~/java-bootcamp` then `cd examples/lab33-crm` when ready.

## Optional: VS Code

1. **File → Open Folder…** → the same project folder.
2. Confirm **Extension Pack for Java** (and Maven for Java) are installed.
3. **Terminal → New Terminal**.

## Paths (macOS)

| Item | macOS |
| ---- | ----- |
| Workspace | `~/java-bootcamp` |
| This lab project | `~/java-bootcamp/examples/lab33-crm` |
| Shell | zsh / bash inside IntelliJ |
| Path style | Forward slashes; case-sensitive |

```bash
cd ~/java-bootcamp
# after creating the project:
cd examples/lab33-crm
```

### Commands this lab typically uses

```text
npm install
npm run dev
npm run build
```

## Run configurations (IntelliJ)

1. Open the class with `public static void main` (or use the Spring Boot run config when the lab uses Spring).
2. Green ▶ → **Run**.
3. **Run → Edit Configurations…** → set **Working directory** to the project root (`examples/lab33-crm`) when the lab reads relative files (`.env`, `application.properties`, logs).
4. For Maven goals: right-click `pom.xml` → **Maven** → `clean` / `compile` / `test` / `package`, or use the Maven tool window.

## Do the lab

Complete **every step** in **[LAB-33-GUIDE.md](LAB-33-GUIDE.md)**.  
Wherever that guide shows `~/java-bootcamp`, on macOS use `~/java-bootcamp`. Prefer IntelliJ for Java editing and runs; use VS Code only if you already prefer it.

## Evidence / screenshots

Capture IntelliJ (project tree + Run/Terminal) on macOS. Redact passwords, tokens, and kubeconfig contents.

## Done when

- [ ] Project opens in IntelliJ with SDK **21**
- [ ] Lab checklist / deliverables in [LAB-33-GUIDE.md](LAB-33-GUIDE.md) are complete
- [ ] Commands above succeed in the IntelliJ terminal (or as the lab specifies)
- [ ] Screenshots (if required) show macOS + IntelliJ
