# Exercise 2 — Notifier Extract Plan

**Module 11** · Architecture exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab11-notifier-extract-plan.md` that plans extracting a notifier collaborator so tests can isolate side effects (matches Lab 11’s `CustomerNotifier`).

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-11-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-02-notifier-extract.md` (this file in the course repo) |
| Your notes file | `notes/lab11-notifier-extract-plan.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

**Goal reminder:** Create `notes/lab11-notifier-extract-plan.md` that plans extracting a notifier collaborator so tests can isolate side effects (matches Lab 11’s `CustomerNotifier`).

**Done looks like:** `notes/lab11-notifier-extract-plan.md` with smell, interface sketch, Copilot sentence, and out-of-scope note.

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-11-exercises/`, create `notes/lab11-notifier-extract-plan.md`.

### Step 2 — Write these four sections

Use this exact structure (copy headings, fill the body):

**1. Smell (1–2 sentences)**  
Inline `System.out` / email send inside `CustomerService.updateStatus` (or activate) makes unit tests slow, flaky, and hard to assert. Side effects belong on a collaborator.

**2. Interface sketch (Lab 11 shape — sketch only, do not implement yet)**

```java
public interface CustomerNotifier {
    void notifyStatusChange(String customerId,
                            CustomerStatus from,
                            CustomerStatus to);
}
```

**3. Why this helps Copilot (one sentence)**  
Stronger prompts name `CustomerNotifier` so AI does not bury I/O inside `CustomerService`.

**4. Out of scope for this pre-lab**  
Do **not** implement Spring events, Kafka, or email providers yet — sketch only.  
Do **not** finish Lab 11’s Mockito test yet.

### Step 3 — Self-check

Method name must be `notifyStatusChange` (same as Lab 11), **not** a made-up `notifyActivated` only.

## Expected result

`notes/lab11-notifier-extract-plan.md` with smell, interface sketch, Copilot sentence, and out-of-scope note.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab11-notifier-extract-plan.md` |
| Inventing Spring `@EventListener` | Plain Java interface only |
| Implementing the class now | Sketch in notes only; Lab 11 implements |

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | File exists at `notes/lab11-notifier-extract-plan.md` | Pass / Fail |
| 2 | Smell named + `notifyStatusChange` sketched | Pass / Fail |
| 3 | Out-of-scope (no Spring/Kafka; pre-lab only) noted | Pass / Fail |
