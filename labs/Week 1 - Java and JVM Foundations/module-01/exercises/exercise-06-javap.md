# Exercise — Inspect Bytecode

**Module 1** · Pre-lab practice · then open [`../../lab1/LAB-1-GUIDE.md`](../lab1/LAB-1-GUIDE.md)  
**Folder:** `examples/module-01-exercises/` ([setup](EXERCISES-INDEX.md))

## Goal

Disassemble `Person` (or `Hello`) with `javap` and note three bytecode instructions.

## What each command piece means

| Piece | Easy meaning |
| ----- | ------------ |
| `javap` | Read a `.class` file and show its structure |
| `-c` | Include bytecode for each method |
| `-v` | Verbose: more detail (constants, flags) |
| `Person` | Class name to inspect (must already be compiled) |

## Do this

**Why:** Connect your Java source to the instructions the JVM actually runs.

From the exercises folder (after `javac` produced the `.class`):

**Windows:**

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\module-01-exercises
javap -c -v Person
```

**macOS:**

```bash
cd ~/java-bootcamp/examples/module-01-exercises
javap -c -v Person
```

If you prefer the smaller Exercise 1 example:

```text
javap -c Hello
```

- Save text or a local screenshot under `notes/screenshots/` (keep screenshots on your laptop only)
- List three of: `ldc`, `invokevirtual`, `return`, `aload`, `istore`

### Quick opcode meanings (same ideas as Exercise 1)

| Opcode | Easy meaning |
| ------ | ------------ |
| `ldc` | Load a constant (often a `String` or number) onto the stack |
| `getstatic` | Read a static field (e.g. `System.out`) |
| `invokevirtual` | Call an instance method (e.g. `println`) |
| `aload` / `aload_0` | Load an object reference from a local variable |
| `istore` | Store an `int` into a local variable |
| `return` | Exit the method |

Reminder: bytecode is what the JVM runs after `javac`. See [Exercise 1 Step 4](exercise-01-hello-world.md) for a full walkthrough of `Hello`.

## Expected result

You can name what three instructions do from your listing.

## Pass criteria

_Mark each row **Pass** or **Fail** in your lab notes (GitHub markdown files are not interactive checklists)._

| # | Confirm | Your notes |
| - | ------- | ---------- |
| 1 | Code compiles and runs (or notes complete if analysis-only) | Pass / Fail |
| 2 | You can explain the result in one sentence | Pass / Fail |
