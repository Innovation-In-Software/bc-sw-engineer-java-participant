# Module 1 — Pre-Lab Exercises

> **Start here for Module 1:** [`../README.md`](../README.md) · **Which file when?** [`../../../_PARTICIPANT-FILE-GUIDE.md`](../../../_PARTICIPANT-FILE-GUIDE.md)

**Module:** 1 — JVM Architecture and Runtime Model  
**Source:** Module 1 slides: Lab Overview / Lab Tasks (JVM and Compilation)  
**Next (after all 7 exercises):** OS how-to → [`../lab1/LAB-1-WINDOWS.md`](../lab1/LAB-1-WINDOWS.md) or [`../lab1/LAB-1-MACOS.md`](../lab1/LAB-1-MACOS.md) → then [`../lab1/LAB-1-GUIDE.md`](../lab1/LAB-1-GUIDE.md)

> **When:** Complete these exercises **after the module slides** and **before** the full lab.  
> **JDK:** 21 · **IDE:** IntelliJ Community (primary) or VS Code (optional).  
> Keep practice sources separate from the graded lab (`examples/jvm-compilation-lab/`).  
> Each exercise includes **line comments in starter code**, a short **why** for each step, and plain-English meanings for commands / bytecode.

## Workspace

| Item | Windows | macOS |
| ---- | ------- | ----- |
| Lab 0 workspace (open in IntelliJ) | `%USERPROFILE%\java-bootcamp` | `~/java-bootcamp` |
| Pre-lab exercises folder | `%USERPROFILE%\java-bootcamp\examples\module-01-exercises` | `~/java-bootcamp/examples/module-01-exercises` |
| Shell | IntelliJ **Terminal** (PowerShell) | IntelliJ **Terminal** (zsh) |

### Setup — create the exercises folder (do once)

**Windows (PowerShell)** — verified:

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-01-exercises | Out-Null
cd examples\module-01-exercises
pwd
```

**Expected (Windows):** `pwd` prints `C:\Users\<you>\java-bootcamp\examples\module-01-exercises`; Project pane shows `examples` → `module-01-exercises`.

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-01-exercises
cd examples/module-01-exercises
pwd
```

**Expected (macOS):** `pwd` prints `/Users/<you>/java-bootcamp/examples/module-01-exercises`; Project pane shows `examples` → `module-01-exercises`.

Stay in this folder for every exercise below (or `cd` back before each compile/run).

### How to create each `.java` file (IntelliJ)

**Use this only** (verified on Windows with this workspace layout):

1. Right-click `module-01-exercises` → **New → File**
2. Type the full name including extension, e.g. `Hello.java` or `Variables.java`
3. Paste the code → save (**Ctrl+S** / **⌘S**)
4. Compile and run from the IntelliJ **Terminal** with `javac` / `java` (commands in each exercise)

**Do not** rely on these for the exercises folder (they often fail or mislead):

| Avoid | Why |
| ----- | --- |
| **New → Java Class** | Often missing on `module-01-exercises` (hyphens are not a valid Java package name under a Sources Root) |
| Mark `examples` or `module-01-exercises` as **Sources Root** | Conflicts with Lab 0’s `HelloJava/src` Sources Root; Mark Directory as may only offer **Excluded** |
| Leaving `examples` marked as Sources Root | Causes IDE error: *Missing package statement… package name 'module-01-exercises' … is invalid* (hyphens). **Fix:** right-click `examples` → **Mark Directory as → Unmark as Sources Root**. Keep only `HelloJava/src` (and later lab `src/` folders) as Sources Root. |
| Yellow banner *outside of the module source root* | **Expected** for files in `module-01-exercises`. Ignore it. Do **not** click **Move to source root** (sends the file into Lab 0’s `HelloJava/src`). Use Terminal `javac` / `java`. |
| Creating files under `examples/HelloJava` | That folder is Lab 0 only — keep Module 1 practice in `module-01-exercises` |

Terminal alternative (same result):

**Windows:** `New-Item -ItemType File -Force -Path Hello.java | Out-Null`  
**macOS:** `touch Hello.java`

Then open the file in the editor and paste the code.

## Exercise index

| # | Exercise | File |
| - | -------- | ---- |
| 1 | Hello World | [`exercise-01-hello-world.md`](exercise-01-hello-world.md) |
| 2 | Variables and Data Types | [`exercise-02-variables.md`](exercise-02-variables.md) |
| 3 | Methods and Parameters | [`exercise-03-methods.md`](exercise-03-methods.md) |
| 4 | Control Flow | [`exercise-04-control-flow.md`](exercise-04-control-flow.md) |
| 5 | Objects and Classes | [`exercise-05-objects.md`](exercise-05-objects.md) |
| 6 | Inspect Bytecode | [`exercise-06-javap.md`](exercise-06-javap.md) |
| 7 | Platform Independence (WORA) | [`exercise-07-wora.md`](exercise-07-wora.md) |

Work in order.
