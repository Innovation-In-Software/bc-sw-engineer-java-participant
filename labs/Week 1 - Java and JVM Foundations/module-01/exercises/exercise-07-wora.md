# Exercise — Platform Independence (WORA)

**Module 1** · Pre-lab practice · then open [`../../lab1/LAB-1-GUIDE.md`](../lab1/LAB-1-GUIDE.md)  
**Folder:** `examples/module-01-exercises/` ([setup](EXERCISES-INDEX.md))

## Goal

Run an existing `.class` with `java`. Note why recompile is not required for another OS JVM.

## Easy idea (WORA)

| Piece | What it is | Portable? |
| ----- | ---------- | --------- |
| `.java` source | What you type | Yes (text), but not what the OS runs |
| `.class` bytecode | Output of `javac` | Yes — same bytes on Windows/macOS/Linux |
| JVM (`java`) | Runtime that understands bytecode | Installed per OS, but reads the same `.class` |

**Write once, run anywhere:** compile once to bytecode; any matching JVM can run that `.class` without changing your source for each OS.

## Do this

**Why:** Prove you are running bytecode, not re-interpreting the `.java` file each time.

| Command | Easy meaning |
| ------- | ------------ |
| `java Person` | Start JVM, load `Person.class`, run `main` (no `javac` needed if `.class` already exists) |

**Windows:**

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\module-01-exercises
java Person
```

**macOS:**

```bash
cd ~/java-bootcamp/examples/module-01-exercises
java Person
```

- Write 2–3 sentences: source vs bytecode vs JVM (save as `notes/wora-notes.md` or similar under the workspace)

**Sample note you can adapt:**

```text
javac turns Person.java into Person.class (bytecode).
The java command starts a JVM that executes that bytecode.
I do not need to rewrite or recompile for another OS if that OS has a compatible JVM —
the .class is already platform-independent.
```

## Expected result

Short note explains WORA using your `.class` experience.

## Pass criteria

_Mark each row **Pass** or **Fail** in your lab notes (GitHub markdown files are not interactive checklists)._

| # | Confirm | Your notes |
| - | ------- | ---------- |
| 1 | Code compiles and runs (or notes complete if analysis-only) | Pass / Fail |
| 2 | You can explain the result in one sentence | Pass / Fail |
