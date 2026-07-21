# Lab 7: Exception Handling and Error Management — ATM Banking System

> **Participants:** Module sequence is in [`../README.md`](../README.md). **Do not start this guide until** you have finished Module 7 [pre-lab exercises 1–8](../exercises/EXERCISES-INDEX.md) (Pass in your notes). Then open **one** OS how-to ([Windows](LAB-7-WINDOWS.md) · [macOS](LAB-7-MACOS.md)) and do **every Step below**. Skip `solution/` unless your instructor says otherwise. See [Which file do I open?](../../../_PARTICIPANT-FILE-GUIDE.md).

**Module:** 7 — Exception Handling and Error Management  
**Lab folder:** `labs/Week 1 - Java and JVM Foundations/module-07/lab7/`  
**Difficulty:** Intermediate  
**Duration:** 65–240 minutes (Day 5 core checkpoint ~65 min; finish remaining ATM paths as extended work)

**Primary IDE:** IntelliJ IDEA Community Edition · **Optional IDE:** VS Code

| OS | How-to for this lab |
| -- | ------------------- |
| Windows | [LAB-7-WINDOWS.md](LAB-7-WINDOWS.md) |
| macOS | [LAB-7-MACOS.md](LAB-7-MACOS.md) |

> **Environment reminder:** Finish [Lab 0](../../module-00/lab0/LAB-0-GUIDE.md). Use **JDK 21** and **IntelliJ IDEA Community** (primary) or **VS Code** (optional). Workspace: `java-bootcamp` (Windows: `%USERPROFILE%\java-bootcamp`).

> **Hard gate — pre-lab exercises:** Complete **all eight** Module 7 exercises under [`../exercises/`](../exercises/EXERCISES-INDEX.md) and mark their Pass criteria **Pass** **before** Step 1 of this lab. Lab 7 is graded consolidation in a **separate** packaged project (`examples/Lab7-ATMSystem/`), not a replacement for the flat exercises folder (`examples/module-07-exercises/`).

**Verified participant layout (Windows IntelliJ + PowerShell; Temurin JDK 21.0.11):**

| Role | Path |
| ---- | ---- |
| IntelliJ opens | `%USERPROFILE%\java-bootcamp` (SDK / language level **21**) |
| Pre-lab exercises | `examples\module-07-exercises\` (flat files — must exist before graded work) |
| This lab project | `examples\Lab7-ATMSystem\` with `src\com\academy\atm\`, `transactions.txt`, `logs\` |
| Compile / run | Named `javac -d out` on the nine sources → `java -cp out com.academy.atm.Main` **from project root** |
| Smoke-test output | Login `1001`/`1234` → withdraw `20000` Insufficient Balance → deposit `1000` → balance `12000` → mini statement → `Thank You` |

**If it fails (Windows PowerShell):** Prefer naming each `.java` file in the `javac` line (as in [LAB-7-WINDOWS.md](LAB-7-WINDOWS.md)). Missing `logs\application.log` or `transactions.txt` → you ran `java` from the wrong folder; `cd` to `Lab7-ATMSystem` first. Mark `src` as Sources Root; set Run working directory to the project root.

---

## How to follow this lab

1. Confirm Lab 0 + prior Week 1 menus/packages + Module 7 Exercises 1–8 are done (checklists below).
2. Open the **Windows** or **macOS** how-to (links above) in a second tab.
3. Create/work only under your `java-bootcamp/examples/…` folder from the steps (not inside this `labs/` git clone unless a step says otherwise).
4. For each **Step N**: read **Why** / **Builds on** (if present) → do the actions → confirm **Expected** / **Expected result** → then continue.
5. When stuck, use **Failure Experiments** / troubleshooting in this guide before asking for help.
6. Capture evidence under `notes/screenshots/lab-7/` (workspace root under `java-bootcamp`; redact secrets). Use the **Pass criteria** tables — write **Pass** or **Fail** in your notes. GitHub file view does not support clickable checkboxes.

## Module 7 exercises you must already have completed

Lab 7 assumes you already practiced exception skills in `examples/module-07-exercises/`. Do **not** treat Steps 2–12 as your first time with custom exceptions, `throw`/`throws`, or try-with-resources.

| Exercise | You already did | Lab 7 builds on it |
| -------- | --------------- | ------------------ |
| 1 — Common exceptions | Specific unchecked catches | Step 12 unchecked demos |
| 2 — `try-catch-finally` | Success/failure cleanup | Step 8 `executeTransaction` multi-catch + finally |
| 3 — Try-with-resources | Auto-close reader | Step 11 mini statement / `transactions.txt` |
| 4 — `throw` / `throws` | Signal vs declare | Steps 3, 7, 9 Account/service contracts |
| 5 — Custom exception | Checked domain failure | Step 2 four ATM exception types |
| 6 — Propagation | Trace stack to boundary | Steps 3, 8–9 `Account` → `ATMService` → `Main` |
| 7 — Error strategies | Retry and fallback | Step 7 login PIN attempts / recovery |
| 8 — Logging warm-up | Context + exception + safe message | Step 5 `LoggerUtil` → `logs/application.log` |

**Intentional deltas (extend — do not paste exercise code blindly):**

* Exercises were **flat** default-package demos; Lab uses `package com.academy.atm` + `src` / `out` (Lab 5–6 pattern)
* Exercise 5 used one custom type; Lab adds four domain exceptions with extra fields
* Exercise 8 was a small log sketch; Lab wires logging into every ATM failure path

**Lab-only additions:** seed accounts + PIN login, deposit/withdraw/transfer, mini statement, menu recovery, run-from-project-root for relative files, LMS evidence pack.

If any of Exercises 1–8 is still **Fail**, finish that exercise first — then return here.

---

## Lab Overview

This Module 7 lab is the **graded consolidation** after Module 7 slides and [Exercises 1–8](../exercises/EXERCISES-INDEX.md). You already practiced catching common exceptions, `try-catch-finally`, try-with-resources, `throw`/`throws`, custom exceptions, propagation, retry/fallback, and logging in `module-07-exercises/`. Here you assemble those skills into a fault-tolerant **ATM Banking System**.

**Purpose.** Labs 3–6 focused on *what* the program does (OOP, collections, streams). Module 7 exercises taught each error-handling skill in isolation. Lab 7 locks the **enterprise habit**: domain throws, boundary catches, log detail, short user messages, menu keeps running.

**What you build.** An ATM console under package `com.academy.atm`: login with PIN retry limits, deposit, withdraw, balance, transfer (with optional rollback), mini statement (session + file), unchecked-exception demos, and centralized logging. Core types: `Account`, `Transaction`, `ATMService`, `LoggerUtil`, `Main`, plus four custom exceptions.

**What success looks like.** Under `java-bootcamp/examples/Lab7-ATMSystem/` you compile with `javac -d out ...`, run `java -cp out com.academy.atm.Main` **from the project root**, walk success and failure paths (including withdraw-too-much → insufficient balance), inspect `logs/application.log`, and submit evidence graders can recompile. Exercise sources remain under `examples/module-07-exercises/`.

**Depends on Lab 0 + prior Week 1 skills + Exercises 1–8.** If your IDE, `java`, or `javac` fail, stop and fix [Lab 0](../../module-00/lab0/LAB-0-GUIDE.md) / [SETUP-INSTRUCTIONS.md](../../../SETUP-INSTRUCTIONS.md). Comfort with packages, service layering (Lab 5), and menu + Scanner loops (Labs 5–6) speeds this lab. IDE paths: [`_IDE-CONVENTIONS.md`](../../_IDE-CONVENTIONS.md).

**CRM connection (future only).** From Lab 8 onward the **Customer Management Platform** will throw domain exceptions (not found, validation failed), map them to API error responses, and log diagnostics. This lab does **not** build CRM APIs, Spring `@ControllerAdvice`, or a database. Treat the ATM as a **skill bridge**: today’s custom exceptions and recovery loops reappear when CRM services reject bad requests without taking down the JVM.

---

## Learning Objectives

After completing this lab, you will be able to **consolidate and extend** what you practiced in Exercises 1–8:

* Distinguish **checked** vs **unchecked** exceptions and choose appropriately (builds on Exercises 1 & 5)
* Wrap operations in **`try` / `catch` / `finally`** (and multiple catch blocks) (builds on Exercise 2)
* Create **custom exception** classes with meaningful messages (and optional fields) (builds on Exercise 5)
* Use **`throw`** to signal rule violations and **`throws`** to declare checked propagation (builds on Exercise 4)
* Trace **exception propagation** across `Main → ATMService → Account` (builds on Exercise 6)
* Use **try-with-resources** for `FileReader` / `BufferedReader` without manual `close()` (builds on Exercise 3)
* Log errors with timestamp, level, type, message, and stack trace via `LoggerUtil` (builds on Exercise 8)
* Validate numeric input and recover from `InputMismatchException` / `NumberFormatException`
* Keep the ATM menu running after recoverable failures (**error recovery**) (builds on Exercise 7)
* Compile and run with `javac -d out` / `java -cp out` **from the project root** on your laptop (VS Code or IntelliJ)

---

## Business Scenario

A bank wants to harden its classroom ATM simulator. You already practiced exception building blocks in Module 7 Exercises 1–8. Today’s **graded** pass consolidates those skills into one recoverable ATM menu (pedagogical demo accounts — not live banking PII).

The bank requires the ATM software to:

* **Never terminate unexpectedly** on user/business errors
* **Display meaningful error messages** (not raw stack traces to end users)
* **Log every error** for mentors/ops review
* **Validate all user input** before mutating balances
* **Continue running** after recoverable failures (return to the main menu)

You build and run the app on your **laptop** with plain JDK—no Spring, no database, no GUI framework.

**Optional forward look:** The same “domain exception → catch at service boundary → log → continue/API error” thinking later helps CRM endpoints reject invalid customer updates without killing the server. You are not building CRM today.

**Security note for evidence.** Do not paste GitHub credentialss, AWS secrets, or real bank credentials. Demo PINs (`1234`) and account numbers are fine; do not treat them as production secrets, and do not commit real PII.

---

## Architecture Context

### Call chain and exception flow (NOW)

```mermaid
flowchart TB
  Main["Main<br/>menu + input validation"] -->|calls| ATM["ATMService"]
  Scan["Scanner"] --> ATM
  subgraph Ops["ATMService responsibilities"]
    O1["login / deposit / withdraw / transfer"]
    O2["try / multi-catch / finally"]
    O3["try-with-resources -> transactions.txt"]
    O4["LoggerUtil -> logs"]
  end
  ATM --- Ops
  ATM --> Acc["Account.deposit / withdraw"]
  Acc -->|InvalidAmount / InsufficientFunds| ATM
