# Exercise 1 — Read a Maven Project Layout

**Module 8** · Analysis exercise · [setup](EXERCISES-INDEX.md)

## Goal

Create `maven-layout-notes.md` and explain where production code, tests, configuration, documentation, and generated files belong.

## Reference tree

```text
customer-management-platform/
├── pom.xml
├── docs/
│   └── CODING-STANDARDS.md
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/northstar/crm/
│   │   └── resources/
│   │       └── application.properties
│   └── test/
│       ├── java/
│       │   └── com/northstar/crm/
│       └── resources/
└── target/
```

## Directory meanings

| Path | Purpose | Commit to Git? |
| ---- | ------- | -------------- |
| `pom.xml` | Maven identity, build, dependencies, plugins | Yes |
| `src/main/java` | Production Java source | Yes |
| `src/main/resources` | Runtime configuration/resources | Yes, but never secrets |
| `src/test/java` | Test source | Yes |
| `src/test/resources` | Test-only data/configuration | Yes, if safe |
| `docs` | Team-facing project documentation | Yes |
| `target` | Generated classes, reports, JARs | No |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

**Goal reminder:** Create `maven-layout-notes.md` and explain where production code, tests, configuration, documentation, and generated files belong.

**Done looks like:** Every file is assigned to the correct Maven location, and you can distinguish source from generated output.

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Classify these files

Copy into `maven-layout-notes.md` and fill the destination:

| File | Destination |
| ---- | ----------- |
| `Customer.java` | |
| `CustomerServiceTest.java` | |
| `application.properties` | |
| `sample-customers.json` used only by tests | |
| `CODING-STANDARDS.md` | |
| `Customer.class` | |

### Step 2 — Check your answers

| File | Destination |
| ---- | ----------- |
| `Customer.java` | `src/main/java/...` |
| `CustomerServiceTest.java` | `src/test/java/...` |
| `application.properties` | `src/main/resources/` |
| test JSON | `src/test/resources/` |
| standards | `docs/` |
| `Customer.class` | generated under `target/classes/` |

### Step 3 — Explain `target/`

Write:

> `target/` is generated from source by Maven. It can be deleted and rebuilt, so it should be ignored rather than committed.

### Step 4 — Spot the mistakes

Explain why each is wrong:

- production Java in `src/test/java`;
- passwords committed in `application.properties`;
- hand-editing `target/classes`;
- test fixtures in production resources without a runtime need.

## Expected result

Every file is assigned to the correct Maven location, and you can distinguish source from generated output.

## Pass criteria

| # | Confirm | Notes |
| - | ------- | ----- |
| 1 | Six files classified correctly | Pass / Fail |
| 2 | You explain why `target/` is ignored | Pass / Fail |
| 3 | You state that resources must not contain committed secrets | Pass / Fail |
