# Exercise 1 — Draft Infra Contract

**Module 45** · Architecture exercise · [setup](EXERCISES-INDEX.md)

## Goal

Define what AI-assisted Terraform/Ansible may create for CRM.

## Reference

| Allowed in IaC | Forbidden in IaC |
| --- | --- |
| Network/runtime sketches | Real cloud keys |
| tfvars.example | terraform.tfstate |
| inventory.example.yml | Customer PII |
| Tags/labels | Unreviewed public DB |

## Steps

### Step 1 — Contract fields

env names (`crm-dev`/`crm-test`), region, network, runtime, DB, tags, cost limits, forbidden public exposure.

### Step 2 — Check the reference

Syntactically valid Terraform that opens a public DB still fails the lab.

### Step 3 — Tags

Propose tags: `application=crm`, `environment=dev`, `owner=_____`.

### Step 4 — Data rule

State: fixtures `CUS-1001`/`CUS-1002` stay in app labs—not IaC state.

## Expected result

Infra contract with forbidden exposures documented.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Contract fields present | Pass / Fail |
| 2 | Public DB forbidden | Pass / Fail |
| 3 | Fixture rule stated | Pass / Fail |
