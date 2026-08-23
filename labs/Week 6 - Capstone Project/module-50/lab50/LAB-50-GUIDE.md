# Lab 50: Capstone Frontend and Persistence — Northstar CRM UI→PostgreSQL Journey

**Module:** 50 — Capstone Frontend and Persistence  
**Duration:** ~45 minutes (session block with starter) · Full path: 6–8 Hours (multi-day)

**Primary IDE:** IntelliJ IDEA Community Edition · **Optional IDE:** VS Code

| OS | How-to for this lab |
| -- | ------------------- |
| Windows | [LAB-50-WINDOWS.md](LAB-50-WINDOWS.md) |
| macOS | [LAB-50-MACOS.md](LAB-50-MACOS.md) |

> **Two folders (do not mix):** [Clone the course repo · Commit in your own repo](../../../CLONE-AND-OWN-REPO-GUIDE.md). Read this GUIDE in the **course clone**. Write in **your** `java-bootcamp` repo.

---

## Activity card

| | |
| --- | --- |
| **Time** | ~45 min session · full path 6–8 h |
| **Checkpoint** | **E** (after Ex **1 → 4 → 2 → 3 → 5 → 6**) |
| **Must prove** | Data/API checklist · SQL TODOs · fixtures · durability SELECT draft |
| **Hard gate** | Pre-lab Pass · Lab 49 `POST /api/v1/interactions` known |

### What you will learn

Align PostgreSQL + (full path) an accessible React journey with Lab 49 contracts.

### Enterprise context

Pretty UI without a SQL row after restart fails the capstone.

### Predict

UI shows success but SQL has no row — first checks?

### Debug

Copied starter `*` over Lab 48 ADRs, or used Oracle `RAW(16)` / field `channel` vs Lab 49 `interactionType`?

---

## Two folders

| Folder | You… |
| ------ | ---- |
| Course clone | Read GUIDE / starter |
| `java-bootcamp` | Merge **SQL + checklist** into `examples/customer-management-platform/` |

| Item | Course clone | `java-bootcamp` |
| ---- | ------------ | --------------- |
| Starter | `lab50/starter/db/` + `docs/data-api-checklist.md` | same paths under the platform tree |
| Lab 48–49 work | — | **Keep** `docs/adrs`, `backend/` |

**Session starter has no `frontend/`.** Do **not** run `npm` on the session path. Do **not** `Copy-Item starter\*` over the platform root (that overwrites Lab 48 README/ADRs).

**Contracts (must match Lab 49):**

