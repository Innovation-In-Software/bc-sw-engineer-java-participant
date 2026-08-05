# Module 7 exercise solutions (instructor only)

Complete reference implementations for the pre-lab exercises.

**Do not share with participants.** This folder is named `solution/` so `push-all.ps1` excludes it from the participant remote.

Flat folder + JDK 21 on `PATH`. Run demos from this directory so relative files resolve (`transactions.txt` is written by `TryWithResourcesDemo`).

## File map

| Exercise | File(s) | Role |
| -------- | ------- | ---- |
| 1 Trigger Common Exceptions | [`CommonExceptionsDemo.java`](CommonExceptionsDemo.java) | Runnable |
| 2 `try-catch-finally` | [`FinallyDemo.java`](FinallyDemo.java) | Runnable |
| 3 Try-with-resources | [`TryWithResourcesDemo.java`](TryWithResourcesDemo.java) (+ writes [`transactions.txt`](transactions.txt)) | Runnable |
| 4 `throw` and `throws` | [`ThrowThrowsDemo.java`](ThrowThrowsDemo.java) | Runnable |
| 5 Custom Exception | [`InsufficientFundsException.java`](InsufficientFundsException.java), [`Account.java`](Account.java), [`CustomExceptionDemo.java`](CustomExceptionDemo.java) | Runnable |
| 6 Exception Propagation | [`PropagationDemo.java`](PropagationDemo.java) (uses `InsufficientFundsException`) | Runnable |
| 7 Error Handling Strategies | [`StrategyDemo.java`](StrategyDemo.java) | Runnable (retry + fallback; non-deterministic attempts) |
| 8 Logging Warm-up | [`LoggingWarmup.java`](LoggingWarmup.java) | Runnable |

No analysis-only exercises (every exercise has Java).

## Compile and run (Windows PowerShell)

```powershell
javac CommonExceptionsDemo.java FinallyDemo.java TryWithResourcesDemo.java ThrowThrowsDemo.java InsufficientFundsException.java Account.java CustomExceptionDemo.java PropagationDemo.java StrategyDemo.java LoggingWarmup.java

java CommonExceptionsDemo
java FinallyDemo
java TryWithResourcesDemo
java ThrowThrowsDemo
java CustomExceptionDemo
java PropagationDemo
java StrategyDemo
java LoggingWarmup
```

## Expected key output

| Demo | Key lines |
| ---- | --------- |
| `CommonExceptionsDemo` | `Caught: ArithmeticException` · `Caught: NullPointerException` · `Caught: ArrayIndexOutOfBoundsException` · `Program continued.` |
| `FinallyDemo` | success path: `Transfer started.` · `Transfer completed.` · `Cleanup: release transfer session.` then `---` then fail path: `Handled: Transfer service unavailable` · same cleanup line |
| `TryWithResourcesDemo` | `Read: deposit 100` · `Read: withdraw 25` · `Reader closed automatically.` |
| `ThrowThrowsDemo` | `Validation: Amount must be positive` · `Policy file unavailable; caller handled IOException.` |
| `CustomExceptionDemo` | `Insufficient funds: balance=100.00, requested=150.00` · `Short by: 50.00` · `Balance unchanged: 100.00` |
| `PropagationDemo` | `Caught at main: Insufficient funds: balance=100.00, requested=150.00` plus stack frames `accountLayer` → `serviceLayer` → `menuLayer` → `main` |
| `StrategyDemo` | zero or more `Attempt N failed: Service temporarily unavailable` · optional `Retries exhausted, falling back to default.` · `Balance shown to user: 500` or `0` |
| `LoggingWarmup` | `User message: Withdrawal could not be completed.` · JUL `SEVERE: Withdrawal failed accountId=A-1001` with `IllegalStateException` |

## Common mistakes

- Running `TryWithResourcesDemo` from another cwd — it uses `Path.of("transactions.txt")` relative to the process working directory.
- Catching `Exception` too broadly in student rewrites — solution catches the specific types named in each exercise.
- Expecting `StrategyDemo` to always print the same attempt lines — random failures; final balance is `500` on success or `0` after exhausted retries.

## Clean

```powershell
Remove-Item -Force *.class
# optional: Remove-Item -Force transactions.txt
```
