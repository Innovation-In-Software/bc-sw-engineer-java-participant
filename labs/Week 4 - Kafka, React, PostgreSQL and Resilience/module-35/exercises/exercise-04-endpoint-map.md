# Exercise 5 — Endpoint Map

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **A** (after slides 120–125) |
| **Deliverable** | `notes/lab35-api.md` |
| **Fixtures** | CUS-1001 / CUS-1002 · `X-Correlation-Id: lab-request-001` |

### What you will learn

Map UI actions to Spring REST paths for Amina/Ravi CRM.

### Enterprise context

Freeze /api/customers contract before coding the client.

### Predict

Does the browser call Kafka topics directly?

### Debug

Base URL already has /api and path also /api — symptom?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| SOAP from browser | JSON only; SOAP stays server-side if present |
| Unknown methods | List GET list/get, POST create, PUT update |

**Module 35** · Analysis exercise · [setup + file names](EXERCISES-INDEX.md)

## Deliverable

**Submit only** the file(s) below (not the graded lab).

| Item | Path (under `examples/module-35-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab35-api.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 35 — Endpoint Map

## Reference

| UI action | HTTP |
| --- | --- |
| List customers | GET /api/customers |
| Open Amina | GET /api/customers/CUS-1001 |
| Create customer | POST /api/customers |
| Update status | PATCH /api/customers/{id} |

## Step 2 — Ravi row

Add GET for `CUS-1002`.

## Step 3 — Status codes

List expected codes: 200, 201, 400, 404, 500.

## Step 4 — JSON shape

Sketch list item JSON: customerId, name, status.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-35-exercises/`, create `notes/` if needed, then create `notes/lab35-api.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 35 — Endpoint Map

## Reference

| UI action | HTTP |
| --- | --- |
| List customers | GET /api/customers |
| Open Amina | GET /api/customers/CUS-1001 |
| Create customer | POST /api/customers |
| Update status | PATCH /api/customers/{id} |

## Step 2 — Ravi row

Add GET for `CUS-1002`.

## Step 3 — Status codes

List expected codes: 200, 201, 400, 404, 500.

## Step 4 — JSON shape

Sketch list item JSON: customerId, name, status.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

UI↔HTTP map with status codes and a JSON sketch in `notes/lab35-api.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab35-api.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 35 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab35-api.md`
- [ ] Table + Ravi row
- [ ] Five status codes
- [ ] JSON fields listed

