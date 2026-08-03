# Lab 50 starter — session block (~45 minutes)

**Theme:** Data/API checklist + SQL/Flyway stubs for UI→PostgreSQL journey  

## Activity card

| | |
| --- | --- |
| **Checkpoint** | **E** |
| **Must prove** | checklist · SQL TODOs · fixtures · durability SELECT |
| **Hard gate** | Pre-lab Pass · Lab 49 DTOs |

**Target:** `~/java-bootcamp/examples/customer-management-platform/`

Timed-path policy: [`labs/_STARTER-PATH.md`](../../../../_STARTER-PATH.md)

## Copy into your workspace

**Windows (PowerShell)** — from this lab folder:

```powershell
$dest = "$env:USERPROFILE\java-bootcamp\examples\customer-management-platform"
New-Item -ItemType Directory -Force -Path $dest | Out-Null
Copy-Item -Recurse -Force ".\starter\*" $dest\
cd $dest
```

**macOS / Linux:**

```bash
mkdir -p ~/java-bootcamp/examples/customer-management-platform
cp -R starter/. ~/java-bootcamp/examples/customer-management-platform/
cd ~/java-bootcamp/examples/customer-management-platform
```

## 45-minute session checklist

- [ ] Walk `docs/data-api-checklist.md` against Lab 49 DTO/API shapes
- [ ] Complete column TODOs in `db/migration/V50__customer_interaction.sql`
- [ ] Note Flyway versioning rules in `db/migration/README.md`
- [ ] Sketch UI journey steps (search → profile → timeline → create) in checklist
- [ ] List evidence commands for SQL proof of `CUS-1001` + `lab-request-001`

## Smoke test

```bash
ls docs/data-api-checklist.md
ls db/migration/V50__customer_interaction.sql
# When Postgres available (full path / shared host):
# flyway info   OR   start app and confirm migration applied
```

Evidence under `~/java-bootcamp/notes/screenshots/lab-50/`.

## Timed-path Pass criteria

| Criterion | Pass / Fail |
| --------- | ----------- |
| Data/API checklist filled for create-interaction contract | Pass / Fail |
| SQL stub has table + FK/index TODOs resolved or explicitly deferred | Pass / Fail |
| Journey steps name Amina / correlation fixtures | Pass / Fail |
| Durability proof query drafted (SELECT … WHERE correlation_id = …) | Pass / Fail |

Full path (multi-day): React components, typed client, a11y, E2E, restart durability — see GUIDE.


### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Checklist vs Lab 49 mismatch | Re-open Lab 49 DTO/demo.md |
| Vague SQL TODOs | Name columns, FK, correlation_id |
| No durability query | Draft SELECT by correlation_id |
| Overwriting platform files | Merge carefully; backup first |
