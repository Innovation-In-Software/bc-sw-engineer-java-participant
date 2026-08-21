# Lab 44 — Release plan

## Immutable artifact

Promote **one** identity from Lab 43: **`jarSha256`** + **`gitCommit`** from `SHA256SUMS`. Never rebuild with Maven on the deploy agent. Image digest / GHCR is **optional** (Lab 41 `RepoDigests` is empty until you push).

| Field | Value |
| ----- | ----- |
| Version | TODO(lab44) |
| Commit | TODO(lab44) from Lab 43 `commit=` line |
| JAR SHA-256 | TODO(lab44) from Lab 43 `SHA256SUMS` (not a local `mvn package`) |
| Image digest | `null` unless you pushed |

## Promotion path

```text
Lab 43 CI package (crm-jar) → test → staging (list-API smoke) → [approval] → production
```

## Gates (objective)

| Env | Gate | Evidence |
| --- | ---- | -------- |
| test | Lab 43 verify green | Actions run URL |
| staging | SHA match + `GET /api/customers?status=ACTIVE` (or tabletop) | TODO(lab44) |
| production | approval + `jarSha256` match | TODO(lab44) |

## Config vs artifact

TODO(lab44): Env-specific ConfigMaps/Secrets (`SPRING_DATASOURCE_*` / Lab 42 `CRM_DB_*`, Ingress host) stay **outside** the JAR. Secret **names** only in Git. User is **`crm`**, not `crm_app`. No Kafka requirement for this lab’s smoke.

## DB compatibility

TODO(lab44): Expand-before-contract. Isolated DB **`crm_lab43`** — do not treat Lab 42’s `crm_lab42` as production. Record when digest rollback cannot undo a DROP COLUMN.
