# Exercise 2 — SecurityFilterChain Sketch

**Module 28** · Architecture exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/filter-chain.md` — sketch Lab 28 security components without implementing them.

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-28-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-02-filter-chain-sketch.md` (this file in the course repo) |
| Your notes file | `notes/filter-chain.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 28 — SecurityFilterChain Sketch

## Reference

| Component | Role |
| --- | --- |
| SecurityFilterChain | Authorize HTTP requests |
| JwtService | Issue/parse tokens |
| JwtAuthenticationFilter | Read Bearer header |
| CrmUserDetailsService | Load lab users/roles |

## Step 1 — Component list

In `notes/filter-chain.md`, list the four components from the reference.

## Step 2 — Session policy

Write: session creation policy STATELESS for JWT APIs.

## Step 3 — Route rules

`/api/auth/login` permitAll; `/api/customers/**` AGENT/ADMIN; `/api/admin/**` ADMIN only.

## Step 4 — CSRF note

For stateless Bearer APIs, CSRF is typically disabled — confirm in lab guide.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-28-exercises/`, create `notes/` if needed, then create `notes/filter-chain.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 28 — SecurityFilterChain Sketch

## Reference

| Component | Role |
| --- | --- |
| SecurityFilterChain | Authorize HTTP requests |
| JwtService | Issue/parse tokens |
| JwtAuthenticationFilter | Read Bearer header |
| CrmUserDetailsService | Load lab users/roles |

## Step 1 — Component list

In `notes/filter-chain.md`, list the four components from the reference.

## Step 2 — Session policy

Write: session creation policy STATELESS for JWT APIs.

## Step 3 — Route rules

`/api/auth/login` permitAll; `/api/customers/**` AGENT/ADMIN; `/api/admin/**` ADMIN only.

## Step 4 — CSRF note

For stateless Bearer APIs, CSRF is typically disabled — confirm in lab guide.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Filter-chain sketch and route rules ready in `notes/filter-chain.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/filter-chain.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 28 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/filter-chain.md`
- [ ] Four components listed
- [ ] STATELESS noted
- [ ] Route role rules written

