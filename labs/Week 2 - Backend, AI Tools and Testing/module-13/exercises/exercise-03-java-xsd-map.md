# Exercise 3 — Java to XSD Map

**Module 13** · Checkpoint B · Exercises 1–6 Pass then Lab 13

## Activity card

| | |
| --- | --- |
| **Objective** | Map Java CRM fields to XSD types for Amina/Ravi payloads |
| **Skills practiced** | XSD type mapping |
| **Expected outcome** | notes/lab13-java-xsd-map.md |
| **Estimated time** | 10–12 minutes |
| **File to create** | `examples/module-13-exercises/` → notes/lab13-java-xsd-map.md |
| **Checkpoint** | B (after slides 121–123) |

## What you will learn

- XSD is the shared type vocabulary for SOAP payloads
- Status enums need explicit XSD enumerations or restricted strings
- Namespace consistency matters as much as field names

**Enterprise context:** Schema drift between Java and XSD breaks bank/partner integrations.

## Deliverable

**Submit only** the file(s) below (not the graded lab).

| Item | Path (under `examples/module-13-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab13-java-xsd-map.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 13 — Java to XSD Map

## Reference

| Java idea | XSD idea | Example |
| --- | --- | --- |
| String customerId | xsd:string | CUS-1001 |
| String fullName | xsd:string | Amina Khan |
| enum/status | xsd:string or enum | ACTIVE / PROSPECT |

## Step 2 — Id pattern

Propose a documentation pattern `CUS-####` (not enforced in code yet).

## Step 3 — Honesty

Note: mapping in this notes file. ≠ generated JAXB yet.

## Step 4 — Boundary

Mark: hosting/codegen with Spring-WS is Lab 24, not this prep.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-13-exercises/`, create `notes/` if needed, then create `notes/lab13-java-xsd-map.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 13 — Java to XSD Map

## Reference

| Java idea | XSD idea | Example |
| --- | --- | --- |
| String customerId | xsd:string | CUS-1001 |
| String fullName | xsd:string | Amina Khan |
| enum/status | xsd:string or enum | ACTIVE / PROSPECT |

## Step 2 — Id pattern

Propose a documentation pattern `CUS-####` (not enforced in code yet).

## Step 3 — Honesty

Note: mapping in this notes file. ≠ generated JAXB yet.

## Step 4 — Boundary

Mark: hosting/codegen with Spring-WS is Lab 24, not this prep.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

A Java→XSD map using Amina and Ravi examples in `notes/lab13-java-xsd-map.md`.


## Debug / design challenge

Map CustomerStatus ACTIVE/PROSPECT to an XSD restriction list.

## Predict the Output / Behavior

Which XSD type fits customerId string codes like CUS-1001?

## Troubleshooting

### If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab13-java-xsd-map.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 13 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab13-java-xsd-map.md`
- [ ] Table includes both customers
- [ ] Id pattern proposed
- [ ] Lab 24 hosting deferred

