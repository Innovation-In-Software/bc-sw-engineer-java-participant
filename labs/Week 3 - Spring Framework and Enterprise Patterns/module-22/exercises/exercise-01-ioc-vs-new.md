# Exercise 1 — IoC Versus Manual Wiring

**Module 22** · Analysis exercise · [setup](EXERCISES-INDEX.md)

## Goal

Explain why Northstar CRM should stop constructing repositories inside services with `new`.

## Reference

| Approach | Who creates collaborators? | Test impact |
| --- | --- | --- |
| Manual `new` | Service constructs `InMemoryCustomerRepository` | Hard to swap fakes |
| IoC / DI | Spring (or test) supplies collaborators | Constructor takes a fake repo |

## Steps

### Step 1 — Spot the smell

In `notes/ioc-vs-new.md`, rewrite this anti-pattern in one sentence:

```java
public class CustomerService {
    private final CustomerRepository repo = new InMemoryCustomerRepository();
}
```

Name one problem for swapping persistence later.

### Step 2 — Check the reference

Compare your note to the reference table. IoC means the **container** owns lifecycle; the service declares needs via constructor parameters.

### Step 3 — CRM fixtures

List three evidence IDs Lab 22 will use: `CUS-1001` (Amina Khan, ACTIVE), `CUS-1002` (Ravi Singh, PROSPECT), correlation `lab-request-001`.

### Step 4 — Pre-lab boundary

Write one line: this exercise prepares for bean wiring only — you will **not** finish the full Lab 22 starter TODOs here.

## Expected result

A short note explains IoC vs `new` and lists the three CRM fixtures.

## If it fails

| Problem | Fix |
| --- | --- |
| Problem | Fix |
| Calling IoC 'magic statics' | IoC is injection of dependencies, not global lookup |
| Skipping fixtures | Keep Amina/Ravi IDs consistent for later labs |

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Anti-pattern problem is named (testability or swapability) | Pass / Fail |
| 2 | IoC ownership is stated clearly | Pass / Fail |
| 3 | CUS-1001, CUS-1002, and lab-request-001 appear in notes | Pass / Fail |
