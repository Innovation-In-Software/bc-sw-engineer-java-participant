# Exercise 1 — Weak vs Strong Prompts

**Module 10** · Analysis exercise · [setup](EXERCISES-INDEX.md)

## Goal

Contrast a vague Copilot prompt with a strong Northstar-scoped one.

## Steps

### Step 1 — Weak prompt

Write the weak prompt: *Write a customer class.* Note why it invites wrong package, wrong JDK APIs, or invented annotations.

### Step 2 — Strong prompt

Rewrite: plain Java 21 record/class for Northstar CRM customer `CUS-1001` Amina Khan status ACTIVE; fields id, fullName, status; no Spring, no JPA; correlation note `lab-request-001` in comments only.

### Step 3 — Diff the asks

List three constraints the strong prompt adds (JDK, domain fixtures, no-framework).

### Step 4 — Capture

Save both prompts under `notes/lab10-prelab-prompts.md`. Pre-lab only — do not finish Lab 10.

## Expected result

Paired weak/strong prompts with three explicit constraints documented.

## If it fails

| Problem | Fix |
| --- | --- |
| Problem | Fix |
| Accepting first suggestion blindly | Require fixtures + JDK 21 + no phantom deps in the prompt |
| Putting secrets in chat | Use fake CRM ids only (CUS-1001 / CUS-1002) |

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Weak and strong prompts written | Pass / Fail |
| 2 | Three constraints listed | Pass / Fail |
| 3 | Notes file saved under notes/ | Pass / Fail |
