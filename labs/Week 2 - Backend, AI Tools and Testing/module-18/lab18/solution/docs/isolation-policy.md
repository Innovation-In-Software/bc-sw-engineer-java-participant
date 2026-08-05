# Lab 18 — Isolation policy (solution)

## What is mocked

- **Mock:** `CustomerRepository` (and optionally notifiers) in Lab 18 unit suites.
- **Real:** `CustomerValidator` + `DefaultCustomerService` (never mock the SUT).

Wire validator and service with the **same** mock repository so `existsById` / `existsByEmail` stubs are hit.

## When to prefer Lab 17 vs Lab 18

| Suite style | Use when |
| --- | --- |
| Lab 17 real in-memory repo | Confidence that transition/uniqueness rules + Map storage integrate |
| Lab 18 Mockito | Prove interaction contracts (`find`/`save`/`never`) without HashMap state |

## Stub vs verify

- **Stub (`when` / `given`)** — supply collaborator return values needed for the path.
- **Verify (`verify` / `then().should`)** — assert the interaction happened (or `never()`).

## Correlation

Exception paths for `changeStatus` carry `lab-request-001` via `BusinessException`.

## AI review (`lab18-001`)

Manual: rejected drafts that `@Mock` the service under test; kept collaborator-only mocks and `never().save` on not-found.
