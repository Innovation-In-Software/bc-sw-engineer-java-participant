# Lab 21 solution notes

## What / why

Actuator health with distinct liveness vs readiness (`CrmReadinessIndicator` in readiness group), Micrometer counters `crm.customer.create` / `crm.customer.get` with low-cardinality `result` tags, verified by `ActuatorIT`.

## Verify

```powershell
cd "labs\Week 2 - Backend, AI Tools and Testing\module-21\lab21\solution"
mvn -B -Dtest=ActuatorIT test
```

No Docker required. Delete any `target/` under solution/starter before commit.

## Pitfalls

- Custom readiness indicator must be in the readiness group or the probe ignores it.
- Tagging customerId/correlation → cardinality anti-pattern.
- Lab exposure of Actuator is not a production config.
