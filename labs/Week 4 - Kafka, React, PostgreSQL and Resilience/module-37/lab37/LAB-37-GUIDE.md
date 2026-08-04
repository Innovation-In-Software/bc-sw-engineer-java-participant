# Lab 37: PostgreSQL Design for Customers and Accounts

**Module:** 37 — PostgreSQL Design for Customers and Accounts  
**Duration:** ~45 minutes (timed path with starter) · Full path: 4–5 Hours

**Primary IDE:** IntelliJ IDEA Community Edition · **Optional IDE:** VS Code

| OS | How-to for this lab |
| -- | ------------------- |
| Windows | [LAB-37-WINDOWS.md](LAB-37-WINDOWS.md) |
| macOS | [LAB-37-MACOS.md](LAB-37-MACOS.md) |

---

## Activity card

| | |
| --- | --- |
| **Time** | ~45 min timed · full path 4–5 h |
| **Checkpoint** | **E** (after Ex 1→2→3→4→5→6) |
| **Must prove** | Schema + named constraints · Amina/Ravi seeds · one negative check |
| **Hard gate** | Pre-lab Pass · Docker/shared Postgres · no secrets in Git |

### What you will learn

Implement a repeatable PostgreSQL CRM schema with constraints and fixture seeds.

### Enterprise context

Freeze identifiers and integrity rules before SQL tuning (38) and JPA (39).

### Predict

Inserting ACCOUNT before its CUSTOMER — which constraint fails?

### Debug

Re-running CREATE without drop — name already exists — what script first?

---

## 45-minute timed path (use starter)

> **Timed-path schema contract (`starter/database/02_schema.sql`):** column `email` (UNIQUE), `account.balance_cents BIGINT`, status CHECK without `SUSPENDED` (`PROSPECT`/`ACTIVE`/`CLOSED`). Full GUIDE/solution samples below may still demonstrate `email_normalized` + `NUMERIC(19,2)` money — do not mix tracks on the timed path. **Lab 39** maps these tables via JPA/Flyway.


> **Pacing reminder:** [PACING.md](../PACING.md) checkpoint **E**. Homework: full negatives + drop/recreate + design-decisions.md.

In class, use the starter templates so the **core** objectives fit **~45 minutes**. The full Steps below remain for homework / extended depth.

1. Open [`starter/README.md`](starter/README.md).
2. Copy `starter/` into your `java-bootcamp/examples/…` target (see starter README).
3. Fill every `// TODO` / `TODO` — do **not** wait on a perfect prior lab; the starter includes a baseline.
4. Run the starter smoke test; evidence under `notes/screenshots/lab-37/`.
5. Mark timed-path Pass criteria in the starter README. Continue remaining GUIDE steps as homework if needed.

| Path | Time | Scope |
| ---- | ---- | ----- |
| **Timed (default)** | ~45 min | Starter TODOs + smoke test |
| **Full (extended)** | see Duration | Every Step in this GUIDE |

---

## What you'll submit (read this first)

Keep this checklist visible while you work.

| # | Deliverable |
| - | ----------- |
| 1 | ER notes/diagram with cardinalities and identifier rules |
| 2 | PostgreSQL Docker runtime with persistent volume |
| 3 | `CRM_APP` least-privilege user script |
| 4 | Full DDL for CUSTOMER, ACCOUNT, ADDRESS, HISTORY + indexes |
| 5 | Seed script for Amina/Ravi (+ history correlation) |
| 6 | Negative verification script with ORA evidence |
| 7 | Drop/recreate proof |
| 8 | Design decisions + screenshots |

**Must submit:** the items in the table above (sources + evidence + short notes).

**Do not submit:** `target/`, `node_modules/`, secrets, heap dumps, or a verbatim instructor `solution/`.

## Lab Overview

This Module 37 lab designs and implements the **PostgreSQL** CRM schema: ER cardinalities, stable identifiers, PostgreSQL in Docker, least-privileged `CRM_APP` user, DDL for `CUSTOMER` / `ACCOUNT` / `ADDRESS` / `CUSTOMER_STATUS_HISTORY`, named constraints, money/timestamp types, FK indexes, seed data for Amina and Ravi, negative constraint tests, and dependency-ordered cleanup scripts.

## Learning Objectives

After completing this lab, you will be able to:

* Draw a normalized PostgreSQL CRM ER model with cardinalities
* Start PostgreSQL with persistent Docker storage
* Create a least-privileged CRM schema user (no DBA)
* Write CUSTOMER, ACCOUNT, ADDRESS, and status-history DDL
* Apply named primary, unique, foreign-key, and check constraints

