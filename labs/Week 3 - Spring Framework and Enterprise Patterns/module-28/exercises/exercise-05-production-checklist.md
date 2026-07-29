# Exercise 5 — Production IdP Checklist

**Module 28** · Documentation exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/security-notes-outline.md` — draft `docs/security-notes.md` outline items for IdP and key rotation.

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-28-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-05-production-checklist.md` (this file in the course repo) |
| Your notes file | `notes/security-notes-outline.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 28 — Production IdP Checklist

## Step 1 — Outline

In `notes/security-notes-outline.md`: replace lab users with IdP; rotate signing keys; short token TTL; HTTPS only.

## Step 2 — Lab vs prod

In-memory `agent1`/`admin1` are lab-only.

## Step 3 — Transfers

Note Lab 27 money routes must stay behind auth in production narratives.

## Step 4 — Boundary

Do not implement OAuth2 Authorization Server here.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-28-exercises/`, create `notes/` if needed, then create `notes/security-notes-outline.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 28 — Production IdP Checklist

## Step 1 — Outline

In `notes/security-notes-outline.md`: replace lab users with IdP; rotate signing keys; short token TTL; HTTPS only.

## Step 2 — Lab vs prod

In-memory `agent1`/`admin1` are lab-only.

## Step 3 — Transfers

Note Lab 27 money routes must stay behind auth in production narratives.

## Step 4 — Boundary

Do not implement OAuth2 Authorization Server here.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Production checklist outline exists in `notes/security-notes-outline.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/security-notes-outline.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 28 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/security-notes-outline.md`
- [ ] Four checklist items present
- [ ] Lab users marked non-prod
- [ ] OAuth server deferred

