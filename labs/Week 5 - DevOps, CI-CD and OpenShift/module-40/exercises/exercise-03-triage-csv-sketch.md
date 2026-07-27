# Exercise 3 — Sketch Findings Triage CSV

**Module 40** · Analysis exercise · [setup](EXERCISES-INDEX.md)

## Goal

Practice classifying findings before the lab scanner output arrives.

## Reference

| Classification | Meaning |
| --- | --- |
| true_positive | Confirm and fix or accept with owner |
| false_positive | Document CPE/path mismatch |
| accepted_risk | Time-bounded, owned |
| fixed | Re-scan evidence required |

## Steps

### Step 1 — Columns

Define CSV headers: finding_id, cve, cvss, dependency, path, classification, owner, due_date, notes.

### Step 2 — Check the reference

Classifications: `true_positive`, `false_positive`, `accepted_risk`, `fixed`. Accepted risk needs owner + expiry.

### Step 3 — Sample rows

Invent two synthetic rows (not real CVEs from production). One true_positive on a transitive JAR; one false_positive with rationale.

### Step 4 — CRM link

Note how a true_positive on the API layer could affect agents opening `CUS-1001` profiles—without claiming you are remediating today.

## Expected result

A triage CSV sketch with two synthetic rows and clear classifications.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Headers match the triage model | Pass / Fail |
| 2 | Two sample rows classified | Pass / Fail |
| 3 | Accepted-risk rules stated | Pass / Fail |
