# Lab 7 Reference Solution — ATM Banking System

Instructor reference only. Students should write these files themselves **after** completing Module 7 Exercises 1–8, under:

* Windows: `%USERPROFILE%\java-bootcamp\examples\Lab7-ATMSystem`
* macOS / Linux: `~/java-bootcamp/examples/Lab7-ATMSystem`

Do not confuse with flat exercise sources in `examples/module-07-exercises/`.

**Participant path reminder:** Run `java` from the **project root** so `transactions.txt` and `logs/` resolve. Do not log PINs.

## Pass criteria

| Path | Required |
| ---- | -------- |
| **Timed (~45 min)** | `login` + `deposit` + `withdraw`; smoke below including **mini statement**; evidence under `notes/screenshots/lab-7/` |
| **Full / extended** | Timed criteria plus transfer / daily error report / transaction summary bonuses |

## What the starter leaves for students

Already given (do **not** recreate on the timed path): four custom exception classes, `Account`, `Transaction`, `LoggerUtil`, `Main`, `displayBalance`, `displayMiniStatement`, unchecked-exception demo, Bonus stubs for transfer/reports.

**Core TODOs (still throw until filled):**

* `ATMService.login`
* `ATMService.deposit`
* `ATMService.withdraw`

**Bonus stubs (print message — do not crash):**

* `transferFunds` (menu 5)
* `generateDailyErrorReport` (menu 9)
* `generateTransactionSummary` (menu 10)

## Files

| File | Role |
| ---- | ---- |
| `AccountNotFoundException.java` | Missing account |
| `InvalidPinException.java` | Bad PIN (max 3 attempts) |
| `InvalidAmountException.java` | Zero / negative amount |
| `InsufficientFundsException.java` | Over-withdraw / transfer |
| `Account.java` | Account model + deposit/withdraw |
| `Transaction.java` | Transaction record |
| `LoggerUtil.java` | File logging under `logs/` |
| `ATMService.java` | Login + banking operations |
| `Main.java` | Menu-driven entry point |
| `transactions.txt` | Sample transaction fixture |

All Java sources under `src/com/academy/atm/`. Matches GUIDE **Expected files:** `*.java` + `transactions.txt` + `logs/`.

**Sample accounts:** `1001` / John Smith / PIN `1234` / balance `11000` · `1002` / Alice Johnson / PIN `5678` / balance `5000`

## How to compile and run

From this `Lab7-ATMSystem` directory (JDK 21 on `PATH`):

**Windows PowerShell:**

```powershell
New-Item -ItemType Directory -Force -Path logs | Out-Null
javac -d out `
  src\com\academy\atm\AccountNotFoundException.java `
  src\com\academy\atm\InvalidPinException.java `
  src\com\academy\atm\InvalidAmountException.java `
  src\com\academy\atm\InsufficientFundsException.java `
  src\com\academy\atm\Account.java `
  src\com\academy\atm\Transaction.java `
  src\com\academy\atm\LoggerUtil.java `
  src\com\academy\atm\ATMService.java `
  src\com\academy\atm\Main.java
java -cp out com.academy.atm.Main
```

**macOS / Linux:**

```bash
mkdir -p logs
javac -d out src/com/academy/atm/*.java
java -cp out com.academy.atm.Main
```

## Expected smoke transcript

Path: login `1001` / `1234` → withdraw `20000` (fail) → deposit `1000` → balance `12000` → mini statement → exit.

```text
Login Successful
...
Insufficient Balance
Transaction Cancelled
...
Deposit Successful
Current Balance : 12000
...
Session Transactions:
...
Historical Transactions (from file):
...
Thank You
```

Also confirm `logs/application.log` gained ERROR lines for the failed withdraw (no PIN values).

## Common mistakes

| Mistake | Fix |
| ------- | --- |
| Recreating exception classes in timed path | Use starter types; fill only login/deposit/withdraw |
| Running `java` from wrong folder | `cd` to `Lab7-ATMSystem` so relative files resolve |
| Logging the PIN | Log account number / operation only |
| Catching too early inside Account | Propagate domain exceptions to the service/menu boundary |
| Menu 5 crashes timed explorers | Transfer is Bonus stub — implement after core |

## Clean

```powershell
Remove-Item -Recurse -Force out, logs   # PowerShell (keep transactions.txt)
# rm -rf out logs                       # bash
```
