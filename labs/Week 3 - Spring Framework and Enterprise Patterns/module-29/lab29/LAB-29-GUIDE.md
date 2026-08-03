# Lab 29: Validation and Exception Handling — Northstar CRM Error Contracts

> **Participants:** Module sequence is in [`../README.md`](../README.md). **Do not start this guide until** you have finished Module 29 [pre-lab exercises 1–6](../exercises/EXERCISES-INDEX.md) (Pass in your notes; order **1 → 2 → 3 → 4 → 6 → 5**). Then open **one** OS how-to ([Windows](LAB-29-WINDOWS.md) · [macOS](LAB-29-MACOS.md)). In class, prefer the **45-minute timed path** with [`starter/`](starter/README.md); the **full path** is every Step below (homework / extended). Skip `solution/` unless your instructor says otherwise. See [Which file do I open?](../../../_PARTICIPANT-FILE-GUIDE.md).

## Activity card

| | |
| --- | --- |
| **Objective** | Ship Bean Validation + GlobalExceptionHandler + stable ErrorResponse for CRM REST |
| **Skills practiced** | @Valid DTOs, @RestControllerAdvice, 400/404/409 envelopes, MockMvc body asserts |
| **Expected outcome** | Invalid → 400 · CUS-9999 → 404 · duplicate → 409 · happy GET · tests green |
| **Estimated time** | Timed path ~45 min · Full path 4–5 hours |
| **Prerequisites** | Lab 0 · Labs 14/16 concepts · Labs 25–28 preferred · Exercises 1–6 Pass · JDK 21 · Maven 3.9+ |
| **Expected files** | `examples/lab29-crm/` — DTOs, advice, ErrorResponse, tests, error-contract notes |
| **Validation checkpoints** | Starter smoke · GUIDE Implementation Checkpoints |

**Module:** 29 — Validation and Exception Handling  
**Duration:** ~45 minutes (timed path with starter) · Full path: 4–5 Hours

**Primary IDE:** IntelliJ IDEA Community Edition · **Optional IDE:** VS Code

| OS | How-to for this lab |
| -- | ------------------- |
| Windows | [LAB-29-WINDOWS.md](LAB-29-WINDOWS.md) |
| macOS | [LAB-29-MACOS.md](LAB-29-MACOS.md) |

> **Incremental build:** DTO constraints → handler TODOs → envelope → status map → MockMvc body plan → readiness → Lab 29.

> **Classroom pacing:** [`../PACING.md`](../PACING.md) (Checkpoints A–D).

> **Critical scope:** **`@Valid` + ErrorResponse**. Map **400/404/409**. Keep **`lab-request-001`**. Assert status **and** body. **No stack-trace HTML**. Keep Lab 28 security. Optional Week 3 review slides 215–220 after Kahoot.

## 45-minute timed path (use starter)

In class, use the starter templates so the **core** objectives fit **~45 minutes**. The full Steps below remain for homework / extended depth.

1. Open [`starter/README.md`](starter/README.md).
2. Copy `starter/` into your `java-bootcamp/examples/…` target (see starter README).
3. Fill every `// TODO` — do **not** wait on a perfect prior lab; the starter includes a baseline.
4. Run the starter smoke test; evidence under `notes/screenshots/lab-29/`.
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
| 1 | `lab29-crm` with Bean Validation + `GlobalExceptionHandler` + `ErrorResponse` |
| 2 | Automated tests for validation and not-found envelopes |
| 3 | Successful-path evidence (`CUS-1001`, `CUS-1002`) |
| 4 | Controlled-failure evidence (400/404/409 + envelope) |
| 5 | Lab 14/16 unify note (and optional SOAP alignment) |
| 6 | Run and cleanup instructions |
| 7 | No secrets or generated build directories committed |

**Must submit:** the items in the table above (sources + evidence + short notes).

**Do not submit:** `target/`, `node_modules/`, secrets, heap dumps, or a verbatim instructor `solution/`.

## Lab Overview

