# Exercise — Platform Independence (WORA)

**Module 1** · Pre-lab practice · then open [`../../lab1/LAB-1-GUIDE.md`](../lab1/LAB-1-GUIDE.md)  
**Folder:** `examples/module-01-exercises/` ([setup](EXERCISES-INDEX.md))

![Java: Compile Once, Run Anywhere](../../../lab_diagrams/mod01-ex07-wora.png)

## Goal

Run an existing `.class` with `java`. Note why recompile is not required for another OS JVM.

## Easy idea (WORA)

| Piece | What it is | Portable? |
| ----- | ---------- | --------- |
| `.java` source | What you type | Yes (text), but not what the OS runs |
| `.class` bytecode | Output of `javac` | Yes — same bytes on Windows/macOS/Linux |
| JVM (`java`) | Runtime that understands bytecode | Installed per OS, but reads the same `.class` |

**Write once, run anywhere:** compile once to bytecode; any matching JVM can run that `.class` without changing your source for each OS.

```mermaid
flowchart LR
    S["Hello.java<br/>source"] -->|javac| C["Hello.class<br/>bytecode"]
    C -->|java on Windows| W["JVM runs"]
    C -->|java on macOS| M["JVM runs"]
    C -->|java on Linux| L["JVM runs"]
    W --> O["Same program behavior"]
    M --> O
    L --> O
```

## Do this

**Why:** Prove you are running bytecode, not re-interpreting the `.java` file each time.

| Command | Easy meaning |
| ------- | ------------ |
| `java Hello` | Start JVM, load `Hello.class`, run `main` (no `javac` needed if `.class` already exists) |

**Windows:**

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\module-01-exercises
java Hello
```

**macOS:**

```bash
cd ~/java-bootcamp/examples/module-01-exercises
java Hello
```

**Expected:** Something like `Hello, JVM!` (same as Exercise 1 — no `javac` needed if `.class` already exists).

**Verified (Windows):** `java Hello` prints:

```text
Hello, JVM!
```

(Re-run without recompiling proves you are executing bytecode, not re-reading the `.java` file.)

- Write 2–3 sentences: source vs bytecode vs JVM (save as `notes/wora-notes.md` under the workspace)

**Sample note:**

```text
javac turned Hello.java into Hello.class (bytecode).
The java command starts a JVM that runs that bytecode — I did not need to recompile to run it again.
Any OS with a compatible JVM can run the same .class file without changing the source — that is Write Once, Run Anywhere.
```

## Expected result

Short note explains WORA using your `.class` experience.

## Pass criteria

_Mark each row **Pass** or **Fail** in your lab notes (GitHub markdown files are not interactive checklists)._

| # | Confirm | Your notes |
| - | ------- | ---------- |
| 1 | Code compiles and runs (or notes complete if analysis-only) | Pass / Fail |
| 2 | You can explain the result in one sentence | Pass / Fail |
