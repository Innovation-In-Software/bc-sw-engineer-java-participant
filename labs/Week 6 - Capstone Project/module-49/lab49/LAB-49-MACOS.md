# Lab 49: Capstone Backend and Messaging — Northstar CRM Interaction Slice — macOS

**OS:** macOS  
**Primary IDE:** IntelliJ IDEA Community Edition  
**Optional IDE:** VS Code  
**Shell:** macOS Terminal (zsh)  
**Stack hint:** JDK 21 · Maven (`mvn`, no wrapper) · IntelliJ  
**Full lab steps:** [LAB-49-GUIDE.md](LAB-49-GUIDE.md)  
**Pre-lab exercises:** [`../exercises/EXERCISES-INDEX.md`](../exercises/EXERCISES-INDEX.md)  
**Other OS:** [Windows guide](LAB-49-WINDOWS.md) · [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md)  
**Two folders:** [Clone + own repo](../../../CLONE-AND-OWN-REPO-GUIDE.md)


## Prerequisites (macOS)

- [Lab 0 (macOS)](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/module-00/lab0/LAB-0-MACOS.md) complete (JDK 21, Maven, Git)
- IntelliJ — open **`~/java-bootcamp`**, SDK 21
- Lab 48 docs already in `examples/customer-management-platform/docs`

## Paths (macOS)

| Item | Path |
| ---- | ---- |
| Course clone | `~/bc-sw-engineer-java-participant/` |
| Your repo | `~/java-bootcamp` |
| This lab backend | `~/java-bootcamp/examples/customer-management-platform/backend` |
| Evidence | `~/java-bootcamp/notes/screenshots/lab-49` |

```bash
cd ~/java-bootcamp
mkdir -p notes/screenshots/lab-49
cd examples/customer-management-platform/backend
```

### Commands this lab typically uses

**Do not** `./mvnw`. **Do not** send Bearer on the session stub.

```bash
JB=~/java-bootcamp
COURSE_LAB49=~/bc-sw-engineer-java-participant/labs/Week\ 6\ -\ Capstone\ Project/module-49/lab49
DEST="$JB/examples/customer-management-platform"

mkdir -p "$DEST/backend" "$DEST/docs" "$JB/notes/screenshots/lab-49"
cp -R "$COURSE_LAB49/starter/backend/." "$DEST/backend/"
cp "$COURSE_LAB49/starter/docs/build-checklist.md" "$DEST/docs/build-checklist.md"
cd "$DEST/backend"
mvn -B test
```

Session curl (no Bearer):

```bash
curl -i -X POST "http://localhost:8080/api/v1/interactions" \
  -H "Content-Type: application/json" \
  -H "X-Correlation-ID: lab-request-001" \
  -d '{"customerId":"CUS-1001","interactionType":"NOTE","summary":"Requested address update","correlationId":"lab-request-001"}'
```

Same verification notes as Windows: merge **`backend/`** into the Lab 48 tree, `mvn` not `mvnw`, POST interactions, JWT is Lab 51. Details: [LAB-49-WINDOWS.md](LAB-49-WINDOWS.md).

### If it fails

| Symptom | Fix |
| --- | --- |
| `./mvnw` not found | Use `mvn -B test` |
| 401 | Drop Bearer until Lab 51 |
| Overwrote Lab 48 docs | Copy `backend/` only |


## Do the lab

Complete every step in **[LAB-49-GUIDE.md](LAB-49-GUIDE.md)**.

## Evidence / screenshots

Save under `~/java-bootcamp/notes/screenshots/lab-49`. Redact secrets.

## Pass criteria

| # | Confirm | Your notes |
| - | ------- | ---------- |
| 1 | Workspace `~/java-bootcamp` open, SDK 21 | Pass / Fail |
| 2 | Code under `examples/customer-management-platform/backend` | Pass / Fail |
| 3 | Session tests green **or** GUIDE full-path verify | Pass / Fail |
| 4 | No Maven Wrapper required | Pass / Fail |
| 5 | Screenshots under `notes/screenshots/lab-49/` | Pass / Fail |
