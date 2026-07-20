# Module 7 — Pre-Lab Exercises

> **Start here for Module 7:** [`../README.md`](../README.md) · **Which file when?** [`../../../_PARTICIPANT-FILE-GUIDE.md`](../../../_PARTICIPANT-FILE-GUIDE.md)

**Module:** 7 — Exception Handling and Error Management  
**Source:** Module 7 slides: Lab Overview (Exception Handling)  
**Next (after all 8 exercises Pass):** OS how-to → [`../lab7/LAB-7-WINDOWS.md`](../lab7/LAB-7-WINDOWS.md) or [`../lab7/LAB-7-MACOS.md`](../lab7/LAB-7-MACOS.md) → then [`../lab7/LAB-7-GUIDE.md`](../lab7/LAB-7-GUIDE.md)

> **When:** Complete these exercises **after the module slides** and **before** the full lab.  
> **Gate for Lab 7:** All **eight** exercises must be Pass.  
> **JDK:** 21 · **IDE:** IntelliJ Community (primary) or VS Code (optional).
> Keep practice separate from the graded lab (`examples/Lab7-ATMSystem/`).
> Exercises deliberately trigger failures, but every expected failure is caught so the JVM continues.

## Already covered — do not redo

Modules 1–6 covered normal program flow, OOP, collections, and streams. Module 7 focuses only on **failure contracts and recovery**: identify exceptions, catch at a useful boundary, close resources, propagate checked failures, and preserve diagnostic context.

## Checked vs unchecked

| Type | Compiler rule | Example | Typical use |
| ---- | ------------- | ------- | ----------- |
| Checked (`Exception`, excluding `RuntimeException`) | Catch or declare | `IOException` | Recoverable external failure |
| Unchecked (`RuntimeException`) | Catch/declare not required | `IllegalArgumentException` | Invalid argument or programming defect |

Do not catch `Exception` merely to silence errors. Prefer the narrow type you can meaningfully handle.

## Workspace

| Item | Windows | macOS |
| ---- | ------- | ----- |
| Exercises folder | `%USERPROFILE%\java-bootcamp\examples\module-07-exercises` | `~/java-bootcamp/examples/module-07-exercises` |
| Shell | IntelliJ **Terminal** (PowerShell) | IntelliJ **Terminal** (zsh) |

### Setup

**Windows:**

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-07-exercises | Out-Null
cd examples\module-07-exercises
```

**macOS:**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-07-exercises
cd examples/module-07-exercises
```

### IntelliJ file creation

1. Right-click `module-07-exercises` → **New → File**.
2. Enter the complete filename, such as `CommonExceptionsDemo.java`.
3. Paste the starter and save (**Ctrl+S** / **⌘S**).
4. Compile and run from the IntelliJ **Terminal**.

| Avoid | Why |
| ----- | --- |
| **New → Java Class** in the hyphenated exercises folder | IntelliJ may treat the folder as an invalid package |
| Marking `examples` as **Sources Root** | Conflicts with Lab 0 and later lab `src/` folders |
| Clicking **Move to source root** | Can move the exercise into the wrong project |

The yellow *outside of the module source root* banner is expected. Ignore it.

## Exercise index

Numbered to match the order these topics appear in the Module 7 slides — work in order.

| # | Exercise | New error-handling skill | File |
| - | -------- | ------------------------ | ---- |
| 1 | Trigger Common Exceptions | Specific unchecked catches | [`exercise-01-common-exceptions.md`](exercise-01-common-exceptions.md) |
| 2 | `try-catch-finally` | Success/failure cleanup | [`exercise-02-try-catch-finally.md`](exercise-02-try-catch-finally.md) |
| 3 | Try-with-resources | Automatic resource closure | [`exercise-03-try-with-resources.md`](exercise-03-try-with-resources.md) |
| 4 | `throw` and `throws` | Signal vs declare | [`exercise-04-throw-throws.md`](exercise-04-throw-throws.md) |
| 5 | Custom Exception | Checked domain failure | [`exercise-05-custom-exception.md`](exercise-05-custom-exception.md) |
| 6 | Exception Propagation | Trace stack frames to boundary | [`exercise-06-propagation.md`](exercise-06-propagation.md) |
| 7 | Error Handling Strategies | Retry and Fallback around a flaky call | [`exercise-07-error-strategies.md`](exercise-07-error-strategies.md) |
| 8 | Logging Warm-up | Context + exception + user-safe message | [`exercise-08-logging-warmup.md`](exercise-08-logging-warmup.md) |

Work in order. Never use real account data, PINs, credentials, or secrets in logs/screenshots.

When all **eight** Pass criteria are **Pass**, open your OS how-to and then [`../lab7/LAB-7-GUIDE.md`](../lab7/LAB-7-GUIDE.md). Do not start Lab 7 GUIDE Steps mid-exercise list.
