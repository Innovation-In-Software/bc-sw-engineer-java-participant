# Exercise 1 — Map CRM Attack Surfaces

**Module 40** · Analysis exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab40-owasp-surface-map.md` — list Northstar CRM surfaces that matter before scanners run.

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-40-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-01-owasp-surface-map.md` (this file in the course repo) |
| Your notes file | `notes/lab40-owasp-surface-map.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 40 — Map CRM Attack Surfaces

## Reference

| Surface | OWASP theme | Example |
| --- | --- | --- |
| Customer GET/PUT API | Broken access control | Agent reads CUS-1001 |
| Search query params | Injection | Name/email filters |
| pom.xml deps | Vulnerable components | Transitive CVE |
| application.yml secrets | Security misconfiguration | DB password in Git |
| Actuator endpoints | Security misconfiguration | Unprotected /env |

## Step 1 — Inventory touchpoints

In notes, list at least five surfaces for the Spring CRM that serves agents looking up `CUS-1001` (Amina Khan) and `CUS-1002` (Ravi Singh): HTTP APIs, JWT/RBAC, SQL/JPA, file/log sinks, and (later) Kafka. Mark which hold PII vs IDs.

## Step 2 — Check the reference

Compare your list to OWASP themes: injection, broken access control, security misconfiguration, vulnerable components, logging/monitoring failures.

## Step 3 — Rank top three

Pick the three highest-risk surfaces for a release gate before containers. Write one sentence of business impact per item.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-40-exercises/`, create `notes/` if needed, then create `notes/lab40-owasp-surface-map.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 40 — Map CRM Attack Surfaces

## Reference

| Surface | OWASP theme | Example |
| --- | --- | --- |
| Customer GET/PUT API | Broken access control | Agent reads CUS-1001 |
| Search query params | Injection | Name/email filters |
| pom.xml deps | Vulnerable components | Transitive CVE |
| application.yml secrets | Security misconfiguration | DB password in Git |
| Actuator endpoints | Security misconfiguration | Unprotected /env |

## Step 1 — Inventory touchpoints

In notes, list at least five surfaces for the Spring CRM that serves agents looking up `CUS-1001` (Amina Khan) and `CUS-1002` (Ravi Singh): HTTP APIs, JWT/RBAC, SQL/JPA, file/log sinks, and (later) Kafka. Mark which hold PII vs IDs.

## Step 2 — Check the reference

Compare your list to OWASP themes: injection, broken access control, security misconfiguration, vulnerable components, logging/monitoring failures.

## Step 3 — Rank top three

Pick the three highest-risk surfaces for a release gate before containers. Write one sentence of business impact per item.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

A ranked surface map exists with OWASP themes and no real customer data in `notes/lab40-owasp-surface-map.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab40-owasp-surface-map.md` |
| Scanning without a surface map | Map trust boundaries first |
| Using real emails in notes | Use @example.test fixtures |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab40-owasp-surface-map.md`
- [ ] At least five surfaces listed
- [ ] Top three ranked with business impact
- [ ] Synthetic fixtures only

