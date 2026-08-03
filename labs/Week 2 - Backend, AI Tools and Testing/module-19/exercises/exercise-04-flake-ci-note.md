# Exercise 4 — Flake and CI Note

**Module 19** · Checkpoint D · Classroom order **1 → 2 → 3 → 4 → 6 → 5** then Lab 19

## Activity card

| | |
| --- | --- |
| **Objective** | Document two flake sources and one CI constraint for Selenium |
| **Skills practiced** | Flake mitigation, CI readiness |
| **Expected outcome** | notes/lab19-flake-ci.md |
| **Estimated time** | 10–12 minutes |
| **File to create** | `examples/module-19-exercises/` → notes/lab19-flake-ci.md |
| **Checkpoint** | D (after slides 232) |

## What you will learn

- Flake: timing, animations, shared mutable data
- Mitigation: testids, explicit waits, isolated fixtures
- CI: headless browser + driver version alignment

**Enterprise context:** CI agents without matching Chrome/driver versions fail green laptops mysteriously.

## Deliverable

**Submit only** the file(s) below (not the graded lab).

| Item | Path (under `examples/module-19-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab19-flake-ci.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 19 — Flake and CI Note

Flake: timing, animations, shared CRM data.
Mitigation: isolated fixtures, testids, explicit waits.
CI: headless + WebDriverManager / aligned driver.

## Scope
Pre-lab only.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-19-exercises/`, create `notes/` if needed, then create `notes/lab19-flake-ci.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 19 — Flake and CI Note

## Flake sources
1. _____
2. _____

## Mitigation
_____

## CI constraint
_____

## Scope
Pre-lab only.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Flake/CI note in `notes/lab19-flake-ci.md`.

## Debug / design challenge

Why is Thread.sleep(2000) a flake magnet compared to waiting for customer-status?

## Predict the Output / Behavior

Name one reason committed chromedriver.exe breaks CI.

## Troubleshooting

### If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab19-flake-ci.md` |
| Only one flake source | List two |
| Skipping CI constraint | Note headless/driver alignment |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab19-flake-ci.md`
- [ ] Two flake sources
- [ ] Mitigation present
- [ ] CI constraint present