This Module 29 lab unifies **Bean Validation** on request DTOs with a global `@RestControllerAdvice` that returns a consistent **`ErrorResponse`** for REST failures. Patterns from Lab 14 (DTO/validation concepts) and Lab 16 (exception hierarchy / handler ideas) become the Spring Boot contract every client — React SPA, integration test, or partner — relies on.

## Learning Objectives

After completing this lab, you will be able to:

* Annotate CRM request DTOs with Bean Validation constraints
* Trigger validation with `@Valid` / `@Validated` on controller methods
* Map field and object-level violations into a stable `ErrorResponse`
* Centralize exception handling with `@RestControllerAdvice` / `@ExceptionHandler`
* Align HTTP status codes with business exceptions (404, 409, 400/422)

## Business Scenario

The CRM stores customer identity, contact details, lifecycle status, and financial accounts. Agents and integrations will send bad JSON. Leadership freezes:

**No API error path may return framework-default HTML stack traces or ad-hoc `Map` bodies to React.**

You own the contract for Amina (`CUS-1001` ACTIVE), Ravi (`CUS-1002` PROSPECT), unknown IDs, duplicates, and illegal transitions.

Use these examples consistently:

| ID | Name | Notes |
| -- | ---- | ----- |
| `CUS-1001` | Amina Khan | `ACTIVE` — happy GET; duplicate create → 409 |
| `CUS-1002` | Ravi Singh | `PROSPECT` — happy GET / status update source |
| `CUS-9999` | — | not-found → 404 `ErrorResponse` |
| `lab-request-001` | — | `ErrorResponse.correlationId` / `X-Correlation-Id` |
| `CUS-1003` | Maya Chen (tests) | valid shape for validation-only tests |

**Security note for evidence.** Never echo passwords or JWTs in `rejectedValue`. Fictional emails only.

---

## Architecture Context
### NOW (this lab)

```mermaid
flowchart TB
  UI["React CRM SPA"] -->|HTTPS/JSON| Ctrl["CustomerController<br/>@Valid DTOs"]
  Ctrl --> Svc["CustomerService<br/>BusinessException subtypes"]
  Svc --> Repo["CustomerRepository"]
  Ctrl --> GEH["@RestControllerAdvice<br/>GlobalExceptionHandler"]
  GEH --> Err["ErrorResponse JSON"]
```

## Prerequisites

Prior labs: [14](../../../Week%202%20-%20Backend,%20AI%20Tools%20and%20Testing/module-14/lab14/LAB-14-GUIDE.md) · [16](../../../Week%202%20-%20Backend,%20AI%20Tools%20and%20Testing/module-16/lab16/LAB-16-GUIDE.md) · [25](../../module-25/lab25/LAB-25-GUIDE.md) · [28](../../module-28/lab28/LAB-28-GUIDE.md).

Confirm (Lab 0 tools assumed):

* JDK 21; Maven; Spring Boot 3.x web app with Customer API
* `spring-boot-starter-validation` on the classpath
* Familiarity with Lab 14 DTO ideas and Lab 16 exception-handler ideas
* Optional: Lab 28 Security — validation must still return JSON for API clients
* No secrets committed to Git

### Pre-flight

```bash
java -version
mvn -version
```

## Worked example (read before you code)

Study this pattern once before Step 1. Your job is to apply the same idea in the Steps — do not skip ahead to a full solution.

```java
@Test
void create_rejectsInvalidEmail() throws Exception {
  mockMvc.perform(post("/api/customers")
          .contentType(MediaType.APPLICATION_JSON)
          .header("X-Correlation-Id", "lab-request-001")
          .content("""
              {"customerId":"CUS-1003","fullName":"Maya Chen",
               "email":"bad","status":"PROSPECT"}
              """))
      .andExpect(status().isBadRequest())
      .andExpect(jsonPath("$.correlationId").value("lab-request-001"))
      .andExpect(jsonPath("$.violations[0].field").exists());
}

@Test
void get_unknownCustomer_returns404Envelope() throws Exception {
  mockMvc.perform(get("/api/customers/CUS-9999")
          .header("X-Correlation-Id", "lab-request-001"))
      .andExpect(status().isNotFound())
      .andExpect(jsonPath("$.status").value(404));
}
```

