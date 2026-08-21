# Lab 44 — Rollback runbook

## Known-good identity

| Field | Value |
| ----- | ----- |
| Previous `jarSha256` | TODO(lab44) — record **before** this promote |
| Previous version / Image Id | TODO(lab44) |
| Verification check | readiness + **`GET /api/customers?status=ACTIVE`** with `X-Correlation-Id: lab-request-001` |

There is **no** `GET /api/customers/{id}`. Optional local cluster is **Lab 42 k3d** (`Host` header on `:8088`), not instructor GHCR.

## Procedure (sketch)

1. Announce incident / change freeze as needed (Lab 47 templates).
2. Redeploy the **prior** identity — do **not** `mvn package`. For optional k3d: `kubectl -n crm-training rollout undo deployment/crm-api`.
3. TODO(lab44): Exact commands for your environment (tabletop is valid on the timed path).
4. Verify readiness + list-API smoke.
5. Record outcome in release notes (no secrets).

## Rehearsal evidence

TODO(lab44): Path under `notes/screenshots/lab-44/` (redact tokens).
