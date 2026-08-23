# Lab 50 — data / API checklist (session block)

Fixtures: `CUS-1001` Amina · `CUS-1002` Ravi · `CUS-9999` not-found · `lab-request-001`

## API contract (align with Lab 49)

| Item | Expected | Your notes |
| ---- | -------- | ---------- |
| Create interaction method/path | `POST /api/v1/interactions` (or _____) | _____ |
| Request body fields | `customerId`, `interactionType` (CALL/EMAIL/NOTE/MEETING), `summary`, `correlationId` — **not** `channel` | _____ |
| Correlation header | `X-Correlation-ID` | _____ |
| Success status | 201 + response id | _____ |
| Not-found / invalid | Problem Details / 4xx | _____ |
| Auth expectation (Lab 51) | Bearer JWT later | _____ |

## UI journey (session sketch)

1. [ ] Search Amina (`CUS-1001`)
2. [ ] Open profile / timeline
3. [ ] Submit interaction with summary + `lab-request-001`
4. [ ] Timeline shows new row
5. [ ] SQL proves row after refresh/restart (full path)

## PostgreSQL / Flyway

- [ ] Migration file version unique and ordered
- [ ] Columns match JPA / DTO names
- [ ] Index for customer_id / correlation_id as needed
- [ ] Seed or fixture strategy for Amina/Ravi documented

## Durability proof query (draft)

```sql
-- TODO: adjust table/column names to your migration
SELECT id, customer_id, summary, correlation_id, created_at
FROM customer_interaction
WHERE customer_id = 'CUS-1001'
  AND correlation_id = 'lab-request-001'
ORDER BY created_at DESC
LIMIT 5;
```

## Accessibility / states (full path reminders)

- [ ] Labels + keyboard focus on form
- [ ] Loading / empty / error / unauthorized states