**What to notice:** Match names, IDs, and failure behavior from the scenario — graders check these.

---

## Implementation Steps

Complete each step in order. Commands assume `~/java-bootcamp/examples/lab29-crm` (Windows: `%USERPROFILE%\java-bootcamp\examples\lab29-crm`) unless noted.

---

### Step 1 — Branch Lab 28 and pin validation + ErrorResponse

**Why:** A single error envelope beats ad-hoc `Map` bodies for every client.

**Do this:**

```bash
cd ~/java-bootcamp/examples
cp -r lab28-crm lab29-crm   # or latest CRM API if Lab 28 skipped
cd lab29-crm
mkdir -p docs
mkdir -p ~/java-bootcamp/notes/screenshots/lab-29
```

```xml
<dependency>
  <groupId>org.springframework.boot</groupId>
  <artifactId>spring-boot-starter-validation</artifactId>
</dependency>
```

```java
public record ErrorResponse(
    Instant timestamp,
    int status,
    String error,
    String message,
    String path,
    String correlationId,
    List<FieldViolation> violations
) {
  public record FieldViolation(String field, String message, Object rejectedValue) {}
}
```

Keep `rejectedValue` free of secrets.

```bash
mvn -q -DskipTests package
```

**Expected result:** `BUILD SUCCESS`; `ErrorResponse` compiles; validation starter on classpath.

**If it fails:** Boot 3 missing validation starter → add dependency explicitly. Record refuses Instant → check imports (`java.time.Instant`).

---

### Step 2 — Annotate CustomerRequest and StatusUpdateRequest

**Why:** Validation belongs on the request DTO, not only inside undocumented service `if` checks.

**Do this:** Unify Lab 14-style constraints on API contracts:

```java
public record CustomerRequest(
    @NotBlank @Pattern(regexp = "CUS-\\d{4}") String customerId,
    @NotBlank @Size(max = 120) String fullName,
    @NotBlank @Email String email,
    @NotNull CustomerStatus status
) {}

public record StatusUpdateRequest(
    @NotNull CustomerStatus status
) {}
```

Creating `CUS-1001` Amina Khan `ACTIVE` and `CUS-1002` Ravi Singh `PROSPECT` must satisfy these rules.

**Expected result:** DTOs compile with `jakarta.validation` annotations; illegal emails and blank names are expressible as constraint violations.

**If it fails:** `javax.validation` imports on Boot 3 → switch to `jakarta.validation`. Pattern rejects valid IDs → align regex with your ID scheme.

---

### Step 3 — Enable @Valid on controller methods

**Why:** Constraints do nothing without `@Valid`; forgetting it is a common production bug.

**Do this:**

```java
@PostMapping
public ResponseEntity<CustomerResponse> create(
    @Valid @RequestBody CustomerRequest request,
    @RequestHeader(value = "X-Correlation-Id", defaultValue = "lab-request-001")
    String correlationId) {
  // delegate to service
}

@PatchMapping("/{customerId}/status")
public CustomerResponse updateStatus(
    @PathVariable String customerId,
    @Valid @RequestBody StatusUpdateRequest request) {
  return CustomerResponse.from(service.updateStatus(customerId, request.status()));
}
```

If Lab 28 Security is on, call with a Bearer token for manual curls.

**Expected result:** Valid create for a new customer returns 201; methods reference `@Valid`.

**If it fails:** Security returns 401 before validation → obtain JWT or use `@WithMockUser` in tests. Missing `@Valid` → bad emails reach the service (prove then restore).

---

### Step 4 — Prove validation failures with curl (before/after)

**Why:** Capture the trust-boundary rejection and compare framework-default vs custom envelope.

**Do this:**

```bash
curl -s -i -X POST http://localhost:8080/api/customers \
  -H "Content-Type: application/json" \
  -H "X-Correlation-Id: lab-request-001" \
  -H "Authorization: Bearer $TOKEN" \
  -d '{"customerId":"BAD","fullName":"","email":"not-an-email","status":"ACTIVE"}'
```

