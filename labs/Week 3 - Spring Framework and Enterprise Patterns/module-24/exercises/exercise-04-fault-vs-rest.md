# Exercise 4 — SOAP Fault Versus REST Error

**Module 24** · Checkpoint C · Exercises 1–6 Pass then Lab 24

## Activity card

| | |
| --- | --- |
| **Objective** | Contrast SOAP fault shapes with REST JSON/HTTP errors |
| **Skills practiced** | Fault vs REST error analysis |
| **Expected outcome** | notes/fault-vs-rest.md |
| **Estimated time** | 10–12 minutes |
| **File to create** | `examples/module-24-exercises/` → notes/fault-vs-rest.md |
| **Checkpoint** | C (after slides 79–82) |

## What you will learn

- Not-found: SOAP fault vs HTTP 404 JSON
- Same BusinessException can drive both mappings
- Do not return REST bodies on the SOAP channel

**Enterprise context:** Partners parse SOAP faults with XML tools — HTTP 404 JSON on /ws confuses them.

## Deliverable

**Submit only** the file(s) below (not the graded lab).

| Item | Path (under `examples/module-24-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/fault-vs-rest.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 24 — SOAP Fault Versus REST Error

| Case | SOAP | REST |
| --- | --- | --- |
| Missing CUS-9999 | SOAP Fault (Client/business) | 404 JSON problem details |
| Validation fail | SOAP Fault | 400 JSON |
| Auth missing | WS-Security fault | 401/403 (later Lab 28) |

Same CustomerService exception; different protocol adapters.

## Scope
Pre-lab only.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-24-exercises/`, create `notes/` if needed, then create `notes/fault-vs-rest.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 24 — SOAP Fault Versus REST Error

| Case | SOAP | REST |
| --- | --- | --- |
| Missing customer | _____ | _____ |
| Validation fail | _____ | _____ |
| Missing UsernameToken | _____ | _____ |

## One rule
_____

## Scope
Pre-lab only.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab24-001` (or `lab-request-001` on REST). Replace every `_____` before Pass.

## Expected result

Fault vs REST notes in `notes/fault-vs-rest.md`.

## Debug / design challenge

Should CustomerEndpoint catch Exception and always return a generic SERVER fault?

## Predict the Output / Behavior

Where should NotFoundException be translated for SOAP?

## Troubleshooting

### If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/fault-vs-rest.md` |
| Same HTTP codes on SOAP | Use SOAP faults |
| No shared-exception note | One service exception, two adapters |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/fault-vs-rest.md`
- [ ] Table filled
- [ ] Shared exception rule
