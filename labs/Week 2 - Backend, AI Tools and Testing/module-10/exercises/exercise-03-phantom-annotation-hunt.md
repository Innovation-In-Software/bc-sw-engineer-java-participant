# Exercise 3 — Phantom Annotation Hunt

**Module 10** · Analysis exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/phantom-annotation-notes.md` and flag Copilot-style annotations that do not belong in a plain Java prep sketch.

## Deliverable

| Item | Path (under `examples/module-10-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-03-phantom-annotation-hunt.md` (this file in the course repo) |
| Your notes file | `notes/phantom-annotation-notes.md` |

## Reference

| Seen in suggestion | Likely real? | Prep action |
| --- | --- | --- |
| @Entity / @Table | JPA only | Defer — not Lab 10 scope |
| @Service / @Autowired | Spring | Defer — hosting labs later |
| @NotNull (Jakarta) | Validation lib | Name it; don't invent imports |
| public record Customer(...) | Java 16+ | OK on JDK 21 |

## Steps

### Step 1 — Create the notes file

Create `notes/phantom-annotation-notes.md` and recreate the reference table; add one row for an annotation you invent as a trap.

### Step 2 — Reject rule

Write: *Reject any import I cannot name from JDK 21 or an agreed Maven dependency.*

### Step 3 — Fixture check

Mark whether a suggestion hard-codes `CUS-1002` Ravi as ACTIVE (wrong — PROSPECT) as a review fail.

### Step 4 — Out of scope

Note: SOAP and Spring Boot hosting are not in this pre-lab (before Labs 13/24).

## Expected result

A phantom-annotation checklist in `notes/phantom-annotation-notes.md` tied to JDK 21 / Maven honesty.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | File exists at `notes/phantom-annotation-notes.md` | Pass / Fail |
| 2 | Table copied with one trap row | Pass / Fail |
| 3 | Reject-unknown-import rule written | Pass / Fail |
| 4 | Ravi status PROSPECT called out | Pass / Fail |
