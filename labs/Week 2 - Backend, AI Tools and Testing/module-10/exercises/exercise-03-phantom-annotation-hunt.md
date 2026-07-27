# Exercise 3 — Phantom Annotation Hunt

**Module 10** · Analysis exercise · [setup](EXERCISES-INDEX.md)

## Goal

Flag Copilot-style annotations that do not belong in a plain Java prep sketch.

## Reference

| Seen in suggestion | Likely real? | Prep action |
| --- | --- | --- |
| @Entity / @Table | JPA only | Defer — not Lab 10 scope |
| @Service / @Autowired | Spring | Defer — hosting labs later |
| @NotNull (Jakarta) | Validation lib | Name it; don't invent imports |
| public record Customer(...) | Java 16+ | OK on JDK 21 |

## Steps

### Step 1 — Copy table

Recreate the reference table in notes; add one row for an annotation you invent as a trap.

### Step 2 — Reject rule

Write: *Reject any import I cannot name from JDK 21 or an agreed Maven dependency.*

### Step 3 — Fixture check

Mark whether a suggestion hard-codes `CUS-1002` Ravi as ACTIVE (wrong — PROSPECT) as a review fail.

### Step 4 — Out of scope

Note: SOAP and Spring Boot hosting are not in this pre-lab (before Labs 13/24).

## Expected result

A phantom-annotation checklist tied to JDK 21 / Maven honesty.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Table copied with one trap row | Pass / Fail |
| 2 | Reject-unknown-import rule written | Pass / Fail |
| 3 | Ravi status PROSPECT called out | Pass / Fail |
