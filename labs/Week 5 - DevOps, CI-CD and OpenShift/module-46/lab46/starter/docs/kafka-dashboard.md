# Lab 46 — Kafka dashboard notes

## Event flow

| Role | Name | Notes |
| ---- | ---- | ----- |
| Producer | Lab 31 publisher | key = `customerId` |
| Topic | `crm.customer-events.v1` | Lab 30/31 main stream |
| DLT | `crm.customer-events.v1.DLT` | Spring recoverer default (`topic + ".DLT"`) |
| Group | `crm-notifications` | Lab 31 default — use **your** `application.yml` `group-id` |
| Side effect | Projection / notification | `ProcessedEventStore` (in-memory unless you persist it) |
| Owner | TODO(lab46) | |

Lab 30 also created `crm.customer-events.v1.dlq`. That is **not** the Spring DLT unless you coded that name.

## Signals

| Signal | Why it matters | Alert sketch |
| ------ | -------------- | ------------ |
| Consumer lag | Partition stuck / slow handler | TODO(lab46) |
| DLT message rate | Poison / contract break | TODO(lab46) |
| Retry count | Transient vs permanent | TODO(lab46) |
| Processing latency | SLA risk | TODO(lab46) |

## False confidence

Lag = 0 while DLT is growing still means customer events are failing — TODO(lab46): call this out in ops notes.

## How you will scrape (lab)

- Actuator Prometheus: `http://localhost:8080/actuator/prometheus` (not Lab 42 `:8088`)
- Lag: `docker exec crm-kafka /opt/kafka/bin/kafka-consumer-groups.sh --bootstrap-server localhost:9092 --group crm-notifications --describe`

## Fixtures

Synthetic only: `CUS-1001`, `CUS-1002`, correlation `lab-request-001`. Redact emails from metric tags (use `topic` / `outcome`, not email).
