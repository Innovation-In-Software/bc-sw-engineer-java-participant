# Exercise 2 — Encapsulation Practice

**Module 3** · Pre-lab practice · finish all 8 Pass, then [`../lab3/LAB-3-GUIDE.md`](../lab3/LAB-3-GUIDE.md)  
**Folder:** `examples/module-03-exercises/` ([setup](EXERCISES-INDEX.md))

![Encapsulation with Private State and Validated Methods](../../../lab_diagrams/mod03-ex02-encapsulation.png)

> **Builds on Exercise 1:** `Account` owns the balance, so callers request a deposit or withdrawal instead of writing the field directly.

## Goal

Create `Account.java` with private balance state and validated operations. Create `EncapsulationDemo.java` to prove valid operations succeed and an invalid withdrawal is rejected.

## Starter (fill in the TODOs)

Paste these skeletons, then replace each `_____` and `// TODO` with working code. Do **not** leave TODOs or blanks in your finished files.

### `Account.java`

```java
public class Account {
    // TODO: hide balance from outside code (private field)
    _____ double balance;

    public Account(double initialBalance) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException(
                    "Initial balance cannot be negative");
        }
        balance = initialBalance;
    }

    public void deposit(double amount) {
        // TODO: reject non-positive amounts (print message, return early)
        if (_____) {
            System.out.println(
                    "Deposit rejected: amount must be positive.");
            return;
        }
        balance += amount;
    }

    public boolean withdraw(double amount) {
        // TODO: reject if amount <= 0 OR amount > balance
        if (_____) {
            System.out.println("Withdrawal rejected.");
            return false;
        }
        balance -= amount;
        return true;
    }

    // TODO: read-only accessor — return balance (double getBalance())
    public _____ getBalance() {
        return _____;
    }

    // Exercise 3 will override this method
    public String getAccountType() {
        return "Account";
    }
}
```

### `EncapsulationDemo.java`

```java
public class EncapsulationDemo {
    public static void main(String[] args) {
        Account account = new Account(100.00);

        account.deposit(50.00);     // balance: 150
        account.withdraw(30.00);    // balance: 120
        account.withdraw(500.00);   // rejected; balance remains 120

        System.out.printf(
                "Final balance: %.2f%n", account.getBalance());
    }
}
```

| Design choice | Why it matters |
| ------------- | -------------- |
| `private double balance` | Prevents uncontrolled writes |
| No `setBalance(...)` | A setter would bypass deposit/withdraw rules |
| Constructor validation | Stops an invalid object from being created |
| `withdraw` returns `boolean` | Caller can tell whether the operation succeeded |
| `getBalance()` | Allows read-only observation |

## Steps

### Step 1 — Create both files

**Why:** One class models the account; the demo class only exercises its public API.

Create:

```text
module-03-exercises/
  Account.java
  EncapsulationDemo.java
```

Paste the starter skeletons. Fill every `_____` / `// TODO` in `Account.java`. Save.

### Step 2 — Compile both classes

**Windows:**

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\module-03-exercises
javac Account.java EncapsulationDemo.java
```

**macOS:**

```bash
cd ~/java-bootcamp/examples/module-03-exercises
javac Account.java EncapsulationDemo.java
```

**Why:** `EncapsulationDemo` depends on `Account`, so both source files must be available to the compiler.

### Step 3 — Run the demo

```text
java EncapsulationDemo
```

**Verified (Windows):**

```text
Withdrawal rejected.
Final balance: 120.00
```

### Step 4 — Prove direct access is blocked

**Why:** Encapsulation is enforced by the compiler, not merely by convention.

Temporarily add this line inside `main`:

```java
account.balance = 999999;
```

Compile again. Expected compiler message includes:

```text
balance has private access in Account
```

Remove the failure-experiment line before continuing.

## Expected result

Valid operations change the balance; the oversized withdrawal does not. Outside code cannot directly assign `balance`.

## If it fails

| Problem | Fix |
| ------- | --- |
| `illegal start of expression` near `_____` | Replace every blank with real Java (`private`, conditions, return type, etc.) |
| `class Account is public, should be declared...` | File must be exactly `Account.java` |
| Final balance is `-380.00` | Validate before subtracting |
| Demo cannot access balance | Use `getBalance()`; do not make balance public |

## Pass criteria

| # | Confirm | Your notes |
| - | ------- | ---------- |
| 1 | Demo prints rejection and final balance `120.00` | Pass / Fail |
| 2 | Direct `account.balance` access fails to compile | Pass / Fail |
| 3 | You can explain why no public `setBalance` exists | Pass / Fail |
