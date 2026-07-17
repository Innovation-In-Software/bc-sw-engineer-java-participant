# Exercise — Inspect Bytecode

**Module 1** · Pre-lab practice · then open [`../../lab1/LAB-1-GUIDE.md`](../lab1/LAB-1-GUIDE.md)  
**Folder:** `examples/module-01-exercises/` ([setup](EXERCISES-INDEX.md))

## Goal

Disassemble `Person` (or `Hello`) with `javap` and note three bytecode instructions.

## Do this

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

- Save text or a local screenshot under `notes/screenshots/` (do **not** commit screenshots)
- List three of: `ldc`, `invokevirtual`, `return`, `aload`, `istore`

Then commit any written notes under `examples/` or `notes/` (not screenshots) per [EXERCISES-INDEX.md](EXERCISES-INDEX.md).

## Expected result

You can name what three instructions do from your listing.

## Pass criteria

_Mark each row **Pass** or **Fail** in your lab notes (GitHub markdown files are not interactive checklists)._

| # | Confirm | Your notes |
| - | ------- | ---------- |
| 1 | Code compiles and runs (or notes complete if analysis-only) | Pass / Fail |
| 2 | You can explain the result in one sentence | Pass / Fail |
