# Exercise 3 — Inheritance and Polymorphism

**Module 3** · Pre-lab practice · then open [`../lab3/LAB-3-GUIDE.md`](../lab3/LAB-3-GUIDE.md)  
**Folder:** `examples/module-03-exercises/` ([setup](EXERCISES-INDEX.md))

> **Builds on Exercise 2:** Keep `Account.java`. Add two specialized account types and call overridden behavior through `Account` references.

## Goal

Create `SavingsAccount` and `CurrentAccount` subclasses. Override account type in both; override withdrawal in current accounts to apply a fee. Demonstrate runtime polymorphism with `Account[]`.

## Starter / reference

### `SavingsAccount.java`

```java
public class SavingsAccount extends Account {
    public SavingsAccount(double initialBalance) {
        super(initialBalance);  // call Account constructor
    }

    @Override
    public String getAccountType() {
        return "Savings";
    }
}
```

### `CurrentAccount.java`

```java
public class CurrentAccount extends Account {
    private static final double WITHDRAWAL_FEE = 2.00;

    public CurrentAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public boolean withdraw(double amount) {
        // Reuse Account validation and balance update.
        return super.withdraw(amount + WITHDRAWAL_FEE);
    }

    @Override
    public String getAccountType() {
        return "Current";
    }
}
```

### `InheritanceDemo.java`

```java
public class InheritanceDemo {
    public static void main(String[] args) {
        // Base-type array can hold either subclass.
        Account[] accounts = {
            new SavingsAccount(100.00),
            new CurrentAccount(100.00)
        };

        for (Account account : accounts) {
            // Runtime type chooses the overridden method.
            account.withdraw(20.00);
            System.out.printf("%s balance: %.2f%n",
                    account.getAccountType(),
                    account.getBalance());
        }
    }
}
```

| Keyword / idea | Easy meaning |
| -------------- | ------------ |
| `extends Account` | Subclass inherits accessible Account behavior |
| `super(initialBalance)` | Run the parent constructor |
| `@Override` | Ask the compiler to verify a parent method is replaced correctly |
| `super.withdraw(...)` | Reuse parent validation instead of duplicating it |
| `Account[]` | One base type stores different concrete account objects |
| Runtime polymorphism | Actual object type selects the override at runtime |

## Steps

### Step 1 — Confirm Exercise 2 files remain

**Why:** These subclasses depend on `Account.java`.

Your folder should already include:

```text
Account.java
EncapsulationDemo.java
```

If not, complete Exercise 2 first.

### Step 2 — Create the three new files

Create:

```text
SavingsAccount.java
CurrentAccount.java
InheritanceDemo.java
```

Paste the starter code and save.

### Step 3 — Compile

**Windows:**

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\module-03-exercises
javac Account.java SavingsAccount.java CurrentAccount.java InheritanceDemo.java
```

**macOS:**

```bash
cd ~/java-bootcamp/examples/module-03-exercises
javac Account.java SavingsAccount.java CurrentAccount.java InheritanceDemo.java
```

### Step 4 — Run

```text
java InheritanceDemo
```

**Verified (Windows):**

```text
Savings balance: 80.00
Current balance: 78.00
```

The current account loses `20.00 + 2.00 fee`; the savings account loses only `20.00`.

### Step 5 — Explain the polymorphic call

**Why:** The variable type and object type are not always the same.

For the second loop iteration:

```text
Reference type: Account
Object type:    CurrentAccount
Method chosen:  CurrentAccount.withdraw
```

## Expected result

One `Account[]` holds both subclasses. The same `withdraw(20)` call produces different balances because the current account override adds a fee.

## If it fails

| Problem | Fix |
| ------- | --- |
| `constructor Account... cannot be applied` | Add `super(initialBalance)` |
| `method does not override` | Match parent name, parameters, and return type exactly |
| Both balances are `80.00` | Confirm `CurrentAccount` overrides `withdraw` |
| Cannot update private balance in subclass | Call `super.withdraw`; do not make balance public |

## Pass criteria

| # | Confirm | Your notes |
| - | ------- | ---------- |
| 1 | Savings prints `80.00`; Current prints `78.00` | Pass / Fail |
| 2 | Base-type array contains both subclass objects | Pass / Fail |
| 3 | You can explain `super` and runtime polymorphism | Pass / Fail |