Before the global handler exists, Spring may return its default 400 structure. Note it — Step 5 replaces it with your envelope.

**Expected result:** HTTP 400 (or 422 if configured later); body indicates validation problems; no stack-trace HTML.

**If it fails:** Wrong Content-Type → validation may not run as expected. Security HTML login → fix Lab 28 API entry point first.

---

### Step 5 — Implement GlobalExceptionHandler for validation

**Why:** Stable client contracts beat framework-default JSON shapes that drift across Boot versions.

**Do this:** Unify Lab 16-style central handling:

```java
@RestControllerAdvice
public class GlobalExceptionHandler {

  @ExceptionHandler(MethodArgumentNotValidException.class)
  public ResponseEntity<ErrorResponse> handleValidation(
      MethodArgumentNotValidException ex, HttpServletRequest req) {
    var violations = ex.getBindingResult().getFieldErrors().stream()
        .map(fe -> new ErrorResponse.FieldViolation(
            fe.getField(), fe.getDefaultMessage(), fe.getRejectedValue()))
        .toList();
    var body = new ErrorResponse(
        Instant.now(), 400, "Bad Request", "Validation failed",
        req.getRequestURI(), correlationId(req), violations);
    return ResponseEntity.badRequest().body(body);
  }
}
```

Read `X-Correlation-Id` from the request (default `lab-request-001` only when demos need it).

**Expected result:** Re-run invalid POST; JSON matches `ErrorResponse`; violations include email/fullName/customerId; `correlationId` reflects `lab-request-001` when header sent.

**If it fails:** Advice not scanned → wrong package. Violations empty → handler type mismatch (use `MethodArgumentNotValidException`).

---

### Step 6 — Domain exceptions: not found, duplicate, illegal transition

**Why:** Domain exceptions must not leak as generic 500s.

**Do this:**

```java
public class CustomerNotFoundException extends BusinessException { ... }
public class DuplicateCustomerException extends BusinessException { ... }
public class InvalidStatusTransitionException extends BusinessException { ... }

@ExceptionHandler(CustomerNotFoundException.class)
public ResponseEntity<ErrorResponse> notFound(...) {
  return ResponseEntity.status(404).body(...);
}

@ExceptionHandler(DuplicateCustomerException.class)
public ResponseEntity<ErrorResponse> conflict(...) {
  return ResponseEntity.status(409).body(...);
}
```

Exercise:

```bash
curl -s -i http://localhost:8080/api/customers/CUS-9999 \
  -H "X-Correlation-Id: lab-request-001" \
  -H "Authorization: Bearer $TOKEN"
# After seeding CUS-1001, POST create again for CUS-1001 -> 409
# Illegal ACTIVE → PROSPECT (or your Lab 15 rules) -> 400/422
```

**Expected result:** `CUS-9999` → 404 envelope; duplicate `CUS-1001` → 409; happy GET `CUS-1001` / `CUS-1002` still 200 (Amina ACTIVE / Ravi PROSPECT).

**If it fails:** Duplicate returns 500 → exception not mapped. Transition mutates status then throws → fix service atomicity from Lab 15/27 patterns.

---

### Step 7 — Fallback handler and SOAP/WS notes

**Why:** Client bodies must stay safe while logs remain actionable.

**Do this:**

```java
@ExceptionHandler(Exception.class)
public ResponseEntity<ErrorResponse> fallback(Exception ex, HttpServletRequest req) {
  log.error("Unhandled correlationId={}", correlationId(req), ex);
  return ResponseEntity.status(500).body(new ErrorResponse(
      Instant.now(), 500, "Internal Server Error",
      "Unexpected error", req.getRequestURI(), correlationId(req), List.of()));
}
```

In `docs/error-contract-notes.md`, add a short “SOAP / Spring-WS alignment” note: the same `BusinessException` types should map to SOAP faults (as in Lab 24) so REST and SOAP do not invent divergent semantics. Implementing faults is optional unless assigned.

