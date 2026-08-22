# Lab 46 starter — timed path (~45 minutes)

**Theme:** Kafka resilience — factory-wired error handler, DLT, replay notes

## Two folders

| Folder | You… |
| ------ | ---- |
| **Course clone** (this `starter/` directory) | Read / copy **from** here |
| **`java-bootcamp`** | Copy **Lab 31** → `examples/lab46-crm`, then merge **these** starter files, commit, push |

Do **not** grade work inside the course `labs/` tree. IntelliJ stays on `java-bootcamp`.

**This starter is not a Maven app** (no `pom.xml`). Copy **`examples/lab31-crm`**, then overlay docs + `KafkaErrorConfig` + `application.yml`.

**Do not** copy Lab 30 (Compose only), Lab 41–45 (HTTP CRM, no Kafka), or this starter onto an empty folder.

## Activity card

| | |
| --- | --- |
| **Checkpoint** | **E** |
| **Must prove** | Handler on the **factory** · DLT `.DLT` · dashboard · dry-run replay |
| **Hard gate** | Pre-lab Pass · Lab 31 in `java-bootcamp` |

## Copy into your workspace

**Windows (PowerShell):**

```powershell
$jb = "$env:USERPROFILE\java-bootcamp"
$courseLab46 = "$env:USERPROFILE\bc-sw-engineer-java-participant\labs\Week 5 - DevOps, CI-CD and OpenShift\module-46\lab46"

Copy-Item -Recurse -Force "$jb\examples\lab31-crm" "$jb\examples\lab46-crm"
New-Item -ItemType Directory -Force -Path "$jb\examples\lab46-crm\docs","$jb\notes\screenshots\lab-46" | Out-Null
Copy-Item -Force "$courseLab46\starter\docs\*" "$jb\examples\lab46-crm\docs\"
Copy-Item -Force "$courseLab46\starter\src\main\java\com\northstar\crm\config\KafkaErrorConfig.java" `
  "$jb\examples\lab46-crm\src\main\java\com\northstar\crm\config\KafkaErrorConfig.java"
Copy-Item -Force "$courseLab46\starter\src\main\resources\application.yml" `
  "$jb\examples\lab46-crm\src\main\resources\application.yml"
cd "$jb\examples\lab46-crm"
```

**macOS / Linux:**

```bash
JB=~/java-bootcamp
COURSE_LAB46=~/bc-sw-engineer-java-participant/labs/Week\ 5\ -\ DevOps,\ CI-CD\ and\ OpenShift/module-46/lab46

cp -R "$JB/examples/lab31-crm" "$JB/examples/lab46-crm"
mkdir -p "$JB/examples/lab46-crm/docs" "$JB/notes/screenshots/lab-46"
cp "$COURSE_LAB46/starter/docs/"* "$JB/examples/lab46-crm/docs/"
cp "$COURSE_LAB46/starter/src/main/java/com/northstar/crm/config/KafkaErrorConfig.java" \
  "$JB/examples/lab46-crm/src/main/java/com/northstar/crm/config/KafkaErrorConfig.java"
cp "$COURSE_LAB46/starter/src/main/resources/application.yml" \
  "$JB/examples/lab46-crm/src/main/resources/application.yml"
cd "$JB/examples/lab46-crm"
```

Then complete TODOs in `KafkaErrorConfig` and the docs. See [LAB-46-GUIDE.md](../LAB-46-GUIDE.md) Step 1–3.

Add Actuator if Lab 31 `pom.xml` does not have it:

```xml
<dependency>
  <groupId>org.springframework.boot</groupId>
  <artifactId>spring-boot-starter-actuator</artifactId>
</dependency>
<dependency>
  <groupId>io.micrometer</groupId>
  <artifactId>micrometer-registry-prometheus</artifactId>
</dependency>
```

## 45-minute checklist

- [ ] Work is in `java-bootcamp/examples/lab46-crm` (Lab 31 copy, not course `labs/`)
- [ ] One `KafkaErrorConfig` — recoverer + bounded backoff + **`factory.setCommonErrorHandler`**
- [ ] Topics stay `crm.customer-events.v1` / `crm.customer-events.v1.DLT` (not `crm.customer.events`)
- [ ] No second `DefaultErrorHandler` `@Bean`
- [ ] Fill `docs/kafka-dashboard.md` and `docs/dlt-replay-runbook.md`
- [ ] Note in-memory `ProcessedEventStore` restart risk for `CUS-1001` / `CUS-1002`

## Smoke test

From **`java-bootcamp/examples/lab46-crm`**:

```powershell
mvn -B test
```

Full path (Lab 30 broker up):

```powershell
docker exec crm-kafka /opt/kafka/bin/kafka-console-consumer.sh `
  --bootstrap-server localhost:9092 `
  --topic crm.customer-events.v1.DLT --from-beginning `
  --property print.headers=true --max-messages 10 --timeout-ms 15000
```

Evidence under `~/java-bootcamp/notes/screenshots/lab-46/` (redact PII).

## Timed-path Pass criteria

| Criterion | Pass / Fail |
| --------- | ----------- |
| Work is in `java-bootcamp/examples/lab46-crm` (Lab 31 seed) | Pass / Fail |
| Handler wired on the listener factory | Pass / Fail |
| Not-retryable exceptions classified | Pass / Fail |
| Dashboard docs list lag + DLT rate | Pass / Fail |
| Replay runbook has dry-run + rate limit | Pass / Fail |

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| No `pom.xml` | You copied starter-only — copy **Lab 31** first |
| Config compiles but no DLT | `setCommonErrorHandler` on the factory |
| Retries forever | not-retryable + max elapsed |
| Empty DLT on `.dlq` | Spring default is **`.DLT`** |
| `.sh` not found | `docker exec crm-kafka /opt/kafka/bin/….sh` |
| Dual handler beans | Delete extra `KafkaConsumerConfig` `@Bean` |
