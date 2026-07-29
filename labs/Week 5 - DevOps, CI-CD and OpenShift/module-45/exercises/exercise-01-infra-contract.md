# Exercise 1 — Draft Infra Contract

**Module 45** · Architecture exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab45-infra-contract.md` — define what AI-assisted Terraform/Ansible may create for CRM.

## Deliverable

| Item | Path (under `examples/module-45-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-01-infra-contract.md` (this file in the course repo) |
| Your notes file | `notes/lab45-infra-contract.md` |

## Steps

### Step 1 — Create the notes file

From `examples/module-45-exercises/`, create `notes/` if needed, then create `notes/lab45-infra-contract.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 45 — Draft Infra Contract

## Reference

| Allowed in IaC | Forbidden in IaC |
| --- | --- |
| Network/runtime sketches | Real cloud keys |
| tfvars.example | terraform.tfstate |
| inventory.example.yml | Customer PII |
| Tags/labels | Unreviewed public DB |

## Step 1 — Contract fields

env names (`crm-dev`/`crm-test`), region, network, runtime, DB, tags, cost limits, forbidden public exposure.

## Step 2 — Check the reference

Syntactically valid Terraform that opens a public DB still fails the lab.

## Step 3 — Tags

Propose tags: `application=crm`, `environment=dev`, `owner=_____`.

## Step 4 — Data rule

State: fixtures `CUS-1001`/`CUS-1002` stay in app labs—not IaC state.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Infra contract with forbidden exposures documented in `notes/lab45-infra-contract.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab45-infra-contract.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 45 |

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | File exists at `notes/lab45-infra-contract.md` | Pass / Fail |
| 2 | Contract fields present | Pass / Fail |
| 3 | Public DB forbidden | Pass / Fail |
| 4 | Fixture rule stated | Pass / Fail |
