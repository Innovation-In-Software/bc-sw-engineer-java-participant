# C4 Container — Customer Management Platform

> **TODO:** Place React, Spring Boot, PostgreSQL, Kafka, IdP, and observability. Note sync vs async paths.

## Containers

| Container | Responsibility | Tech | Data store / topics |
| --------- | -------------- | ---- | ------------------- |
| `crm-web` | _____ | React | — |
| `crm-api` | _____ | Spring Boot | JDBC → PostgreSQL |
| `crm-db` | _____ | PostgreSQL | schemas / tables |
| `crm-events` | _____ | Kafka | topic: _____ |
| `idp` | _____ | _____ | — |
| `obs` | _____ | _____ | logs / metrics |

## Data flow (interaction create)

1. Agent → UI → `POST /api/v1/interactions` with `X-Correlation-ID: lab-request-001`
2. API validates → persists → publishes `CustomerInteractionRecordedV1` (or equivalent)
3. Consumer _____ (idempotent / DLT notes): _____

## Open decisions → ADRs

- Database: see `docs/adrs/ADR-001-postgresql.md` (or draft from `_ADR-TEMPLATE.md`)
- Messaging: _____
- Consistency (persist + publish): _____
- Auth: _____
- Deploy: _____
