# Exercise — Hello World

**Module 1** · Pre-lab practice · then open [`../../lab1/LAB-1-GUIDE.md`](../lab1/LAB-1-GUIDE.md)  
**Folder:** `examples/module-01-exercises/` (see [EXERCISES-INDEX.md](EXERCISES-INDEX.md) setup)

## Goal

Write, compile, and run a minimal program that prints `Hello, JVM!`.

## Starter / reference

```java
public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, JVM!");
    }
}
```

## Steps

### Step 1 — Create the exercises folder

Already covered in [EXERCISES-INDEX.md](EXERCISES-INDEX.md) setup.

| OS | Confirm terminal cwd |
| -- | -------------------- |
| Windows | `C:\Users\<you>\java-bootcamp\examples\module-01-exercises` |
| macOS | `/Users/<you>/java-bootcamp/examples/module-01-exercises` |

### Step 2 — Create `Hello.java`

**Do this (IntelliJ):**

1. Right-click `module-01-exercises` → **New → File** (not **Java Class**).
2. Name it exactly `Hello.java` (include the `.java` extension).
3. Paste the starter code above. Save (Windows: **Ctrl+S** · macOS: **⌘S**).

**Or from Terminal:**

**Windows:**

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\module-01-exercises
New-Item -ItemType File -Force -Path Hello.java | Out-Null
```

**macOS:**

```bash
cd ~/java-bootcamp/examples/module-01-exercises
touch Hello.java
```

Then open `Hello.java` in the editor and paste the starter code.

**Expected:** `Hello.java` under `module-01-exercises`; editor shows the `Hello` class.

**If it fails / what not to do:**

* **New → Java Class** missing → normal here; use **New → File** instead.
* **Mark Directory as** only shows **Excluded** on `module-01-exercises` → ignore; you do not need Sources Root for these exercises.
* Do not mark `examples` as Sources Root for this step (breaks the Lab 0 `HelloJava/src` layout).
* Red IDE error *package name 'module-01-exercises' … is invalid* → `examples` was marked Sources Root. Right-click `examples` → **Mark Directory as → Unmark as Sources Root**. Your `.java` file is fine; `javac` / `java` still work from Terminal.
### Step 3 — Compile and run from Terminal

**Windows:**

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\module-01-exercises
javac Hello.java
java Hello
```

**macOS:**

```bash
cd ~/java-bootcamp/examples/module-01-exercises
javac Hello.java
java Hello
```

**Expected:** Console prints `Hello, JVM!`. `Hello.class` appears next to `Hello.java` (list with `dir` / `ls`).

**Verified (Windows):** From `examples\module-01-exercises`, `javac Hello.java` then `java Hello` prints `Hello, JVM!`.

**If it fails:** Confirm `javac -version` / `java -version` are 21.x (Lab 0). Confirm you are in `module-01-exercises`, not `examples/HelloJava`.

**IntelliJ yellow banner** *Java file is located outside of the module source root* → **ignore**. Do **not** click **Move to source root** (that moves the file into `HelloJava/src`). These exercises compile with Terminal `javac`, not IntelliJ’s build. Keep `Hello.java` under `examples/module-01-exercises/`.

### Step 4 — Optional: inspect bytecode

```text
javap -c Hello
```

(Same command on Windows and macOS.)

**Expected:** Disassembly includes `main` and a `println` call.

**Verified (Windows):** `javap -c Hello` shows `main`, with bytecode including `getstatic`, `ldc` (`"Hello, JVM!"`), `invokevirtual` (`println`), and `return`.

### Step 5 — Commit (after Lab 1 Step 0)

Pre-lab exercises come **before** Lab 1. Skip git until **[Lab 1 Step 0](../lab1/LAB-1-GUIDE.md)** creates your personal repo; then commit per [EXERCISES-INDEX.md](EXERCISES-INDEX.md) (or wait for Lab 1 Step 12).

## Expected result

Console prints `Hello, JVM!`; `Hello.class` exists.

## Pass criteria

_Mark each row **Pass** or **Fail** in your lab notes (GitHub markdown files are not interactive checklists)._

| # | Confirm | Your notes |
| - | ------- | ---------- |
| 1 | Code compiles and runs (or notes complete if analysis-only) | Pass / Fail |
| 2 | You can explain the result in one sentence | Pass / Fail |
