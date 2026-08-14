# Lab 35: Integrating React with the Spring CRM API

**Module:** 35 — Integrating React with the Spring CRM API  
**Duration:** ~45 minutes (timed path with starter) · Full path: 4–5 Hours

**Primary IDE:** IntelliJ IDEA Community Edition · **Optional IDE:** VS Code

| OS | How-to for this lab |
| -- | ------------------- |
| Windows | [LAB-35-WINDOWS.md](LAB-35-WINDOWS.md) |
| macOS | [LAB-35-MACOS.md](LAB-35-MACOS.md) |

---

## Activity card

| | |
| --- | --- |
| **Time** | ~45 min timed · full path 4–5 h |
| **Checkpoint** | **E** (after Ex 4→2→5→1→3→6) |
| **Must prove** | Typed http/ApiError · list from Spring · abort · CORS notes/tests |
| **Hard gate** | Pre-lab Pass · Spring API + Vite env · no JWT UI required |

### What you will learn

Connect CRM React to Spring JSON APIs with one fetch boundary and honest UX states.

### Enterprise context

Freeze browser↔API contracts (errors, CORS, correlation) before Lab 36 auth.

### Predict

If Vite origin is `:5173` but CORS allows `:3000` — what does the browser show?

### Debug

Duplicate `/api/api` in requests — what joined wrong?

---

## 45-minute timed path (use starter)

> **Pacing reminder:** [PACING.md](../PACING.md) checkpoint **E**. Homework: CORS evil-Origin evidence + 400 field mapping.

In class, use the starter templates so the **core** objectives fit **~45 minutes**. The full Steps below remain for homework / extended depth.

1. Open [`starter/README.md`](starter/README.md).
2. Copy `starter/` into your `java-bootcamp/examples/…` target (see starter README).
3. Fill every `// TODO` / `TODO` — do **not** wait on a perfect prior lab; the starter includes a baseline.
4. Run the starter smoke test; evidence under `notes/screenshots/lab-35/`.
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
| 1 | Typed `ApiError` / `http` / `customersApi` with abortable loads |
| 2 | Distinct loading/empty/data/error UX |
| 3 | Create/update with correlation + duplicate-submit guard |
| 4 | Backend 400 field mapping |
| 5 | Spring CORS allowlist + evil Origin evidence |
| 6 | Response-class tests + green build |
| 7 | Integration notes + screenshots |
| 8 | README runbook (Spring + Vite) |

**Must submit:** the items in the table above (sources + evidence + short notes).

**Do not submit:** `target/`, `node_modules/`, secrets, heap dumps, or a verbatim instructor `solution/`.

## Lab Overview

This Module 35 lab connects the React CRM SPA to the **Spring Boot** customer API: typed `fetch`, normalized `ApiError`, loading/empty/error UX, `AbortController` cancellation, duplicate-submit prevention, backend field-error mapping, restricted CORS, and failure-class tests. In-memory Lab 34 state becomes a cache of server records.

## Learning Objectives

After completing this lab, you will be able to:

* Document the REST (or SOAP-bridge) customer contract with curl evidence
* Configure a public API base URL via Vite env (no secrets in `VITE_*`)
* Write a typed fetch client and normalized `ApiError`
* Render loading, success, empty, and error states distinctly
* Cancel obsolete requests with `AbortController`

## Business Scenario

The CRM React client must talk to Spring Boot over HTTPS/JSON in production. Spring persists to PostgreSQL, may expose REST while optionally bridging SOAP internally, emits Kafka events, and protects outbound calls. This lab wires the **happy path and failure UX** without auth yet (Lab 36).

Leadership freezes:

**No merge of SPA↔API integration without typed fetch, AbortController cleanup, explicit request states, CORS allowlist, and tests for 2xx / 4xx / 5xx / network / abort.**

You own that gate for listing Amina (`CUS-1001`) and Ravi (`CUS-1002`), creating a draft, mapping email 400s, and rejecting `https://evil.example`.

Use these examples consistently:

