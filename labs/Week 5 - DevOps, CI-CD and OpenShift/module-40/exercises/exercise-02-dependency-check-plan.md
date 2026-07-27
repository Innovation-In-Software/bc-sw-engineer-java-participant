# Exercise 2 — Plan Dependency-Check Gate

**Module 40** · Documentation exercise · [setup](EXERCISES-INDEX.md)

## Goal

Draft how Dependency-Check will run under JDK 21 / Maven without claiming a finished lab.

## Steps

### Step 1 — Profile sketch

Write a bullet plan for a Maven profile `-Psecurity-scan`: plugin goal, HTML+JSON reports, and a CVSS fail threshold placeholder.

### Step 2 — Check the reference

Confirm JDK 21 + Maven Wrapper habits: `./mvnw -B -Psecurity-scan dependency-check:check` from the CRM module root.

### Step 3 — Suppression policy draft

Write three required fields for any suppression: CVE id, owner, expiry date. State that silent suppressions fail the gate.

### Step 4 — Folder prep

Create note paths for sanitized HTML/JSON under `notes/screenshots/lab-40/` (do not run the full scan yet unless instructor says smoke only).

## Expected result

A written scan-gate plan and suppression policy exist for Lab 40.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Profile goal and report formats named | Pass / Fail |
| 2 | CVSS threshold placeholder present | Pass / Fail |
| 3 | Suppression fields include owner + expiry | Pass / Fail |