## Business Scenario

The CRM stores customer identity, contact details, lifecycle status, postal addresses, and financial accounts. React (Labs 33–36) talks to Spring; Spring will persist to PostgreSQL. This lab defines **tables before ORM**—wrong money types or missing history cannot be patched by UI security alone.

Leadership freezes:

| ID | Name | Notes |
| -- | ---- | ----- |
| `CUS-1001` | Amina Khan | `ACTIVE` — has ≥1 ACCOUNT + ADDRESS |
| `CUS-1002` | Ravi Singh | `PROSPECT` — zero accounts (edge case) |
| `lab-request-001` | — | sample history reason / correlation note |
| emails | `amina@example.com`, `ravi@example.com` | store normalized unique email |

**Security note for evidence.** Lab passwords (`POSTGRES_PASSWORD` / schema password, `CRM_APP`) are **lab-only**—never reuse in production; prefer `.env` / Docker env not committed. Do not seed real PII. Do not commit PostgreSQL data volumes.

## Architecture Context
### NOW (this lab)

```mermaid
flowchart TB
  ER["ER design<br/>Customer 1-0..* Account / Address / StatusHistory"] --> PG["PostgreSQL crm DB<br/>+ named volume"]
  PG --> User["User CRM_APP<br/>no superuser"]
  User --> C["CUSTOMER"]
  User --> A["ACCOUNT"]
  User --> Addr["ADDRESS"]
  User --> H["CUSTOMER_STATUS_HISTORY"]
  Idx["indexes on FKs + changed_at"] -.-> User
  Seed["Seed -> verify -> negative tests"] -.-> PG
```

## Prerequisites

Confirm (Lab 0 tools assumed):

* Docker with enough RAM/disk for PostgreSQL (often ≥2–4 GB free)
* psql or pgAdmin
* Diagram tool (draw.io, Mermaid, VS Code markdown preview)
* No secrets committed to Git

### Pre-flight

```bash
java -version
mvn -version
```

## Worked example (read before you code)

Study this pattern once before Step 1. Your job is to apply the same idea in the Steps — do not skip ahead to a full solution.

```sql
INSERT INTO customer (public_id, full_name, email_normalized, phone, status)
VALUES ('CUS-1001', 'Amina Khan', 'amina@example.com', '+1-555-0101', 'ACTIVE');

INSERT INTO customer (public_id, full_name, email_normalized, phone, status)
VALUES ('CUS-1002', 'Ravi Singh', 'ravi@example.com', '+1-555-0102', 'PROSPECT');

INSERT INTO account (account_number, customer_id, account_type, balance, currency)
SELECT 'ACCT-1001-01', customer_id, 'CHECKING', 2500.00, 'CAD'
FROM customer WHERE public_id = 'CUS-1001';

INSERT INTO address (customer_id, address_type, line1, city, region, postal_code, country_code)
SELECT customer_id, 'HOME', '100 Maple St', 'Toronto', 'ON', 'M5V 2T6', 'CA'
FROM customer WHERE public_id = 'CUS-1001';

INSERT INTO customer_status_history (
  customer_id, old_status, new_status, changed_by, reason, correlation_id
)
SELECT customer_id, 'PROSPECT', 'ACTIVE', 'lab37', 'Activation', 'lab-request-001'
FROM customer WHERE public_id = 'CUS-1001';

COMMIT;
```

**What to notice:** Match names, IDs, and failure behavior from the scenario — instructors check these.

---

## Implementation Steps

Complete each step in order. Paths assume `~/java-bootcamp/examples/lab37-crm`.

---

### Step 1 — Capture ER cardinalities

**Why:** Wrong optionality (e.g., forcing an account) breaks PROSPECT onboarding for Ravi.

**Do this:** In `database/design-decisions.md` and optional mermaid:

```text
Customer 1 ---- 0..* Account
Customer 1 ---- 0..* Address
Customer 1 ---- 0..* StatusHistory
```

Document delete rules (RESTRICT vs CASCADE) you choose and why history is never updated in place.

**Expected result:** ER shows optional many relationships; Ravi-without-account is valid.

**If it fails:** Mandatory account drawn → fix to `0..*`.

---

### Step 2 — Choose stable identifiers

**Why:** Surrogate keys churn; public CRM ids (`CUS-1001`) must remain immutable API identifiers.

**Do this:** Document:

