# Module 2 — Pre-Lab Exercises

> **Start here for Module 2:** [`../README.md`](../README.md) · **Which file when?** [`../../../_PARTICIPANT-FILE-GUIDE.md`](../../../_PARTICIPANT-FILE-GUIDE.md)

**Module:** 2 — Java Syntax and Core Constructs  
**Source:** Module 2 slides: Lab Overview / Lab Tasks (Java Syntax and I/O)  
**Next (after Exercises 1–7 Pass):** OS how-to → [`../lab2/LAB-2-WINDOWS.md`](../lab2/LAB-2-WINDOWS.md) or [`../lab2/LAB-2-MACOS.md`](../lab2/LAB-2-MACOS.md) → then [`../lab2/LAB-2-GUIDE.md`](../lab2/LAB-2-GUIDE.md)

> **When:** Complete these exercises **after the module slides** and **before** the graded lab.  
> **Core gate for Lab 2:** Exercises **1–7** must be Pass. Exercises **8–9** are challenge/bonus (strongly recommended before Lab display/`printf` steps).  
> **JDK:** 21 · **IDE:** IntelliJ Community (primary) or VS Code (optional).  
> Keep practice sources separate from the graded lab (`examples/Lab2-JavaSyntax/`).  
> Each exercise includes a **TODO / fill-in-the-blank starter** (not complete solutions), a short **why** for each step, and Windows / macOS commands.  
> Replace every `_____` and `// TODO` with your own code, then compile and run.  
> **Lab 2 assumes** you can already use arithmetic, decisions, loops, methods, `Scanner`+parse, and `printf` from these exercises — Lab 2 packages them into a menu app, not first teaching.

## Already covered — do not redo

| Topic | Where you did it |
| ----- | ---------------- |
| `Hello` / `main` / `System.out.println` | Lab 0 · Module 1 Exercise 1 |
| Platform independence (WORA), control flow (bytecode) | Module 1 Exercises 2–3 |
| Hard-coded variables and types | Module 1 Exercise 5 |
| Methods, classes/objects, `javap` | Module 1 Exercises 6–8 |

Module 2 practice is **new**: console input with `Scanner`, typed reads, leftover-newline pitfalls, `Math.PI`, and `printf` formatting — the skills Lab 2 needs for the student menu app.

## Workspace

| Item | Windows | macOS |
| ---- | ------- | ----- |
| Lab 0 workspace (open in IntelliJ) | `%USERPROFILE%\java-bootcamp` | `~/java-bootcamp` |
| Pre-lab exercises folder | `%USERPROFILE%\java-bootcamp\examples\module-02-exercises` | `~/java-bootcamp/examples/module-02-exercises` |
| Shell | IntelliJ **Terminal** (PowerShell) | IntelliJ **Terminal** (zsh) |

### Setup — create the exercises folder (do once)

**Windows (PowerShell)** — verified:

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-02-exercises | Out-Null
cd examples\module-02-exercises
pwd
```

**Expected (Windows):** `pwd` prints `C:\Users\<you>\java-bootcamp\examples\module-02-exercises`.

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-02-exercises
cd examples/module-02-exercises
pwd
```

**Expected (macOS):** `pwd` prints `/Users/<you>/java-bootcamp/examples/module-02-exercises`.

Stay in this folder for every exercise below (or `cd` back before each compile/run).

### How to create each `.java` file (IntelliJ)

**Use this only** (same pattern as Module 1):

1. Right-click `module-02-exercises` → **New → File**
2. Type the full name including extension, e.g. `PersonalDetails.java`
3. Paste the **starter skeleton** → fill every `_____` / `// TODO` → save (**Ctrl+S** / **⌘S**)
4. Compile and run from the IntelliJ **Terminal** with `javac` / `java`

**How the starter works:** scaffolding (imports, prompts, method signatures) is given; the learning parts are blanks marked `_____` or `// TODO`. Your finished file must compile — blanks are not valid Java.

**Do not:**

| Avoid | Why |
| ----- | --- |
| **New → Java Class** | Often missing on hyphenated folders |
| Mark `examples` as **Sources Root** | Conflicts with Lab 0 `HelloJava/src` |
| Click **Move to source root** on the yellow banner | Moves the file into Lab 0 — ignore the banner; use Terminal `javac` / `java` |

## Exercise index

Numbered to match the order these topics appear in the Module 2 slides — work in order.

| # | Exercise | New skill | File |
| - | -------- | --------- | ---- |
| 1 | Calculations | Read two numbers; arithmetic + labels | [`exercise-01-calculator.md`](exercise-01-calculator.md) |
| 2 | Decision Making | `if` / `else if` / `else` and `switch` | [`exercise-02-decision-making.md`](exercise-02-decision-making.md) |
| 3 | Loops | `for`, `while`, and `do-while` | [`exercise-03-loops.md`](exercise-03-loops.md) |
| 4 | Methods | Parameters, return values, and overloading | [`exercise-04-methods.md`](exercise-04-methods.md) |
| 5 | Personal Details | `Scanner` + `nextLine` / `nextInt` + leftover newline | [`exercise-05-personal-details.md`](exercise-05-personal-details.md) |
| 6 | Product Information | Mix `String` / `int` / `double` via `nextLine` + parse | [`exercise-06-product-info.md`](exercise-06-product-info.md) |
| 7 | Area of Circle | `Math.PI` + `printf` decimals | [`exercise-07-circle-area.md`](exercise-07-circle-area.md) |
| 8 | Bill Summary (challenge) | Money math + `%.2f` | [`exercise-08-bill-summary.md`](exercise-08-bill-summary.md) |
| 9 | Personal Profile (bonus) | Aligned `printf` table layout | [`exercise-09-profile-bonus.md`](exercise-09-profile-bonus.md) |

Work in order. Keep practice sources separate from the graded lab submission.

When Exercises **1–7** Pass criteria are **Pass**, open your OS how-to and then [`../lab2/LAB-2-GUIDE.md`](../lab2/LAB-2-GUIDE.md). Do not start Lab 2 mid-exercise list. Finish 8–9 when you can (before or during Lab extended time).
