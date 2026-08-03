# Exercise 2 — data-testid Locators

**Module 19** · Checkpoint B · Classroom order **1 → 2 → 3 → 4 → 6 → 5** then Lab 19

## Activity card

| | |
| --- | --- |
| **Objective** | Propose data-testid values for CRM UI elements |
| **Skills practiced** | Stable locator contracts |
| **Expected outcome** | notes/lab19-locators.md |
| **Estimated time** | 10–12 minutes |
| **File to create** | `examples/module-19-exercises/` → notes/lab19-locators.md |
| **Checkpoint** | B (after slides 226–229) |

## What you will learn

- Name testids for status, activate, customer id/name
- Mark nth-child CSS as brittle
- Testids are an HTML contract for automation

**Enterprise context:** Marketing CSS class renames break XPath suites weekly — testids survive redesigns.

## Deliverable

**Submit only** the file(s) below (not the graded lab).

| Item | Path (under `examples/module-19-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab19-locators.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 19 — data-testid Locators

| Element | data-testid |
| --- | --- |
| Status badge | customer-status |
| Activate / submit | activate-customer / submit-customer |
| Customer id / name | customer-id / customer-name |

Brittle: div.col-md-3 > span:nth-child(2)
Contract: keep testids stable across UI polish.

## Scope
Pre-lab only.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-19-exercises/`, create `notes/` if needed, then create `notes/lab19-locators.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 19 — data-testid Locators

| Element | data-testid |
| --- | --- |
| Status | _____ |
| Activate/submit | _____ |
| Customer id/name | _____ |

## Brittle alternative
_____

## Contract note
_____

## Scope
Pre-lab only.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Locator table + brittle note in `notes/lab19-locators.md`.

## Debug / design challenge

Rewrite absolute XPath /html/body/div[3]/button into a testid strategy.

## Predict the Output / Behavior

Who owns adding data-testid to customers.html — test author or UI change?

## Troubleshooting

### If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab19-locators.md` |
| Only CSS selectors listed | Prefer data-testid column |
| No brittle example | Call out nth-child/XPath |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab19-locators.md`
- [ ] Three testids
- [ ] Brittle example
- [ ] Contract note
