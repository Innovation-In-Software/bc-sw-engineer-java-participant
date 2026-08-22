# Lab 46 — DLT replay runbook

## Failure policy (lab)

| Failure | Retryable? | Action |
| ------- | ---------- | ------ |
| `InvalidCustomerEventException` / `UnsupportedEventVersionException` | No | DLT immediately |
| Parse / deserialization | No | DLT (listener `JsonParseException` may miss deserializer failures — optional homework: `ErrorHandlingDeserializer`) |
| Transient `DataAccessResourceFailureException` | Yes | Bounded backoff, max elapsed **10s**, then DLT |

## When to replay

Poison messages on **`crm.customer-events.v1.DLT`** after the root cause is fixed. Do not consume Lab 30 `.dlq` and call it done unless that is the name you coded.

## Dry-run first

1. Inspect DLT records (headers: correlation `lab-request-001`, exception class).
2. Peek without producing to the main topic:

```powershell
docker exec crm-kafka /opt/kafka/bin/kafka-console-consumer.sh `
  --bootstrap-server localhost:9092 `
  --topic crm.customer-events.v1.DLT --from-beginning `
  --property print.headers=true --max-messages 10 --timeout-ms 15000
```

3. Confirm idempotent handler will not double-apply side effects for `CUS-1001` / `CUS-1002`.
4. TODO(lab46): note that in-memory `ProcessedEventStore` **resets on restart**.

## Limited replay

1. Rate-limit: TODO(lab46) messages/sec (lab default: 1)
2. Replay N messages → verify CRM side effects once
3. Stop on unexpected errors; escalate

## Evidence

TODO(lab46): screenshot/path of DLT inspection + limited replay (no secrets/PII). Timed path: tabletop the `docker exec` command.
