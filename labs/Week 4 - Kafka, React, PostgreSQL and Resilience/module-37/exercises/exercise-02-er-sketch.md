# Exercise 2 — ER Sketch

**Module 37** · Architecture exercise · [setup](EXERCISES-INDEX.md)

## Goal

Draw customer—account cardinality on paper/markdown.

## Reference

| Relationship | Cardinality |
| --- | --- |
| customer → account | 1:N |
| account.customer_id | FK → customer.customer_id |
| customer.customer_id | PK / unique business key |

## Steps

### Step 1 — Copy rules

Copy the reference table.

### Step 2 — Diagram

Mermaid or ASCII: Customer ||--o{ Account.

### Step 3 — Cascade policy

Decide ON DELETE behavior (RESTRICT vs CASCADE) and justify.

### Step 4 — Boundary

Do not create Kafka outbox tables in this module unless guide requires.

## Expected result

ER sketch with FK and delete policy decision.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | 1:N stated | Pass / Fail |
| 2 | Diagram present | Pass / Fail |
| 3 | Delete policy justified | Pass / Fail |
