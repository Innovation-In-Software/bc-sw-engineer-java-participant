# Exercise 6 — Lab 13 Prep Checklist

**Module 13** · Checkpoint D · Exercises 1–6 Pass then Lab 13

## Activity card

| | |
| --- | --- |
| **Objective** | Complete Lab 13 prep checklist (contracts, samples, docs paths) |
| **Skills practiced** | Lab readiness |
| **Expected outcome** | notes/lab13-prep-checklist.md |
| **Estimated time** | 8–10 minutes |
| **File to create** | `examples/module-13-exercises/` → notes/lab13-prep-checklist.md |
| **Checkpoint** | D (after slides 127–128) |

## What you will learn

- Lab folder is contracts + samples + docs — no Java server
- Well-formedness checks beat pretending to call /ws
- Namespace http://northstar.com/crm/customer must stay consistent

**Enterprise context:** Handoff checklists keep contract packs reviewable by integration teams.

## Deliverable

**Submit only** the file(s) below (not the graded lab).

| Item | Path (under `examples/module-13-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab13-prep-checklist.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 13 prep checklist

## Earlier exercise files present?
| File | Present? (yes/no) |
| ---- | ----------------- |
| notes/lab13-fault-todos.md | (your note here) |
| notes/lab13-operation-matrix.md | (your note here) |
| notes/lab13-java-xsd-map.md | (your note here) |
| notes/lab13-contract-first.md | (your note here) |
| notes/lab13-placeholder-honesty.md | (your note here) |

## Fixtures (verify)
| ID | Name | Status |
| -- | ---- | ------ |
| CUS-1001 | Amina Khan | ACTIVE |
| CUS-1002 | Ravi Singh | PROSPECT |

## Scope statement
Pre-lab only — prepare for lab; do not complete full Lab 13 now.

## Self mark
Overall prep: Pass / Fail
If Fail, revisit exercise(s): (your note here)
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-13-exercises/`, create `notes/` if needed, then create `notes/lab13-prep-checklist.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 13 prep checklist

## Earlier exercise files present?
| File | Present? (yes/no) |
| ---- | ----------------- |
| notes/lab13-fault-todos.md | _____ |
| notes/lab13-operation-matrix.md | _____ |
| notes/lab13-java-xsd-map.md | _____ |
| notes/lab13-contract-first.md | _____ |
| notes/lab13-placeholder-honesty.md | _____ |

## Fixtures (verify)
| ID | Name | Status |
| -- | ---- | ------ |
| CUS-1001 | Amina Khan | ACTIVE |
| CUS-1002 | Ravi Singh | PROSPECT |

## Scope statement
Pre-lab only — prepare for lab; do not complete full Lab 13 now.

## Self mark
Overall prep: Pass / Fail
If Fail, revisit exercise(s): _____
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Readiness with design-only scope before Lab 24 hosting in `notes/lab13-prep-checklist.md`.


## Debug / design challenge

Add schemaLocation=customer.xsd beside WSDL to the checklist.

## Predict the Output / Behavior

Where do operation-matrix.md and soap-design-notes.md live in the lab?

## Troubleshooting

### If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab13-prep-checklist.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 13 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab13-prep-checklist.md`
- [ ] Artifacts confirmed
- [ ] CUS-9999 recalled
- [ ] Design-before-hosting statement present

