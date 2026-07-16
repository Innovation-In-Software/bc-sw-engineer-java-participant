# Lab 52: Capstone Final Defense — Northstar CRM Presentation and Technical Defense — macOS

**OS:** macOS  
**Primary IDE:** IntelliJ IDEA Community Edition  
**Optional IDE:** VS Code  
**Shell:** macOS Terminal (zsh)  
**Stack hint:** Capstone: full stack from prior weeks · IntelliJ primary  
**Full lab steps:** [README.md](README.md)  
**Other OS:** [Windows guide](README-windows.md) · [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md)

## Prerequisites (macOS)

- [Lab 0 (macOS)](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/module-00/lab0/README-macos.md) complete (JDK 21, Maven when needed, Git)
- IntelliJ IDEA Community with **Project SDK 21**
- Optional: VS Code + Extension Pack for Java
- Instructor shared Kafka / PostgreSQL credentials when this lab needs them ([FINAL-SETUP](../../../FINAL-SETUP-README.md))
- Docker Desktop (or Engine) when the lab builds images
- `kubectl` + your `studentNN.yaml` kubeconfig

## Open this lab in IntelliJ (primary)

1. Start **IntelliJ IDEA Community**.
2. **File → Open…** → `~/java-bootcamp/examples/lab52-crm`  
   If the folder does not exist yet, create it under `examples` as the lab steps describe, then open it.
3. Trust the project if prompted.
4. **File → Project Structure → Project** → SDK = **21**, language level **21**.
5. Maven labs: open the `pom.xml` so IntelliJ imports the project; wait for indexing.
6. If there is a `src/main/java` tree, confirm it is marked as **Sources Root** (Maven usually does this).
7. **View → Tool Windows → Terminal** → `cd ~/java-bootcamp` then `cd examples/lab52-crm` when ready.

## Optional: VS Code

1. **File → Open Folder…** → the same project folder.
2. Confirm **Extension Pack for Java** (and Maven for Java) are installed.
3. **Terminal → New Terminal**.

## Paths (macOS)

| Item | macOS |
| ---- | ----- |
| Workspace | `~/java-bootcamp` |
| This lab project | `~/java-bootcamp/examples/lab52-crm` |
| Shell | zsh / bash inside IntelliJ |
| Path style | Forward slashes; case-sensitive |

```bash
cd ~/java-bootcamp
# after creating the project:
cd examples/lab52-crm
```

### Commands this lab typically uses

```text
mvn clean compile
mvn -q -DskipTests package   # when the lab says so
```

## Run configurations (IntelliJ)

1. Open the class with `public static void main` (or use the Spring Boot run config when the lab uses Spring).
2. Green ▶ → **Run**.
3. **Run → Edit Configurations…** → set **Working directory** to the project root (`examples/lab52-crm`) when the lab reads relative files (`.env`, `application.properties`, logs).
4. For Maven goals: right-click `pom.xml` → **Maven** → `clean` / `compile` / `test` / `package`, or use the Maven tool window.

## Do the lab

Complete **every step** in **[README.md](README.md)**.  
Wherever that guide shows `~/java-bootcamp`, on macOS use `~/java-bootcamp`. Prefer IntelliJ for Java editing and runs; use VS Code only if you already prefer it.

## Evidence / screenshots

Capture IntelliJ (project tree + Run/Terminal) on macOS. Redact passwords, tokens, and kubeconfig contents.

## Done when

- [ ] Project opens in IntelliJ with SDK **21**
- [ ] Lab checklist / deliverables in [README.md](README.md) are complete
- [ ] Commands above succeed in the IntelliJ terminal (or as the lab specifies)
- [ ] Screenshots (if required) show macOS + IntelliJ
