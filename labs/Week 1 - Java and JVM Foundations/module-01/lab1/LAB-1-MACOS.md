# Lab 1: JVM and Compilation — macOS

**OS:** macOS  
**Primary IDE:** IntelliJ IDEA Community Edition  
**Optional IDE:** VS Code  
**Shell:** macOS Terminal (zsh)  
**Stack hint:** JDK 21 · Maven not required for most Week 1 labs (Lab 0 installs Maven for later)  
**Full lab steps:** [LAB-1-GUIDE.md](LAB-1-GUIDE.md)  
**Other OS:** [Windows guide](LAB-1-WINDOWS.md) · [IDE conventions](../_IDE-CONVENTIONS.md)

- Pre-lab exercises: [`../exercises/`](../exercises/)
## Prerequisites (macOS)

- [Lab 0 (macOS)](../../module-00/lab0/LAB-0-MACOS.md) complete (JDK 21, Maven when needed, Git)
- IntelliJ IDEA Community with **Project SDK 21**
- Optional: VS Code + Extension Pack for Java

## Open this lab in IntelliJ (primary)

1. Start **IntelliJ IDEA Community**.
2. **File → Open…** → `~/java-bootcamp/examples/lab1-answers`  
   If the folder does not exist yet, create it under `examples` as the lab steps describe, then open it.
3. Trust the project if prompted.
4. **File → Project Structure → Project** → SDK = **21**, language level **21**.
5. Maven labs: open the `pom.xml` so IntelliJ imports the project; wait for indexing.
6. If there is a `src/main/java` tree, confirm it is marked as **Sources Root** (Maven usually does this).
7. **View → Tool Windows → Terminal** → `cd ~/java-bootcamp` then `cd examples/lab1-answers` when ready.

## Optional: VS Code

1. **File → Open Folder…** → the same project folder.
2. Confirm **Extension Pack for Java** (and Maven for Java) are installed.
3. **Terminal → New Terminal**.

## Paths (macOS)

| Item | macOS |
| ---- | ----- |
| Workspace | `~/java-bootcamp` |
| This lab project | `~/java-bootcamp/examples/lab1-answers` |
| Shell | zsh / bash inside IntelliJ |
| Path style | Forward slashes; case-sensitive |

```bash
cd ~/java-bootcamp
# after creating the project:
cd examples/lab1-answers
```

### Commands this lab typically uses

```text
javac -d out src/.../*.java
java -cp out ...Main
```

## Run configurations (IntelliJ)

1. Open the class with `public static void main` (or use the Spring Boot run config when the lab uses Spring).
2. Green ▶ → **Run**.
3. **Run → Edit Configurations…** → set **Working directory** to the project root (`examples/lab1-answers`) when the lab reads relative files (`.env`, `application.properties`, logs).
4. For Maven goals: right-click `pom.xml` → **Maven** → `clean` / `compile` / `test` / `package`, or use the Maven tool window.

## Do the lab

Complete **every step** in **[LAB-1-GUIDE.md](LAB-1-GUIDE.md)**.  
Wherever that guide shows `~/java-bootcamp`, on macOS use `~/java-bootcamp`. Prefer IntelliJ for Java editing and runs; use VS Code only if you already prefer it.

## Evidence / screenshots

Capture IntelliJ (project tree + Run/Terminal) on macOS. Redact passwords, tokens, and kubeconfig contents.

## Done when

- [ ] Project opens in IntelliJ with SDK **21**
- [ ] Lab checklist / deliverables in [LAB-1-GUIDE.md](LAB-1-GUIDE.md) are complete
- [ ] Commands above succeed in the IntelliJ terminal (or as the lab specifies)
- [ ] Screenshots (if required) show macOS + IntelliJ
