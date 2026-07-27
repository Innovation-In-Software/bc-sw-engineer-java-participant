# Exercise 3 — XSS and CSP Notes

**Module 36** · Documentation exercise · [setup](EXERCISES-INDEX.md)

## Goal

Document XSS-safe rendering rules for customer names/notes.

## Steps

### Step 1 — Danger

If a malicious name contains `<script>...` and you use `dangerouslySetInnerHTML`, XSS can steal tokens.

### Step 2 — Rule

Prefer text children / React escaping; avoid HTML injection APIs.

### Step 3 — CSP

One sentence: CSP can reduce inline script risk (lab may only document).

### Step 4 — Test idea

Paper test string: `Amina <b>Khan</b>` should show angle brackets as text.

## Expected result

XSS rules and a paper test string for safe rendering.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | dangerouslySetInnerHTML warning | Pass / Fail |
| 2 | Prefer-escaping rule | Pass / Fail |
| 3 | Test string recorded | Pass / Fail |