| Field | Lab 49 | Do not use |
| ----- | ------ | ---------- |
| Create body | `customerId`, `interactionType` (CALL/EMAIL/NOTE/MEETING), `summary`, `correlationId` | `channel` / PHONE/CHAT only |
| Customer id | **String** `CUS-1001` | `RAW(16)` / UUID path as the public id |
| Header | `X-Correlation-ID: lab-request-001` | Bearer required (that's Lab 51) |

Lab 49 **session** API is create-only. Search/list/get-by-id may **not** exist. Full-path UI may seed Amina/Ravi in the client until you add GET endpoints — say so in the checklist. Do **not** call `GET /api/customers/{id}` as if Week 5 had it.

**Postgres:** Lab 37 style user **`crm` / `change-me`**. Prefer a dedicated DB (e.g. `crm_capstone`). Starter SQL uses `VARCHAR` + `UUID` id + `interaction_type` — **not** Oracle `RAW`.

**Maven:** `mvn` from `backend/` if you run it. No `./mvnw`.

---

## 45-minute session block

1. Open [`starter/README.md`](starter/README.md) in the **course clone**.
2. Copy **`db/`** + **`docs/data-api-checklist.md`** into the platform tree.
3. Fill checklist + SQL TODOs against Lab 49 DTOs.
4. Smoke with `Test-Path` / `Select-String` (not `npm`).
5. Mark session Pass criteria.

| Path | Scope |
| ---- | ----- |
| **Session** | Checklist + `V50__customer_interaction.sql` |
| **Full** | React + a11y + E2E + restart durability + `docs/frontend-persistence-demo.md` |

---

## What you'll submit

| # | Deliverable | Session | Full |
| - | ----------- | ------- | ---- |
| 1 | `docs/data-api-checklist.md` | Required | Required |
| 2 | `db/migration/V50__*.sql` | TODOs resolved or deferred in writing | Applied |
| 3 | React search/profile/timeline/form | No | Required |
| 4 | Typed API client (`interactionType`, correlation header) | Sketch | Required |
| 5 | UI/E2E tests | No | Required or documented substitute |
| 6 | `docs/frontend-persistence-demo.md` | Outline | Commands + SQL proof |

---

## Lab Overview

Session: freeze schema + API mapping. Full path: agent journey UI→PostgreSQL for CUS-1001.

## Prerequisites

Lab 48 docs + Lab 49 `backend/`. Node 22 only on the **full** path.

### Pre-flight

```powershell
Test-Path "$env:USERPROFILE\java-bootcamp\examples\customer-management-platform\backend\pom.xml"
```

## Worked example (session)

```powershell
Select-String -Path db\migration\V50__customer_interaction.sql -Pattern 'interaction_type|correlation_id|CUS-1001'
```

Durability draft:

```sql
SELECT id, customer_id, interaction_type, correlation_id, created_at
FROM customer_interaction
WHERE customer_id = 'CUS-1001' AND correlation_id = 'lab-request-001';
```

---

## Implementation Steps

### Step 1 — Merge starter, freeze the journey

```powershell
$jb = "$env:USERPROFILE\java-bootcamp"
$course = "$env:USERPROFILE\bc-sw-engineer-java-participant\labs\Week 6 - Capstone Project\module-50\lab50"
$dest = "$jb\examples\customer-management-platform"

New-Item -ItemType Directory -Force -Path "$dest\db\migration","$dest\docs","$jb\notes\screenshots\lab-50" | Out-Null
Copy-Item -Force "$course\starter\db\migration\*" "$dest\db\migration\"
Copy-Item -Force "$course\starter\docs\data-api-checklist.md" "$dest\docs\data-api-checklist.md"
```

In the checklist: search → profile → timeline → `POST /api/v1/interactions`. Note missing GET list as residual risk.

### Step 2 — Complete PostgreSQL schema

Fill TODOs in `V50__customer_interaction.sql`. Keep **VARCHAR customer_id**, **interaction_type** CHECK aligned with CALL/EMAIL/NOTE/MEETING, **correlation_id**, timeline index. Do **not** paste the Oracle `RAW(16)` / `channel` sample from older drafts.

If Lab 49 already added a Flyway file, **merge versions** — do not create a fighting duplicate table.

### Step 3 — JPA mapping (full path / if you persist for real)

Align entity columns with V50. Lazy timeline query. Session: document “in-memory Lab 49 repo until Flyway is wired.”

### Step 4 — Typed API client (full path)

`interactionType` + `customerId` string + `X-Correlation-ID`. `authHeaders()` empty until Lab 51. Do not type `channel`.

### Step 5–6 — Accessible UI + server states (full path)

Labels, keyboard, `role="alert"`. Loading / empty / 201 / 400 / (401 later) / outage. Disable double-submit.

### Step 7 — Persistence proof (full path)

UI create → SQL SELECT by `customer_id` + `correlation_id` → restart API → row remains. Invalid POST → no row.

### Step 8 — Automate (full path)

```powershell
cd frontend
npm ci
npm test
npm run build
cd ..\backend
mvn -B test
```

### Step 9 — Evidence

`docs/frontend-persistence-demo.md`. `git status` on **java-bootcamp**.

---

## Checkpoints

**Session:** checklist filled; SQL types match Lab 49; durability SELECT drafted; Lab 48/49 files intact.

**Full:** UI journey keyboard-complete; SQL proof for CUS-1001; npm build; no secrets.

---

## Failure Experiments

| # | Experiment | Fix |
| - | ---------- | --- |
| 1 | Field `channel` in TS | Use `interactionType` |
| 2 | `GET /api/customers/CUS-1001` | Not a Week 5 route; seed or add GET |
| 3 | `Copy-Item starter\*` | Copy `db/` + checklist only |
| 4 | `./mvnw` | `mvn` from `backend/` |
| 5 | UI success / empty SQL | Wrong DB/profile / uncommitted tx |

---

## Troubleshooting

| Symptom | Fix |
| ------- | --- |
| Overwrote ADRs | Copy specific files only |
| RAW/UUID fight | Follow starter VARCHAR/UUID SQL |
| DTO drift | Re-open Lab 49 records |
| `npm` on session | Not required today |
| 401 | JWT is Lab 51 |
| Work in `labs/` | `java-bootcamp` |

---

## Cleanup

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\customer-management-platform
git status --short
```

Keep SQL + (full path) `frontend/`. Lab 51 secures and deploys this stack.

---

## Reflection

1. What proves the row is durable?
2. Which Lab 49 field did you almost rename?
3. Why is session allowed without React?
