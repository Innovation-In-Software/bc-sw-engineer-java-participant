# Exercise 5 — Placeholder Endpoint Honesty

**Module 13** · Checkpoint D · Exercises 1–6 Pass then Lab 13

## Activity card

| | |
| --- | --- |
| **Objective** | Document that http://localhost:8080/ws is a placeholder (not live) |
| **Skills practiced** | Scope honesty, security awareness |
| **Expected outcome** | notes/lab13-placeholder-honesty.md |
| **Estimated time** | 8–10 minutes |
| **File to create** | `examples/module-13-exercises/` → notes/lab13-placeholder-honesty.md |
| **Checkpoint** | D (after slides 127–128) |

## What you will learn

- Placeholder addresses are design-time, not proof of hosting
- Connection refused to :8080 is expected in Lab 13
- Security considerations apply even to sample contracts

**Enterprise context:** Falsely claiming a live endpoint fails audits and partner onboarding.

## Deliverable

**Submit only** the file(s) below (not the graded lab).

| Item | Path (under `examples/module-13-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab13-placeholder-honesty.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 13 — Placeholder Endpoint Honesty

## Step 1 — Define placeholder

One sentence: contract + sample messages without a production-ready host.

## Step 2 — What you will not do

List: no Spring-WS `@Endpoint`, no Boot app, no deploy to Tomcat in prep.

## Step 3 — What Lab 24 adds

Note Lab 24 introduces Spring hosting for SOAP.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-13-exercises/`, create `notes/` if needed, then create `notes/lab13-placeholder-honesty.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 13 — Placeholder Endpoint Honesty

## Step 1 — Define placeholder

One sentence: contract + sample messages without a production-ready host.

## Step 2 — What you will not do

List: no Spring-WS `@Endpoint`, no Boot app, no deploy to Tomcat in prep.

## Step 3 — What Lab 24 adds

Note Lab 24 introduces Spring hosting for SOAP.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

An honesty note separating design from hosting in `notes/lab13-placeholder-honesty.md`.


## Debug / design challenge

Write one sentence: Lab 24 hosts /ws; Lab 13 does not.

## Predict the Output / Behavior

Is starting Tomcat required to Pass Lab 13?

## Troubleshooting

### If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab13-placeholder-honesty.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 13 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab13-placeholder-honesty.md`
- [ ] Placeholder defined
- [ ] Three non-goals listed
- [ ] Lab 24 referenced

