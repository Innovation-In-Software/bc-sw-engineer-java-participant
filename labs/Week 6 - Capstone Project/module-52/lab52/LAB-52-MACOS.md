# Lab 52: Capstone Final Defense — Northstar CRM Presentation and Technical Defense — macOS

**OS:** macOS  
**Primary IDE:** IntelliJ IDEA Community Edition  
**Optional IDE:** VS Code  
**Shell:** macOS Terminal (zsh)  
**Stack hint:** Session = `defense/` markdown · Full path = PDF + panel  
**Full lab steps:** [LAB-52-GUIDE.md](LAB-52-GUIDE.md)  
**Pre-lab exercises:** [`../exercises/EXERCISES-INDEX.md`](../exercises/EXERCISES-INDEX.md)  
**Other OS:** [Windows guide](LAB-52-WINDOWS.md) · [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md)  
**Two folders:** [Clone + own repo](../../../CLONE-AND-OWN-REPO-GUIDE.md)


## Prerequisites (macOS)

- Git; Lab 48–51 tree in `examples/customer-management-platform`
- IntelliJ on **`~/java-bootcamp`**
- No Maven required for the session block

## Paths (macOS)

| Item | Path |
| ---- | ---- |
| Course clone | `~/bc-sw-engineer-java-participant/` |
| Platform tree | `~/java-bootcamp/examples/customer-management-platform` |
| Evidence | `~/java-bootcamp/notes/screenshots/lab-52` |

### Commands this lab typically uses

**Do not** `cp -R starter/.` over the platform root. **Do not** `./mvnw`. **Do not** `mvn` as smoke.

```bash
JB=~/java-bootcamp
COURSE=~/bc-sw-engineer-java-participant/labs/Week\ 6\ -\ Capstone\ Project/module-52/lab52
DEST="$JB/examples/customer-management-platform"

mkdir -p "$DEST/defense" "$JB/notes/screenshots/lab-52"
cp "$COURSE/starter/defense/"* "$DEST/defense/"
cd "$DEST"
ls defense/*.md
grep -E 'CUS-1001|lab-request-001|POST /api/v1/interactions' defense/*.md
```

Same notes as Windows: [LAB-52-WINDOWS.md](LAB-52-WINDOWS.md).

### If it fails

| Symptom | Fix |
| --- | --- |
| Overwrote Lab 48 README | Copy `defense/` only |
| `mvn` required today | Session smoke is `ls defense` |
| `channel` / nested URL | Lab 49 DTO |
| Invented 401/digest | Finish Lab 51 or list a non-claim |

## Do the lab

Complete **[LAB-52-GUIDE.md](LAB-52-GUIDE.md)**. Redact tokens.

## Pass criteria

| # | Confirm | Notes |
| - | ------- | ----- |
| 1 | Work in `~/java-bootcamp` platform tree | Pass / Fail |
| 2 | Session outline+script+evidence or full pack | Pass / Fail |
| 3 | No secrets in `defense/` | Pass / Fail |
| 4 | Screenshots under `notes/screenshots/lab-52/` | Pass / Fail |
