# Exercise 3 — Design Three Probes

## Activity card

| | |
| --- | --- |
| **Time** | 12–15 minutes |
| **Checkpoint** | **B** (after slides 74–77) |
| **Deliverable** | `notes/lab42-probe-design.md` |
| **Fixtures** | CUS-1001 list smoke · Lab 41 image `crm-api:lab41` · no Secret values |

### What you will learn

Design distinct startup, readiness, and liveness probe paths/timings.

### Enterprise context

Wrong liveness kills healthy apps during slow startup.

### Predict

Readiness fail vs liveness fail — traffic impact?

### Debug

Same probe for all three — risk?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| CrashLoop from aggressive liveness | Lengthen startup; separate probes |
| Health 404 | Profile must be `docker` so Lab 41 actuator probes exist |

**Module 42** · Documentation exercise · [setup + file names](EXERCISES-INDEX.md)

## Deliverable

**Submit only** the file(s) below (not the graded lab).

| Item | Path (under `examples/module-42-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab42-probe-design.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 42 — Design Three Probes

## Step 1 — Definitions

Write one sentence each: startup (slow boot), readiness (take traffic), liveness (restart if wedged).

## Step 2 — Check the reference

Do not point all three at the same shallow endpoint without thinking—readiness should reflect DB dependency where required.

## Step 3 — Paths

Propose Actuator paths: startup and readiness on `/actuator/health/readiness`; liveness on `/actuator/health/liveness`.

## Step 4 — Failure story

Describe what agents see if readiness fails while liveness stays up.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-42-exercises/`, create `notes/` if needed, then create `notes/lab42-probe-design.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 42 — Design Three Probes

## Step 1 — Definitions

Write one sentence each: startup (slow boot), readiness (take traffic), liveness (restart if wedged).

## Step 2 — Check the reference

Do not point all three at the same shallow endpoint without thinking—readiness should reflect DB dependency where required.

## Step 3 — Paths

Propose Actuator paths: startup and readiness on `/actuator/health/readiness`; liveness on `/actuator/health/liveness`.

## Step 4 — Failure story

Describe what agents see if readiness fails while liveness stays up.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Probe design notes with agent-visible failure story in `notes/lab42-probe-design.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab42-probe-design.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 42 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab42-probe-design.md`
- [ ] Three probes defined
- [ ] Paths proposed
- [ ] Readiness failure impact stated

