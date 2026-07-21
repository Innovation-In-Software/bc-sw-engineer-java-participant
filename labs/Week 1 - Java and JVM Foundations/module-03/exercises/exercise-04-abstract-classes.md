# Exercise 4 — Abstract Classes

**Module 3** · Pre-lab practice · finish all 8 Pass, then [`../lab3/LAB-3-GUIDE.md`](../lab3/LAB-3-GUIDE.md)  
**Folder:** `examples/module-03-exercises/` ([setup](EXERCISES-INDEX.md))

![Abstract Classes and Concrete Subclasses](../../../lab_diagrams/mod03-ex04-abstract-classes.png)

> **Builds on Exercise 3:** `SavingsAccount` and `CurrentAccount` already override behavior — now make the parent itself impossible to instantiate directly.

## Goal

Turn `Account` into an `abstract class` with one abstract method, and prove it can no longer be created directly.

## Starter (fill in the TODOs)

Paste these skeletons, then replace each `_____` and `// TODO` with working code. Do **not** leave TODOs or blanks in your finished files.

### `AbstractAccount.java` (a trimmed copy of `Account`, made abstract)

```java
public _____ class AbstractAccount {
    protected double balance;

    public AbstractAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    // TODO: abstract method — no body; every concrete subclass must implement
    public _____ String getAccountType();
}
```

### `AbstractSavings.java`

```java
public class AbstractSavings extends AbstractAccount {
    public AbstractSavings(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public String getAccountType() {
        // TODO: return "Savings"
        return _____;
    }
}
```

### `AbstractDemo.java`

```java
public class AbstractDemo {
    public static void main(String[] args) {
        // AbstractAccount account = new AbstractAccount(50.00); // will not compile — try it, then comment it out
        AbstractAccount account = new AbstractSavings(50.00);
        System.out.println(account.getAccountType() + " balance: " + account.getBalance());
    }
}
```

| Keyword / idea | Easy meaning |
| --------------- | ------------ |
| `abstract class` | A class you can extend but never instantiate directly |
| `abstract` method | A method with no body — every concrete subclass must implement it |
| Concrete subclass | A non-abstract class that fills in every abstract method |

## Steps

### Step 1 — Create the three files

Create `AbstractAccount.java`, `AbstractSavings.java`, and `AbstractDemo.java`. Paste the starter skeletons. Fill every `_____` / `// TODO`. Save.

### Step 2 — Prove it cannot be instantiated

**Why:** This is the entire point of `abstract` — the compiler enforces it, not a runtime check.

Uncomment the line `new AbstractAccount(50.00)` in `AbstractDemo.java` and try to compile.

**Windows:**

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\module-03-exercises
javac AbstractAccount.java AbstractSavings.java AbstractDemo.java
```

**macOS:**

```bash
cd ~/java-bootcamp/examples/module-03-exercises
javac AbstractAccount.java AbstractSavings.java AbstractDemo.java
```

**Expected:** `error: AbstractAccount is abstract; cannot be instantiated`.

### Step 3 — Comment that line back out, compile, and run

```text
java AbstractDemo
```

**Verified (Windows):**

```text
Savings balance: 50.0
```

## Expected result

The direct-instantiation line fails to compile; the program runs once you go through the concrete `AbstractSavings` subclass instead.

## If it fails

| Problem | Fix |
| ------- | --- |
| `illegal start of expression` near `_____` | Use `abstract` on the class and method; return `"Savings"` in the subclass |
| Program compiles with `new AbstractAccount(...)` still active | Confirm the class is declared `public abstract class`, not just `public class` |
| `AbstractSavings does not override abstract method` | Every abstract method must be implemented in the first concrete subclass |

## Pass criteria

| # | Confirm | Your notes |
| - | ------- | ---------- |
| 1 | Direct instantiation of `AbstractAccount` fails to compile | Pass / Fail |
| 2 | `AbstractDemo` runs successfully through `AbstractSavings` | Pass / Fail |
| 3 | You can explain why `abstract` forces subclasses to implement the method | Pass / Fail |
