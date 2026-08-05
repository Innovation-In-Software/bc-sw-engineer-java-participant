# Lab 12 — Instructor solution notes

## What was implemented

- Frozen messy baseline as `CustomerService.before.java.txt`.
- Refactored `CustomerService` with Map store + target API + correlation-aware exceptions.
- Tests: CustomerTest (2) + CustomerServiceTest (6) = 8.
- Smell / before-after / standards docs.

## How to verify

```powershell
cd "labs\Week 2 - Backend, AI Tools and Testing\module-12\lab12\solution"
mvn -B clean test
java -cp target\classes com.northstar.crm.Main
```

## Pitfalls

- Before snapshot must use `.txt` suffix so Maven does not compile two classes.
- Update tests away from `addCustomer` / `doStuff` after API rename.
