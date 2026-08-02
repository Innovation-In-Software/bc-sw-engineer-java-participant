# Lab 29 starter — timed path (~45 minutes)

**Theme:** @Valid + GlobalExceptionHandler + ErrorResponse envelopes

## Activity card

| | |
| --- | --- |
| **Objective** | Complete DTO constraints and advice TODOs; prove 400/404/409 envelopes |
| **Skills practiced** | Bean Validation, @RestControllerAdvice, ErrorResponse, correlation |
| **Expected outcome** | Bad email 400 · CUS-9999 404 · duplicate 409 · happy GET |
| **Estimated time** | ~45 minutes |
| **Files** | `examples/lab29-crm/` copied from this starter |

**Boilerplate reduced:** DTO/advice stubs + `// TODO` — keep Lab 28 security if present.

Pacing: [`../../PACING.md`](../../PACING.md) · Full steps: [`../LAB-29-GUIDE.md`](../LAB-29-GUIDE.md)

## Copy into your workspace

Do **not** grade work only inside the course `labs/` clone. Copy this `starter/` into your bootcamp examples tree as `lab29-crm`.

**Windows (PowerShell)** — from this lab folder:

```powershell
New-Item -ItemType Directory -Force -Path "$env:USERPROFILE\java-bootcamp\examples\lab29-crm" | Out-Null
Copy-Item -Recurse -Force ".\starter\*" "$env:USERPROFILE\java-bootcamp\examples\lab29-crm\"
cd $env:USERPROFILE\java-bootcamp\examples\lab29-crm
```

**macOS / Linux:**

```bash
mkdir -p ~/java-bootcamp/examples/lab29-crm
cp -R starter/. ~/java-bootcamp/examples/lab29-crm/
cd ~/java-bootcamp/examples/lab29-crm
```

Full GUIDE: [`../LAB-29-GUIDE.md`](../LAB-29-GUIDE.md)

## 45-minute checklist

- [ ] Add Bean Validation annotations on `CustomerRequest`
- [ ] Put `@Valid` on controller create method
- [ ] Implement `GlobalExceptionHandler` for 400/404/409 (+ safe 500)
- [ ] Shape `ErrorResponse` (+ field violations)
- [ ] Smoke: bad email → 400; CUS-9999 → 404; duplicate CUS-1001 → 409

## Smoke test

```bash
mvn -B test
mvn -B spring-boot:run
```

Evidence under `~/java-bootcamp/notes/screenshots/lab-29/` (redact secrets).

## Timed-path Pass criteria

| Criterion | Pass / Fail |
| --------- | ----------- |
| Invalid POST returns 400 with violations | Pass / Fail |
| Missing customer returns 404 envelope | Pass / Fail |
| Duplicate returns 409 | Pass / Fail |
| Happy GET CUS-1001 / CUS-1002 still 200 | Pass / Fail |
| Error envelope includes correlation when provided | Pass / Fail |

Continue remaining GUIDE steps as homework / full path if needed.
