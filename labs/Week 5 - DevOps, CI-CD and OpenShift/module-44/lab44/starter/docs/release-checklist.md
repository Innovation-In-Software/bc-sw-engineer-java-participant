# Lab 44 — Release checklist

## Go / No-Go

| # | Check | Go / No-Go |
| - | ----- | ---------- |
| 1 | Manifest `jarSha256` matches downloaded Lab 43 `crm-jar` (not a local rebuild) | TODO |
| 2 | Staging smoke: readiness + `GET /api/customers?status=ACTIVE` + `lab-request-001` (or documented tabletop) | TODO |
| 3 | Security gate residual risks accepted with owners (Lab 40) | TODO |
| 4 | Rollback runbook rehearsed; prior SHA / Image Id recorded **before** promote | TODO |
| 5 | No secrets in Git, manifest, or release notes | TODO |
| 6 | `crm-cd.yml` is at the **git root**; no `mvn` in CD | TODO |

## Decision

- **Decision:** TODO(lab44) GO / NO-GO
- **Approver:** TODO(lab44)
- **Date/time:** TODO(lab44)
- **Rationale:** TODO(lab44)