| ID | Name | Notes |
| -- | ---- | ----- |
| `CUS-1001` | Amina Khan | `ACTIVE` — list/GET fixture |
| `CUS-1002` | Ravi Singh | `PROSPECT` — update fixture |
| `lab-request-001` | — | `X-Correlation-Id` on writes |
| `VITE_API_BASE_URL` | `http://localhost:8080` | public host only (paths include `/api/...`) |

**Security note for evidence.** Never put secrets in `VITE_*` (they ship to the browser). Use fictional PII. Do not commit `.env` with non-example values if your policy forbids it—commit `.env.example` only.

---

## Architecture Context
### NOW (this lab)

```mermaid
flowchart TB
  SPA["React SPA<br/>Vite :5173"] -->|fetch JSON + correlation + AbortSignal| HTTP["http.request / customersApi"]
  HTTP --> API["Spring Boot CRM API :8080<br/>CORS localhost:5173"]
  API --> Svc["Service / repository"]
  UI["UI states: loading / empty / data / error"] -.-> SPA
  Save["saving flag disables double submit"] -.-> SPA
```

## Prerequisites

Prior labs: [33](../../module-33/lab33/LAB-33-GUIDE.md) · [34](../../module-34/lab34/LAB-34-GUIDE.md).

Confirm (Lab 0 tools assumed):

* Lab 34 `crm-ui` builds/tests green
* Spring Boot API on `:8080` (or documented port)
* Node 22+; browser DevTools Network tab
* No secrets committed to Git

### Pre-flight

```bash
java -version
mvn -version
```

## Worked example (read before you code)

Study this pattern once before Step 1. Your job is to apply the same idea in the Steps — do not skip ahead to a full solution.

```bash
cd ~/java-bootcamp/examples
cp -r lab34-crm lab35-crm
# ensure Spring is running, then:
curl -i http://localhost:8080/api/customers
curl -i -X POST http://localhost:8080/api/customers \
  -H "Content-Type: application/json" \
  -H "X-Correlation-Id: lab-request-001" \
  -d "{\"fullName\":\"Amina Khan\",\"email\":\"amina@example.com\",\"phone\":\"+1-555-0101\",\"status\":\"ACTIVE\"}"
```

**What to notice:** Match names, IDs, and failure behavior from the scenario — instructors check these.

---

## Implementation Steps

Complete each step in order. SPA commands assume `~/java-bootcamp/examples/lab35-crm/crm-ui`.

---

### Step 1 — Inspect the API contract

**Why:** Typed clients fail when the assumed JSON shape does not match Spring.

**Do this:**

```bash
cd ~/java-bootcamp/examples
cp -r lab34-crm lab35-crm
# ensure Spring is running, then:
curl -i http://localhost:8080/api/customers
curl -i -X POST http://localhost:8080/api/customers \
  -H "Content-Type: application/json" \
  -H "X-Correlation-Id: lab-request-001" \
  -d "{\"fullName\":\"Amina Khan\",\"email\":\"amina@example.com\",\"phone\":\"+1-555-0101\",\"status\":\"ACTIVE\"}"
```

Confirm list JSON includes (or can seed) `CUS-1001` / `CUS-1002`. Confirm the browser will only need JSON—if a SOAP bridge exists, it stays server-side.

**Expected result:** Documented list/create shapes; 2xx create returns a customer with id; notes capture fields.

**If it fails:** 404 path → fix API base or controller mapping. Connection refused → start Spring first.

---

### Step 2 — Configure the public base URL

**Why:** Hard-coded hosts break laptop vs laptop; secrets in `VITE_*` would ship to every browser.

**Do this:** Add `.env.example`:

```text
VITE_API_BASE_URL=http://localhost:8080
# Never place secrets in VITE_* variables — they are embedded in the client bundle.
```

Copy to local `.env` (gitignored). Read with `import.meta.env.VITE_API_BASE_URL`. Restart Vite after changes.

TypeScript does not know Vite’s `import.meta.env` unless Vite client types are loaded. If you copied Lab 34 (or only pasted `http.ts`), add `src/vite-env.d.ts`:

```typescript
/// <reference types="vite/client" />

interface ImportMetaEnv {
  readonly VITE_API_BASE_URL: string
}

interface ImportMeta {
  readonly env: ImportMetaEnv
}
```