```text
customer_id        — PostgreSQL identity surrogate PK
public_id          — immutable business id (CUS-1001)
email_normalized   — unique lookup (lowercased)
account_number     — unique business account identifier
```

Save `er-diagram.png` or mermaid in `database/`.

**Expected result:** Identifiers and delete rules documented before DDL.

**If it fails:** Using email as PK → reject; emails change.

---

### Step 3 — Connect to shared PostgreSQL (preferred)

**Why:** This cohort uses a shared PostgreSQL service with a per-student schema. Local Docker is only a fallback if the instructor allows it.

**Do this (shared — primary):**

1. From the instructor connection sheet, record host, port `5432`, database, username/schema, and password in a local `.env` that is **gitignored**.
2. Test connectivity:

```bash
# Example — replace with your assigned values
psql "host=$CRM_DB_HOST port=5432 dbname=crm user=crm_app" -c 'select version();'
```

**Optional local Docker fallback (only if instructor allows):**

```bash
cd ~/java-bootcamp/examples/lab37-crm
mkdir -p database docs ~/java-bootcamp/notes/screenshots/lab-37

docker run -d --name crm-postgres \
  -p 5432:5432 \
  -e POSTGRES_PASSWORD='LabOnly_Strong1' \
  -e POSTGRES_USER=crm_app -e POSTGRES_DB=crm -v crm-postgres-data:/var/lib/postgresql/data \
  postgres:17
```

Wait until logs show database ready (often several minutes):

```bash
docker logs -f crm-postgres
# look for: database system is ready to accept connections
```

Connect to crm database / assigned schema with psql/pgAdmin as system using the lab password.

**Expected result:** Postgres ready on database `crm` / assigned schema; port 5432 accepting connections.

**If it fails:** Cannot reach shared host → check VPN/firewall/instructor sheet. OOM → increase Docker memory. Name conflict → `docker rm -f crm-postgres` only if you accept reset (volume may persist).

---

### Step 4 — Create the least-privileged user

**Why:** App credentials with DBA turn every SQL injection into total loss.

**Do this:** As a privileged user on crm database / assigned schema, run `database/01_create_user.sql`:

```sql
-- Run as instructor admin / postgres (shared service); adjust names per student
CREATE USER crm_app WITH PASSWORD 'CrmLab_Strong1';
CREATE SCHEMA IF NOT EXISTS crm_app AUTHORIZATION crm_app;
GRANT CONNECT ON DATABASE crm TO crm_app;
GRANT USAGE, CREATE ON SCHEMA crm_app TO crm_app;
-- Do NOT grant superuser or CREATEDB without instructor approval.
```

Reconnect as `crm_app` with `search_path=crm_app`. Confirm you cannot drop unrelated schemas.

**Expected result:** `CRM_APP` created without DBA role; can create tables in its schema.

**If it fails:** Insufficient privileges → run as the instructor DB admin / postgres superuser. Password complexity → strengthen quotes.

---

### Step 5 — Create CUSTOMER

**Why:** Status/email constraints at the database prevent corrupt API writes.

**Do this:** In `database/02_schema.sql` (full script continues in later steps):

```sql
CREATE TABLE customer (
  customer_id        BIGINT GENERATED BY DEFAULT AS IDENTITY,
  public_id          VARCHAR(36) NOT NULL,
  full_name          VARCHAR(150) NOT NULL,
  email_normalized   VARCHAR(254) NOT NULL,
  phone              VARCHAR(30),
  status             VARCHAR(20) DEFAULT 'PROSPECT' NOT NULL,
  version_no         INTEGER DEFAULT 0 NOT NULL,
  created_at         TIMESTAMPTZ DEFAULT CURRENT_TIMESTAMP NOT NULL,
  updated_at         TIMESTAMPTZ DEFAULT CURRENT_TIMESTAMP NOT NULL,
  CONSTRAINT pk_customer PRIMARY KEY (customer_id),
  CONSTRAINT uk_customer_public UNIQUE (public_id),
  CONSTRAINT uk_customer_email UNIQUE (email_normalized),
  CONSTRAINT ck_customer_status CHECK (
    status IN ('PROSPECT', 'ACTIVE', 'SUSPENDED', 'CLOSED')
  )
);
```

**Expected result:** `CUSTOMER` table and named constraints created under `CRM_APP`.

**If it fails:** Identity syntax unsupported → check PostgreSQL version. Name length → use quoted identifiers sparingly.

---

### Step 6 — Create ACCOUNT

