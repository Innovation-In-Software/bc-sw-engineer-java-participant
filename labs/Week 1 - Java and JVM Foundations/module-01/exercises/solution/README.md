# Module 1 exercise solutions (instructor only)

Complete reference implementations for the pre-lab exercises.

**Do not share with participants.** This folder is named `solution/` so `push-all.ps1` excludes it from the participant remote.

Flat folder + JDK 21 on `PATH`. From this `solution/` directory:

## File map

| Exercise | File(s) | Role |
| -------- | ------- | ---- |
| 1 Hello World | [`Hello.java`](Hello.java) | Runnable |
| 2 Platform Independence (WORA) | [`WoraProbe.java`](WoraProbe.java) | Runnable |
| 3 Control Flow | [`ControlFlow.java`](ControlFlow.java) | Runnable |
| 4 Watch Class Loading | [`Helper.java`](Helper.java), [`LoadDemo.java`](LoadDemo.java) | `LoadDemo` runnable; `Helper` is loaded by it |
| 5 Variables and Data Types | [`Variables.java`](Variables.java) | Runnable |
| 6 Methods and Parameters | [`Methods.java`](Methods.java) | Runnable |
| 7 Objects and Classes | [`Person.java`](Person.java) | Runnable |
| 8 `javap` | — | Analysis-only — no solution `.java` |

## Compile and run (Windows PowerShell)

```powershell
javac Hello.java WoraProbe.java ControlFlow.java Helper.java LoadDemo.java Variables.java Methods.java Person.java
java Hello
java WoraProbe
java ControlFlow
java LoadDemo
java Variables
java Methods
java Person
```

Optional class-loading check:

```powershell
java -verbose:class LoadDemo 2>&1 | Select-String "Helper|LoadDemo"
```

## Expected key output

| Demo | Key lines |
| ---- | --------- |
| `Hello` | `Hello, JVM!` |
| `WoraProbe` | OS name, then `Bytecode runs on: <os.name>` (machine-specific) |
| `ControlFlow` | `even` · `1`…`5` · `countdown 3`…`1` · `Tuesday` |
| `LoadDemo` | `helper-ok` |
| `Variables` | `21` · `8000000000` · `19.99` · `true` · `A` · `Aman` |
| `Methods` | `30` · `Hello, Aman!` |
| `Person` | `Aman is 21 years old` |

## Common mistakes

- Running `java Helper` — no `main`; run `LoadDemo` instead.
- Wrong cwd — `cd` into this flat `solution/` (or the student’s `module-01-exercises/`) before `javac`.
- Confusing exercise `Hello` / `Person` with Lab 1’s `HelloWorld` / `Employee` under `jvm-compilation-lab`.

## Clean

```powershell
Remove-Item -Force *.class
```
