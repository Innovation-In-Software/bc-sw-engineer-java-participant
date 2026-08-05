# Lab 20 — logging contract

## MDC keys

| Key | Meaning |
| --- | ------- |
| corr | X-Correlation-Id (filter-owned) |
| cust | customerId (service-owned for the op) |
| op | create / get |

## Rules

- Never log fullName or email
- Filter always `MDC.clear()` in `finally`
- Pattern: `corr=%X{corr} cust=%X{cust} op=%X{op}`

## Sample INFO lines (after smoke)

```text
... CustomerService corr=lab-request-001 cust=CUS-1001 op=get - get customer id=CUS-1001
... CustomerService corr=lab-request-001 cust=CUS-1002 op=create - create customer id=CUS-1002
```
