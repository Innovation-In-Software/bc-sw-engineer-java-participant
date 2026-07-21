# Exercise 7 — String vs StringBuilder

**Module 4** · Pre-lab practice · finish all 7 Pass, then [`../lab4/LAB-4-GUIDE.md`](../lab4/LAB-4-GUIDE.md)  
**Folder:** `examples/module-04-exercises/` ([setup](EXERCISES-INDEX.md))

![String Concatenation Compared with StringBuilder](../../../lab_diagrams/mod04-ex07-string-vs-builder.png)

## Goal

Create `StringBuilderComparison.java` and compare repeated immutable `String` concatenation with mutable `StringBuilder`.

## Starter (fill in the TODOs)

Paste this skeleton, then replace each `// TODO` with working code. Do **not** leave TODOs in your finished file.

```java
public class StringBuilderComparison {
    private static final int ITERATIONS = 50_000;

    static String withString() {
        String result = "";
        for (int i = 0; i < ITERATIONS; i++) {
            // TODO: result += "x";  (each update creates another String)
        }
        return result;
    }

    static String withBuilder() {
        // Initial capacity avoids repeated buffer growth.
        // TODO: StringBuilder result = new StringBuilder(ITERATIONS);
        for (int i = 0; i < ITERATIONS; i++) {
            // TODO: result.append('x');
        }
        // TODO: return result.toString();
    }

    public static void main(String[] args) {
        // TODO: time withString() with System.nanoTime()
        // TODO: time withBuilder() with System.nanoTime()
        // TODO: printf both lengths and ms (stringNanos / 1_000_000.0)
    }
}
```

## Why performance differs

| `String` loop | `StringBuilder` loop |
| ------------- | -------------------- |
| `String` is immutable | Builder has a mutable character buffer |
| Each concatenation creates a new result | `append` reuses the buffer |
| Existing characters are repeatedly copied | Characters are appended in place |
| Creates more temporary garbage | Usually creates far fewer temporary objects |

## Steps

### Step 1 — Create `StringBuilderComparison.java`

**Why:** Lab 4 compares allocation patterns — repeated `String` concatenation is a common source of temporary garbage.

1. **New → File** → `StringBuilderComparison.java`.
2. Paste the starter.
3. Fill every `// TODO`. Save.

### Step 2 — Compile and run

**Windows:**

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\module-04-exercises
javac StringBuilderComparison.java
java StringBuilderComparison
```

**macOS:**

```bash
cd ~/java-bootcamp/examples/module-04-exercises
javac StringBuilderComparison.java
java StringBuilderComparison
```

**Verified (one Windows run):**

```text
String: 50000 chars, 271.661 ms
StringBuilder: 50000 chars, 1.865 ms
```

Your times will differ. Both lengths must be `50000`; that confirms equivalent work.

### Step 3 — Run three times

**Why:** One timing is noisy because of JIT compilation, GC, CPU load, and other processes.

Record:

```markdown
| Run | String ms | StringBuilder ms |
| --- | --------- | ---------------- |
| 1 | | |
| 2 | | |
| 3 | | |
```

Describe the repeated trend instead of claiming one exact benchmark result.

### Step 4 — Explain correct use

Add to `notes.md`:

> Use `StringBuilder` when constructing text repeatedly in a loop. Ordinary `+` remains readable and appropriate for a small, fixed expression.

## Expected result

Both methods produce 50,000 characters. Across repeated runs, `StringBuilder` should usually be substantially faster for this workload.

## If it fails

| Problem | Fix |
| ------- | --- |
| Program takes too long on a slow laptop | Reduce `ITERATIONS` to `20_000` and document it |
| Different output lengths | Both loops must run the same iteration count |
| One surprising timing | Repeat three times; this is a demo, not a rigorous JMH benchmark |

## Pass criteria

| # | Confirm | Your notes |
| - | ------- | ---------- |
| 1 | Both output lengths equal `50000` | Pass / Fail |
| 2 | You recorded three timing runs | Pass / Fail |
| 3 | You can explain immutability and temporary allocation | Pass / Fail |

---

## Next

Exercises 1–7 complete → on Day 4 open **one** OS how-to → [`../lab4/LAB-4-WINDOWS.md`](../lab4/LAB-4-WINDOWS.md) or [`../lab4/LAB-4-MACOS.md`](../lab4/LAB-4-MACOS.md) → then graded [`../lab4/LAB-4-GUIDE.md`](../lab4/LAB-4-GUIDE.md) (builds on these seven; separate folder `examples/Lab4-MemoryManagement/`).

Bring your Exercise 4–5 G1/ZGC notes to the Day 4 Lab 4 core checkpoint.
