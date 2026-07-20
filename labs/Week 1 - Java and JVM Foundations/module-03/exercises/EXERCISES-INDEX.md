# Module 3 — Pre-Lab Exercises

> **Start here for Module 3:** [`../README.md`](../README.md) · **Which file when?** [`../../../_PARTICIPANT-FILE-GUIDE.md`](../../../_PARTICIPANT-FILE-GUIDE.md)

**Module:** 3 — Object-Oriented Programming in Java  
**Source:** Module 3 slides: Lab Overview / Lab Tasks (Object-Oriented Design)  
**Next (after Exercises 1–8 Pass):** OS how-to → [`../lab3/LAB-3-WINDOWS.md`](../lab3/LAB-3-WINDOWS.md) or [`../lab3/LAB-3-MACOS.md`](../lab3/LAB-3-MACOS.md) → then [`../lab3/LAB-3-GUIDE.md`](../lab3/LAB-3-GUIDE.md)

> **When:** Complete these exercises **after the module slides** and **before** the graded lab.  
> **Gate for Lab 3:** All **eight** exercises must be Pass.  
> **JDK:** 21 · **IDE:** IntelliJ Community (primary) or VS Code (optional).  
> Keep practice sources separate from the graded lab (`examples/Lab3-BankingSystem/`).  
> Exercises 2–5 build on the same small banking model, so work in order.  
> **Lab 3 assumes** you can already apply encapsulation, inheritance, abstract types, interfaces, SOLID spot-checks, and mini UML — Lab 3 packages them into a banking menu app, not first teaching.

## Already covered — do not redo

| Topic | Where you did it |
| ----- | ---------------- |
| Creating a basic class and object | Module 1 Exercise 7 |
| Variables, methods, loops, and arrays | Modules 1–2 |
| Console input and `printf` | Module 2 exercises |

Module 3 practice is about **design**: protecting state, building an inheritance hierarchy, programming to an interface, describing relationships with UML, and separating responsibilities.

## Workspace

| Item | Windows | macOS |
| ---- | ------- | ----- |
| Lab 0 workspace (open in IntelliJ) | `%USERPROFILE%\java-bootcamp` | `~/java-bootcamp` |
| Pre-lab exercises folder | `%USERPROFILE%\java-bootcamp\examples\module-03-exercises` | `~/java-bootcamp/examples/module-03-exercises` |
| Shell | IntelliJ **Terminal** (PowerShell) | IntelliJ **Terminal** (zsh) |

### Setup — create the exercises folder (do once)

**Windows (PowerShell):**

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-03-exercises | Out-Null
cd examples\module-03-exercises
pwd
```

**Expected (Windows):** `C:\Users\<you>\java-bootcamp\examples\module-03-exercises`

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-03-exercises
cd examples/module-03-exercises
pwd
```

**Expected (macOS):** `/Users/<you>/java-bootcamp/examples/module-03-exercises`

Stay in this folder for every exercise below.

### How to create files in IntelliJ

1. Right-click `module-03-exercises` → **New → File**.
2. Enter the complete filename, such as `Account.java` or `notes.md`.
3. Paste or write the content and save (**Ctrl+S** / **⌘S**).
4. Compile and run Java files from the IntelliJ **Terminal**.

| Avoid | Why |
| ----- | --- |
| **New → Java Class** in the hyphenated exercises folder | IntelliJ may treat the folder as an invalid package |
| Marking `examples` as **Sources Root** | Conflicts with Lab 0 and later lab `src/` folders |
| Clicking **Move to source root** | Can move the exercise into the wrong project |

The yellow *outside of the module source root* banner is expected. Ignore it.

## Exercise index

Numbered to match the order these topics appear in the Module 3 slides — work in order.

| # | Exercise | New design skill | File |
| - | -------- | ---------------- | ---- |
| 1 | Identify Entities | Domain nouns → attributes and responsibilities | [`exercise-01-domain-entities.md`](exercise-01-domain-entities.md) |
| 2 | Encapsulation Practice | Private state + validated methods | [`exercise-02-encapsulation.md`](exercise-02-encapsulation.md) |
| 3 | Inheritance and Polymorphism | `extends`, `super`, override, base references | [`exercise-03-inheritance.md`](exercise-03-inheritance.md) |
| 4 | Abstract Classes | `abstract class`, `abstract` method, compiler-enforced contract | [`exercise-04-abstract-classes.md`](exercise-04-abstract-classes.md) |
| 5 | Interface Practice | Contract + `implements` + interface reference | [`exercise-05-interface.md`](exercise-05-interface.md) |
| 6 | SOLID Spot-Check: SRP | Single Responsibility Principle | [`exercise-06-solid-check.md`](exercise-06-solid-check.md) |
| 7 | SOLID Spot-Check: OCP, LSP, ISP, DIP | The other four SOLID principles | [`exercise-07-solid-beyond-srp.md`](exercise-07-solid-beyond-srp.md) |
| 8 | Mini UML | Inheritance, association, multiplicity | [`exercise-08-uml-mini.md`](exercise-08-uml-mini.md) |

Work in order. Keep these practice files separate from the graded Lab 3 submission.

When all **eight** Pass criteria are **Pass**, open your OS how-to and then [`../lab3/LAB-3-GUIDE.md`](../lab3/LAB-3-GUIDE.md). Do not start Lab 3 mid-exercise list.