This lab’s `tsconfig.json` also lists `"types": ["vite/client", "vitest/globals"]` so the checker includes Vite’s `ImportMeta.env`. The timed starter already has both files.

**Expected result:** Vite reads `localhost:8080` after restart; `.env.example` committed, secrets absent. `import.meta.env` type-checks (no TS2339).

**If it fails:** Env ignored → restart Vite; confirm `VITE_` prefix. Typo `VITE_API` → match code. Red squiggle `TS2339: Property 'env' does not exist on type 'ImportMeta'` while `console.log(import.meta.env.VITE_API_BASE_URL)` still prints `http://localhost:8080` → runtime is fine; add `src/vite-env.d.ts` (and `"vite/client"` in `compilerOptions.types`). Reload the TypeScript / IDE window if the error lingers.

---

### Step 3 — Create normalized `ApiError`

**Why:** Callers must not parse ad-hoc `response.text()` in every component.

**Do this:** Match starter `src/api/ApiError.ts`: `ApiErrorKind = 'network' | 'http' | 'abort' | 'parse'` and `new ApiError(message, kind, status?)`. Network failures become `new ApiError("Cannot reach the CRM service", "network")`.

**Expected result:** Network, validation, and server errors share one safe frontend type.

**If it fails:** Throwing raw `Error` only → wrap. Logging response HTML dumps → sanitize message.

---

### Step 4 — Build the fetch boundary

**Why:** One helper owns headers, empty bodies (204), and non-OK translation.

**Do this:** `src/api/http.ts`:

```typescript
export async function request<T>(path: string, init: RequestInit = {}): Promise<T> {
  const response = await fetch(`${API_URL}${path}`, {
    ...init,
    headers: {
      "Content-Type": "application/json",
      "X-Correlation-Id": "lab-request-001",
      ...init.headers,
    },
  });
  if (!response.ok) throw await ApiError.from(response);
  if (response.status === 204) return undefined as T;
  return response.json() as Promise<T>;
}
```

**Expected result:** 204 does not JSON-parse-fail; non-OK throws `ApiError`.

**If it fails:** Reading JSON on 204 → guard status. Missing CORS → continue to Step 10 after UI wired.

---

### Step 5 — Create typed customer operations

**Why:** Paths and DTOs must live in one module so Lab 36 can attach auth once.

**Do this:** `src/api/customers.ts`:

```typescript
export const customersApi = {
  list: (signal?: AbortSignal) =>
    http<Customer[]>("/api/customers", { signal }),
  create: (draft: CustomerDraft) =>
    http<Customer>("/api/customers", {
      method: "POST",
      body: JSON.stringify(draft),
    }),
  update: (id: string, draft: CustomerDraft) =>
    request<Customer>(`/customers/${encodeURIComponent(id)}`, {
      method: "PUT",
      body: JSON.stringify(draft),
    }),
};
```

**Expected result:** GET `/api/customers` returns `Customer[]` through the helper.

**If it fails:** Double `/api/api` → strip trailing slash in base URL. Wrong DTO field names → align with curl JSON.

---

### Step 6 — Cancel obsolete loads with `AbortController`

**Why:** Fast query changes or unmounts must not apply stale responses or warn about setState.

**Do this:** In `useCustomers` / page effect:

```typescript
useEffect(() => {
  const controller = new AbortController();
  let cancelled = false;
  setState({ kind: "loading" });
  customersApi
    .list(controller.signal)
    .then((data) => {
      if (!cancelled) setState({ kind: "data", data });
    })
    .catch((err) => {
      if (err.name === "AbortError" || controller.signal.aborted) return;
      if (!cancelled) setState({ kind: "error", error: err });
    });
  return () => {
    cancelled = true;
    controller.abort();
  };
}, []);
```

**Expected result:** Unmount shows canceled request in Network; no React warning.

**If it fails:** Abort treated as UI error → ignore abort in catch. Missing cleanup → add return abort.

---

### Step 7 — Render explicit request states

**Why:** Silent empty lists hide outages; operators need distinct loading vs error vs empty.

**Do this:** On the customer page:

