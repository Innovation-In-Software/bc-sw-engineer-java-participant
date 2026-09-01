# Capstone defense — PowerPoint preparation template

**Who this is for:** Teams presenting Northstar CRM to guests who did **not** teach the bootcamp.  
**Target:** about **20 minutes** of *speaking*, then Q&A. That is **20 slides you actually show**, not 10 packed walls of text.  
**How to use:** One PowerPoint (or Google Slides) slide per section below. Fill every `_____`. Export to `defense/final-presentation.pdf`. Keep this file as speaker copy.

**Rule:** No claim on a slide unless it has a row in `defense/evidence-index.md`. If you did not run it, write **Not evidenced** — do not invent a digest, a pipeline run, or a cluster.

---

## Why 20 slides (not 10)

Ten slides forces architecture, five stack decisions, security, release, tests, and performance onto two or three screens. Guests cannot read that. **Split ideas.** Keep each slide to **one idea, at most five bullets**, ~30–45 seconds of talk — except the live demo, which is **not** a slide talk.

Hidden **appendix** slides (A1–A4) are extra. Do not present them unless someone asks.

---

## Timing (do not exceed 20 minutes before Q&A)

| Block | Minutes | Slides |
| ----- | ------: | ------ |
| Title, problem, scope | 3 | 1–4 |
| Architecture | 2 | 5–6 |
| Stack decisions | 3 | 7–10 |
| Demo map + **live product** | 8–10 | 11–12 (12 is a title card only) |
| Security, release, quality, performance, gaps | 4 | 13–18 |
| Retro + invite questions | 1 | 19–20 |
| **Appendix** | 0 unless asked | A1–A4 |

Assign **Narrator** (slides), **Driver** (UI), **Verifier** (SQL / API / logs) before you open PowerPoint.

---

## Slide design (so guests can follow)

- One idea per slide; **at most 5 bullets**; large type.
- Title in business language (“Why the database is PostgreSQL”), not internal codes.
- One diagram or screenshot per slide. Crop; no terminal dump of secrets.
- Footer: team name · date · “Synthetic training data only”.
- Dark text on light background. You will project in a bright room.
- Do **not** put lab numbers, week numbers, or homework filenames on **titles**. Guests do not know them. Paths belong in speaker notes.

### Never put on a slide

- Live JWT, passwords, kubeconfigs, `.env`, connection strings
- Real emails or real customer names
- An image digest you never produced
- `:latest` as your only release identity
- Blame (“X was late”) — residual risk has an **owner** and a **next step**

---

## Slide 1 — Title (~20 s)

**Title:** Northstar CRM — customer management platform

**On the slide:**

- Team name: `_____`
- Roles on the call: Narrator `_____` · Driver `_____` · Verifier `_____`
- Today: 20-minute delivery review · synthetic training data only

**Visual:** product name only. No architecture.

**Speaker:** `_____`

---

## Slide 2 — Agenda (~20 s)

**Title:** What we will cover

**On the slide (checklist, not paragraphs):**

1. Problem and scope
2. How the system is put together
3. Why this stack
4. Live walkthrough (most of the time)
5. Security, release, quality, performance
6. What is still open · questions

**Say:** We will spend the bulk of the time in the running system, not in slides.

---

## Slide 3 — Problem / outcome (~45 s)

**Title:** `_____` (example: *Agents need a durable customer interaction record*)

**On the slide (3 bullets max):**

1. Who uses it: `_____`
2. What they must accomplish in one sitting: `_____`
3. What “done” looks like for this review: `_____`

**Say (≤20 s):** `_____`

**Evidence:** `docs/architecture/context.md`  
**Speaker:** `_____`

---

## Slide 4 — In scope / out of scope (~45 s)

**Title:** What is in, what is out

**In:** React agent workspace · Spring Boot API · PostgreSQL · Kafka events · JWT roles · container / Kubernetes evidence **as we actually have it**

**Out:** `_____` (billing, company identity provider, multi-region, …)

**Say:** We will not import real customer data.

**Evidence:** `docs/backlog.md`  
**Speaker:** `_____`

---

## Slide 5 — People in the demo (~45 s)

