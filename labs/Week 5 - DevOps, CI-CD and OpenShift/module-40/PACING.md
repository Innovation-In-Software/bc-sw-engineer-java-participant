# Module 40 — Learn → Practice → Review (participant)

**Theme:** Application Security Testing (Week 5 start)  
**CRM:** Lab 39 app · OWASP Dependency-Check · focused SAST · triage CSV · assessment gate

## Checkpoint map

| CP | After slides | Practice | Minutes |
| -- | ------------ | -------- | ------- |
| **A** | 1–8 SSDLC / OWASP | [Ex 1](exercises/exercise-01-owasp-surface-map.md) | ~12–15 |
| **B** | 9–13 SAST | [Ex 4](exercises/exercise-04-sast-todo-notes.md) | ~12–15 |
| **C** | 14–22 DAST awareness + triage | [Ex 2](exercises/exercise-02-dependency-check-plan.md) → [3](exercises/exercise-03-triage-csv-sketch.md) | ~20–24 |
| **D** | 23–25 gates | [Ex 5](exercises/exercise-05-assessment-outline.md) → [6](exercises/exercise-06-gate-go-nogo.md) | ~18–22 |
| **E** | 26–29 | [Lab 40](lab40/LAB-40-GUIDE.md) timed ~45 min | ~45 |

## Practice order

**1 → 4 → 2 → 3 → 5 → 6** then Lab 40.

## Do / don't

| Do now | Don't yet |
| --- | --- |
| Surface map, SCA gate, triage CSV, focused SAST notes | Silent CVE suppressions |
| Residual risk with owner + expiry | Docker images (Lab 41) / k3s (Lab 42) / GHA (Lab 43) |
| Sanitize scan evidence | Real customer PII in findings |

## Hard gate before Lab 40

- [ ] Ex notes complete in `java-bootcamp/examples/module-40-exercises/notes/` (order above)
- [ ] Lab 39 `mvn -B test` green in `java-bootcamp/examples/lab39-crm`
- [ ] Personal NVD API key requested (env only)
- [ ] Evidence folder plan under `java-bootcamp/notes/screenshots/lab-40/`