**Why:** Binary floating types corrupt money; FK must enforce customer existence.

**Do this:** Append to `02_schema.sql`:

```sql
CREATE TABLE account (
  account_id     BIGINT GENERATED BY DEFAULT AS IDENTITY,
  account_number VARCHAR(34) NOT NULL,
  customer_id    BIGINT NOT NULL,
  account_type   VARCHAR(20) NOT NULL,
  status         VARCHAR(20) DEFAULT 'OPEN' NOT NULL,
  balance        NUMERIC(19, 2) DEFAULT 0 NOT NULL,
  currency       CHAR(3) DEFAULT 'CAD' NOT NULL,
  opened_at      TIMESTAMPTZ DEFAULT CURRENT_TIMESTAMP NOT NULL,
  CONSTRAINT pk_account PRIMARY KEY (account_id),
  CONSTRAINT uk_account_number UNIQUE (account_number),
  CONSTRAINT fk_account_customer FOREIGN KEY (customer_id)
    REFERENCES customer (customer_id),
  CONSTRAINT ck_account_type CHECK (
    account_type IN ('CHECKING', 'SAVINGS', 'CREDIT')
  ),
  CONSTRAINT ck_account_status CHECK (
    status IN ('OPEN', 'CLOSED', 'FROZEN')
  )
);
```

**Expected result:** `ACCOUNT` uses `NUMERIC(19,2)` and valid FK to `CUSTOMER`.

**If it fails:** Using `double precision (forbidden for money)` → replace with `NUMERIC(19,2)`. FK errors → create CUSTOMER first.

---

### Step 7 — Create ADDRESS

**Why:** Repeating address columns on CUSTOMER blocks multiple typed addresses.

**Do this:**

```sql
CREATE TABLE address (
  address_id   BIGINT GENERATED BY DEFAULT AS IDENTITY,
  customer_id  BIGINT NOT NULL,
  address_type VARCHAR(20) NOT NULL,
  line1        VARCHAR(100) NOT NULL,
  line2        VARCHAR(100),
  city         VARCHAR(80) NOT NULL,
  region       VARCHAR(80),
  postal_code  VARCHAR(20),
  country_code CHAR(2) DEFAULT 'CA' NOT NULL,
  CONSTRAINT pk_address PRIMARY KEY (address_id),
  CONSTRAINT fk_address_customer FOREIGN KEY (customer_id)
    REFERENCES customer (customer_id),
  CONSTRAINT ck_address_type CHECK (
    address_type IN ('HOME', 'WORK', 'BILLING', 'OTHER')
  )
);
```

**Expected result:** `ADDRESS` supports multiple typed addresses per customer.

**If it fails:** Missing FK → add. Over-long CHAR → use VARCHAR(n) lengths that match UI constraints.

---

### Step 8 — Create status history (append-only)

**Why:** Overwriting status without history loses auditability for Amina/Ravi transitions.

**Do this:**

```sql
CREATE TABLE customer_status_history (
  history_id   BIGINT GENERATED BY DEFAULT AS IDENTITY,
  customer_id  BIGINT NOT NULL,
  old_status   VARCHAR(20),
  new_status   VARCHAR(20) NOT NULL,
  changed_by   VARCHAR(100) NOT NULL,
  reason       VARCHAR(200),
  correlation_id VARCHAR(64),
  changed_at   TIMESTAMPTZ DEFAULT CURRENT_TIMESTAMP NOT NULL,
  CONSTRAINT pk_cust_status_hist PRIMARY KEY (history_id),
  CONSTRAINT fk_hist_customer FOREIGN KEY (customer_id)
    REFERENCES customer (customer_id)
);
```

Do not update history rows in app design—insert only.

**Expected result:** History accepts ordered append-only transitions with optional `lab-request-001` correlation.

**If it fails:** Table name too long for older limits → shorten constraint names (already done above).

---

### Step 9 — Add relationship indexes

**Why:** Unindexed FKs cause locks and slow timeline queries as accounts grow.

**Do this:**

```sql
CREATE INDEX ix_account_customer ON account (customer_id);
CREATE INDEX ix_address_customer ON address (customer_id);
CREATE INDEX ix_history_customer_time
  ON customer_status_history (customer_id, changed_at);
```

Avoid duplicating unique indexes (`public_id` already unique).

**Expected result:** FK/timeline queries can use indexes (`EXPLAIN PLAN` optional evidence).

**If it fails:** SQLSTATE/01408 duplicate index → skip redundant unique column indexes.

---