Optional stretch: sketch how SOAP clients, REST, services, repositories, transactions (Lab 27), and security (Lab 28) fit one Customer Service Platform backend — keep out of the critical path unless your instructor assigns it.

**Expected result:** Forced `RuntimeException` in a test returns 500 `ErrorResponse`; server logs include stack; client body does not; README/docs contain SOAP alignment paragraph.

**If it fails:** Fallback shadows more specific handlers → order handlers carefully / prefer specific types first.

---

### Step 8 — Automated tests for validation and handler

**Why:** Asserting `jsonPath` on `ErrorResponse` prevents silent contract drift.

**Do this:**

```java
@Test
void create_rejectsInvalidEmail() throws Exception {
  mockMvc.perform(post("/api/customers")
          .contentType(MediaType.APPLICATION_JSON)
          .header("X-Correlation-Id", "lab-request-001")
          .content("""
              {"customerId":"CUS-1003","fullName":"Maya Chen",
               "email":"bad","status":"PROSPECT"}
              """))
      .andExpect(status().isBadRequest())
      .andExpect(jsonPath("$.correlationId").value("lab-request-001"))
      .andExpect(jsonPath("$.violations[0].field").exists());
}

@Test
void get_unknownCustomer_returns404Envelope() throws Exception {
  mockMvc.perform(get("/api/customers/CUS-9999")
          .header("X-Correlation-Id", "lab-request-001"))
      .andExpect(status().isNotFound())
      .andExpect(jsonPath("$.status").value(404));
}
```

If Lab 28 security is active, use a test JWT or `@WithMockUser`.

```bash
mvn -q test
mvn -q test
```

**Expected result:** Surefire green twice; assertions cover correlation and violations.

**If it fails:** Violation list order flake → sort in handler or assert with Hamcrest `hasItem`. Security blocks MockMvc → add security test helpers.

---

### Step 9 — Failure experiments + Lab 14/16 unify note

**Why:** Document that Boot is the unification point for earlier course patterns.

**Do this:** Complete Failure Experiments. Write a short paragraph in `docs/error-contract-notes.md` stating how Lab 14 DTO constraints and Lab 16 handlers are now one Boot contract. Capture before/after curl bodies under `notes/screenshots/lab-29/`.

**Expected result:** ≥3 experiments; unify note present; evidence saved; `git status` clean of `target/`.

**If it fails:** See Troubleshooting.

---

## Implementation Checkpoints

### Checkpoint A — Tooling and envelope

_Mark **Pass** or **Fail** in your lab notes._

| # | Confirm | Your notes |
| - | ------- | ---------- |
| 1 | `lab29-crm` under `~/java-bootcamp/examples/` | Pass / Fail |
| 2 | Validation starter present | Pass / Fail |
| 3 | `ErrorResponse` + `FieldViolation` compile | Pass / Fail |

### Checkpoint B — DTO and controller validation

_Mark **Pass** or **Fail** in your lab notes._

| # | Confirm | Your notes |
| - | ------- | ---------- |
| 1 | Annotated `CustomerRequest` / `StatusUpdateRequest` | Pass / Fail |
| 2 | `@Valid` on create and status update | Pass / Fail |
| 3 | Invalid POST rejected at boundary (no HTML stack) | Pass / Fail |

### Checkpoint C — Global handler and domain mapping

_Mark **Pass** or **Fail** in your lab notes._

| # | Confirm | Your notes |
| - | ------- | ---------- |
| 1 | Validation → 400 custom envelope with `lab-request-001` | Pass / Fail |
| 2 | Not-found 404, duplicate 409, illegal transition mapped | Pass / Fail |
| 3 | Safe 500 fallback; SOAP/Lab 14–16 notes documented | Pass / Fail |

### Checkpoint D — Tests and hygiene

_Mark **Pass** or **Fail** in your lab notes._

| # | Confirm | Your notes |
| - | ------- | ---------- |
| 1 | MockMvc asserts status + `jsonPath` body | Pass / Fail |
| 2 | Two consecutive `mvn test` identical success | Pass / Fail |
| 3 | No secrets / stack traces / `target/` committed | Pass / Fail |

---

