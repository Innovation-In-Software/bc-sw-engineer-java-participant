# Exercise 3 — Page Object Sketch

**Module 19** · Checkpoint C · Classroom order **1 → 2 → 3 → 4 → 6 → 5** then Lab 19

## Activity card

| | |
| --- | --- |
| **Objective** | Sketch a CustomerForm/Status Page Object with actions and queries |
| **Skills practiced** | Page Object pattern |
| **Expected outcome** | notes/lab19-page-object.md |
| **Estimated time** | 10–12 minutes |
| **File to create** | `examples/module-19-exercises/` → notes/lab19-page-object.md |
| **Checkpoint** | C (after slides 230–231) |

## What you will learn

- Class with WebDriver field
- Actions: open, fill, submit/activate; queries: readStatus
- Prefer asserts in tests; page returns data

**Enterprise context:** Duplicated driver.findElement calls across tests make locator fixes a copy-paste tax.

## Deliverable

**Submit only** the file(s) below (not the graded lab).

| Item | Path (under `examples/module-19-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab19-page-object.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 19 — Page Object Sketch

Class CustomerFormPage / CustomerStatusPage with driver.
Methods: open(), fillName(...), submit(), readStatus().
Assertions in tests; page returns status text.
Prepare for Lab 19; do not complete full suite now.

## Scope
Pre-lab only.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-19-exercises/`, create `notes/` if needed, then create `notes/lab19-page-object.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 19 — Page Object Sketch

## Class name
_____

## Actions
_____

## Queries
_____

## Asserts live in
_____

## Scope
Pre-lab only.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Page Object sketch in `notes/lab19-page-object.md`.

## Debug / design challenge

Should clickActivate() contain assertEquals(ACTIVE)? Why/why not?

## Predict the Output / Behavior

Where do data-testid strings live — page object or raw test?

## Troubleshooting

### If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab19-page-object.md` |
| Putting all asserts in the page | Move asserts to tests |
| No action methods | List open/fill/submit/read |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab19-page-object.md`
- [ ] Class named
- [ ] Actions listed
- [ ] Assert placement noted
