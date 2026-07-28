### Manual Verificaiton:
**ALL MANUAL VERIFICATION CHECKS PASSED**

### Concept Questions - review after Checkpoint C:
**1. Why are InvalidAmountException and friends checked in this lab, while NullPointerException is unchecked?**\
They are checked because they fall under checked exceptions, or exceptions that should be handled at compile time. This is because we can anticipate when these exceptions should be thrown. Unchecked exceptions, such as `NullPointerException`, aren't checked at compile time because the compiler can't anticipate when this will happen. It is rather a programming error that can't be forced to handle.\
**2. What does throws on Account.withdraw(...) force callers to do?**\
It forces one of its calling methods to handle `InsufficientFundsException` and `InvalidAmountException` as it propagates up, before it reaches the top of the call stack.\
**3. Why catch specific exceptions before a broad catch (Exception ex)?**\
It is good practice to catch specific exceptions before a broad catch because it allows for clearer logging / error reporting. Being able to tell exactly what caused an error and where it was thrown is much more helpful than receiving a generic exception message.\
**4. What guarantee does finally give you that catch alone does not?**\
A `finally` block guarantees the code inside of it will run, no matter what happens previously in the `try-catch` preceding it. If a `try` succeeds, the `finally` code will still run. If an exception is caught in the `catch` block(s), the code in the `finally` will also run. This allows for a fixed behavior no matter the outcome of a `try-catch`.\
**5. Why prefer try-with-resources over reader.close() in a finally block?**\
Using `try-with-resources` is a cleaner, more concise, and less error-prone way of doing the exact same thing. Rather than manually closing resources in a `finally` block, it automatically closes all resources opened in the `try`, avoiding the risk of missing a resource on exit.\
**6. Why log stack traces to a file while showing short messages to the ATM user?**\
A stack trace means nothing to a bank customer and shouldn't be shown to them. Instead, using `LoggerUtil.logError` keeps detailed logs for developers, while the user only ever sees something like `Insufficient Balance` or `Invalid Numeric Input`.\
**7. Where should validation throw—deep in Account or only in Main? Why?**\
It should throw deep in `Account` rather than in `Main`. Since `Account` owns `balance`, it is the only place that can guarantee the rule is actually being enforced no matter who uses it. If it was in `Main`, any future caller of `Account.withdraw()` could bypass the rule entirely.\
**8. How will CRM later reuse “domain exception + boundary catch + log” (without claiming CRM is done today)?**\
A future CRM service could throw its own exceptions from the layer that owns the rule, exactly like `Account` does in this lab. Then it could catch them in a single boundary and log details. The pattern remains the same.\


### Reflection Questions:
**1. What is the difference between checked and unchecked exceptions?**\
Checked exceptions are checked a compile time, forcing every caller to catch or declare them. In this lab we have four of them. Unchecked exceptions, like `NullPointerException` and `RuntimeException`, aren't checked at compile time. They are caused by programming errors that the compiler can't predict or force you to handle.\
**2. Why should custom exceptions be used?**\
A custom exception can often be much more specific than a generic exception with a custom message. For example, in this lab we have `InsuffcientFundsException`. This allows for greater context and documents an error directly in the method signature and lets the callers catch that specific rule violation.\
**3. What is exception propagation?**\ 
Exception propagation is when a method doesn't catch an exception, but rather lets it automatically pass up through each of the calling methods until something does catch it. In this lab, `Account.withdraw()` throws an exception, and it propagates up into `executeTransactions`'s catch blocks. Every layer in between needs to declare `throws` but doesn't necessarily need a catch.\
**4. What is the purpose of finally?**\
`finally` guarantees the block of code runs no matter what happens in a `try-catch`. Whether a `try` succeeds or a `catch` handles an error, whatever is in the `finally` block will run. In this lab, `executeTransaction` has a `finally` block that always runs `printReturnMessage()`.\
**5. Why is try-with-resources preferred?**\
It closes resources autmatically after the block exits. This removes the need for a `finally` block to manually close the resources. In this lab, the `BufferedReader` closes itself in `loadTransactionsFromFile()`.\
**6. When should throw be used?**\
`throw` should be used within a method when code explicitly causes an error or disrupts the program flow. It will then raise an exception and jump to the nearest `try-catch` block that can handle the exception.\
**7. When should throws be used?**\
`throws` should be used when a method could possibly throw an exception during its execution. If this were to happen, it would propagate up to the calling methods until it reaches a `catch` or the top of the call stack.\
**8. Why is logging important in enterprise applications?**\

**9. What happens if an exception is not handled?**\
It keeps propagating up through the callings methods until it finds a `catch` block that handles the exception, or reaches the top of the call stack. If it is not caught, the JVM prints the stack trace and thread, terminating the program. In this lab, `executeTransaction` has a final `catch` for general exceptions to avoid this.\
**10. How does proper exception handling improve software reliability?**\
It aims to recover from all possible outcomes, such as a bad input, missing file, or in this case insufficient funds in a users account. This avoids crashes, and when used with a logging file, provides a durable history and record of what went wrong. This allows for easier troubleshooting and reliable systems.\
**11. (Forward look) How would a future CRM map domain exceptions (not found / validation) to API errors using the same boundary-catch + log pattern—without claiming CRM is implemented today?**\
A CRM map could use this almost exactly, just with some different business logic. For example, an error such as `InvalidCustomerIdException` could be thrown deep in the service, but would propagate ip to a boundary layer. Here, something would catch it similar to `executeTransaction`, then log the error.\