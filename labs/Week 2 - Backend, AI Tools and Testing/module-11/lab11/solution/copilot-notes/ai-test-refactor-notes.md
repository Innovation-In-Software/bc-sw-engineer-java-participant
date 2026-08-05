## lab11-001 — false-confidence rejection

Rejected weak suggestion:
```java
@Test void serviceIsNotNull() { assertNotNull(service); }
```
Reason: cannot fail while `@BeforeEach` constructs the service. Replaced with `findByStatusReturnsOnlyMatchingCustomers`.

## lab11-002 — smell → refactor

Smell: duplicated blank `customerId` checks + `System.out` side effect.
Refactor: `validateCustomerId()` helper + `CustomerNotifier` called from `updateStatus`.
Proof: `CustomerServiceTest` + `CustomerNotifierMockTest` green.

## lab11-003 — coverage gaps

Covered: equals/toString (entity); add/duplicate/update/unknown/findByStatus; notifier verify.
Gaps acceptable now: exhaustive `listAll` direct asserts; edge cases for SUSPENDED/CLOSED transitions.

## lab11-004 — acceptance guidelines

1. Every assertion must be able to fail.
2. Every refactor backed by tests before/after.
3. No new undeclared dependencies.
4. Author can explain without Copilot.
5. Coverage gaps documented.
