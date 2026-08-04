# Lab 47: Professional Communication for a CRM Release — Northstar Stakeholder Pack — macOS

**OS:** macOS  
**Primary IDE:** IntelliJ IDEA Community Edition  
**Optional IDE:** VS Code  
**Shell:** macOS Terminal (zsh)  
**Stack hint:** JDK 21 · Maven · Docker as assigned · kubectl + kubeconfig · GitHub Actions · IntelliJ  
**Full lab steps:** [LAB-47-GUIDE.md](LAB-47-GUIDE.md)  
**Pre-lab exercises:** [`../exercises/EXERCISES-INDEX.md`](../exercises/EXERCISES-INDEX.md)  
**Other OS:** [Windows guide](LAB-47-WINDOWS.md) · [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md)


## Prerequisites (macOS)

- [Lab 0 (macOS)](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/module-00/lab0/LAB-0-MACOS.md) complete (JDK 21, Maven when needed, Git)
- IntelliJ with **Project SDK 21** (open/run steps: [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md))

## Paths (macOS)

| Item | macOS |
| ---- | ------- |
| Workspace (open in IDE) | `~/java-bootcamp` |
| This lab project | `~/java-bootcamp/examples/lab47-crm` |
| Evidence / screenshots | `~/java-bootcamp/notes/screenshots/lab-47` |
| Shell | macOS Terminal inside IntelliJ |
| Path style | Forward slashes |

```bash
cd ~/java-bootcamp
# Lab 0 layout: evidence at workspace root; code under examples/
mkdir -p notes/screenshots/lab-47
cd examples/lab47-crm
```

### Commands this lab typically uses

```bash
cd ~/java-bootcamp/examples/lab47-crm
ls communications/*.md
rg -n '1\.4\.0|CUS-1001|Sev-2|lab-request-001' communications/
```


## Do the lab

Complete every step in **[LAB-47-GUIDE.md](LAB-47-GUIDE.md)**. GUIDE paths already use `~/java-bootcamp`.  
Open/run IntelliJ steps are the same every lab — see [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md).

## Evidence / screenshots

Save under `~/java-bootcamp/notes/screenshots/lab-47`. Capture IntelliJ (project tree + Run/Terminal). Redact secrets.

## Pass criteria

_Mark **Pass** or **Fail** in your lab notes._

| # | Confirm | Your notes |
| - | ------- | ---------- |
| 1 | Workspace `~/java-bootcamp` open in IntelliJ with SDK **21** | Pass / Fail |
| 2 | Lab project under `examples/lab47-crm` as in [LAB-47-GUIDE.md](LAB-47-GUIDE.md) | Pass / Fail |
| 3 | GUIDE deliverables / checkpoints complete | Pass / Fail |
| 4 | Commands above succeed (or as the GUIDE specifies) | Pass / Fail |
| 5 | Screenshots (if required) under `notes/screenshots/lab-47/` | Pass / Fail |
