# Lab 21 — Monitoring report (solution)

## Probes

| Endpoint | Meaning |
| --- | --- |
| `/actuator/health/liveness` | Process alive — do not fail for dependency warmup |
| `/actuator/health/readiness` | Safe for traffic — includes `crmReadiness` lab toggle |

`CrmReadinessIndicator` is **lab-only** (contributor id `crmReadinessIndicator` in the readiness group). When `setReady(false)`, readiness leaves UP while liveness stays UP.

## Metrics (low cardinality)

| Name | Tags |
| --- | --- |
| `crm.customer.create` | `result=success\|failure` |
| `crm.customer.get` | `result=success\|not_found` |

Never tag `customerId` or correlation IDs (cardinality explosion).

## Production hardening

Local lab exposes `health,metrics,info`. Production must authenticate Actuator, firewall the management port, and allow-list endpoints. Do **not** expose `/actuator/env` or unrestricted `show-details`.

## Evidence checklist

- Health + liveness + readiness UP at start
- Readiness toggled down independently of liveness
- After POST `CUS-2101` / GET `CUS-1001`, `/actuator/metrics/crm.customer.create` present