## Reference Commands, Configuration, and Code

### GlobalExceptionHandler (pattern)

```java
@RestControllerAdvice
public class GlobalExceptionHandler {
  @ExceptionHandler(MethodArgumentNotValidException.class)
  public ResponseEntity<ErrorResponse> handleValidation(...) { ... }

  @ExceptionHandler(CustomerNotFoundException.class)
  public ResponseEntity<ErrorResponse> notFound(...) { ... }
}
```

### Commands

```bash
cd ~/java-bootcamp/examples/lab29-crm
mvn -q spring-boot:run
curl -s -i -X POST http://localhost:8080/api/customers \
  -H "Content-Type: application/json" \
  -H "X-Correlation-Id: lab-request-001" \
  -H "Authorization: Bearer <token>" \
  -d '{"customerId":"BAD","fullName":"","email":"x","status":"ACTIVE"}'
curl -s -i http://localhost:8080/api/customers/CUS-1001 \
  -H "X-Correlation-Id: lab-request-001" \
  -H "Authorization: Bearer <token>"
mvn -q test
git status
```

## Failure Experiments

| # | Experiment | Observe | Restore |
| - | ---------- | ------- | ------- |
| 1 | Omit `@Valid` temporarily | Bad email reaches service | Restore `@Valid` |
| 2 | Blank name / bad email / bad ID pattern | 400 + violations | Keep constraints |
| 3 | Unknown `CUS-9999`; duplicate `CUS-1001` | 404 / 409 envelopes | Keep mappings |
| 4 | Force unhandled exception | Safe 500 body; stack in logs only | Keep fallback |
| 5 | Repeat invalid POST twice | Identical failure contract | Keep handler deterministic |

---

## Troubleshooting

| Symptom | Likely cause | Fix |
| ------- | ------------ | --- |
| Constraints ignored | Missing `@Valid` or validation starter | Add both |
| Advice never runs | Not component-scanned | Place under `com.northstar.crm` |
| HTML login on bad JSON | Lab 28 form login | Return JSON 401; obtain JWT for curls |
| Violation order flake | Unsorted field errors | Sort in handler or loosen asserts |
| Duplicate returns 200 | Unique check missing / after side effects | Enforce after validation, before persist |
| 500 for not-found | Exception type not handled | Map `CustomerNotFoundException` → 404 |
| Working in `module-29-exercises` for the lab | Wrong project | Lab lives in `examples/lab29-crm` |
| Stack trace in JSON body | Unsafe 500 handler | Return generic message only |

## Security and Production Review

Optional — jot brief notes in your README if useful for the rubric (not a separate essay):

1. Which inputs are untrusted (JSON bodies, path IDs, headers)?
2. Where are authn (Lab 28), authz, and validation enforced?
3. Which values are sensitive — never in `rejectedValue` or client 500 bodies?

---


## Cleanup

```bash
cd ~/java-bootcamp/examples/lab29-crm
# Stop spring-boot:run (Ctrl+C)
mvn -q clean
git status
```

Keep screenshots/excerpts. Do not commit `target/`.

**Keep `lab29-crm`**—Labs 30–31 add Kafka on a CRM that already speaks a stable error contract.

---

## Evaluation Rubric (100 Marks)

| Criteria | Marks |
| -------- | ----: |
| Environment and project structure | 10 |
| Core implementation (`@Valid`, handler, envelope) | 30 |
| Integration/configuration correctness (statuses, correlation) | 15 |
| Failure handling (404/409/500 safety) | 15 |
| Automated verification | 10 |
| Security and production awareness | 10 |
| Documentation and evidence (Lab 14/16 unify) | 10 |

**Notes:** Happy path only without envelope tests → incomplete. Leaking stacks to clients → security/production marks lost. Equivalent `ProblemDetail` OK if field equivalence and React impact are documented.

---

## Reflection Questions

Write **1–3 sentence** answers (not essays):

1. Which design decision most affected correctness (where validation runs)?
2. What evidence proves the error contract is stable?
3. Which failure was hardest to diagnose (missing `@Valid`, advice not scanned)?

---


