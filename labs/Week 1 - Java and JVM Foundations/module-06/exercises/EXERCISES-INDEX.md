# Module 6 — Pre-Lab Exercises

> **Start here for Module 6:** [`../README.md`](../README.md) · **Which file when?** [`../../../_PARTICIPANT-FILE-GUIDE.md`](../../../_PARTICIPANT-FILE-GUIDE.md)

**Module:** 6 — Streams and Functional Programming  
**Source:** Module 6 slides: Lab Overview (Streams and Lambdas)  
**Next (after Exercises 1–7 Pass):** OS how-to → [`../lab6/LAB-6-WINDOWS.md`](../lab6/LAB-6-WINDOWS.md) or [`../lab6/LAB-6-MACOS.md`](../lab6/LAB-6-MACOS.md) → then [`../lab6/LAB-6-GUIDE.md`](../lab6/LAB-6-GUIDE.md)

> **When:** Complete these exercises **after the module slides** and **before** the full lab.
> **Gate for Lab 6:** Exercises **1–7** must be Pass. Exercise 8 is recommended parallel bonus.
> **JDK:** 21 · **IDE:** IntelliJ Community (primary) or VS Code (optional).
> Keep practice separate from the graded lab (`examples/Lab6-EmployeeAnalytics/`).
> Exercises 2–7 reuse the five-employee dataset created in Exercise 1, so work in order.

## Already covered — do not redo

| Topic | Where you did it |
| ----- | ---------------- |
| Classes, records, methods, and interfaces | Modules 2–3 |
| `List` and collection iteration | Module 5 |
| Collection choice and mutability | Module 5 exercises |

Module 6 focuses on **declarative data processing**: describe what to select,
transform, aggregate, or group while the Streams API handles iteration.

## Stream pipeline vocabulary

| Term | Easy meaning | Example |
| ---- | ------------ | ------- |
| Source | Data the stream reads | `EmployeeData.sample().stream()` |
| Intermediate operation | Builds the pipeline; lazy until a terminal operation | `filter`, `map`, `sorted` |
| Terminal operation | Executes the pipeline and produces a result | `toList`, `count`, `max` |
| Stateless lambda | Uses only its input; safe and predictable | `e -> e.salary() > 60_000` |
| Reduction | Combines many values into one result | `count`, `min`, `max`, `reduce` |

Do not reuse a stream after a terminal operation. Create a new stream from the
source collection for each question.

## Workspace

| Item | Windows | macOS |
| ---- | ------- | ----- |
| Lab 0 workspace | `%USERPROFILE%\java-bootcamp` | `~/java-bootcamp` |
| Exercises folder | `%USERPROFILE%\java-bootcamp\examples\module-06-exercises` | `~/java-bootcamp/examples/module-06-exercises` |
| Shell | IntelliJ **Terminal** (PowerShell) | IntelliJ **Terminal** (zsh) |

### Setup — create the folder once

**Windows (PowerShell):**

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-06-exercises | Out-Null
cd examples\module-06-exercises
pwd
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-06-exercises
cd examples/module-06-exercises
pwd
```

Stay in this folder for all eight exercises.

### IntelliJ file creation

1. Right-click `module-06-exercises` → **New → File**.
2. Enter the complete filename, such as `Employee.java`.
3. Paste the starter code and save (**Ctrl+S** / **⌘S**).
4. Compile and run from the IntelliJ Terminal.

Ignore the yellow *outside of the module source root* banner. Do not mark the
hyphenated exercises folder as Sources Root and do not click
**Move to source root**.

## Exercise index

Numbered to match the order these topics appear in the Module 6 slides — work in order.

| # | Exercise | New stream skill | File |
| - | -------- | ---------------- | ---- |
| 1 | Lambda and a Custom Functional Interface | Functional contract, anonymous class, lambda, shared dataset | [`exercise-01-lambda-functional-interface.md`](exercise-01-lambda-functional-interface.md) |
| 2 | Filter by Salary | `filter` + predicate + `toList` | [`exercise-02-filter-salary.md`](exercise-02-filter-salary.md) |
| 3 | List All Names | `map` + method reference | [`exercise-03-list-names.md`](exercise-03-list-names.md) |
| 4 | Highest and Lowest Salary | `Comparator`, `min`, `max`, `Optional` | [`exercise-04-minmax.md`](exercise-04-minmax.md) |
| 5 | Map a 10% Raise | Transform values without mutating source objects | [`exercise-05-map-raise.md`](exercise-05-map-raise.md) |
| 6 | Count by Department | `groupingBy` + `counting` | [`exercise-06-group-count.md`](exercise-06-group-count.md) |
| 7 | HR Department Names | Compose `filter`, `map`, `sorted`, `toList` | [`exercise-07-hr-names.md`](exercise-07-hr-names.md) |
| 8 | `parallelStream` Bonus | Correctness first; cautious performance interpretation | [`exercise-08-parallel-bonus.md`](exercise-08-parallel-bonus.md) |

Work in order. Keep practice sources separate from the graded lab submission.

When Exercises **1–7** Pass criteria are **Pass**, open your OS how-to and then [`../lab6/LAB-6-GUIDE.md`](../lab6/LAB-6-GUIDE.md). Do not start Lab 6 GUIDE Steps mid-exercise list. Complete Exercise 8 (parallel bonus) when time allows — bring notes to lab stretch options.