### Step 10 — Seed representative records

**Why:** UI/API fixtures must match DB public ids for end-to-end stories later.

**Do this:** `database/03_seed.sql`:

```sql
INSERT INTO customer (public_id, full_name, email_normalized, phone, status)
VALUES ('CUS-1001', 'Amina Khan', 'amina@example.com', '+1-555-0101', 'ACTIVE');

INSERT INTO customer (public_id, full_name, email_normalized, phone, status)
VALUES ('CUS-1002', 'Ravi Singh', 'ravi@example.com', '+1-555-0102', 'PROSPECT');

INSERT INTO account (account_number, customer_id, account_type, balance, currency)
SELECT 'ACCT-1001-01', customer_id, 'CHECKING', 2500.00, 'CAD'
FROM customer WHERE public_id = 'CUS-1001';

INSERT INTO address (customer_id, address_type, line1, city, region, postal_code, country_code)
SELECT customer_id, 'HOME', '100 Maple St', 'Toronto', 'ON', 'M5V 2T6', 'CA'
FROM customer WHERE public_id = 'CUS-1001';

INSERT INTO customer_status_history (
  customer_id, old_status, new_status, changed_by, reason, correlation_id
)
SELECT customer_id, 'PROSPECT', 'ACTIVE', 'lab37', 'Activation', 'lab-request-001'
FROM customer WHERE public_id = 'CUS-1001';

COMMIT;
```

Verify:

```sql
SELECT public_id, status FROM customer ORDER BY public_id;
SELECT c.public_id, a.account_number, a.balance
FROM customer c LEFT JOIN account a ON a.customer_id = c.customer_id;
```

**Expected result:** `CUS-1001` has account; `CUS-1002` has none; history row for Amina with `lab-request-001`.

**If it fails:** Unique violation on re-seed → run drop or delete first. Wrong status → check constraint list.

---

### Step 11 — Run negative constraint tests

**Why:** Green seeds alone do not prove checks/uniques/FKs.

**Do this:** `database/04_verify.sql` using savepoints:

```sql
SAVEPOINT negative_test;

-- invalid status
INSERT INTO customer (public_id, full_name, email_normalized, status)
VALUES ('CUS-X', 'Bad Status', 'bad@example.com', 'UNKNOWN');
-- expect SQLSTATE/02290

ROLLBACK TO SAVEPOINT negative_test;
SAVEPOINT negative_test;

-- duplicate email
INSERT INTO customer (public_id, full_name, email_normalized, status)
VALUES ('CUS-DUPE', 'Dupe', 'amina@example.com', 'PROSPECT');
-- expect SQLSTATE/00001

ROLLBACK TO SAVEPOINT negative_test;
SAVEPOINT negative_test;

-- orphan account FK
INSERT INTO account (account_number, customer_id, account_type, balance)
VALUES ('ACCT-ORPHAN', 999999, 'CHECKING', 0);
-- expect SQLSTATE/02291

ROLLBACK TO SAVEPOINT negative_test;
COMMIT; -- no net change
```

Record SQLSTATE / error codes in notes.

**Expected result:** SQLSTATE/02290 / 00001 / 02291 appear; seeds remain intact after rollbacks.

**If it fails:** Autocommit tools → ensure rollback works. Constraint unnamed → still fails but name evidence weaker; keep named constraints.

---

### Step 12 — Clean up in dependency order + evidence pack

**Why:** Wrong drop order fails; unreproducible schema blocks peers.

**Do this:** `database/05_drop.sql`:

```sql
DROP TABLE customer_status_history CASCADE CONSTRAINTS PURGE;
DROP TABLE address CASCADE CONSTRAINTS PURGE;
DROP TABLE account CASCADE CONSTRAINTS PURGE;
DROP TABLE customer CASCADE CONSTRAINTS PURGE;
```

Re-run `02_schema.sql` + `03_seed.sql` from empty to prove repeatability. Complete Failure Experiments. Screenshot DESCs and seed SELECTs. Document connect strings **without** committing real passwords (use `.env.example`).

Optional stop (keep volume unless resetting):

```bash
docker stop crm-postgres
```

**Expected result:** Cleanup succeeds; schema recreates from empty; README runbook complete; `git status` clean of secrets/volumes.

**If it fails:** errors on drop → children first. See Troubleshooting.

---

## Implementation Checkpoints

### Checkpoint A — Design + runtime

_Mark **Pass** or **Fail** in your lab notes._

