# Lab 21 solution — timed path (~45 minutes)

**Theme:** Observability — Actuator probes, CrmReadinessIndicator, Micrometer create/get metrics

## Activity card

| | |
| --- | --- |
| **Objective** | Complete readiness indicator, low-cardinality metrics, and ActuatorIT |
| **Skills practiced** | Health probes, Micrometer counters, exposure caution |
| **Expected outcome** | `ActuatorIT` green · monitoring-report.md filled |
| **Estimated time** | ~45 minutes |
| **Files** | Completed reference for `examples/lab21-crm` (compare to your timed starter work) |

**Boilerplate reduced:** App + observability TODOs — fill `// TODO`; no customerId metric tags.

Pacing: [`../../PACING.md`](../../PACING.md) · Full steps: [`../LAB-21-GUIDE.md`](../LAB-21-GUIDE.md)

**Detailed walkthrough:** [SOLUTION.md](SOLUTION.md) · [SOLUTION-NOTES.md](SOLUTION-NOTES.md)

**Honesty:** Lab Actuator exposure is for learning — document production lockdown in the report.

## Copy into your workspace

Do **not** grade work only inside the course `labs/` clone. Copy this `starter/` into your bootcamp examples tree as `lab21-crm`.

**Windows (PowerShell)** — from this lab folder:

```powershell
New-Item -ItemType Directory -Force -Path "$env:USERPROFILE\java-bootcamp\examples\lab21-crm" | Out-Null
Copy-Item -Recurse -Force ".\starter\*" "$env:USERPROFILE\java-bootcamp\examples\lab21-crm\"
cd $env:USERPROFILE\java-bootcamp\examples\lab21-crm
```

**macOS / Linux:**

```bash
mkdir -p ~/java-bootcamp/examples/lab21-crm
cp -R starter/. ~/java-bootcamp/examples/lab21-crm/
cd ~/java-bootcamp/examples/lab21-crm
```

Full GUIDE: [`../LAB-21-GUIDE.md`](../LAB-21-GUIDE.md)

## 45-minute checklist

- [ ] Confirm Actuator exposure + probes in `application.yml` (lab-only)
- [ ] Implement `CrmReadinessIndicator` (ready vs OUT_OF_SERVICE)
- [ ] Implement `CustomerMetrics` counters (low-cardinality tags only)
- [ ] Wire metrics calls in `CustomerService`; finish `ActuatorIT`
- [ ] Fill `docs/monitoring-report.md`; run smoke test

## Smoke test

```bash
mvn -B -Dtest=ActuatorIT test
mvn -B clean verify
```

Evidence under `~/java-bootcamp/notes/screenshots/lab-21/` (redact secrets).

## Timed-path Pass criteria

| Criterion | Pass / Fail |
| --------- | ----------- |
| ActuatorIT green | Pass / Fail |
| Liveness UP when readiness toggled down | Pass / Fail |
| Create/get metrics present after traffic | Pass / Fail |
| monitoring-report.md documents prod exposure caution | Pass / Fail |

Continue remaining GUIDE steps as homework / full path if needed.

