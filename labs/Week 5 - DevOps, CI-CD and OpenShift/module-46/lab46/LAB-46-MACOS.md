# Lab 46: Kafka Resilience and Observability — Northstar CRM Event Paths — macOS

**OS:** macOS  
**Primary IDE:** IntelliJ IDEA Community Edition  
**Optional IDE:** VS Code  
**Shell:** macOS Terminal (zsh)  
**Stack hint:** JDK 21 · Maven · Docker Desktop · IntelliJ  
**Full lab steps:** [LAB-46-GUIDE.md](LAB-46-GUIDE.md)  
**Pre-lab exercises:** [`../exercises/EXERCISES-INDEX.md`](../exercises/EXERCISES-INDEX.md)  
**Other OS:** [Windows guide](LAB-46-WINDOWS.md) · [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md)  
**Two folders:** [Clone + own repo](../../../CLONE-AND-OWN-REPO-GUIDE.md)


## Prerequisites (macOS)

- [Lab 0 (macOS)](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/module-00/lab0/LAB-0-MACOS.md) complete (JDK 21, Maven, Git)
- IntelliJ — open **`~/java-bootcamp`**, not the course clone
- **Lab 31 CRM** already in `examples/lab31-crm` (Spring Kafka). This lab copies that app.
- Docker Desktop for the Lab 30 broker (`crm-kafka`). Timed path may use EmbeddedKafka only.

## Paths (macOS)

| Item | Path |
| ---- | ---- |
| Course clone (read GUIDE / starter) | `~/bc-sw-engineer-java-participant/` |
| Your repo (write / run / commit / push) | `~/java-bootcamp` |
| This lab Kafka CRM | `~/java-bootcamp/examples/lab46-crm` |
| Lab 30 Compose (broker) | `~/java-bootcamp/examples/lab30-crm` |
| Evidence / screenshots | `~/java-bootcamp/notes/screenshots/lab-46` |
| Shell | macOS Terminal inside IntelliJ |

```bash
cd ~/java-bootcamp
mkdir -p notes/screenshots/lab-46
cd examples/lab46-crm
```

### Commands this lab typically uses

**Do not** copy Lab 41–45 CRM (no Kafka). Compose lives in **Lab 30**, not Lab 46. Prefer `docker exec` even on macOS so the CLI matches class. Actuator is **`:8080`**, not Lab 42 `:8088`.

```bash
cd ~/java-bootcamp/examples/lab30-crm
docker compose up -d
docker compose ps

docker exec crm-kafka /opt/kafka/bin/kafka-topics.sh \
  --bootstrap-server localhost:9092 --create --if-not-exists \
  --topic crm.customer-events.v1.DLT --partitions 1 --replication-factor 1

docker exec crm-kafka /opt/kafka/bin/kafka-consumer-groups.sh \
  --bootstrap-server localhost:9092 --group crm-notifications --describe

cd ~/java-bootcamp/examples/lab46-crm
mvn -B test
# Full path, after the app is running:
curl -fsS http://localhost:8080/actuator/prometheus
```

Same verification notes as Windows (2026-08-22): seed **Lab 31**, topics **`crm.customer-events.v1`** / **`.DLT`**, one `KafkaErrorConfig` on the factory, no host `kafka-*.sh` requirement. Details: [LAB-46-WINDOWS.md](LAB-46-WINDOWS.md) and [LAB-46-GUIDE.md](LAB-46-GUIDE.md).

### If it fails

| Symptom | Fix |
| --- | --- |
| No `pom.xml` | Copy **Lab 31**, then merge starter docs/config |
| Copied Lab 41–45 | Those apps have **no** Kafka — start over with Lab 31 |
| Empty DLT on `.dlq` | Spring recoverer publishes to **`.DLT`** |
| Empty DLT on `.DLT` | Wire `factory.setCommonErrorHandler` |
| Dual `DefaultErrorHandler` | Delete extra `KafkaConsumerConfig` `@Bean` |
| Connection refused on 8088 | Actuator is **8080** |
| Work ended up in the course clone | Move to `~/java-bootcamp` |


## Do the lab

Complete every step in **[LAB-46-GUIDE.md](LAB-46-GUIDE.md)**. GUIDE paths already use `~/java-bootcamp`.

## Evidence / screenshots

Save under `~/java-bootcamp/notes/screenshots/lab-46`. Redact emails and tokens. Log **CUS-1001**, not email.

## Pass criteria

| # | Confirm | Your notes |
| - | ------- | ---------- |
| 1 | Workspace `~/java-bootcamp` open in IntelliJ | Pass / Fail |
| 2 | `examples/lab46-crm` is a Lab 31 copy (not Lab 41–45) | Pass / Fail |
| 3 | GUIDE deliverables / checkpoints complete | Pass / Fail |
| 4 | Commands above succeed (or documented EmbeddedKafka substitute) | Pass / Fail |
| 5 | Screenshots under `notes/screenshots/lab-46/` | Pass / Fail |
