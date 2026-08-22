# Lab 46: Kafka Resilience and Observability — Northstar CRM Event Paths — Windows

**OS:** Windows  
**Primary IDE:** IntelliJ IDEA Community Edition  
**Optional IDE:** VS Code  
**Shell:** Windows PowerShell  
**Stack hint:** JDK 21 · Maven · Docker Desktop · IntelliJ  
**Full lab steps:** [LAB-46-GUIDE.md](LAB-46-GUIDE.md)  
**Pre-lab exercises:** [`../exercises/EXERCISES-INDEX.md`](../exercises/EXERCISES-INDEX.md)  
**Other OS:** [macOS guide](LAB-46-MACOS.md) · [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md)  
**Two folders:** [Clone + own repo](../../../CLONE-AND-OWN-REPO-GUIDE.md)


## Prerequisites (Windows)

- [Lab 0 (Windows)](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/module-00/lab0/LAB-0-WINDOWS.md) complete (JDK 21, Maven, Git)
- IntelliJ — open **`%USERPROFILE%\java-bootcamp`**, not the course clone
- **Lab 31 CRM** already in `examples\lab31-crm` (Spring Kafka). This lab copies that app.
- Docker Desktop for the Lab 30 broker (`crm-kafka`). Timed path may use EmbeddedKafka only.

## Paths (Windows)

| Item | Path |
| ---- | ---- |
| Course clone (read GUIDE / starter) | `%USERPROFILE%\bc-sw-engineer-java-participant\` |
| Your repo (write / run / commit / push) | `%USERPROFILE%\java-bootcamp` |
| This lab Kafka CRM | `%USERPROFILE%\java-bootcamp\examples\lab46-crm` |
| Lab 30 Compose (broker) | `%USERPROFILE%\java-bootcamp\examples\lab30-crm` |
| Evidence / screenshots | `%USERPROFILE%\java-bootcamp\notes\screenshots\lab-46` |
| Shell | Windows PowerShell inside IntelliJ |

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path notes\screenshots\lab-46 | Out-Null
cd examples\lab46-crm
```

### Commands this lab typically uses

**Do not** copy Lab 41–45 CRM (no Kafka). **Do not** run `kafka-*.sh` on the Windows PATH. Compose lives in **Lab 30**, not Lab 46. Actuator is **`:8080`**, not Lab 42 `:8088`.

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\lab30-crm
docker compose up -d
docker compose ps

docker exec crm-kafka /opt/kafka/bin/kafka-topics.sh `
  --bootstrap-server localhost:9092 --create --if-not-exists `
  --topic crm.customer-events.v1.DLT --partitions 1 --replication-factor 1

docker exec crm-kafka /opt/kafka/bin/kafka-consumer-groups.sh `
  --bootstrap-server localhost:9092 --group crm-notifications --describe

cd $env:USERPROFILE\java-bootcamp\examples\lab46-crm
mvn -B test
# Full path, after the app is running:
curl.exe -fsS http://localhost:8080/actuator/prometheus
```

Verified notes (2026-08-22):

- Seed is **`examples\lab31-crm`**. Starter has **no** `pom.xml`. Lab 30 is Compose-only. Lab 41–45 are HTTP CRM.
- Topics stay **`crm.customer-events.v1`** and Spring DLT **`crm.customer-events.v1.DLT`**. Lab 30 also created `.dlq` — that is a **different** name.
- Default Lab 31 group is **`crm-notifications`**. Use the `group-id` in **your** `application.yml`.
- `kafka-console-consumer.sh` is **not** on PATH. Always `docker exec crm-kafka /opt/kafka/bin/….sh`.
- One error-handler bean: edit Lab 31 `KafkaErrorConfig`. A second `DefaultErrorHandler` `@Bean` breaks Spring.
- Timed path: `mvn -B test` (EmbeddedKafka) + docs. Live poison→DLT is full path.
- `ProcessedEventStore` is in-memory — restart clears it.

### If it fails

| Symptom | Fix |
| --- | --- |
| No `pom.xml` | Copy **Lab 31**, then merge starter docs/config |
| Copied Lab 41–45 | Those apps have **no** Kafka — start over with Lab 31 |
| `kafka-console-consumer.sh` not found | Use `docker exec crm-kafka …` |
| Empty DLT on `.dlq` | Spring recoverer publishes to **`.DLT`** |
| Empty DLT on `.DLT` | Wire `factory.setCommonErrorHandler` |
| Dual `DefaultErrorHandler` | Delete extra `KafkaConsumerConfig` `@Bean` |
| Connection refused on 8088 | Actuator is **8080** |
| Work ended up in the course clone | Move to `java-bootcamp` |


## Do the lab

Complete every step in **[LAB-46-GUIDE.md](LAB-46-GUIDE.md)**. Wherever the GUIDE shows `~/java-bootcamp`, use `%USERPROFILE%\java-bootcamp`.

## Evidence / screenshots

Save under `%USERPROFILE%\java-bootcamp\notes\screenshots\lab-46`. Redact emails and tokens. Log **CUS-1001**, not email.

## Pass criteria

| # | Confirm | Your notes |
| - | ------- | ---------- |
| 1 | Workspace `%USERPROFILE%\java-bootcamp` open in IntelliJ | Pass / Fail |
| 2 | `examples/lab46-crm` is a Lab 31 copy (not Lab 41–45) | Pass / Fail |
| 3 | GUIDE deliverables / checkpoints complete | Pass / Fail |
| 4 | Commands above succeed (or documented EmbeddedKafka substitute) | Pass / Fail |
| 5 | Screenshots under `notes/screenshots/lab-46/` | Pass / Fail |