**Title:** Who you will see (synthetic only)

| Id | Person | What we will show |
| -- | ------ | ----------------- |
| CUS-1001 | Amina Khan | Search → profile → save a note |
| CUS-1002 | Ravi Singh | Prospect → Active (privileged role) |
| CUS-9999 | (none) | Not-found / error path |
| lab-request-001 | (correlation) | Same id on API, logs, database, event |

**Speaker:** `_____`

---

## Slide 6 — Architecture: who talks to whom (~1 min)

**Title:** Context — users and systems

**On the slide:** C4 **context** picture only.

**Say:** Agents use the React app. The app calls our API. The API is the system of record and the integration edge.

**Evidence:** `docs/architecture/context.md`  
**Speaker:** `_____`

---

## Slide 7 — Architecture: inside the platform (~1 min)

**Title:** Containers — request path

**On the slide:** C4 **containers** (or a left-to-right flow): React → Spring Boot → PostgreSQL, and Spring Boot → Kafka. Pipeline / Kubernetes as a second row if it fits without clutter.

**Three sentences:**

1. Browser talks to `_____` over REST, not to the database.
2. The API writes `_____` then publishes `_____`.
3. We ship `_____` → image → cluster (or labeled gap).

**Do not** read every arrow.

**Evidence:** `docs/architecture/container.md`  
**Speaker:** `_____`

---

## Slide 8 — Why PostgreSQL (~40 s)

**Title:** System of record

| We chose | We rejected | Because |
| -------- | ----------- | ------- |
| PostgreSQL | `_____` | `_____` |

**Say:** Agents need ACID writes and a timeline by customer, not a file dump.

**Evidence:** `docs/adrs/` (PostgreSQL decision)  
**Speaker:** `_____`

---

## Slide 9 — Why Kafka, and persist first (~45 s)

**Title:** Events without lying to the agent

| We chose | We rejected | Because |
| -------- | ----------- | ------- |
| Versioned Kafka event + dead-letter | `_____` | `_____` |
| Persist the row, **then** publish | Publish first | `_____` |

**Say:** A successful save means a database row. If the broker is down, we do not pretend the event already left.

**Evidence:** Kafka + consistency decision records  
**Speaker:** `_____`

---

## Slide 10 — Why JWT on the API (~40 s)

**Title:** The browser is not the lock

| We chose | We rejected | Because |
| -------- | ----------- | ------- |
| JWT + roles on the **API** | Roles only in React | `_____` |

**Say:** Hiding a button is not authorization. We will show denied calls, not only a missing menu.

**Evidence:** auth decision record  
**Speaker:** `_____`

---

## Slide 11 — Why a pinned container (~40 s)

**Title:** Same bits we tested

| We chose | We rejected | Because |
| -------- | ----------- | ------- |
| Pinned image on Kubernetes | `:latest` only / leftover unrelated cluster | `_____` |

**Honesty if needed:** `_____` (example: *Not pushed to a registry; local image id only.*)

**Evidence:** deploy decision record · `reports/artifact-manifest.md`  
**Speaker:** `_____`

---

## Slide 12 — Demo map (~30 s)

**Title:** What you are about to see

1. Sign in (agent)
2. Search Amina · open timeline
3. Record note · correlation `lab-request-001`
4. Prove the **PostgreSQL** row
5. Prove the **Kafka** event (or labeled fallback)
6. Deny path: no token / wrong role / unknown customer

**Roles:** Driver `_____` · Verifier `_____` · Narrator stays quiet unless the Driver stalls.

**Evidence:** `defense/demo-script.md`

---

## Slide 13 — Live demo title card (~10 s, then **screens**)

**Title:** Live walkthrough

**On the slide:** UI address · “Synthetic accounts only” · “We will not paste tokens.”

**Then stop presenting slides.** Drive the app for **8–10 minutes**. If live fails, open `reports/test-evidence.md` or a **scrubbed** screenshot — say it is a fallback.

**Do not** tour extra screens “while we are here.”

---

## Slide 14 — Security: login and roles (~45 s)

**Title:** Who may write, who may promote