* `loading` → Lab 33 `LoadingState` / Progress
* `data` with `length === 0` → EmptyState
* `data` with rows → CustomerList
* `error` → ErrorState with Retry (re-run load)

**Expected result:** Loading, empty, error, and data states are visually/semantically distinct.

**If it fails:** Error path shows empty → branch on `kind === "error"` first. Retry no-ops → re-invoke load function.

---

### Step 8 — Map backend field errors to the form

**Why:** Client validation is incomplete; Spring 400 field errors must land beside labels.

**Do this:** On create/update catch:

```tsx
if (error instanceof ApiError && error.status === 400) {
  setErrors(error.fieldErrors ?? { form: error.message });
  return;
}
```

Force a 400 (invalid email) against the API and confirm the Email field alert updates.

**Expected result:** 400 email message appears beside Email; list unchanged.

**If it fails:** Backend sends different error JSON → adapt `ApiError.from`. Errors not shown → pass into `CustomerForm`.

---

### Step 9 — Prevent duplicate submissions

**Why:** Double-clicks produce duplicate customers and confusing inventories.

**Do this:**

```tsx
setSaving(true);
try {
  const created = await customersApi.create(draft);
  setCustomers((prev) => [...prev, created]); // or reload list
} finally {
  setSaving(false);
}
```

Disable Save while `saving`. Prefer server-returned record over optimistic-only duplicates.

**Expected result:** Double click → one POST and one card.

**If it fails:** Two POSTs in Network → disable button synchronously on first click. Optimistic + server append → reconcile once.

---

### Step 10 — Restrict development CORS on Spring

**Why:** `*` origins teach the wrong production habit and allow hostile browser calls.

**Do this:** In Spring `WebConfig` / `CorsRegistry`:

```java
registry.addMapping("/api/**")
    .allowedOrigins("http://localhost:5173")
    .allowedMethods("GET", "POST", "PUT", "DELETE")
    .allowedHeaders("Content-Type", "Authorization", "X-Correlation-Id");
```

Restart Spring. Confirm SPA works from Vite origin.

**Expected result:** `localhost:5173` allowed; browser calls succeed with CORS headers.

**If it fails:** Preflight fails → allow OPTIONS / required headers. Wrong origin port → match Vite port.

---

### Step 11 — Test all response classes

**Why:** UI glue breaks when only happy fetch is mocked.

**Do this:** `customers.test.ts` mocks `fetch` for:

* 200 list with Amina/Ravi
* 201 create
* 400 field errors
* 500 server message → ApiError
* network failure
* abort

```bash
npm run test -- --run
npm run build
```

**Expected result:** 200/201/400/500/network/abort tests pass; build green.

**If it fails:** Unmocked real fetch → use `vi.stubGlobal('fetch', ...)`. Flaky abort → assert promise rejection kind carefully.

---

### Step 12 — Probe disallowed origins + evidence pack

**Why:** Prove CORS deny with curl; capture evidence for the security story.

**Do this:**

```bash
curl -i -H "Origin: https://evil.example" http://localhost:8080/api/customers
```

Confirm no `Access-Control-Allow-Origin: https://evil.example`. Complete Failure Experiments. Screenshot Network for load/create/400. Run SPA tests twice. Document runbook including Spring start + Vite.

**Expected result:** Evil origin denied; ≥3 experiments; consecutive green tests; notes complete.

**If it fails:** Spring reflects any Origin → fix allowlist. See Troubleshooting.

---

## Implementation Checkpoints

### Checkpoint A — Tooling

_Mark **Pass** or **Fail** in your lab notes._

| # | Confirm | Your notes |
| - | ------- | ---------- |
| 1 | `lab35-crm/crm-ui` from Lab 34 | Pass / Fail |
| 2 | Spring API reachable; contract documented via curl | Pass / Fail |
| 3 | `.env.example` with `VITE_API_BASE_URL` (no secrets) | Pass / Fail |

### Checkpoint B — Client core

_Mark **Pass** or **Fail** in your lab notes._

