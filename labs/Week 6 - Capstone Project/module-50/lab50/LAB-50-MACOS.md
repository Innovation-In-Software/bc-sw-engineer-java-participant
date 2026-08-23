# Lab 50: Capstone Frontend and Persistence — Northstar CRM UI→PostgreSQL Journey — macOS

**OS:** macOS  
**Primary IDE:** IntelliJ IDEA Community Edition  
**Optional IDE:** VS Code  
**Shell:** macOS Terminal (zsh)  
**Stack hint:** Session = SQL + docs · Full path = Node 22 + Maven  
**Full lab steps:** [LAB-50-GUIDE.md](LAB-50-GUIDE.md)  
**Pre-lab exercises:** [`../exercises/EXERCISES-INDEX.md`](../exercises/EXERCISES-INDEX.md)  
**Other OS:** [Windows guide](LAB-50-WINDOWS.md) · [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md)  
**Two folders:** [Clone + own repo](../../../CLONE-AND-OWN-REPO-GUIDE.md)


## Prerequisites (macOS)

- Git; Lab 48–49 tree in `examples/customer-management-platform`
- IntelliJ on **`~/java-bootcamp`**
- Node 22 **only** for the full path

## Paths (macOS)

| Item | Path |
| ---- | ---- |
| Course clone | `~/bc-sw-engineer-java-participant/` |
| Platform tree | `~/java-bootcamp/examples/customer-management-platform` |
| Evidence | `~/java-bootcamp/notes/screenshots/lab-50` |

### Commands this lab typically uses

**Do not** `cp -R starter/.` over the platform root. **Do not** `./mvnw`. **Do not** `npm` on the session path.

```bash
JB=~/java-bootcamp
COURSE=~/bc-sw-engineer-java-participant/labs/Week\ 6\ -\ Capstone\ Project/module-50/lab50
DEST="$JB/examples/customer-management-platform"

mkdir -p "$DEST/db/migration" "$DEST/docs" "$JB/notes/screenshots/lab-50"
cp "$COURSE/starter/db/migration/"* "$DEST/db/migration/"
cp "$COURSE/starter/docs/data-api-checklist.md" "$DEST/docs/data-api-checklist.md"
cd "$DEST"
grep -E 'interaction_type|correlation_id' db/migration/V50__customer_interaction.sql
```

Full path: `cd frontend && npm ci && npm test && npm run build`. Same notes as Windows: [LAB-50-WINDOWS.md](LAB-50-WINDOWS.md).

### If it fails

| Symptom | Fix |
| --- | --- |
| Overwrote ADRs | Copy `db/` + checklist only |
| `npm` not found on session | Expected |
| `channel` / per-id GET | Lab 49 DTO; no Week 5 `/{id}` |

## Do the lab

Complete **[LAB-50-GUIDE.md](LAB-50-GUIDE.md)**.

## Pass criteria

| # | Confirm | Notes |
| - | ------- | ----- |
| 1 | Work in `~/java-bootcamp` platform tree | Pass / Fail |
| 2 | Session SQL+checklist or full-path React | Pass / Fail |
| 3 | Types match Lab 49 | Pass / Fail |
| 4 | Screenshots under `notes/screenshots/lab-50/` | Pass / Fail |
