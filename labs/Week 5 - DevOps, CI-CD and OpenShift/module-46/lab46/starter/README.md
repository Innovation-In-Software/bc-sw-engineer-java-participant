# Lab 46 starter — timed path (~45 minutes)

**Theme:** Kafka resilience — DefaultErrorHandler, DLT, replay notes

## Activity card

| | |
| --- | --- |
| **Checkpoint** | **E** |
| **Must prove** | ErrorHandler+DLT · not-retryable · dashboard · dry-run replay |
| **Hard gate** | Pre-lab Pass · Kafka path available |

## Copy into your workspace

Do **not** grade work only inside the course `labs/` clone. Copy this `starter/` into your bootcamp examples tree as `lab46-crm` (merge Kafka config into your CRM module).

**Windows (PowerShell)** — from this lab folder:

```powershell
New-Item -ItemType Directory -Force -Path "$env:USERPROFILE\java-bootcamp\examples\lab46-crm" | Out-Null
Copy-Item -Recurse -Force ".\starter\*" "$env:USERPROFILE\java-bootcamp\examples\lab46-crm\"
cd $env:USERPROFILE\java-bootcamp\examples\lab46-crm
```

**macOS / Linux:**

```bash
mkdir -p ~/java-bootcamp/examples/lab46-crm
cp -R starter/. ~/java-bootcamp/examples/lab46-crm/
cd ~/java-bootcamp/examples/lab46-crm
```

## 45-minute checklist

- [ ] Complete `KafkaConsumerConfig` TODOs (`DefaultErrorHandler` + DLT recoverer)
- [ ] Align topic names in `application.yml` (`crm.customer.events` / `.DLT`)
- [ ] Document dashboard signals in `docs/kafka-dashboard.md`
- [ ] Fill `docs/dlt-replay-runbook.md` (dry-run + rate limit)
- [ ] Note idempotency strategy for `CUS-1001` / `CUS-1002` events

## Smoke test

```bash
# After merging into a Spring CRM with Kafka on the classpath:
# mvn -B -Dtest=*Kafka* test
# Or compile-check the config class once wired into your module.
echo "TODO(lab46): run listener IT that forces poison -> DLT"
```

Evidence under `~/java-bootcamp/notes/screenshots/lab-46/` (redact PII).

## Timed-path Pass criteria

| Criterion | Pass / Fail |
| --------- | ----------- |
| Bounded retry + DLT recoverer configured | Pass / Fail |
| Not-retryable exceptions classified | Pass / Fail |
| Dashboard docs list lag + DLT rate | Pass / Fail |
| Replay runbook has dry-run step | Pass / Fail |

Continue remaining GUIDE steps as homework / full path if needed.


### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Config compiles but no DLT | Wire handler on listener container factory |
| Retries forever | Add not-retryable + max failures |
| Missing correlation on DLT | Preserve headers in recoverer |
| Empty dashboard doc | List lag + DLT rate + owner |
