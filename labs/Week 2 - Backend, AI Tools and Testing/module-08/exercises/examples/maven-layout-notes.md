## Exercise-01-maven-layout:

### Directory meanings

| Path | Purpose | Commit to Git? |
| ---- | ------- | -------------- |
| `pom.xml` | Maven identity, build, dependencies, plugins | Yes |
| `src/main/java` | Production Java source | Yes |
| `src/main/resources` | Runtime configuration/resources | Yes, but never secrets |
| `src/test/java` | Test source | Yes |
| `src/test/resources` | Test-only data/configuration | Yes, if safe |
| `docs` | Team-facing project documentation | Yes |
| `target` | Generated classes, reports, JARs | No |


### Classify files

| File | Destination                       |
| ---- |-----------------------------------|
| `Customer.java` | `src/main/java/...`               |
| `CustomerServiceTest.java` | `src/test/java/...`               |
| `application.properties` | `src/main/resources/`             |
| `sample-customers.json` used only by tests | `src/test/resources`               |
| `CODING-STANDARDS.md` | `docs/`                           |
| `Customer.class` | generated under `target/classes/` |

### Explain `target/`

> `target/` is generated from source by Maven. It can be deleted and rebuilt, so it should be ignored rather than committed.


