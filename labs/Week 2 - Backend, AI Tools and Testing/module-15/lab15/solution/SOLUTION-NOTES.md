# Lab 15 solution notes

## What / why

Instructor key for the service-layer lab: private-Map repository, transition matrix in `CustomerValidator`, constructor-DI `DefaultCustomerService` that validates **before** mutating status. Fixtures: `CUS-1001` Amina ACTIVE, `CUS-1002` Ravi PROSPECT→ACTIVE, correlation `lab-request-001`.

## Verify

```powershell
cd "labs\Week 2 - Backend, AI Tools and Testing\module-15\lab15\solution"
mvn -B clean test
mvn -q exec:java -Dexec.mainClass=com.northstar.crm.Main
```

Expect: tests green; Main prints `activated CUS-1002 status=ACTIVE`, illegal transition message with `[lab-request-001]`, Amina still ACTIVE.

## Pitfalls

- Two repo instances → duplicate checks miss existing customers.
- Mutating status before `validateTransition` corrupts state on failure.
- Lab 16 replaces `IllegalStateException` / `IllegalArgumentException` with `BusinessException`.
