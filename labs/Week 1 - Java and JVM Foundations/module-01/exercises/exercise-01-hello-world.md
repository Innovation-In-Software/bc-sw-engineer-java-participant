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

## Steps (Windows — IntelliJ + PowerShell)

### Step 1 — Create the exercises folder

Already covered in [EXERCISES-INDEX.md](EXERCISES-INDEX.md) setup. Confirm terminal cwd is:

```text
C:\Users\<you>\java-bootcamp\examples\module-01-exercises
```

### Step 2 — Create `Hello.java`

1. In IntelliJ Project pane: right-click `examples\module-01-exercises` → **New → File** → name it `Hello.java`.  
   Or in Terminal:

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\module-01-exercises
New-Item -ItemType File -Force -Path Hello.java | Out-Null
```

2. Paste the starter code above. Save (**Ctrl+S**).

**Expected:** `Hello.java` appears under `module-01-exercises`; editor shows the `Hello` class with no red errors.

### Step 3 — Compile and run from Terminal

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\module-01-exercises
javac Hello.java
java Hello
```

**Expected:** Console prints `Hello, JVM!`. Project pane (or `dir`) shows `Hello.class` next to `Hello.java`.

**If it fails:** Confirm `javac -version` / `java -version` are 21.x (Lab 0). Confirm you are in `module-01-exercises`, not `examples\HelloJava`.

### Step 4 — Optional: inspect bytecode

```powershell
javap -c Hello
```

**Expected:** Disassembly includes `main` and a `println` call.

## Expected result

Console prints `Hello, JVM!`; `Hello.class` exists.

## Pass criteria

_Mark each row **Pass** or **Fail** in your lab notes (GitHub markdown files are not interactive checklists)._

| # | Confirm | Your notes |
| - | ------- | ---------- |
| 1 | Code compiles and runs (or notes complete if analysis-only) | Pass / Fail |
| 2 | You can explain the result in one sentence | Pass / Fail |
