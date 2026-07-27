# Exercise 1 — Read POM Coordinates

**Module 9** · Analysis exercise · [setup](EXERCISES-INDEX.md)

## Goal

Create `pom-coordinates-notes.md` and explain how Maven names a project so teammates and CI resolve the same artifact.

## Coordinate map

| Element | Meaning | Northstar CRM example |
| ------- | ------- | --------------------- |
| `groupId` | Organization / product namespace | `com.northstar` |
| `artifactId` | Module name inside that group | `customer-service` |
| `version` | Release or snapshot label | `0.1.0-SNAPSHOT` |
| `packaging` | Output type (`jar`, `war`, `pom`, …) | `jar` |
| GAV string | Combined identity | `com.northstar:customer-service:0.1.0-SNAPSHOT` |

## Steps

### Step 1 — Fill the blanks from this POM fragment

```xml
<groupId>com.northstar</groupId>
<artifactId>customer-service</artifactId>
<version>0.1.0-SNAPSHOT</version>
<packaging>jar</packaging>
```

| Question | Your answer |
| -------- | ----------- |
| What is the `groupId`? | |
| What is the `artifactId`? | |
| What is the `version`? | |
| What is the packaging? | |
| Write the full GAV (`groupId:artifactId:version`) | |

### Step 2 — Check the reference

| Question | Answer |
| -------- | ------ |
| `groupId` | `com.northstar` |
| `artifactId` | `customer-service` |
| `version` | `0.1.0-SNAPSHOT` |
| packaging | `jar` |
| GAV | `com.northstar:customer-service:0.1.0-SNAPSHOT` |

### Step 3 — Explain SNAPSHOT

Write one sentence:

> A `-SNAPSHOT` version means the artifact is still under active development and may change without a new release number.

### Step 4 — Spot the mistakes

Explain why each is wrong for Northstar CRM Lab 9:

- `groupId` set to `com.example` while the Java packages are `com.northstar.crm`;
- `artifactId` set to `CustomerService` (PascalCase);
- omitting `<packaging>` and assuming WAR for a plain Java library/app JAR;
- committing a different `version` on every laptop with no team agreement.

## Expected result

You can read a POM header and state the exact GAV plus packaging without guessing.

## Pass criteria

| # | Confirm | Notes |
| - | ------- | ----- |
| 1 | Five coordinate answers match the reference | Pass / Fail |
| 2 | You explain what `-SNAPSHOT` means | Pass / Fail |
| 3 | You identify at least two coordinate mistakes | Pass / Fail |
