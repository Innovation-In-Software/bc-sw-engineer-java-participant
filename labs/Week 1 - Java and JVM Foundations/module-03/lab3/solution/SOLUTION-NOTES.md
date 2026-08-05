# Lab 3 Reference Solution — Banking Management System

Instructor reference only. Students should write these files themselves **after** completing Module 3 Exercises 1–8, under:

* Windows: `%USERPROFILE%\java-bootcamp\examples\Lab3-BankingSystem`
* macOS / Linux: `~/java-bootcamp/examples/Lab3-BankingSystem`

Do not confuse with flat exercise sources in `examples/module-03-exercises/`.

**Participant path reminder:** IntelliJ opens `java-bootcamp`; guides stay in the participant course clone. Compile/run from `Lab3-BankingSystem` (project root).

## Pass criteria

| # | Criterion | Pass / Fail |
| - | --------- | ----------- |
| 1 | Eight types compile to `out/` with JDK 21 | |
| 2 | Create customer / savings / deposit / withdraw / display / exit work | |
| 3 | After deposit `2000` and withdraw `3000` on savings `10000` @ 5%, display shows balance `9000` and interest `450` | |
| 4 | Evidence under `notes/screenshots/lab-3/` | |

Timed path: fill TODOs only; bonus menus 9–13 optional.

## Expected smoke transcript

```text
Customer Created Successfully.
Savings Account Created.
...
Balance : 9000
Interest : 450
Thank You
```

Interactive path: create customer `C101` → savings account balance `10000` rate `5` → deposit `2000` → withdraw `3000` → display accounts → exit.

Starter menu also lists bonus options **9–13** — optional on the timed path.

## What starter leaves for students

| Area | Already done | Student fills |
| ---- | ------------ | ------------- |
| Package + eight type shells | `Main` menu 1–13, getters, `Printable` / `Transaction` / `Customer` shells | Confirm layout |
| `Account` | Abstract base shell | `deposit` / `withdraw` validation |
| `SavingsAccount` / `CurrentAccount` | Constructors / display hooks | `calculateInterest` / `calculateCharges` **before** Display Accounts |
| `BankService` | Method stubs | `createCustomer`, create accounts, `deposit`, `withdraw`, `displayAccounts` |

**Timed path:** skip GUIDE create Steps. Implement interest/charges before menu `6` (Display Accounts).

## Common mistakes

| Mistake | Fix |
| ------- | --- |
| Recreating the eight classes on timed path | Copy starter; fill TODOs only |
| Displaying accounts before implementing interest/charges | Implement overrides first — display prints them |
| `new Account(...)` | Account is abstract — use Savings/Current |
| Wrong interest formula | `balance * rate / 100.0` (smoke: `9000 * 5 / 100 = 450`) |
| PowerShell `*.java` glob issues | Name each source in `javac` (see LAB-3-WINDOWS) |
| Wrong main | `java -cp out com.academy.bank.Main` |

## Files

| File | Role |
| ---- | ---- |
| `Printable.java` | Print contract |
| `Customer.java` | Customer profile |
| `Transaction.java` | Deposit / withdraw / transfer record |
| `Account.java` | Abstract account base |
| `SavingsAccount.java` | Interest calculation |
| `CurrentAccount.java` | Withdrawal charges |
| `BankService.java` | Orchestration + menu operations |
| `Main.java` | Menu-driven entry point |

All under `src/com/academy/bank/`. Matches GUIDE **Expected files:** eight types.

## How to compile and run

From this `Lab3-BankingSystem` directory (JDK 21 on `PATH`):

**Windows PowerShell:**

```powershell
javac -d out `
  src\com\academy\bank\Printable.java `
  src\com\academy\bank\Customer.java `
  src\com\academy\bank\Transaction.java `
  src\com\academy\bank\Account.java `
  src\com\academy\bank\SavingsAccount.java `
  src\com\academy\bank\CurrentAccount.java `
  src\com\academy\bank\BankService.java `
  src\com\academy\bank\Main.java
java -cp out com.academy.bank.Main
```

**macOS / Linux:**

```bash
javac -d out src/com/academy/bank/*.java
java -cp out com.academy.bank.Main
```

Smoke path: customer `C101` → savings balance `10000` rate `5` → deposit `2000` → withdraw `3000` → display → exit.

**Expected snippet:** `Balance : 9000` · `Interest : 450` · `Thank You`

## Clean

```powershell
Remove-Item -Recurse -Force out   # PowerShell
# rm -rf out                      # bash
```
