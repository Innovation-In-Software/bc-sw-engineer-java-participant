# Capstone Progress Check-In — participant guide

**For candidates / teams only.** This is not the final capstone.

**Form you fill:** the shared Google Doc your instructor opens for your team (from [Java_Software_Engineer_Capstone_Progress_Check_In.docx](Java_Software_Engineer_Capstone_Progress_Check_In.docx)).

This guide explains that Google Doc: when setup is ready, what to type, and what the terms mean.

---

## 1. Confirm setup is ready (do this first)

Do **not** start filling the check-in until both lists below are true. If something fails, message your instructor — do not download a private Word copy and work there.

### A. Your team Google Doc is ready

You should have received a Google Doc named like `Team A — Capstone Progress Check-In` (or Team B / C / D).

| Check | Ready looks like |
| --- | --- |
| ☐ You have the **link** from your instructor | Opens in the browser as a Google Doc, not an email attachment you edit alone |
| ☐ The **title** matches your team | `Team A`, `Team B`, `Team C`, or `Team D` — Capstone Progress Check-In |
| ☐ You can **type** in it | Cream-colored cells accept text. If you can only comment or view, sharing is not finished |
| ☐ **All four** teammates open the **same** link | One shared doc. Four private copies is not ready |
| ☐ Instructors can see it | You do not email the file. Saving in this Google Doc is the update |

**Not ready:** you only have the `.docx` from GitHub and no team Google Doc link; you are asked to “make your own copy”; you cannot edit; two teammates have different documents.

### B. Your capstone workspace is ready

The check-in points at evidence in your repo. The Google Doc is empty until that workspace exists.

| Check | Ready looks like |
| --- | --- |
| ☐ Lab 0 environment is in place | JDK **21**, Maven, Node, Docker, Git — same machine you used for Weeks 1–5 |
| ☐ Bootcamp folder exists | `~/java-bootcamp` (macOS/Linux) or `%USERPROFILE%\java-bootcamp` (Windows) |
| ☐ Team Git repository exists | You have a clone URL to paste into Section 1 of the check-in |
| ☐ You can open the CRM project | `customer-management-platform` (or the path your instructor named) opens in IntelliJ or VS Code |
| ☐ Weeks 1–5 are far enough along | You can start **Lab 48** (plan). You do not need Labs 49–52 done yet |

Quick smoke (from your project / lab folder; adjust if your instructor gave a different path):

```text
java -version          → 21
mvn -version           → Maven, Java 21
git status
```

If `java -version` is not 21, or you have no team repo URL, **setup is not ready** — fix that before Checkpoint 1.

When **A** and **B** are both true, continue. Fill Section 1 and roles once (Step 0 below), then use the three checkpoints.

---

## 2. What this is (and what it is not)

| This check-in **is** | This check-in **is not** |
| --- | --- |
| A short **progress tracker** so the team stays on schedule | The **final capstone submission** |
| Updated **three times** in the **same** shared Google Doc | A new report, essay, or email each time |
| Proof you are moving from plan → working slice → ready to present | A replacement for Labs 48–52, the repo, or the defense packet |
| About 10–15 minutes of typing per checkpoint | A writing assignment that is scored on length |

**What is scored at the end:** the live demo, the evidence in the Git repository, and the defense packet. The check-in only shows whether you are on track.

**Final work lives in:** the team Git repository, Labs 48–52, and the `defense/` packet (slides, demo script, evidence index).

Work **only** in the shared Google Doc. Type in the cream-colored cells.

---

## 3. Your team

Tick **your** team in the Google Doc. Do not change members unless your instructor approves it.

| Team | Members |
| --- | --- |
| **A** | ByongChul Hur, Cole Hansen, Michael McGrath, Christopher McEnroe |
| **B** | Luke Pupilli, Timoth Mooney, Himank Juttiga, Chase Bulkin |
| **C** | Tyler Shapiro, Stephen Anderson, Jack Heckenlaible, Austin Bustos |
| **D** | Nicholas Smith, Ethan Pacifico, Aidan Conroy, Jimmy Le-Nguyen |

---

## 4. Team steps

### Step 0 — Kickoff (fill once, after setup is ready, before 17 August)

Do this the first time you open the Google Doc. Do **not** repeat it at later checkpoints except to correct a URL or owner name.

1. Tick **your** team in **Section 1**.
2. Fill **repository and working agreement**:
   - Git repository URL
   - default working branch (for example `lab/48-crm`)
   - where evidence lives (`docs/`, `reports/`, `defense/`, screenshot folder)
   - team chat / stand-up time
   - leave demo customer IDs as given (**CUS-1001**, **CUS-1002**, **lab-request-001**)
