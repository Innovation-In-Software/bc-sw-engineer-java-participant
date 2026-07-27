# Exercise 1 — Map CRM Attack Surfaces

**Module 40** · Analysis exercise · [setup](EXERCISES-INDEX.md)

## Goal

List Northstar CRM surfaces that matter before scanners run.

## Reference

| Surface | OWASP theme | Example |
| --- | --- | --- |
| Customer GET/PUT API | Broken access control | Agent reads CUS-1001 |
| Search query params | Injection | Name/email filters |
| pom.xml deps | Vulnerable components | Transitive CVE |
| application.yml secrets | Security misconfiguration | DB password in Git |
| Actuator endpoints | Security misconfiguration | Unprotected /env |

## Steps

### Step 1 — Inventory touchpoints

In notes, list at least five surfaces for the Spring CRM that serves agents looking up `CUS-1001` (Amina Khan) and `CUS-1002` (Ravi Singh): HTTP APIs, JWT/RBAC, SQL/JPA, file/log sinks, and (later) Kafka. Mark which hold PII vs IDs.

### Step 2 — Check the reference

Compare your list to OWASP themes: injection, broken access control, security misconfiguration, vulnerable components, logging/monitoring failures.

### Step 3 — Rank top three

Pick the three highest-risk surfaces for a release gate before containers. Write one sentence of business impact per item.

### Step 4 — Capture evidence note

Save as `threat-surface-draft.md`. Use only synthetic fixtures and correlation `lab-request-001`.

## Expected result

A ranked surface map exists with OWASP themes and no real customer data.

## If it fails

| Problem | Fix |
| --- | --- |
| Scanning without a surface map | Map trust boundaries first |
| Using real emails in notes | Use @example.test fixtures |

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | At least five surfaces listed | Pass / Fail |
| 2 | Top three ranked with business impact | Pass / Fail |
| 3 | Synthetic fixtures only | Pass / Fail |
