# Lab 3 Reference Solution — Banking Management System

Instructor reference only. Students should write these files themselves **after** completing Module 3 Exercises 1–8, under:

* Windows: `%USERPROFILE%\java-bootcamp\examples\Lab3-BankingSystem`
* macOS / Linux: `~/java-bootcamp/examples/Lab3-BankingSystem`

Do not confuse with flat exercise sources in `examples/module-03-exercises/`.

**Participant path reminder:** IntelliJ opens `java-bootcamp`; guides stay in the participant course clone. Compile/run from `Lab3-BankingSystem` (project root).

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
