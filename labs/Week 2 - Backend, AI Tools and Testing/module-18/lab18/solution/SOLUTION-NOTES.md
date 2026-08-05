# Lab 18 solution notes

## What / why

Mockito isolation for `DefaultCustomerService`: mock repository, keep validator real, prove activate Ravi with stub/verify, `never().save` on `CUS-9999`, and `ArgumentCaptor` on add Amina. BDDMockito twin covers given/then/should style.

## Verify

```powershell
cd "labs\Week 2 - Backend, AI Tools and Testing\module-18\lab18\solution"
mvn -B clean test
mvn -q test -Dtest=CustomerServiceMockitoTest,CustomerServiceBddMockTest
```

Run twice for determinism. Expect BUILD SUCCESS.

## Pitfalls

- Missing `@ExtendWith(MockitoExtension.class)` → NPE on `@Mock`.
- Mocking the SUT → honor violation.
- Unused stubs → `UnnecessaryStubbingException`.
- Different mock instances for validator vs service → uniqueness stubs miss.
