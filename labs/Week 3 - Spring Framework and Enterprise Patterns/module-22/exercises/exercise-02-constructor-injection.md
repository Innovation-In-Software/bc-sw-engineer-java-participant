# Exercise 4 — Constructor Injection Preference

**Module 22** · Documentation exercise · [setup](EXERCISES-INDEX.md)

## Goal

Document why constructor injection with `final` fields is the Northstar standard.

## Reference

| Style | Verdict |
| --- | --- |
| Constructor + `final` | Preferred — required deps, testable |
| Setter injection | Optional deps only |
| Field `@Autowired` | Avoid as primary pattern |

## Steps

### Step 1 — Write the rule

In `notes/constructor-di.md`, complete:

> Northstar prefers _____ injection because dependencies are _____ and fields can be _____.

### Step 2 — Check the reference

Answer key: constructor / required (explicit) / final (immutable after construction).

### Step 3 — Sketch signature

Write the constructor signature only (no method bodies):
`CustomerService(CustomerRepository repo, NotificationService notifier)`.

### Step 4 — Unit-test implication

One sentence: a pure unit test can `new CustomerService(fakeRepo, fakeNotifier)` without starting Spring.

## Expected result

Constructor-DI rule and signature sketch are recorded.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Fill-in sentence is correct | Pass / Fail |
| 2 | Constructor lists both collaborators | Pass / Fail |
| 3 | Unit-test-without-Spring point is stated | Pass / Fail |