3. Fill **Section 2 — Roles**: one **owner** and one **backup** per swimlane. These are work lanes, not extra job titles. Pair and rotate so everyone can explain any major part at the defense.

### Step 1 — Checkpoint 1 (Monday 17 August) — plan freeze

**On track if:** the plan is no longer moving, Lab 48 artifacts exist, the demo story is chosen (CUS-1001 search → profile → record interaction), and Lab 49 has started (named commit or branch).

1. Update the **Status at a glance** row for checkpoint 1 (RAG + one-line status + Done).
2. Update the **living progress tracker** (Lab 48 rows should be Done or In progress; Lab 49 started).
3. Fill **Checkpoint 1** sections **A–F** (see [Section 5](#5-how-to-fill-a-checkpoint-af)).
4. Stop. Do not create another document.

### Step 2 — Checkpoint 2 (Friday 21 August) — working slice

**On track if:** backend API + Kafka + tests run, the React journey works for CUS-1001 (search → profile → interaction), you can walk the happy path in under five minutes, and you have **UI→DB** proof.

1. Update Status at a glance (checkpoint 2).
2. Update the tracker (Labs 49–50).
3. Fill **Checkpoint 2** sections A–F only. Leave Checkpoint 1 as history.

### Step 3 — Checkpoint 3 (Monday 24 August) — defense ready, then present

**On track if:** pipeline evidence, image digest, deploy + smoke, one negative path, timed demo script, and evidence index with at least five links.

1. Update Status at a glance (checkpoint 3).
2. Update the tracker (Labs 51–52).
3. Fill **Checkpoint 3** sections A–F.
4. Present (10–15 minutes). This check-in is still not the final packet.

### Step 4 — After the presentation (same day)

In **Section 5** of the Google Doc, tick:

- live or recorded demo done
- Q&A notes updated with what was actually asked
- blameless retrospective
- individual reflections (one short note each)
- residual risks still have owners and dates

Point each tick at a path under `defense/` or `docs/`. Then stop.

---

## 5. How to fill a checkpoint (A–F)

Each of the three checkpoints uses the **same** six blocks. Fill only the checkpoint that is due that day.

| Block | What to write | How long |
| --- | --- | --- |
| **A. Snapshot** | Overall **RAG** (G / A / R), one sentence of status, who typed this update, minutes spent | ~2 minutes |
| **B. What we finished** | At most **three** facts. Name the artifact, not the intention. Example: `docs/nfrs.md` has five measurable NFRs. | rest of the 10–15 minutes |
| **C. What we will finish next** | Three concrete outcomes, owner, need-by date | |
| **D. Blockers** | Who is stuck and whether you need help. Leave blank if none. | |
| **E. Honest risks** | Update the Lab 48 risk register rows. Do not rewrite the whole register. | |
| **F. Check-in completed** | Name of who updated the doc, and the date | |

**Evidence column:** a file path (`docs/backlog.md`), a GitHub Actions run URL, a screenshot folder, or a test name. Not a paragraph copied from the lab guide.

Cream-colored cells are the only places you type.

---

## 6. Suggested timeline (what “done” looks like)

Instructional days only. Saturday/Sunday are catch-up if you are Amber or Red — not extra assigned work. If you finish a lab early, start the next one the same day.

**Critical path:** freeze the plan → ship one vertical story (CUS-1001 search → profile → interaction) → prove it with tests → pipeline + digest deploy → 10–15 minute defense with one failure beat.

| When | Lab / focus | Done looks like |
| --- | --- | --- |
| Thu 13 – Fri 14 Aug | **Lab 48** Plan | Context + container docs, measurable NFRs, ADRs started, backlog, risk register, roles, repo identified |
| **Mon 17 Aug ★ CP1** | Plan freeze + **Lab 49** start | Plan frozen; first backend story in progress; check-in updated |
| Tue 18 – Wed 19 Aug | **Lab 49** Backend | Layered Spring Boot API, validation, Kafka produce/consume, happy + failure tests, `docs/backend-demo.md` |
| **Thu 20 – Fri 21 Aug ★ CP2** | **Lab 50** Full stack | CUS-1001 search → profile → interaction; UI→DB proof; check-in updated |
| Fri 21 p.m. – Mon 24 a.m. | **Lab 51** Release | JWT/RBAC negatives, GitHub Actions with tests + SAST, image digest, k3s deploy, smoke + rollback notes |
| **Mon 24 Aug ★ CP3** | **Lab 52** Present | 10–15 min deck, timed demo script, evidence index (≥5 links), one injected failure, Q&A, retro; check-in updated; then present |

Orange columns / ★ in the Gantt chart are the three check-in dates.

---

## 7. Living progress tracker

Update **Status** and **Evidence** only. Do not invent extra rows.

| Status code | Meaning |
| --- | --- |
| **NS** | Not started |
| **IP** | In progress |
| **D** | Done (you can point to evidence) |
| **B** | Blocked |

**Target gate** means “this row should be done by this check-in” (Plan, CP1–CP2, CP2, CP3, or Always).

---

## 8. Status colors (RAG)

Used in **Status at a glance** and in each checkpoint’s section A.

| Code | Color | Meaning |
| --- | --- | --- |
| **G** | Green | On track for the next checkpoint |
| **A** | Amber | At risk — you have written a recovery plan in this check-in |
| **R** | Red | Blocked or you will miss the next gate — ask for help now |

Honest Amber is useful. Inflated Green is not.

---

## 9. Terms and abbreviations

### Check-in and schedule

| Term | Meaning |
| --- | --- |
| **Progress Check-In** | This tracker. Not the final capstone. |
| **Checkpoint (CP)** | One of the three update dates: **CP1** 17 Aug, **CP2** 21 Aug, **CP3** 24 Aug |
| **Plan freeze** | Stop redesigning architecture/backlog; start (or continue) building |
| **Vertical slice / working slice** | One feature cut through the whole stack (UI → API → database → events), not five disconnected demos |
| **Happy path** | The demo journey that succeeds with valid data (CUS-1001 search → profile → interaction) |
| **Negative path / failure beat** | A planned failure you inject in the demo (401/403, invalid transition, broken consumer, failed probe) and recover through code/pipeline — not a silent console edit |
| **Critical path** | The shortest sequence of work that must finish or the presentation slips |
| **Swimlane** | A work lane (architecture, backend, frontend, security, defense), not a formal job title |
| **Owner / backup** | Person accountable for that lane, plus who covers if they are stuck |
| **Stand-up** | Short daily team sync (the doc suggests ~10 minutes) |
| **Blameless retrospective (retro)** | After the demo: what to keep, drop, and try — no blame |
| **Residual risk** | A known leftover risk with an owner and a date |
| **Defense / defense packet** | Lab 52 presentation materials under `defense/` |
| **Evidence index** | A list of claims mapped to artifacts (paths or URLs); at least five links by CP3 |
| **Demo script** | Timed walkthrough (10–15 minutes) so the live demo is repeatable |
| **Q&A** | Questions and answers after the presentation |
| **Rubric** | How the **final** is scored (weights in the last table of the check-in). This check-in is not that score. |

### Labs 48–52 (Week 6)

| Lab | Name | What you produce |
| --- | --- | --- |
| **48** | Planning and architecture | Context/container docs, NFRs, ADRs, backlog, risk register |
| **49** | Backend and messaging | Spring Boot APIs, Kafka events, tests |
| **50** | Frontend and persistence | React UI + PostgreSQL/JPA, UI→DB proof |
| **51** | Security, CI/CD, deployment | JWT/RBAC, pipeline, image digest, k3s, smoke + rollback |
| **52** | Final defense | Deck, demo script, evidence index, Q&A, retro |

### Product and demo data

| Term | Meaning |
| --- | --- |
| **CRM** | Customer Relationship Management — the capstone product (agent-facing customer platform) |
| **CUS-1001** | Synthetic customer **Amina Khan** (ACTIVE). Main demo journey. |
| **CUS-1002** | Synthetic customer **Ravi Singh**. Second fixture; do not use real people. |
| **lab-request-001** | Correlation ID used in logs/metrics so a request can be traced |
| **CAP-12** | Example backlog item for the interaction API (record an interaction). Your frozen story should be this kind of vertical slice. |
| **Synthetic data** | Fake training data only. Never real customer names, emails, or PII. |
| **PII** | Personally identifiable information (real names, emails, phones). Forbidden in Git and in this doc. |

### Architecture and planning (Lab 48)

| Term | Meaning |
| --- | --- |
| **C4 / context / container** | Architecture views: **context** = users and external systems; **container** = deployable pieces (React app, Spring Boot API, database, Kafka) |
| **NFR** | Non-functional requirement — quality goal that is **measurable** (not “fast” or “secure” with no number or test) |
| **ADR** | Architecture Decision Record — a written decision and its consequences (`docs/adrs/`) |
| **Backlog** | Prioritized list of vertical stories (`docs/backlog.md`) |
| **Risk register** | Risks, mitigations, owners, dates (`docs/risk-register.md`) |
| **Trust boundary** | Where the system meets users, networks, or other systems that are not fully trusted |

### Backend, frontend, data (Labs 49–50)

| Term | Meaning |
| --- | --- |
| **API** | Application programming interface — here, the Spring Boot HTTP endpoints |
| **Spring Boot** | Java framework for the backend service |
| **DTO** | Data transfer object — request/response shape, not the database entity |
| **Validation** | Rejecting bad input before it is saved |
| **Layered design** | Controller → service → repository (business rules not dumped in the controller) |
| **Kafka** | Event streaming. **Produce** = publish an event; **consume** = read it. **Versioned** = the event contract has a version so old and new messages can coexist. |
| **Topic** | A named Kafka stream (for example customer or audit events) |
| **JPA** | Java Persistence API — maps Java objects to database tables (Spring Data JPA) |
| **PostgreSQL** | The relational database used in the capstone labs |
| **Migration** | Versioned SQL/schema change so the database can be rebuilt |
| **UI→DB proof** | Evidence the screen and the database agree (query or screenshot after the UI action) |
| **React** | Frontend library for the agent screens |
| **Typed API client** | Frontend calls that match the API contract (types, not ad-hoc `fetch` with mystery fields) |

### Security, delivery, operations (Lab 51)

| Term | Meaning |
| --- | --- |
| **JWT** | JSON Web Token — the signed token the API checks for login |
| **RBAC** | Role-based access control (for example AGENT vs ADMIN) |
| **401** | Unauthorized — not logged in (or token missing/invalid) |
| **403** | Forbidden — logged in but the role is not allowed |
| **CI/CD** | Continuous integration / continuous delivery — automated build, test, and (gated) deploy |
| **GitHub Actions** | The CI system used in the labs (pipeline runs in GitHub) |
| **SAST** | Static application security testing — scan source for vulnerabilities before release |
| **Gate** | A pipeline step that must pass (tests, SAST) or the change does not promote |
| **Docker / image** | Packaged runnable build of the app |
| **Digest** | Immutable hash identity of a container image (not a floating `latest` tag) |
| **k3s** | Lightweight Kubernetes used in the labs to deploy |
| **Manifest** | Kubernetes YAML that describes how to run the app |
| **Smoke test** | Quick check after deploy that the service is actually up |
| **Rollback** | Documented way to go back to the previous working release |
| **Actuator** | Spring Boot health/metrics endpoints |
| **Observability** | Ability to answer: did it succeed, what is the correlation ID, is it healthy, what failed |
| **Secrets / `.env` / kubeconfig** | Credentials and cluster files. Never commit them. |

### Tracker and evidence shortcuts

| Term in the tracker | Meaning |
| --- | --- |
| **mvn test** | Maven command that runs automated tests; paste the result or report path as evidence |
| **Actions run URL** | Link to a specific GitHub Actions workflow run |
| **Claim → artifact** | “We did X” mapped to a file, URL, or screenshot another engineer can open |

---

## 10. What the final will be judged on (reminder only)

This table is **not** a score for the check-in. It is what the live demo and evidence packet will be judged on.

| Criterion | Weight | Where the check-in points you |
| --- | --- | --- |
| Full-stack architecture & planning | 15% | CP1 + tracker Lab 48 |
| Backend services & messaging | 20% | CP1–CP2 + Lab 49 |
| Frontend & persistence | 15% | CP2 + Lab 50 |
| CI/CD, containers & deployment | 15% | CP3 + Lab 51 |
| Testing & observability | 10% | Tracker tests + failure beat |
| Demonstration scenario & recovery | 10% | CP3 demo script |
| Security & operational hygiene | 5% | JWT negatives + no-secrets row |
| Documentation & repository quality | 5% | Evidence paths |
| Presentation & communication | 5% | CP3 + after-presentation ticks |

A green demo without evidence does not count.

---

## 11. Related files

| File | Purpose |
| --- | --- |
| [Java_Software_Engineer_Capstone_Progress_Check_In.docx](Java_Software_Engineer_Capstone_Progress_Check_In.docx) | Template for the Google Doc you fill |
| [Java_Software_Engineer_Capstone.docx](Java_Software_Engineer_Capstone.docx) | Capstone **project brief** (what to build) |
| [Java_Software_Engineer_Capstone_Rubric.docx](Java_Software_Engineer_Capstone_Rubric.docx) | How the **final** is evaluated |
| [WEEK-LABS-INDEX.md](WEEK-LABS-INDEX.md) | Week 6 labs, schedule, artifacts |
| [CAPSTONE-BRIEF-AND-RUBRIC.md](CAPSTONE-BRIEF-AND-RUBRIC.md) | Brief + rubric in Markdown |