| # | Confirm | Your notes |
| - | ------- | ---------- |
| 1 | `ApiError` + `http` helper + `customersApi` | Pass / Fail |
| 2 | Abortable list load; distinct UI states | Pass / Fail |
| 3 | Create/update with correlation header | Pass / Fail |
| 4 | 400 field errors mapped; saving disables duplicate POST | Pass / Fail |

### Checkpoint C — CORS + tests

_Mark **Pass** or **Fail** in your lab notes._

| # | Confirm | Your notes |
| - | ------- | ---------- |
| 1 | Spring CORS allowlist for Vite origin | Pass / Fail |
| 2 | Evil Origin probe recorded | Pass / Fail |
| 3 | Response-class tests green twice; build green | Pass / Fail |

### Checkpoint D — Hygiene

_Mark **Pass** or **Fail** in your lab notes._

| # | Confirm | Your notes |
| - | ------- | ---------- |
| 1 | Integration notes + screenshots | Pass / Fail |
| 2 | No secrets / `node_modules` / `dist` / `.env` secrets committed | Pass / Fail |
| 3 | README runbook starts Spring + Vite | Pass / Fail |

---

## Reference Commands, Configuration, and Code

### CORS Java

```java
registry.addMapping("/api/**")
    .allowedOrigins("http://localhost:5173")
    .allowedMethods("GET", "POST", "PUT", "DELETE")
    .allowedHeaders("Content-Type", "Authorization", "X-Correlation-Id");
```

### Commands

```bash
# Spring (path may vary)
cd ~/java-bootcamp/examples/lab32-crm   # or your latest Spring CRM under examples/ (often lab29/lab32)
./mvnw spring-boot:run

# SPA
cd ~/java-bootcamp/examples/lab35-crm/crm-ui
npm run dev
npm run test -- --run
npm run build
curl -i -H "Origin: https://evil.example" http://localhost:8080/api/customers
git status
```

## Failure Experiments

| # | Experiment | Observe | Restore |
| - | ---------- | ------- | ------- |
| 1 | Stop Spring; reload SPA | Network ApiError + error UI | Restart API |
| 2 | POST invalid email | 400 → field alert | Fix payload |
| 3 | Double-click Save | One POST only | Keep saving flag |
| 4 | Abort by navigating away mid-load | No setState warning | Keep AbortController |
| 5 | Evil Origin curl | No ACAO for evil | Keep allowlist |

---

## Troubleshooting

| Symptom | Likely cause | Fix |
| ------- | ------------ | --- |
| Browser CORS error | Spring allowlist / port | Match Vite origin exactly |
| `Failed to fetch` | API down / wrong URL | curl; fix `VITE_API_BASE_URL` |
| Env not applied | No restart | Restart Vite |
| `TS2339` on `import.meta.env` (runtime still prints the URL) | `vite/client` types not loaded (`tsconfig` `"types"` is only `vitest/globals`, or no `src/vite-env.d.ts`) | Add `src/vite-env.d.ts` with `/// <reference types="vite/client" />`; include `"vite/client"` in `compilerOptions.types` |
| JSON parse on 204 | No status guard | Handle 204 |
| Abort as error toast | Catch not ignoring abort | Ignore `AbortError` |
| Duplicate customers | No saving flag | Disable submit while pending |
| Wrong `/api/api` | Base URL + path both include api | Normalize join |
| JWT login urge | Wrong module | Keep http injectable — Lab 36 adds tokens |

## Security and Production Review

Optional — jot brief notes in your README if useful for your progress check (not a separate essay):

1. Which inputs are untrusted (all browser payloads; Origin header)?
2. Where are authn/authz/validation enforced (server validation now; auth Lab 36)?
3. Which values are sensitive—never in `VITE_*` or repo?

---


## Cleanup

```bash
# stop Vite and Spring (Ctrl+C)
cd ~/java-bootcamp/examples/lab35-crm/crm-ui
git status
```

Do not commit `node_modules/`, `dist/`, or secret `.env`.

**Keep `lab35-crm`**—Lab 36 adds threat model, in-memory tokens, route guards, XSS/CSRF/CSP controls.


## Reflection Questions

Write **1–3 sentence** answers (not essays):

1. Which design decision most affected correctness?
2. What evidence proves the implementation works?
3. Which failure was hardest to diagnose?

---


