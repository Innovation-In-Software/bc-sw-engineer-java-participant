# Module 1 — Pre-Lab Exercises

**Module:** 1 — JVM Architecture and Runtime Model  
**Source:** Module 1 slides: Lab Overview / Lab Tasks (JVM and Compilation)  
**Next:** Full lab guide → [`lab1/LAB-1-GUIDE.md`](../lab1/LAB-1-GUIDE.md)

> **When:** Complete these exercises **after the module slides** and **before** the full lab.  
> **JDK:** 21 · **IDE:** IntelliJ Community (primary) or VS Code (optional).  
> Keep practice sources separate from the graded lab (`examples/jvm-compilation-lab/`).

## Workspace (verified Windows)

| Item | Path |
| ---- | ---- |
| Lab 0 workspace (open in IntelliJ) | `%USERPROFILE%\java-bootcamp` |
| Pre-lab exercises folder | `%USERPROFILE%\java-bootcamp\examples\module-01-exercises` |
| Shell | IntelliJ **Terminal** (PowerShell) |

**macOS / Linux:** `~/java-bootcamp/examples/module-01-exercises/`

### Setup — create the exercises folder (do once)

In IntelliJ **Terminal**:

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-01-exercises | Out-Null
cd examples\module-01-exercises
pwd
```

**Expected (Windows, verified):** `pwd` prints `C:\Users\<you>\java-bootcamp\examples\module-01-exercises`, and the Project pane shows `examples` → `module-01-exercises`.

Stay in this folder for every exercise below (or `cd` back before each compile/run).

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
