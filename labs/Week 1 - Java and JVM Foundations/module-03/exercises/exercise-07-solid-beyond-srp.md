# Exercise 7 — SOLID Spot-Check: OCP, LSP, ISP, DIP

**Module 3** · Pre-lab practice · finish all 8 Pass, then [`../lab3/LAB-3-GUIDE.md`](../lab3/LAB-3-GUIDE.md)
**Folder:** `examples/module-03-exercises/` ([setup](EXERCISES-INDEX.md))

![SOLID Principles in a Banking Design](../../../lab_diagrams/mod03-ex07-solid-principles.png)

> **Builds on Exercises 3–6:** Reuse `Account`, `SavingsAccount`,
> `CurrentAccount`, `InheritanceDemo`, `Printable`, and your SRP notes.

## Goal

For each remaining SOLID principle, write one short justification and prove LSP
with a working `FrozenAccount` that runs inside the existing polymorphic loop.

## Starter (fill in the TODOs)

Paste these skeletons, then replace each `_____` and `// TODO` with working code. Do **not** leave TODOs or blanks in your finished files.

### `FrozenAccount.java`

```java
public class FrozenAccount extends Account {
    public FrozenAccount(double initialBalance) {
        // Reuse Account construction and balance encapsulation.
        super(initialBalance);
    }

    @Override
    public boolean withdraw(double amount) {
        // TODO: refuse every withdrawal; return false (do not call super.withdraw)
        return _____;
    }

    @Override
    public String getAccountType() {
        // TODO: return "Frozen"
        return _____;
    }
}
```

### Update in `InheritanceDemo.java`

Replace the array and loop from Exercise 3 with:

```java
public class InheritanceDemo {
    public static void main(String[] args) {
        // TODO: add FrozenAccount(100) — same loop, no special-casing
        Account[] accounts = {
            new SavingsAccount(100.00),
            new CurrentAccount(100.00),
            _____
        };

        for (Account account : accounts) {
            // TODO: capture withdraw result; print type, ok flag, and balance
            boolean ok = account.withdraw(20.00);
            System.out.printf("%s withdraw=%s balance=%.2f%n",
                    account.getAccountType(), _____, account.getBalance());
        }
    }
}
```

## Principle checks

### O — Open/Closed Principle

**Idea:** Open for extension, closed for modification — add new behavior by
adding a class, not by editing existing ones.

**Why:** When `CurrentAccount` was added in Exercise 3, `SavingsAccount` and
`Account` did not need edits for the new type to work.

Write one sentence confirming that adding `FrozenAccount` required no changes
inside `SavingsAccount` or `CurrentAccount`.

### L — Liskov Substitution Principle

**Idea:** A subclass must be usable anywhere its parent type is expected,
without breaking the caller's expectations.

**Why:** The loop expects every `Account` to return a boolean and leave balance
unchanged on failure. `FrozenAccount` honors that contract instead of throwing
an unexpected exception.

### I — Interface Segregation Principle

**Idea:** Prefer several small, focused interfaces over one large interface that
forces classes to implement methods they do not need.

**Why:** Exercise 5's `Printable` has one method, `printDetails()`.

Write one sentence: what would go wrong if `Printable` also required
`sendEmailReceipt()`, and a `SavingsAccount` had no email system to call?

### D — Dependency Inversion Principle

**Idea:** Depend on an abstraction, not a concrete class, so the concrete
implementation can change later.

**Why:** Declaring `Account account = new FrozenAccount(100.00);` keeps the
caller focused on the shared contract, not one subclass.

Write one sentence explaining why the base type makes later swaps easier.

## Steps

### Step 1 — Create `FrozenAccount.java`

**Why:** A third account type proves extension without rewriting existing
subclasses.

Paste the starter. Fill every `_____` / `// TODO`. Save.

### Step 2 — Update and run `InheritanceDemo`

**Why:** Polymorphism only counts if the same loop handles the new type safely.

Update `InheritanceDemo.java` with the starter loop above. Fill every blank. Save.

**Windows:**

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\module-03-exercises
javac Account.java SavingsAccount.java CurrentAccount.java FrozenAccount.java InheritanceDemo.java
java InheritanceDemo
```

**macOS:**

```bash
cd ~/java-bootcamp/examples/module-03-exercises
javac Account.java SavingsAccount.java CurrentAccount.java FrozenAccount.java InheritanceDemo.java
java InheritanceDemo
```

**Verified shape (exact balances depend on fee rules from Exercise 3):**

```text
Savings withdraw=true balance=80.00
Current withdraw=true balance=78.00
Frozen withdraw=false balance=100.00
```

### Step 3 — Write the four principle notes

**Why:** SOLID only helps if you can justify the design in plain English.

Add one sentence each for OCP, LSP, ISP, and DIP to `notes.md`.

### Step 4 — Name all five letters from memory

**Why:** Lab 3 asks you to review SOLID against the banking design.

Write: Single Responsibility, Open/Closed, Liskov Substitution, Interface
Segregation, Dependency Inversion.

## Expected result

`FrozenAccount` compiles and runs inside the same loop with no special-casing,
and you have one written sentence for each remaining SOLID principle.

## If it fails

| Problem | Fix |
| ------- | --- |
| `illegal start of expression` near `_____` | Use `false`, `"Frozen"`, `new FrozenAccount(100.00)`, and `ok` in printf |
| `Account` constructor not found | Keep Exercise 2's `Account(double)` constructor public/protected |
| Compile error on `extends Account` | Compile `Account.java` in the same command |
| Frozen account balance decreases | `withdraw` must return `false` without calling `super.withdraw` |
| Loop needs `instanceof FrozenAccount` | That would break the LSP demonstration — keep one shared loop |

## Pass criteria

| # | Confirm | Your notes |
| - | ------- | ---------- |
| 1 | `FrozenAccount` compiles and runs inside the same loop | Pass / Fail |
| 2 | Frozen withdrawal returns `false` and leaves balance unchanged | Pass / Fail |
| 3 | You wrote one sentence for each of OCP, LSP, ISP, and DIP | Pass / Fail |
| 4 | You can name all five SOLID letters from memory | Pass / Fail |