| Guest concern | Our control | Evidence |
| ------------- | ----------- | -------- |
| Anyone can write notes | Unauthenticated create is denied | `_____` |
| Agent does manager work | Wrong role is denied | `_____` |
| UI is the lock | Roles enforced in the API | auth decision |

**Speaker:** `_____`

---

## Slide 15 — Security: hygiene (~40 s)

**Title:** Tokens, secrets, scans

- Token never on slides; not left in the evidence pack
- Secrets: example in Git, real values **not** in Git — `_____`
- Scanner (SAST / image / dependencies): found `_____` · fixed `_____` · accepted with owner `_____`

**Evidence:** `docs/threat-model.md` or `reports/`  
**Speaker:** `_____`

---

## Slide 16 — Release: identity and rollback (~45 s)

**Title:** How we know what is running, and how we undo

| Guest concern | Our answer | Evidence |
| ------------- | ---------- | -------- |
| Which bits? | JAR hash and/or image identity | `reports/artifact-manifest.md` |
| `:latest` drift | Pin / import policy we actually used | `k8s/` or gap |
| Bad rollout | Rollback to `_____` | `docs/security-deploy-demo.md` |
| Pipeline | What actually ran: `_____` | `.github/` or gap |

**Speaker:** `_____`

---

## Slide 17 — Quality: tests (~40 s)

**Title:** More than a click-through

- Happy path we automate: `_____`
- Failure path we automate: `_____` (unauthorized, forbidden, not-found, bad payload, …)
- Report or test names: `_____`

**Evidence:** `reports/test-evidence.md`  
**Speaker:** `_____`

---

## Slide 18 — Performance and operability (~45 s)

**Title:** Classroom numbers, not a fake load test

| Metric | Target | How we measured | Honest limit |
| ------ | ------ | ---------------- | ------------ |
| Create-interaction latency | `_____` (e.g. p95 in lab) | `_____` | Laptop/cluster; load test: yes / **no** |
| Review availability | Readiness `UP` | Actuator | `_____` |

If you **did not** load-test, the slide must say so.

**Evidence:** `docs/nfrs.md`  
**Speaker:** `_____`

---

## Slide 19 — Residual risk and retrospective (~45 s)

**Title:** What we would repeat / change

**Open items (owner + next step):**

| Gap | Owner | Next step |
| --- | ----- | --------- |
| `_____` | `_____` | `_____` |
| `_____` | `_____` | `_____` |

**Three spoken bullets:**

- Went well: `_____`
- Change next: `_____`
- (Optional) ask of the organization: `_____`

**Evidence:** `docs/risk-register.md`, `defense/retrospective.md`  
**Speaker:** `_____`

---

## Slide 20 — Questions (~remaining)

**Title:** Questions

**On the slide:** team names · “We will cite evidence, not memory.”

Open **appendix** slides only if asked.

**Evidence:** `defense/technical-q-and-a.md`, `defense/evidence-index.md`

---

## Appendix (hidden — do not present in the 20 minutes)

Keep 3–5 backup slides after slide 20. Duplicate if you have the screenshot; otherwise omit.

| # | Title | Show only if asked |
| - | ----- | ------------------ |
| A1 | SQL proof (scrubbed) | “Is it really in the database?” |
| A2 | Denied call (401 or 403), no token visible | “Is the UI doing security?” |
| A3 | Event payload / topic name | “What went on the bus?” |
| A4 | Pipeline or scan table | “Did you actually scan?” |

---

## After you build the deck

- [ ] **20 slides** in the main deck (plus hidden appendix)
- [ ] Timed rehearsal with a phone clock (demo 8–10 min)
- [ ] Narrator does not talk over the Driver
- [ ] Every shown slide has an evidence path or an explicit non-claim
- [ ] No secrets, no live JWT, no real PII
- [ ] Guest-facing titles (no homework jargon)
- [ ] Export PDF: `defense/final-presentation.pdf`
- [ ] Someone other than the Driver can recover if the UI dies

**PowerPoint / Google Slides:** File → Export → PDF. Put the PDF in `defense/`. Do not commit a huge `.pptx` unless your instructor asks; the PDF is the shareable artifact.
