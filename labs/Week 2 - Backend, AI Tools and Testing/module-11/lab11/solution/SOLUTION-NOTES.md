# Lab 11 — Instructor solution notes

## What was implemented

- JUnit tests: CustomerTest (2), CustomerServiceTest (5), CustomerNotifierMockTest (1) → **8 tests**.
- Extracted `CustomerNotifier` + `validateCustomerId`; no-arg ctor keeps no-op notifier.
- Review notes `lab11-001`–`004`.

## How to verify

```powershell
cd "labs\Week 2 - Backend, AI Tools and Testing\module-11\lab11\solution"
mvn -q clean test
```

Expected: Tests run: 8, Failures: 0.

## Pitfalls

- Remove Lab 9 `PlaceholderTest` / trivial asserts.
- Keep no-arg `CustomerService()` after notifier extract.
- Package tests under `entity` / `service` as in the GUIDE.
