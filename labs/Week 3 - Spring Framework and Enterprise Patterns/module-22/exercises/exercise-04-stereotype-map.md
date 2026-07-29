# Exercise 5 — Stereotype Annotation Map

**Module 22** · Architecture exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/stereotype-map.md` — map each Northstar CRM type to `@Service`, `@Repository`, `@RestController`, or plain domain.

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-22-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-04-stereotype-map.md` (this file in the course repo) |
| Your notes file | `notes/stereotype-map.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 22 — Stereotype Annotation Map

## Reference

| Type | Stereotype / note |
| --- | --- |
| CustomerService | `@Service` |
| InMemoryCustomerRepository | `@Repository` (implements interface) |
| CustomerController | `@RestController` |
| Customer (model) | Plain Java — no Spring unless required |
| NotificationService | `@Service` |

## Step 1 — Fill the blank table

Create `notes/stereotype-map.md` with columns Type | Annotation | Why.
Fill for: `CustomerService`, `CustomerRepository` interface, `InMemoryCustomerRepository`, `CustomerController`, `Customer`, `NotificationService`.

## Step 2 — Check the reference

Compare against the reference table. Domain `Customer` stays free of Spring.

## Step 3 — Singleton caution

Write two sentences: default Spring beans are singletons; mutable instance fields on `CustomerService` are dangerous for concurrent requests.

## Step 4 — Lab prep

Note that Lab 22 requires `docs/dependency-graph.md` naming these beans — you only sketch names here.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-22-exercises/`, create `notes/` if needed, then create `notes/stereotype-map.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 22 — Stereotype Annotation Map

## Reference

| Type | Stereotype / note |
| --- | --- |
| CustomerService | `@Service` |
| InMemoryCustomerRepository | `@Repository` (implements interface) |
| CustomerController | `@RestController` |
| Customer (model) | Plain Java — no Spring unless required |
| NotificationService | `@Service` |

## Step 1 — Fill the blank table

Create `notes/stereotype-map.md` with columns Type | Annotation | Why.
Fill for: `CustomerService`, `CustomerRepository` interface, `InMemoryCustomerRepository`, `CustomerController`, `Customer`, `NotificationService`.

## Step 2 — Check the reference

Compare against the reference table. Domain `Customer` stays free of Spring.

## Step 3 — Singleton caution

Write two sentences: default Spring beans are singletons; mutable instance fields on `CustomerService` are dangerous for concurrent requests.

## Step 4 — Lab prep

Note that Lab 22 requires `docs/dependency-graph.md` naming these beans — you only sketch names here.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Stereotype map matches Spring roles; domain model stays plain in `notes/stereotype-map.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/stereotype-map.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 22 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/stereotype-map.md`
- [ ] Service/repository/controller annotations are correct
- [ ] `Customer` is marked as plain domain
- [ ] Singleton caution is written

