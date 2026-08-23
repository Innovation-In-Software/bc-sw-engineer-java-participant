# Lab 48: Capstone Planning and Architecture — Northstar CRM Executable Plan — macOS

**OS:** macOS  
**Primary IDE:** IntelliJ IDEA Community Edition  
**Optional IDE:** VS Code  
**Shell:** macOS Terminal (zsh)  
**Stack hint:** Markdown planning · Git · IntelliJ (JDK/Maven **not** required today)  
**Full lab steps:** [LAB-48-GUIDE.md](LAB-48-GUIDE.md)  
**Pre-lab exercises:** [`../exercises/EXERCISES-INDEX.md`](../exercises/EXERCISES-INDEX.md)  
**Other OS:** [Windows guide](LAB-48-WINDOWS.md) · [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md)  
**Two folders:** [Clone + own repo](../../../CLONE-AND-OWN-REPO-GUIDE.md)


## Prerequisites (macOS)

- [Lab 0 (macOS)](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/module-00/lab0/LAB-0-MACOS.md) complete (Git)
- IntelliJ — open **`~/java-bootcamp`**, not the course clone

## Paths (macOS)

| Item | Path |
| ---- | ---- |
| Course clone (read GUIDE / starter) | `~/bc-sw-engineer-java-participant/` |
| Your repo (write / commit / push) | `~/java-bootcamp` |
| This lab plan | `~/java-bootcamp/examples/customer-management-platform` |
| Evidence / screenshots | `~/java-bootcamp/notes/screenshots/lab-48` |
| Shell | macOS Terminal inside IntelliJ |

```bash
cd ~/java-bootcamp
mkdir -p notes/screenshots/lab-48
cd examples/customer-management-platform
```

### Commands this lab typically uses

**Do not** `mvn` / `./mvnw`. **Do not** copy Lab 41–47 CRM here.

```bash
JB=~/java-bootcamp
COURSE_LAB48=~/bc-sw-engineer-java-participant/labs/Week\ 6\ -\ Capstone\ Project/module-48/lab48

mkdir -p "$JB/examples/customer-management-platform"
cp -R "$COURSE_LAB48/starter/." "$JB/examples/customer-management-platform/"
cd "$JB/examples/customer-management-platform"

ls docs/architecture docs/adrs
test -f docs/architecture/context.md && test -f docs/adrs/_ADR-TEMPLATE.md && test -f docs/backlog.md
```

Same verification notes as Windows (2026-08-22): starter into **`customer-management-platform`**, docs-only smoke, CAP-12 is **POST interactions**, Lab 51 is **k3s**. Details: [LAB-48-WINDOWS.md](LAB-48-WINDOWS.md) and [LAB-48-GUIDE.md](LAB-48-GUIDE.md).

### If it fails

| Symptom | Fix |
| --- | --- |
| `pom.xml` / `mvn` not found | Docs lab — use `test -f` |
| Copied Lab 41–47 | Copy **starter** |
| Work ended up in the course clone | Move to `~/java-bootcamp` |


## Do the lab

Complete every step in **[LAB-48-GUIDE.md](LAB-48-GUIDE.md)**. GUIDE paths already use `~/java-bootcamp`.

## Evidence / screenshots

Save under `~/java-bootcamp/notes/screenshots/lab-48`. Redact secrets.

## Pass criteria

| # | Confirm | Your notes |
| - | ------- | ---------- |
| 1 | Workspace `~/java-bootcamp` open in IntelliJ | Pass / Fail |
| 2 | Plan under `examples/customer-management-platform` (starter, not Lab 41) | Pass / Fail |
| 3 | GUIDE session or full-path checkpoints complete | Pass / Fail |
| 4 | Commands above succeed (no Maven) | Pass / Fail |
| 5 | Screenshots under `notes/screenshots/lab-48/` | Pass / Fail |
