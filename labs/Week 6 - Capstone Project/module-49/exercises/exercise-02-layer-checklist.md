# Exercise 2 — Controller-Service-Repository Checklist

**Module 49** · Documentation exercise · [setup](EXERCISES-INDEX.md)

## Goal

List responsibilities per layer for the chosen slice.

## Reference

| Layer | Owns | Avoids |
| --- | --- | --- |
| Controller | HTTP mapping, status codes | Business rules sprawl |
| Service | Transactions, domain rules | Raw JDBC in controller |
| Repository | Persistence | HTTP concerns |

## Steps

### Step 1 — Table

Controller: HTTP/DTO; Service: rules/transactions; Repository: persistence.

### Step 2 — Check the reference

Validation belongs on inputs; business rules not only in controllers.

### Step 3 — Transaction note

Mark which service method needs `@Transactional` (placeholder).

### Step 4 — JDK/Maven

Note verify habit: `./mvnw -B test` on the backend module.

## Expected result

Layer checklist with transaction placeholder.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Three layers described | Pass / Fail |
| 2 | Validation placement stated | Pass / Fail |
| 3 | mvnw test noted | Pass / Fail |