| # | Confirm | Your notes |
| - | ------- | ---------- |
| 1 | ER cardinalities + identifier decisions documented | Pass / Fail |
| 2 | PostgreSQL container ready on crm database / assigned schema with volume | Pass / Fail |
| 3 | `CRM_APP` least-privilege user created | Pass / Fail |

### Checkpoint B — Schema

_Mark **Pass** or **Fail** in your lab notes._

| # | Confirm | Your notes |
| - | ------- | ---------- |
| 1 | CUSTOMER / ACCOUNT / ADDRESS / HISTORY DDL with named constraints | Pass / Fail |
| 2 | `NUMERIC(19,2)` money; TIMESTAMPTZ audit columns | Pass / Fail |
| 3 | FK indexes created | Pass / Fail |

### Checkpoint C — Data + proofs

_Mark **Pass** or **Fail** in your lab notes._

| # | Confirm | Your notes |
| - | ------- | ---------- |
| 1 | Seed Amina `CUS-1001` (account) and Ravi `CUS-1002` (no account) | Pass / Fail |
| 2 | History correlation `lab-request-001` present | Pass / Fail |
| 3 | Negative ORA tests recorded; drop/recreate works | Pass / Fail |

### Checkpoint D — Hygiene

_Mark **Pass** or **Fail** in your lab notes._

| # | Confirm | Your notes |
| - | ------- | ---------- |
| 1 | Passwords only in local env / Docker—not Git | Pass / Fail |
| 2 | Design notes + screenshots | Pass / Fail |
| 3 | README documents connect + script order | Pass / Fail |

---

## Reference Commands, Configuration, and Code

### Docker

```powershell
docker run -d --name crm-postgres -p 5432:5432 `
  -e POSTGRES_PASSWORD=LabOnly_Strong1 `
  -e POSTGRES_USER=crm_app -e POSTGRES_DB=crm -v crm-postgres-data:/var/lib/postgresql/data `
  postgres:17
```

### Commands

```bash
cd ~/java-bootcamp/examples/lab37-crm
docker ps
docker logs crm-postgres --tail 100
# run SQL scripts via psql / pgAdmin as CRM_APP
git status
```

## Failure Experiments

| # | Experiment | Observe | Restore |
| - | ---------- | ------- | ------- |
| 1 | Insert status `UNKNOWN` | SQLSTATE/02290 | Rollback; keep check |
| 2 | Duplicate `amina@example.com` | SQLSTATE/00001 | Rollback |
| 3 | Account for missing customer_id | SQLSTATE/02291 | Rollback |
| 4 | Use `double precision (forbidden for money)` for balance briefly | Document precision risk | Restore NUMERIC(19,2) |
| 5 | Drop CUSTOMER before children | ORA dependency error | Drop children first |

---

## Troubleshooting

| Symptom | Likely cause | Fix |
| ------- | ------------ | --- |
| Container never ready | Slow first boot / memory | Wait; raise Docker RAM; check logs |
| Cannot connect to shared Postgres | VPN / wrong host / firewall | Re-check instructor connection sheet |
| SQLSTATE/01017 | Wrong password/service | crm database / assigned schema service; reset lab pwd carefully |
| SQLSTATE/00955 name exists | Re-run without drop | Run `05_drop.sql` first |
| SQLSTATE/02292 child records | Delete/drop order | Children before parent |
| Listener refuse | Port 5432 busy | Stop other PostgreSQL; change publish port |
| Quota exceeded | Small quota | Raise QUOTA on USERS |
| FLOAT/double for money | Rounding risk | Use NUMERIC/DECIMAL |

## Security and Production Review

Optional — jot brief notes in your README if useful for your progress check (not a separate essay):

1. Which inputs are untrusted (any SQL from apps; never expose DB to browser)?
2. Where are authn/authz/validation enforced (DB constraints + app authz)?
3. Which values are sensitive—DB passwords, PII—and where stored?

---


## Cleanup

Capture evidence first.

```bash
# optional: stop container but keep volume for next session
docker stop crm-postgres

# full reset (destructive):
# docker rm -f crm-postgres
# docker volume rm crm-postgres-data
```

Remove lab passwords from shell history where practical. Recheck `git status`.

**Keep `lab37-crm` scripts**—**Lab 39** (JPA/Flyway) should map these table/column names rather than inventing a parallel model.


## Reflection Questions

Write **1–3 sentence** answers (not essays):

1. Which design decision most affected correctness?
2. What evidence proves the implementation works?
3. Which failure was hardest to diagnose?

---


