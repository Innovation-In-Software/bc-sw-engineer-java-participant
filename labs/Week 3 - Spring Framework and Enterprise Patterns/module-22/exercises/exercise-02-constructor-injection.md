# Exercise 4 — Constructor Injection Preference

**Module 22** · Documentation exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/constructor-di.md` — document why constructor injection with `final` fields is the Northstar standard.

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-22-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-02-constructor-injection.md` (this file in the course repo) |
| Your notes file | `notes/constructor-di.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 22 — Constructor Injection Preference

## Reference

| Style | Verdict |
| --- | --- |
| Constructor + `final` | Preferred — required deps, testable |
| Setter injection | Optional deps only |
| Field `@Autowired` | Avoid as primary pattern |

## Step 1 — Write the rule

In `notes/constructor-di.md`, complete:

> Northstar prefers (your note here) injection because dependencies are (your note here) and fields can be (your note here).

## Step 2 — Check the reference

Answer key: constructor / required (explicit) / final (immutable after construction).

## Step 3 — Sketch signature

Write the constructor signature only (no method bodies):
`CustomerService(CustomerRepository repo, NotificationService notifier)`.

## Step 4 — Unit-test implication

One sentence: a pure unit test can `new CustomerService(fakeRepo, fakeNotifier)` without starting Spring.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-22-exercises/`, create `notes/` if needed, then create `notes/constructor-di.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 22 — Constructor Injection Preference

## Reference

| Style | Verdict |
| --- | --- |
| Constructor + `final` | Preferred — required deps, testable |
| Setter injection | Optional deps only |
| Field `@Autowired` | Avoid as primary pattern |

## Step 1 — Write the rule

In `notes/constructor-di.md`, complete:

> Northstar prefers _____ injection because dependencies are _____ and fields can be _____.

## Step 2 — Check the reference

Answer key: constructor / required (explicit) / final (immutable after construction).

## Step 3 — Sketch signature

Write the constructor signature only (no method bodies):
`CustomerService(CustomerRepository repo, NotificationService notifier)`.

## Step 4 — Unit-test implication

One sentence: a pure unit test can `new CustomerService(fakeRepo, fakeNotifier)` without starting Spring.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Constructor-DI rule and signature sketch are recorded in `notes/constructor-di.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/constructor-di.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 22 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/constructor-di.md`
- [ ] Fill-in sentence is correct
- [ ] Constructor lists both collaborators
- [ ] Unit-test-without-Spring point is stated

