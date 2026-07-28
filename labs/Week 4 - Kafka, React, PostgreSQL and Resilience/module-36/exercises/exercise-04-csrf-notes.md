# Exercise 5 — CSRF Notes

**Module 36** · Documentation exercise · [setup](EXERCISES-INDEX.md)

## Goal

Explain when CSRF matters for the CRM SPA session model.

## Steps

### Step 1 — Cookie sessions

If auth cookie is sent automatically, CSRF is in scope.

### Step 2 — Bearer header

If token only in Authorization header from JS, classic CSRF is reduced.

### Step 3 — Lab stance

Write which model your Lab 36 starter follows (from README skim or instructor).

### Step 4 — Checklist

Add item: SameSite cookie attributes if cookies used.

## Expected result

CSRF applicability note matched to token model.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Cookie vs bearer contrast | Pass / Fail |
| 2 | Lab stance stated | Pass / Fail |
| 3 | SameSite checklist item | Pass / Fail |
