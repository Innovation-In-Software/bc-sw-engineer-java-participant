# Exercise 1 — IoC Versus Manual Wiring

**Module 22** · Analysis exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/ioc-vs-new.md` — explain why Northstar CRM should stop constructing repositories inside services with `new`.

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-22-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-01-ioc-vs-new.md` (this file in the course repo) |
| Your notes file | `notes/ioc-vs-new.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 22 — IoC Versus Manual Wiring

## Reference

| Approach | Who creates collaborators? | Test impact |
| --- | --- | --- |
| Manual `new` | Service constructs `InMemoryCustomerRepository` | Hard to swap fakes |
| IoC / DI | Spring (or test) supplies collaborators | Constructor takes a fake repo |

## Step 1 — Spot the smell

In `notes/ioc-vs-new.md`, rewrite this anti-pattern in one sentence:
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-22-exercises/`, create `notes/` if needed, then create `notes/ioc-vs-new.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 22 — IoC Versus Manual Wiring

## Reference

| Approach | Who creates collaborators? | Test impact |
| --- | --- | --- |
| Manual `new` | Service constructs `InMemoryCustomerRepository` | Hard to swap fakes |
| IoC / DI | Spring (or test) supplies collaborators | Constructor takes a fake repo |

## Step 1 — Spot the smell

In `notes/ioc-vs-new.md`, rewrite this anti-pattern in one sentence:

```java
public class CustomerService {
    private final CustomerRepository repo = new InMemoryCustomerRepository();
}
```

Name one problem for swapping persistence later.

## Step 2 — Check the reference

Compare your note to the reference table. IoC means the **container** owns lifecycle; the service declares needs via constructor parameters.

## Step 3 — CRM fixtures

List three evidence IDs Lab 22 will use: `CUS-1001` (Amina Khan, ACTIVE), `CUS-1002` (Ravi Singh, PROSPECT), correlation `lab-request-001`.

## Step 4 — Pre-lab boundary

Write one line: this exercise prepares for bean wiring only — you will **not** finish the full Lab 22 starter TODOs here.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

A short note explains IoC vs `new` and lists the three CRM fixtures in `notes/ioc-vs-new.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/ioc-vs-new.md` |
| Calling IoC 'magic statics' | IoC is injection of dependencies, not global lookup |
| Skipping fixtures | Keep Amina/Ravi IDs consistent for later labs |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/ioc-vs-new.md`
- [ ] Anti-pattern problem is named (testability or swapability)
- [ ] IoC ownership is stated clearly
- [ ] CUS-1001, CUS-1002, and lab-request-001 appear in notes

