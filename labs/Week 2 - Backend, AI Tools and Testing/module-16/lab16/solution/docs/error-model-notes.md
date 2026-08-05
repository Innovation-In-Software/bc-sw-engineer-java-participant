# Lab 16 — Error model notes (solution)

## Status map

| Situation | HTTP | `error` code |
| --- | ---: | --- |
| Bean Validation | 400 | `VALIDATION_FAILED` |
| Missing customer | 404 | `CUSTOMER_NOT_FOUND` |
| Illegal transition / duplicate | 409 | `BUSINESS_CONFLICT` |
| Unexpected | 500 | `INTERNAL_ERROR` (generic message only) |

## Why 409 (not 422)

Illegal transitions are **business-rule conflicts** against the lifecycle policy, not malformed request syntax. We standardize on **409**; a team that prefers 422 must document it consistently and update handler + demos together.

## Catch order

Always catch `BusinessException` **before** bare `Exception`, or conflicts become 500.

## Hygiene

Never put stack traces, SQL, or PII in `ErrorResponse.message`. Always include `correlationId` and `errors` (possibly `{}`).
