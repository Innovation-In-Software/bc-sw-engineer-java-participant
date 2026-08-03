# Exercise 1 — Contract-First Recall

**Module 24** · Checkpoint A · Exercises 1–6 Pass then Lab 24

## Activity card

| | |
| --- | --- |
| **Objective** | Recall why XSD is the source of truth before Java endpoints |
| **Skills practiced** | Contract-first analysis |
| **Expected outcome** | notes/contract-first.md |
| **Estimated time** | 10–12 minutes |
| **File to create** | `examples/module-24-exercises/` → notes/contract-first.md |
| **Checkpoint** | A (after slides 66–74) |

## What you will learn

- XSD defines elements/types first
- WSDL exposes operations to partners
- Java/@Endpoint come after the contract

**Enterprise context:** Partner billing tools bind to XML names — changing only Java breaks them silently.

## Deliverable

**Submit only** the file(s) below (not the graded lab).

| Item | Path (under `examples/module-24-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/contract-first.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 24 — Contract-First Recall

Order: XSD → generate JAXB → implement @Endpoint → serve WSDL.
Source of truth: customer.xsd (not hand-written DTO fields alone).
Why: partners depend on stable element names (GetCustomerRequest, etc.).

## Scope
Pre-lab only.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-24-exercises/`, create `notes/` if needed, then create `notes/contract-first.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 24 — Contract-First Recall

## Order (fill)
1. _____
2. _____
3. _____
4. _____

## Source of truth
_____

## Why partners care
_____

## Scope
Pre-lab only.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab24-001` (or `lab-request-001` on REST). Replace every `_____` before Pass.

## Expected result

Contract-first notes in `notes/contract-first.md`.

## Debug / design challenge

If someone adds a Java field without updating the XSD, what breaks for SOAP clients?

## Predict the Output / Behavior

Is code-first WSDL export the Lab 24 primary approach?

## Troubleshooting

### If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/contract-first.md` |
| Saying Java is source of truth | XSD first |
| Skipping partner why | Stable XML names |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/contract-first.md`
- [ ] Order listed
- [ ] XSD as source of truth
- [ ] Partner reason