```

### Exception hierarchy (lab)

```mermaid
flowchart TB
  Ex["Exception checked"] --> IA["InvalidAmountException"]
  Ex --> IF["InsufficientFundsException"]
  Ex --> IP["InvalidPinException"]
  Ex --> AN["AccountNotFoundException"]
  RT["RuntimeException unchecked"] --> NPE["NullPointerException"]
  RT --> AE["ArithmeticException"]
  RT --> AIOOB["ArrayIndexOutOfBoundsException"]
  Bound["Boundary also handles"] --> IM["InputMismatchException"]
  Bound --> IO["IOException"]
```

### Lab flow (mermaid)

```mermaid
flowchart TD
    A["Create package<br/>folders + logs"] --> B["Custom exceptions<br/>+ Account model"]
    B --> C["ATMService<br/>login + throw/throws"]
    C --> D["try / multi-catch<br/>finally on operations"]
    D --> E["try-with-resources<br/>+ LoggerUtil"]
    E --> F["Main menu<br/>1-7 core path"]
    F --> G["javac -d out<br/>java -cp out"]
    G --> H["Failure scenarios<br/>+ application.log + submit"]
```

### Architecture NOW vs LATER

| Aspect | Lab 7 (NOW) | CRM later (Lab 8+) |
| ------ | ----------- | ------------------ |
| Domain | Accounts, PIN, deposit/withdraw | Customers, tickets, agents |
| UI | Console menu | REST / React |
| Errors | Custom exceptions + stdout messages | Problem details / HTTP status + logs |
| Persistence | In-memory map + `transactions.txt` | DB + Spring repositories |
| Logging | File append via `LoggerUtil` | SLF4J / centralized observability |
| Framework | Plain JDK | Spring Boot exception handlers |
| Skills reused | throw/throws, catch boundaries, recovery | Same—applied to CRM APIs |

---

## Prerequisites

Complete the [Labs Setup Instructions](../../../SETUP-INSTRUCTIONS.md) and [Lab 0](../../module-00/lab0/LAB-0-GUIDE.md) before this lab. Confirm:

* **JDK 21** with `javac` and `java` on `PATH` (Lab 0)
* **Laptop IDE:** **IntelliJ IDEA Community** (primary) or **VS Code** (optional) — see [`_IDE-CONVENTIONS.md`](../../_IDE-CONVENTIONS.md)
* Workspace open at `~/java-bootcamp` (Windows: `%USERPROFILE%\java-bootcamp`)
* Working integrated terminal in your IDE
* **Module 7 Exercises 1–8 Pass** — hard gate before Step 1 (see mapping table above)
* **Prior Week 1 recommended:** packages, service layer, menu + `Scanner` (`nextLine`), basic collections (`HashMap` for accounts)
* **Maven is optional**—plain `javac`/`java` is the primary path
* No secrets (keys, tokens, passwords) committed to Git

**Exercise workspace (already done):** `examples/module-07-exercises/` (flat files)  
**Graded lab workspace (this guide):** `examples/Lab7-ATMSystem/` (`src/com/academy/atm/` + `out/` + `logs/` + `transactions.txt`)

### Pre-flight

Run in your IDE terminal on the laptop:

```bash
java -version
javac -version
git --version
pwd   # Windows PowerShell: pwd  or  echo $PWD
```

Expected theme (versions may vary):

```text
openjdk version "21....
javac 21....
git version 2....
```

Confirm `java-bootcamp` exists. Fix environment failures before writing application code.

---

## Suggested Project Files

Create everything under the bootcamp workspace on your laptop:

```text
java-bootcamp/examples/Lab7-ATMSystem/
├── src/
│   └── com/
│       └── academy/
│           └── atm/
│               ├── Main.java
│               ├── Account.java
│               ├── Transaction.java
│               ├── ATMService.java
│               ├── LoggerUtil.java
│               ├── InvalidAmountException.java
│               ├── InsufficientFundsException.java
│               ├── InvalidPinException.java
│               └── AccountNotFoundException.java
├── out/                         # created by javac -d out
│   └── com/academy/atm/*.class
├── transactions.txt             # historical file for try-with-resources
├── logs/
│   └── application.log          # created at runtime by LoggerUtil
└── (answers → ~/java-bootcamp/notes/; screenshots → notes/screenshots/lab-7/)
```

**Important:** Always `cd` to `java-bootcamp/examples/Lab7-ATMSystem` (the folder that contains `transactions.txt` and `logs/`) before `java -cp out com.academy.atm.Main`. Relative paths break if you start the JVM from a parent directory.

Ignore build artifacts if committed later: `out/`, `*.class`. You **may** submit a sanitized snippet of `logs/application.log` showing ERROR lines (no secrets).

**IDE tip:** In VS Code use **File → Open Folder…** on the project. In IntelliJ use **File → Open…**, set Project SDK to **21**, and set the run configuration’s working directory to the project root — details in [`_IDE-CONVENTIONS.md`](../../_IDE-CONVENTIONS.md).

**Instructor reference:** Complete solution (including bonuses) in [`solution/`](solution/) → `Lab7-ATMSystem/` (`com.academy.atm`).

### Seed accounts (memorize these)

| Account | PIN  | Starting balance |
| ------- | ---- | ---------------: |
| `1001`  | `1234` | **$11000** |
| `1002`  | `5678` | **$5000** |

---

## Concepts to Discuss

Write 2–3 sentences each in `../../notes/lab7-answers.md` (from project; or `~/java-bootcamp/notes/lab7-answers.md`) before or during the steps; revisit after Checkpoint C.

1. Why are `InvalidAmountException` and friends **checked** in this lab, while `NullPointerException` is unchecked?
2. What does `throws` on `Account.withdraw(...)` force callers to do?
3. Why catch specific exceptions before a broad `catch (Exception ex)`?
4. What guarantee does `finally` give you that `catch` alone does not?
5. Why prefer try-with-resources over `reader.close()` in a `finally` block?
6. Why log stack traces to a file while showing short messages to the ATM user?
7. Where should validation throw—deep in `Account` or only in `Main`? Why?
8. How will CRM later reuse “domain exception + boundary catch + log” (without claiming CRM is done today)?

---

## Implementation Steps

Complete each step in order. Commands assume `java-bootcamp/examples/Lab7-ATMSystem` on your laptop. Use the integrated terminal in **VS Code** or **IntelliJ** ([`_IDE-CONVENTIONS.md`](../../_IDE-CONVENTIONS.md)).

Parts 1–20 from the Module 7 exercise map into the steps below (model → exceptions → ATMService → logging → menu → failure walkthrough).

---

### Step 1 — Create the project, package, logs, and transaction file

**Why:** Folder path must match `package com.academy.atm;`. Relative files (`transactions.txt`, `logs/`) only work when the JVM starts in the **project root**.

**Builds on Lab 5–6:** Same `src/com/academy/...` + `out/` compile pattern — exercises stayed flat; the graded lab is packaged and must run from project root.

**Do this:**

```bash
# macOS / Linux (Git Bash on Windows also works)
mkdir -p ~/java-bootcamp/examples/Lab7-ATMSystem/src/com/academy/atm
mkdir -p ~/java-bootcamp/examples/Lab7-ATMSystem/logs
mkdir -p ~/java-bootcamp/notes/screenshots/lab-7
cd ~/java-bootcamp/examples/Lab7-ATMSystem
pwd
```

```powershell
# Windows PowerShell alternative
$root = "$env:USERPROFILE\java-bootcamp\examples\Lab7-ATMSystem"
New-Item -ItemType Directory -Force -Path "$root\src\com\academy\atm","$root\logs","$root\notes\screenshots" | Out-Null
cd $root
pwd
```

Create `transactions.txt` in the project root (not under `src/`):

```text
2026-01-10,DEPOSIT,1001,500.00,Initial funding
2026-01-12,WITHDRAW,1001,150.00,ATM withdrawal
2026-01-15,DEPOSIT,1002,1200.00,Salary deposit
2026-01-18,TRANSFER,1001,200.00,Transfer to 1002
```

Open the project folder in VS Code or IntelliJ. Stub the Java files listed under Suggested Project Files.

**Expected result:** Project root contains `src/`, `logs/`, `transactions.txt`, and `notes/`.

**If it fails:** Confirm `pwd` ends with `Lab7-ATMSystem`. Recreate dirs with `mkdir -p` / `New-Item`.

---

### Step 2 — Create custom exception classes (Parts 9–12)

**Why:** Domain rules deserve named types. Catching `InvalidAmountException` is clearer than parsing a generic `Exception` message—and later CRM APIs map named exceptions to status codes.

**Builds on Exercise 5:** Same checked domain-exception pattern — lab adds four ATM types with optional fields (requested/available, attempts remaining).

**Do this:** Create four checked exceptions under `src/com/academy/atm/`:

```java
package com.academy.atm;

public class InvalidAmountException extends Exception {
    public InvalidAmountException(String message) {
        super(message);
    }
}
```

```java
package com.academy.atm;

public class InsufficientFundsException extends Exception {
    private final double requestedAmount;
    private final double availableBalance;

    public InsufficientFundsException(String message, double requestedAmount, double availableBalance) {
        super(message);
        this.requestedAmount = requestedAmount;
        this.availableBalance = availableBalance;
    }

    public double getRequestedAmount() { return requestedAmount; }
    public double getAvailableBalance() { return availableBalance; }
}
```

```java
package com.academy.atm;

public class InvalidPinException extends Exception {
    private final int attemptsRemaining;

    public InvalidPinException(String message, int attemptsRemaining) {
        super(message);
        this.attemptsRemaining = attemptsRemaining;
    }

    public int getAttemptsRemaining() { return attemptsRemaining; }
}
```

```java
package com.academy.atm;

public class AccountNotFoundException extends Exception {
    public AccountNotFoundException(String message) {
        super(message);
    }
}
```

**Rules to wire later:**

| Exception | Rule |
| --------- | ---- |
| `InvalidAmountException` | amount must be **> 0** |
| `InsufficientFundsException` | withdraw/transfer cannot exceed balance |
| `InvalidPinException` | PIN must match; track remaining attempts (max **3**) |
| `AccountNotFoundException` | account number missing from map |

**Expected result:** Four public exception classes compile conceptually; extra fields support richer log lines.

**If it fails:** Class name must match filename. Extend `Exception` (checked), not `RuntimeException`, for this lab’s teaching contract.

---

### Step 3 — Create the `Account` class (Parts 1, 13–14)

**Why:** Business mutations throw at the source of truth. `throws` on `deposit`/`withdraw` documents the checked contract for `ATMService`.

**Builds on Exercises 4–6:** `throw`/`throws` at the domain layer; propagation starts here and continues through `ATMService` to the menu boundary.

**Do this:** Create `src/com/academy/atm/Account.java`:

```java
package com.academy.atm;

public class Account {

    private final String accountNumber;
    private final String customerName;
    private final String pin;
    private double balance;

    public Account(String accountNumber, String customerName, String pin, double balance) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.pin = pin;
        this.balance = balance;
    }

    // getters for all fields

    void restoreBalance(double targetBalance) {
        this.balance = targetBalance; // package-private helper for transfer rollback (bonus)
    }

    public void deposit(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Amount must be greater than zero.");
        }
        balance += amount;
    }

    public void withdraw(double amount) throws InvalidAmountException, InsufficientFundsException {
        if (amount <= 0) {
            throw new InvalidAmountException("Amount must be greater than zero.");
        }
        if (amount > balance) {
            throw new InsufficientFundsException(
                    "Transaction Failed. Insufficient Account Balance.",
                    amount,
                    balance);
        }
        balance -= amount;
    }

    public void displayBalance() {
        System.out.printf("Account : %s | Customer : %s | Balance : $%.2f%n",
                accountNumber, customerName, balance);
    }
}
```

**Attributes checklist:**

| Attribute        | Type     | Notes                |
| ---------------- | -------- | -------------------- |
| Account Number   | `String` | immutable recommended |
| Customer Name    | `String` | immutable recommended |
| PIN              | `String` | demo only—never real  |
| Balance          | `double` | mutable               |

**Expected result:** Negative deposit throws; overdraft withdraw throws with requested/available amounts.

**If it fails:** Remember `throw` creates/throws the object; `throws` only *declares*. Both are required for checked types here.

---

### Step 4 — Create `Transaction` (session mini-statement)

**Why:** Session history supports mini statements and bonus summary reports without a database.

**Do this:** Create `src/com/academy/atm/Transaction.java` with fields: account number, type, amount, timestamp (`LocalDateTime.now()`), successful flag, details. Implement getters and a clear `toString()`.

Match [`solution/`](solution/) if you want grading parity.

**Expected result:** Successful and failed ops can append `Transaction` rows for later display.

**If it fails:** Import `java.time.LocalDateTime`. Keep fields `final` where practical.

---

### Step 5 — Create `LoggerUtil` (Part 17)

**Why:** Users see short ERROR text; mentors need timestamps and stack traces in `logs/application.log`.

**Builds on Exercise 8:** Same context + exception + user-safe message habit — lab centralizes file append under `logs/application.log`.

**Do this:** Create `src/com/academy/atm/LoggerUtil.java`:

```java
package com.academy.atm;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public final class LoggerUtil {

    private static final Path LOG_PATH = Path.of("logs", "application.log");
    private static final DateTimeFormatter FORMATTER =
            DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    private LoggerUtil() {
    }

    public static void logInfo(String message) {
        writeLog("INFO", message, null);
    }

    public static void logError(String message, Throwable throwable) {
        writeLog("ERROR", message, throwable);
    }

    public static void logTransaction(String message, long executionTimeMillis) {
        writeLog("INFO", message + " | Execution Time: " + executionTimeMillis + " ms", null);
    }

    private static void writeLog(String level, String message, Throwable throwable) {
        try {
            Files.createDirectories(LOG_PATH.getParent());
            StringBuilder entry = new StringBuilder();
            entry.append(LocalDateTime.now().format(FORMATTER))
                    .append(" ").append(level).append(" ").append(message);
            if (throwable != null) {
                entry.append(System.lineSeparator())
                        .append(throwable.getClass().getSimpleName()).append(" ")
                        .append(throwable.getMessage()).append(System.lineSeparator())
                        .append(Arrays.toString(throwable.getStackTrace()));
            }
            entry.append(System.lineSeparator());
            Files.writeString(LOG_PATH, entry.toString(),
                    StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        } catch (IOException ioException) {
            System.err.println("Unable to write log file: " + ioException.getMessage());
        }
    }
}
```

Example theme after a failed withdraw:

```text
2026-08-01 10:42:00 ERROR Requested 20000.0 Balance 11000.0
InsufficientFundsException Transaction Failed. Insufficient Account Balance.
[...]
```

**Expected result:** First error creates `logs/application.log` automatically.

**If it fails:** Run the app from the project root. Confirm `logs/` is writable on your laptop.

---

### Step 6 — Skeleton `ATMService` with seed accounts (Parts 2, 12)

**Why:** Service owns accounts, login state, and catch boundaries. `Main` should only switch on menu choices.

**Do this:** Start `src/com/academy/atm/ATMService.java`:

```java
package com.academy.atm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ATMService {

    private static final int MAX_PIN_ATTEMPTS = 3;
    private static final String TRANSACTION_FILE = "transactions.txt";

    private final Map<String, Account> accounts = new HashMap<>();
    private final List<Transaction> sessionTransactions = new ArrayList<>();
    private final Scanner scanner;

    private Account loggedInAccount;
    private int pinAttemptsRemaining = MAX_PIN_ATTEMPTS;

    public ATMService(Scanner scanner) {
        this.scanner = scanner;
        initializeAccounts();
    }

    private void initializeAccounts() {
        accounts.put("1001", new Account("1001", "John Smith", "1234", 11000));
        accounts.put("1002", new Account("1002", "Alice Johnson", "5678", 5000));
    }

    private Account findAccount(String accountNumber) throws AccountNotFoundException {
        Account account = accounts.get(accountNumber);
        if (account == null) {
            throw new AccountNotFoundException("Account not found: " + accountNumber);
        }
        return account;
    }

    private void printReturnMessage() {
        System.out.println("Transaction Completed.");
        System.out.println("Returning to Main Menu.");
    }
}
```

**Sample / seed accounts (required for Expected results):**

| Account | Name | PIN | Balance |
| ------- | ---- | --- | ------: |
| **1001** | John Smith | **1234** | **$11000** |
| **1002** | Alice Johnson | **5678** | **$5000** |

**Expected result:** Service constructs with these two accounts; `findAccount("9999")` throws `AccountNotFoundException`.

**If it fails:** Do not put the account map in `Main`. Keep PIN demo values only in seed data. Match the balances above so insufficient-funds demos make sense (e.g. withdraw `$20000` from `$11000`).

---

### Step 7 — Login with PIN attempts (Parts 11, 15, 18)

**Why:** Login shows multi-catch, custom exception fields, logging, and `finally` return messaging—without exiting the app.

**Builds on Exercises 5 & 7:** Custom `InvalidPinException` plus retry/fallback strategy (max attempts) from the error-strategies exercise.

**Do this:**

```java
public void login() {
    if (loggedInAccount != null) {
        System.out.println("Already logged in as " + loggedInAccount.getCustomerName() + ".");
        return;
    }

    System.out.print("Enter Account Number : ");
    String accountNumber = scanner.nextLine().trim();

    try {
        Account account = findAccount(accountNumber);
        System.out.print("Enter PIN : ");
        String pin = scanner.nextLine().trim();

        if (!account.getPin().equals(pin)) {
            pinAttemptsRemaining--;
            throw new InvalidPinException("Invalid PIN entered.", pinAttemptsRemaining);
        }

        loggedInAccount = account;
        pinAttemptsRemaining = MAX_PIN_ATTEMPTS;
        System.out.println("Login Successful");
        LoggerUtil.logInfo("Login successful for account " + accountNumber);
    } catch (AccountNotFoundException | InvalidPinException ex) {
        System.out.println("ERROR");
        System.out.println(ex.getMessage());
        LoggerUtil.logError(ex.getMessage(), ex);

        if (ex instanceof InvalidPinException invalidPin && invalidPin.getAttemptsRemaining() <= 0) {
            System.out.println("Maximum PIN attempts reached. Login locked for this session.");
        }
    } finally {
        printReturnMessage();
    }
}
```

**Expected result:** Wrong account → ERROR + log; wrong PIN decrements attempts; success prints `Login Successful`; menu always returns via `finally`.

**If it fails:** Use `scanner.nextLine()` for account and PIN. Do not crash on bad PIN.

---

### Step 8 — Shared `executeTransaction` with multi-catch + finally (Parts 3, 6–8, 18)

**Why:** One boundary handler keeps deposit/withdraw/transfer DRY and guarantees the “Returning to Main Menu” message.

**Builds on Exercises 2 & 6:** Same success/failure cleanup as Exercise 2; propagation lands here as the service boundary (Exercise 6).

**Do this:** Add helpers:

```java
import java.util.InputMismatchException;

@FunctionalInterface
private interface TransactionAction {
    void run() throws Exception;
}

private void requireLogin() throws InvalidPinException {
    if (loggedInAccount == null) {
        throw new InvalidPinException(
                "Please login before performing this operation.", pinAttemptsRemaining);
    }
}

private double readAmount(String prompt) throws InputMismatchException {
    System.out.print(prompt);
    String input = scanner.nextLine().trim();
    try {
        return Double.parseDouble(input);
    } catch (NumberFormatException ex) {
        throw new InputMismatchException("Invalid numeric input.");
    }
}

private void executeTransaction(String operationName, TransactionAction action) {
    long startTime = System.nanoTime();
    try {
        action.run();
        LoggerUtil.logTransaction(operationName + " completed successfully",
                (System.nanoTime() - startTime) / 1_000_000);
    } catch (InputMismatchException ex) {
        System.out.println("ERROR");
        System.out.println("Invalid numeric input.");
        System.out.println("Please enter a valid amount.");
        LoggerUtil.logError("Invalid numeric input during " + operationName, ex);
        recordFailedTransaction(operationName, ex.getMessage());
    } catch (InvalidAmountException ex) {
        System.out.println("ERROR");
        System.out.println(ex.getMessage());
        LoggerUtil.logError(ex.getMessage(), ex);
        recordFailedTransaction(operationName, ex.getMessage());
    } catch (InsufficientFundsException ex) {
        System.out.println("ERROR");
        System.out.println("Insufficient Balance");
        System.out.println("Transaction Cancelled");
        LoggerUtil.logError("Requested " + ex.getRequestedAmount()
                + " Balance " + ex.getAvailableBalance(), ex);
        recordFailedTransaction(operationName, ex.getMessage());
    } catch (InvalidPinException | AccountNotFoundException ex) {
        System.out.println("ERROR");
        System.out.println(ex.getMessage());
        LoggerUtil.logError(ex.getMessage(), ex);
        recordFailedTransaction(operationName, ex.getMessage());
    } catch (Exception ex) {
        System.out.println("ERROR");
        System.out.println("Unexpected error occurred. Please try again.");
        LoggerUtil.logError("Unexpected error during " + operationName, ex);
        recordFailedTransaction(operationName, ex.getMessage());
    } finally {
        printReturnMessage();
    }
}
```

Also implement `recordTransaction` / `recordFailedTransaction` using `Transaction` (see solution).

**Invalid amount input (Part 3) messages:**

```text
Invalid numeric input.
Please enter a valid amount.
```

**Finally (Part 8) messages:**

```text
Transaction Completed.
Returning to Main Menu.
```

**Expected result:** Specific catches fire before the generic `Exception` catch; `finally` always runs.

**If it fails:** Order catch blocks from more specific to more general. Catching `Exception` first will not compile for later specific catches.

---

### Step 9 — Deposit, withdraw, balance (Parts 10, 13–15, 19)

**Why:** These paths exercise `throw` inside `Account` and catch inside `ATMService`—classic propagation.

**Do this:**

```java
public void deposit() {
    executeTransaction("Deposit", () -> {
        requireLogin();
        double amount = readAmount("Amount : ");
        loggedInAccount.deposit(amount);
        recordTransaction("DEPOSIT", amount, true, "Deposit successful");
        System.out.println("Deposit Successful");
        System.out.printf("Current Balance : %.0f%n", loggedInAccount.getBalance());
    });
}

public void withdraw() {
    executeTransaction("Withdraw", () -> {
        requireLogin();
        double amount = readAmount("Amount : ");
        loggedInAccount.withdraw(amount);
        recordTransaction("WITHDRAW", amount, true, "Withdrawal successful");
        System.out.println("Withdrawal Successful");
        System.out.printf("Current Balance : %.0f%n", loggedInAccount.getBalance());
    });
}

public void displayBalance() {
    executeTransaction("Balance Inquiry", () -> {
        requireLogin();
        loggedInAccount.displayBalance();
    });
}
```

Propagation chain to observe:

```text
Main → ATMService.withdraw() → Account.withdraw() → throw …
```

**Insufficient funds user messages:**

```text
ERROR
Insufficient Balance
Transaction Cancelled
```

**Expected result:** Deposit `-100` → InvalidAmount; withdraw `20000` on 11000 balance → InsufficientFunds; valid deposit updates balance.

**If it fails:** Login first. Confirm `throws` clauses on `Account` match what `TransactionAction.run()` may throw (`Exception`).

---

### Step 10 — Transfer with rollback (Part 19 + Bonus 1)

**Why:** Transfers are two steps. If the second fails after the first succeeded, balances must restore—training for atomic *thinking* (real systems use DB transactions later).

**Do this:**

```java
public void transferFunds() {
    executeTransaction("Transfer", () -> {
        requireLogin();
        System.out.print("Destination Account Number : ");
        String destinationAccountNumber = scanner.nextLine().trim();
        Account destinationAccount = findAccount(destinationAccountNumber);
        double amount = readAmount("Transfer Amount : ");

        String sourceAccountNumber = loggedInAccount.getAccountNumber();
        double sourceBalanceBefore = loggedInAccount.getBalance();
        double destinationBalanceBefore = destinationAccount.getBalance();

        try {
            loggedInAccount.withdraw(amount);
            destinationAccount.deposit(amount);
            recordTransaction("TRANSFER_OUT", amount, true,
                    "Transfer to " + destinationAccountNumber);
            recordTransaction("TRANSFER_IN", amount, true,
                    "Transfer from " + sourceAccountNumber);
            System.out.println("Transfer Successful");
        } catch (Exception ex) {
            accounts.get(sourceAccountNumber).restoreBalance(sourceBalanceBefore);
            accounts.get(destinationAccountNumber).restoreBalance(destinationBalanceBefore);
            System.out.println("Transfer rolled back due to transaction failure.");
            LoggerUtil.logInfo("Transfer rollback completed for accounts "
                    + sourceAccountNumber + " and " + destinationAccountNumber);
            throw ex; // let executeTransaction log + message
        }
    });
}
```

**Expected result:** Transfer to missing account fails cleanly; failed mid-transfer restores both balances.

**If it fails:** Capture balances **before** mutating. Re-throw so outer multi-catch still logs.

---

### Step 11 — Mini statement + try-with-resources (Parts 4, 16)

**Why:** Reading files is a classic **checked** `IOException` path. Try-with-resources auto-closes the reader.

**Builds on Exercise 3:** Same auto-close reader pattern — lab reads `transactions.txt` from the project root.

**Do this:**

```java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public void displayMiniStatement() {
    executeTransaction("Mini Statement", () -> {
        requireLogin();
        System.out.println("Session Transactions:");
        sessionTransactions.stream()
                .filter(t -> loggedInAccount.getAccountNumber().equals(t.getAccountNumber()))
                .forEach(System.out::println);

        System.out.println();
        System.out.println("Historical Transactions (from file):");
        loadTransactionsFromFile();
    });
}

private void loadTransactionsFromFile() {
    try (BufferedReader reader = new BufferedReader(new FileReader(TRANSACTION_FILE))) {
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
    } catch (IOException ex) {
        System.out.println("Unable to read transaction history.");
        LoggerUtil.logError("Unable to read transaction history", ex);
    }
}
```

**Expected result:** With `transactions.txt` present, historical lines print. Temporarily rename the file → message `Unable to read transaction history.` and an ERROR log; app continues.

**If it fails:** Run from project root. Prefer `BufferedReader` wrapping `FileReader` as in the solution.

---

### Step 12 — Unchecked exception demos (Part 5)

**Why:** Students must handle common runtime faults without letting them kill the menu loop.

**Builds on Exercise 1:** Same NPE / arithmetic / bounds demos — lab keeps the menu alive after each catch.

**Do this:**

```java
public void demonstrateUncheckedExceptions() {
    System.out.println("--- Unchecked Exception Demonstrations ---");

    try {
        Account account = null;
        account.getBalance();
    } catch (NullPointerException ex) {
        System.out.println("Handled NullPointerException gracefully.");
        LoggerUtil.logError("NullPointerException demonstration", ex);
    }

    try {
        int result = 10 / 0;
        System.out.println(result);
    } catch (ArithmeticException ex) {
        System.out.println("Handled ArithmeticException gracefully.");
        LoggerUtil.logError("ArithmeticException demonstration", ex);
    }

    try {
        int[] values = {1, 2, 3};
        System.out.println(values[10]);
    } catch (ArrayIndexOutOfBoundsException ex) {
        System.out.println("Handled ArrayIndexOutOfBoundsException gracefully.");
        LoggerUtil.logError("ArrayIndexOutOfBoundsException demonstration", ex);
    }
}
```

**Expected result:** Three handled messages; process still running; ERROR lines appended to the log.

**If it fails:** Do not omit the catches “to see the crash”—graders want recovery evidence.

---

### Step 13 — Menu-driven `Main` (Parts 2, 18–20)

**Why:** Invalid menu choices must not exit. Only choice `7` terminates cleanly.

**Do this:** Create `src/com/academy/atm/Main.java`:

```java
package com.academy.atm;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ATMService atmService = new ATMService(scanner);

        while (true) {
            displayMenu();
            String choiceInput = scanner.nextLine().trim();

            if (choiceInput.isEmpty()) {
                System.out.println("Invalid menu option. Please try again.");
                continue;
            }

            int choice;
            try {
                choice = Integer.parseInt(choiceInput);
            } catch (NumberFormatException ex) {
                System.out.println("Invalid menu option. Please try again.");
                LoggerUtil.logError("Invalid menu option: " + choiceInput, ex);
                continue;
            }

            System.out.println("--------------------------------");

            switch (choice) {
                case 1 -> atmService.login();
                case 2 -> atmService.deposit();
                case 3 -> atmService.withdraw();
                case 4 -> atmService.displayBalance();
                case 5 -> atmService.transferFunds();
                case 6 -> atmService.displayMiniStatement();
                case 7 -> {
                    System.out.println("Thank You");
                    atmService.logout();
                    scanner.close();
                    return;
                }
                case 8 -> atmService.demonstrateUncheckedExceptions();
                // optional bonuses: 9 daily error report, 10 transaction summary
                default -> {
                    System.out.println("Invalid menu option. Please try again.");
                    LoggerUtil.logInfo("Invalid menu selection: " + choice);
                }
            }
            System.out.println();
        }
    }

    private static void displayMenu() {
        System.out.println("=================================");
        System.out.println("ATM Banking System");
        System.out.println("=================================");
        System.out.println("1 Login");
        System.out.println("2 Deposit");
        System.out.println("3 Withdraw");
        System.out.println("4 Balance Inquiry");
        System.out.println("5 Transfer");
        System.out.println("6 Mini Statement");
        System.out.println("7 Exit");
        System.out.print("Choice : ");
    }
}
```

**Core menu:**

```text
=================================
ATM Banking System
=================================
1 Login
2 Deposit
3 Withdraw
4 Balance Inquiry
5 Transfer
6 Mini Statement
7 Exit
```

You may add options 8–10 as in [`solution/`](solution/).

**Expected result:** `abc` as menu choice prints invalid message and loops; only `7` prints `Thank You` and exits.

**If it fails:** Keep Scanner in `Main`; pass it into `ATMService`. Close Scanner on exit.

---

### Step 14 — Compile, run, and walk success + failure paths (Parts 19–20)

**Why:** Graders care that recoverable errors leave the ATM alive and that logs exist. **Working directory must be the project root** or `transactions.txt` / `logs/` will not resolve.

**Do this:**

**Windows PowerShell** (name each source file — do not rely on `*.java` globs):

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\Lab7-ATMSystem
Remove-Item -Recurse -Force out -ErrorAction SilentlyContinue
javac -d out `
  src\com\academy\atm\InvalidAmountException.java `
  src\com\academy\atm\InsufficientFundsException.java `
  src\com\academy\atm\InvalidPinException.java `
  src\com\academy\atm\AccountNotFoundException.java `
  src\com\academy\atm\Transaction.java `
  src\com\academy\atm\Account.java `
  src\com\academy\atm\LoggerUtil.java `
  src\com\academy\atm\ATMService.java `
  src\com\academy\atm\Main.java
java -cp out com.academy.atm.Main
Get-Content logs\application.log -Tail 40
```

**macOS / Linux:**

```bash
cd ~/java-bootcamp/examples/Lab7-ATMSystem
rm -rf out
javac -d out src/com/academy/atm/*.java
java -cp out com.academy.atm.Main
tail -n 40 logs/application.log
```

Or in IntelliJ: open the project, set SDK 21, set Run working directory to the project root, run `com.academy.atm.Main` (see [`_IDE-CONVENTIONS.md`](../../_IDE-CONVENTIONS.md)).

Suggested walkthrough:

1. Login `1001` / `1234` → `Login Successful` (seed: **$11000**)
2. **Withdraw `20000`** (more than balance) → **Insufficient Balance** error path
3. Deposit `-100` → Amount must be greater than zero
4. Deposit `1000` → success + new balance **12000**
5. Enter amount `abc` → invalid numeric input messages
6. Mini Statement → session + file lines
7. Wrong PIN once or twice → attempts decrease; still in menu
8. Exit `7` → `Thank You`

**Sample: withdraw too much → insufficient balance** (account `1001` has `$11000`):

```text
=================================
ATM Banking System
=================================
Choice : 1
Enter Account Number : 1001
Enter PIN : 1234
Login Successful
--------------------------------
Choice : 3
Amount : 20000
ERROR
Insufficient Balance
Transaction Cancelled
Transaction Completed.
Returning to Main Menu.
--------------------------------
Choice : 2
Amount : -100
ERROR
Amount must be greater than zero.
--------------------------------
Choice : 2
Amount : 1000
Deposit Successful
Current Balance : 12000
--------------------------------
Choice : 7
Thank You
```

Capture screenshots under `notes/screenshots/lab-7/` (no secrets). Also open:

```bash
ls -la logs          # Windows: dir logs
tail -n 40 logs/application.log   # or Get-Content logs\application.log -Tail 40
```

**Expected result:** Clean compile; withdraw-too-much shows Insufficient Balance and returns to menu; log contains ERROR entries; mini statement can read `transactions.txt`.

**If it fails:** Wrong working directory → missing `transactions.txt` or no `logs/application.log`. Fix: `cd` to `Lab7-ATMSystem` and re-run. In IntelliJ, set the run configuration working directory to the project root.

---

### Step 15 — Optional bonuses + notes table

**Why:** Rubric core is exception design/recovery; bonuses show polish.

**Do this (optional):**

1. Daily error report from `logs/application.log` (count ERROR lines)—solution menu `9`
2. Transaction summary (success vs failed session counts)—solution menu `10`
3. Execution time already logged via `LoggerUtil.logTransaction` if you used Step 8’s timer

Then complete `notes/exception-hierarchy.md` and draft Reflection answers.

**Expected result:** Notes list all four custom exceptions + where they are thrown/caught.

**If it fails:** Skip bonuses if core 1–7 paths are incomplete—core grading comes first.

---

## Implementation Checkpoints

### Checkpoint A — Project + exceptions + model

_Mark each row **Pass** or **Fail** in your lab notes (GitHub markdown files are not interactive checklists)._

| # | Confirm | Your notes |
| - | ------- | ---------- |
| 1 | `java-bootcamp/examples/Lab7-ATMSystem/src/com/academy/atm/` exists | Pass / Fail |
| 2 | Four custom exceptions + `Account` + `transactions.txt` + `logs/` present | Pass / Fail |
| 3 | Seed accounts: `1001`/`1234`/$11000 and `1002`/`5678`/$5000 | Pass / Fail |
| 4 | Edited via IntelliJ (or optional VS Code) on your laptop | Pass / Fail |

### Checkpoint B — Service + Main compile

_Mark each row **Pass** or **Fail** in your lab notes (GitHub markdown files are not interactive checklists)._

| # | Confirm | Your notes |
| - | ------- | ---------- |
| 1 | `ATMService`, `LoggerUtil`, `Transaction`, `Main` present | Pass / Fail |
| 2 | `javac -d out src/com/academy/atm/*.java` succeeds | Pass / Fail |
| 3 | `java -cp out com.academy.atm.Main` from **project root** shows menu 1–7 | Pass / Fail |
| 4 | Exit prints `Thank You` and terminates | Pass / Fail |

### Checkpoint C — Exception behavior

_Mark each row **Pass** or **Fail** in your lab notes (GitHub markdown files are not interactive checklists)._

| # | Confirm | Your notes |
| - | ------- | ---------- |
| 1 | Withdraw more than balance (e.g. `20000` on `1001`) → Insufficient Balance; menu continues | Pass / Fail |
| 2 | Invalid amount / bad PIN / missing account produce ERROR messages (not crashes) | Pass / Fail |
| 3 | Invalid numeric input shows the Part 3 messages and continues | Pass / Fail |
| 4 | `finally` prints return-to-menu text after operations | Pass / Fail |
| 5 | try-with-resources handles missing/unreadable `transactions.txt` with the IOException message | Pass / Fail |

### Checkpoint D — Logging + evidence

_Mark each row **Pass** or **Fail** in your lab notes (GitHub markdown files are not interactive checklists)._

| # | Confirm | Your notes |
| - | ------- | ---------- |
| 1 | `logs/application.log` contains ERROR (and ideally INFO) entries under the project root | Pass / Fail |
| 2 | Exception hierarchy notes filled; reflection drafted | Pass / Fail |
| 3 | Screenshots of success **and** failure paths saved (no secrets) | Pass / Fail |

---

## Reference Commands, Configuration, and Code

### Primary compile / run (from project root)

```bash
cd ~/java-bootcamp/examples/Lab7-ATMSystem
javac -d out src/com/academy/atm/*.java
java -cp out com.academy.atm.Main
```

### Clean and rebuild

```bash
cd ~/java-bootcamp/examples/Lab7-ATMSystem
rm -rf out
javac -d out src/com/academy/atm/*.java
find out -type f
```

### Inspect logs

```bash
mkdir -p logs
tail -n 50 logs/application.log
grep ERROR logs/application.log | wc -l
```

### Class / responsibility map

| Class | Responsibility |
| ----- | -------------- |
| `Main` | Menu loop; invalid menu recovery; exit |
| `ATMService` | Login, transactions, multi-catch boundary, file read |
| `Account` | Balance mutations; `throw` validation |
| `Transaction` | Session history row |
| `LoggerUtil` | Append INFO/ERROR to `logs/application.log` |
| Custom exceptions | Domain error types + optional context fields |

### Exception map

| Exception | Thrown where | Caught where |
| --------- | ------------ | ------------ |
| `InvalidAmountException` | `Account.deposit/withdraw` | `ATMService.executeTransaction` |
| `InsufficientFundsException` | `Account.withdraw` | `ATMService.executeTransaction` |
| `InvalidPinException` | `login` / `requireLogin` | `login` or `executeTransaction` |
| `AccountNotFoundException` | `findAccount` | `login` or `executeTransaction` |
| `IOException` | file read / log write | `loadTransactionsFromFile` / LoggerUtil |
| `InputMismatchException` | `readAmount` | `executeTransaction` |

Maven is **not** required for this lab.

---

## Manual Verification

1. Menu 1–7 appears; invalid `abc` → invalid menu message → menu returns.
2. Login `1001` / `1234` → `Login Successful` (balance starts at **$11000**).
3. Withdraw `20000` → **Insufficient Balance** / Transaction Cancelled; still at menu.
4. Deposit `-100` → Amount must be greater than zero.
5. Deposit `abc` → Invalid numeric input messages; still at menu.
6. Deposit `1000` → Deposit Successful; balance becomes **12000**.
7. Mini Statement shows session rows and historical file lines (requires project-root cwd).
8. Login with wrong account `9999` → Account not found; still at menu.
9. Unchecked demo (menu 8 if added) prints three handled messages.
10. `logs/application.log` has ERROR entries; Exit `7` → `Thank You`.

Record pass/fail in `../../notes/lab7-answers.md` (from project; or `~/java-bootcamp/notes/lab7-answers.md`).

---

## Testing Scenarios

| Test Case | Expected Result |
| --------- | --------------- |
| Deposit valid amount | Deposit successful |
| Deposit negative amount | `InvalidAmountException` handled |
| Withdraw within balance | Withdrawal successful |
| Withdraw more than balance | `InsufficientFundsException` handled |
| Invalid PIN | `InvalidPinException` handled; attempts decrease |
| Non-existent account | `AccountNotFoundException` handled |
| Invalid numeric input | Invalid numeric input messages; continue |
| Missing transaction file | `IOException` handled; `Unable to read transaction history.` |
| Invalid menu option | Display error and continue |
| Transfer failure mid-way (bonus) | Balances rolled back |

---

## Failure Experiments

Perform deliberately, then restore working code / files.

| # | Experiment | Observe | Restore |
| - | ---------- | ------- | ------- |
| 1 | Remove `catch` for `InsufficientFundsException` only | Compile error or falls into generic catch / worse UX | Restore specific catch |
| 2 | Rename `transactions.txt` temporarily | `Unable to read transaction history.`; app continues | Restore filename |
| 3 | Comment out `finally { printReturnMessage(); }` | No “Returning to Main Menu” text | Restore `finally` |
| 4 | Run `java -cp out ...` from `~/` instead of project root | Missing file / wrong log path | `cd` to project root |
| 5 | Exhaust 3 bad PIN attempts | Lock message for session; no JVM crash | Restart app / reset attempts logic |

---

## Troubleshooting

| Symptom | Likely cause | Fix |
| ------- | ------------ | --- |
| `javac: command not found` | JDK not on PATH | [Lab 0](../../module-00/lab0/LAB-0-GUIDE.md) / [SETUP](../../../SETUP-INSTRUCTIONS.md) |
| Files missing / wrong project | Wrong folder open | Open `Lab7-ATMSystem` in VS Code or IntelliJ; see [`_IDE-CONVENTIONS.md`](../../_IDE-CONVENTIONS.md) |
| `package does not exist` | Folder ≠ package | Recreate `src/com/academy/atm` |
| Cannot load main class | Wrong `-cp` / package | `java -cp out com.academy.atm.Main` |
| `Unable to read transaction history` always | Wrong cwd | Run from `Lab7-ATMSystem` root (folder with `transactions.txt`) |
| Log file never created | Logger never called / cwd wrong | Trigger an ERROR path; check `logs/` under project root |
| Unreported exception compile error | Missing `throws` or catch | Declare on `Account` methods; catch in service |
| App exits on bad input | Uncaught exception | Wrap ops in `executeTransaction` / catch in `login` |
| Catch order compile error | Broad catch first | Specific catches before `Exception` |
| Changes not visible | Stale `.class` | Re-run `javac -d out ...` |

---

## Security and Production Review

Training console only—gaps are intentional:

* **Demo PINs are not security.** Real ATMs never store PINs in plaintext source. Do not reuse these patterns for production auth.
* **In-memory balances are not durable.** Closing the JVM drops account state. Production banking uses transactional databases and ledgers.
* **Logging sensitive data.** Avoid logging full PINs or real customer PII. This lab logs messages and stack traces for teaching—scrub before sharing logs outside class.
* **User-facing stack traces.** Never dump stack traces to end users; log them. Keep console messages short (as this lab does).
* **No secrets** in source, screenshots, or `notes/` (no private keys, API tokens, real bank credentials).
* Future CRM: validation exceptions and audit logs inherit the same “don’t leak secrets / PII” rules.

---

## Cleanup

```bash
cd ~/java-bootcamp/examples/Lab7-ATMSystem
rm -rf out
# optional: truncate or archive logs after copying an evidence snippet
# : > logs/application.log
```

Keep `.java` sources, `transactions.txt`, notes, and evidence screenshots. Do not delete GitHub credentialss or Lab 0 tooling. Leave [`solution/`](solution/) intact—do not submit it as your own work.

---

## Expected Deliverables

Students should submit:

* Complete Java project with all source files under `src/com/academy/atm/`
* Source code for: `Account`, `Transaction`, `ATMService`, `LoggerUtil`, `Main`, and all four custom exceptions
* `transactions.txt` (or equivalent historical input file)
* Evidence of `logs/application.log` (snippet or screenshot of ERROR lines)
* Screenshots of successful **and** failed transactions (menu still alive)
* README / LMS notes containing:
  * Project overview
  * Exception hierarchy
  * Custom exceptions implemented
  * Logging strategy
  * How to compile and run (from project root)
  * Sample output
  * Lessons learned
* Answers to reflection questions in `../../notes/lab7-answers.md` (from project; or `~/java-bootcamp/notes/lab7-answers.md`)
* Optional: labeled bonuses (rollback, daily error report, timing, summary)
* Git repository (optional)

Do not submit secrets or a verbatim instructor [`solution/`](solution/) as your own work.

---

## Evaluation Rubric (100 Marks)

| Criteria                               | Marks |
| -------------------------------------- | ----: |
| Project Structure                      |    10 |
| Checked & Unchecked Exception Handling |    15 |
| Custom Exceptions                      |    15 |
| try-catch-finally Implementation       |    15 |
| throw & throws Usage                   |    10 |
| Exception Propagation                  |    10 |
| try-with-resources                     |    10 |
| Logging & Error Recovery               |    10 |
| Code Quality & Documentation           |     5 |

**Notes:** Package `com.academy.atm` + `-d out` compile from project root; checked custom exceptions for domain rules; unchecked demos handled; multi-catch + `finally` on banking ops; `throw` in `Account` and `throws` declarations; clear Main→Service→Account propagation; try-with-resources for `transactions.txt`; file logging + menu survives failures. Bonuses are stretch—not required for the core 100.

---

## Reflection Questions

Write short answers (3–6 sentences) in `../../notes/lab7-answers.md` (from project; or `~/java-bootcamp/notes/lab7-answers.md`):

1. What is the difference between checked and unchecked exceptions?
2. Why should custom exceptions be used?
3. What is exception propagation?
4. What is the purpose of `finally`?
5. Why is `try-with-resources` preferred?
6. When should `throw` be used?
7. When should `throws` be used?
8. Why is logging important in enterprise applications?
9. What happens if an exception is not handled?
10. How does proper exception handling improve software reliability?
11. (Forward look) How would a future CRM map domain exceptions (not found / validation) to API errors using the same boundary-catch + log pattern—without claiming CRM is implemented today?

---

## Bonus Challenges

Attempt after core rubric items are solid. See [`solution/`](solution/) menu options 9–10 and transfer rollback.

### Challenge 1 — Transaction Rollback

Implement transfer rollback when any exception occurs mid-transfer (restore both balances)—already sketched in Step 10.

### Challenge 2 — Daily Error Report

Create a daily error report from `logs/application.log` (count and preview ERROR lines).

### Challenge 3 — Execution Time Logging

Log execution time for every successful transaction (`LoggerUtil.logTransaction`).

### Challenge 4 — Login Retry Mechanism

Enforce max 3 PIN attempts with a clear lock message for the session.

### Challenge 5 — Transaction Summary Report

Generate a session transaction summary (total / successful / failed).

---

## Success Criteria

You have completed Lab 7 when you can:

_Mark each row **Pass** or **Fail** in your lab notes (GitHub markdown files are not interactive checklists)._

| # | Confirm | Your notes |
| - | ------- | ---------- |
| 0 | Module 7 Exercises 1–8 Pass criteria are complete **before** Lab Step 1 | Pass / Fail |
| 1 | Work in `java-bootcamp/examples/Lab7-ATMSystem/` with `package com.academy.atm` | Pass / Fail |
| 2 | Custom exceptions + login/deposit/withdraw; insufficient-funds path works | Pass / Fail |
| 3 | Menu recovers after failures; `logs/application.log` has diagnostic entries | Pass / Fail |
| 4 | `javac -d out` / `java -cp out com.academy.atm.Main` succeed **from project root** | Pass / Fail |
| 5 | You can narrate throw site → catch boundary → log → return to menu | Pass / Fail |
| 6 | Screenshots/evidence under `notes/screenshots/lab-7/` without secrets or real PINs | Pass / Fail |

By the end of this lab, you should also be able to:

* Design Java applications that fail gracefully instead of crashing
* Handle checked and unchecked exceptions appropriately
* Create and use meaningful custom exception classes
* Apply `throw`, `throws`, `try-catch-finally`, and `try-with-resources` correctly
* Trace exception propagation through `Main → ATMService → Account`
* Implement centralized file logging for diagnostics
* Keep a console ATM recoverable under bad input and business-rule failures
* Explain how Lab 7’s exception design prepares (but does not implement) later CRM API error handling

This lab bridges **Module 7 exercises** (after Labs 5–6) to graded ATM recovery evidence.

---

## Instructor Notes

**Classroom order (do not reverse):**

1. Module 7 PPT (Day 5 afternoon)
2. Students complete [Exercises 1–8](../exercises/EXERCISES-INDEX.md) in `module-07-exercises/` (Day 5, 3:00–4:30)
3. OS how-to → this guide (Day 5, 4:30–5:35 core checkpoint)
4. Kahoot Module 7 + Week 1 review / Week 2 bridge

**Before students open this guide:** confirm all eight exercise Pass rows (common exceptions, try-catch-finally, try-with-resources, throw/throws, custom exception, propagation, retry/fallback, logging). Lab 7 pacing assumes those skills already exist.

* **Reference solution:** Full implementation including menu options 8–10 and transfer rollback is in [`solution/`](solution/) under `Lab7-ATMSystem/` (`com.academy.atm`). Seed accounts: **`1001`/`1234`/$11000** and **`1002`/`5678`/$5000**. Guide learners to finish core menu 1–7 + logging before revealing bonuses. Emphasize withdraw `$20000` → Insufficient Balance as the signature failure demo.
* **API fidelity:** Align with solution signatures—`Account.deposit/withdraw` checked throws; `InsufficientFundsException(message, requested, available)`; `InvalidPinException(message, attemptsRemaining)`; `ATMService(Scanner)`; `LoggerUtil` path `logs/application.log`; `TRANSACTION_FILE = "transactions.txt"`; user messages for invalid numeric input and insufficient balance as specified.
* **Common pitfalls:** Skipping exercises; running from the wrong directory; putting catches only in `Main` while leaving `Account` undeclared; catching `Exception` first; forgetting `finally`; logging PINs; crashing on `NumberFormatException` instead of translating to a friendly message; mixing `module-07-exercises/` flat files with packaged lab commands.
* **Classpath / cwd / IDE:** Demo failure when starting Java outside the project root so try-with-resources + logging paths “click.” Dual IDE on laptop: IntelliJ Community primary, VS Code optional — [`_IDE-CONVENTIONS.md`](../../_IDE-CONVENTIONS.md). In IntelliJ, set working directory to project root. Score screenshots of **failure** paths + log evidence, not only happy-path deposits.
* **Teaching emphasis:** Boundaries catch; domain throws; users get short messages; logs get detail. CRM/Spring exception handlers (Week 2+) reuse this mental model—Lab 7 stays console + file I/O on purpose.
* **Timing:** Day 5 core ~65 min (login + one success + insufficient funds + log evidence); remaining paths as extended completion. After Lab 7, optionally point students to the Week 1 integrated mini-project below as a portfolio bridge into Week 2.

---

## Week 1 Integrated Mini Project

At the end of Week 1, students may combine module knowledge into:

### Employee Management System v1

**Features:**

```text
OOP Design
Collections Framework
Streams
Exception Handling
Memory Awareness
Coding Standards
```

**Technologies Used:** Java, JVM, Collections, Streams, OOP, Exception Handling

**Purpose:** Creates a bridge into Week 2 where students start building enterprise-grade backend services using Maven, SOAP APIs, GitHub Copilot, testing frameworks, and layered architecture. This mini-project becomes a foundation that later evolves toward Spring Boot applications. It is **optional stretch** beyond Lab 7 core grading unless your instructor assigns it.

---

*End of Lab 7 — Exception Handling and Error Management: ATM Banking System. Keep `Lab7-ATMSystem` for portfolio evidence.*
