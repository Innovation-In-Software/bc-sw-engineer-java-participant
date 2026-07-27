# Exercise 2 — Topic and Key Map

**Module 30** · Architecture exercise · [setup](EXERCISES-INDEX.md)

## Goal

Freeze Northstar topic names, partitions, and keying before any broker runs.

## Reference

| Concept | Northstar choice |
| --- | --- |
| Main topic | crm.customer-events.v1 |
| DLQ topic | crm.customer-events.v1.dlq |
| Partitions (lab) | 3 |
| Record key | customerId (e.g. CUS-1001) |

## Steps

### Step 1 — Copy the table

Recreate the reference table in your notes; leave one blank row for a future `Account*` event topic name you invent.

### Step 2 — Keying reason

Write why keying by `CUS-1001` / `CUS-1002` keeps a customer's events ordered within a partition.

### Step 3 — Versioning

Explain what the `.v1` suffix buys the team when the payload schema changes later.

### Step 4 — DLQ trigger

List two failure cases that should land a record in the DLQ (conceptual only).

## Expected result

A filled topic/key map plus DLQ failure examples ready for Lab 30.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Main + DLQ topic names match the reference | Pass / Fail |
| 2 | Key = customerId justified | Pass / Fail |
| 3 | Two DLQ cases listed | Pass / Fail |
