# Exercise — Objects and Classes

**Module 1** · Pre-lab practice · then open [`../../lab1/LAB-1-GUIDE.md`](../lab1/LAB-1-GUIDE.md)  
**Folder:** `examples/module-01-exercises/` ([setup](EXERCISES-INDEX.md))

## Goal

Create `Person.java` with fields, a constructor, and a method; instantiate in `main`.

## Do this

1. Create `Person.java` with **New → File** (not Java Class) under `module-01-exercises` — see [EXERCISES-INDEX.md](EXERCISES-INDEX.md).
2. Fields: `name` (String), `age` (int)
3. Constructor sets both
4. `toString` or `display()` prints the person
5. `new Person(...)` in `main`

### Compile and run

**Windows:**

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\module-01-exercises
javac Person.java
java Person
```

**macOS:**

```bash
cd ~/java-bootcamp/examples/module-01-exercises
javac Person.java
java Person
```

Then commit/push **after Lab 1 Step 0** (see [EXERCISES-INDEX.md](EXERCISES-INDEX.md)).

## Expected result

Object prints; fields live on the heap and the reference on the stack.

## Pass criteria

_Mark each row **Pass** or **Fail** in your lab notes (GitHub markdown files are not interactive checklists)._

| # | Confirm | Your notes |
| - | ------- | ---------- |
| 1 | Code compiles and runs (or notes complete if analysis-only) | Pass / Fail |
| 2 | You can explain the result in one sentence | Pass / Fail |
