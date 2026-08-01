# Lab 19 starter — timed path (~45 minutes)

**Theme:** Selenium + HTTP integration — API IT, Page Object UI, regression evidence

## Activity card

| | |
| --- | --- |
| **Objective** | Complete CustomerApiIT + CustomerFormPage/CustomerUiIT with correlation |
| **Skills practiced** | data-testid, Page Objects, explicit waits, X-Correlation-Id |
| **Expected outcome** | ApiIT + UiIT green · regression-notes.md filled |
| **Estimated time** | ~45 minutes |
| **Files** | `examples/lab19-crm/` copied from this starter |

**Boilerplate reduced:** Thin web app + IT TODOs — fill `// TODO`; no raw sleeps as primary sync.

Pacing: [`../../PACING.md`](../../PACING.md) · Full steps: [`../LAB-19-GUIDE.md`](../LAB-19-GUIDE.md)

**Honesty:** Chrome/Chromium required for UiIT. Actuator is Lab 21.

## Copy into your workspace

Do **not** grade work only inside the course `labs/` clone. Copy this `starter/` into your bootcamp examples tree as `lab19-crm`.

**Windows (PowerShell)** — from this lab folder:

```powershell
New-Item -ItemType Directory -Force -Path "$env:USERPROFILE\java-bootcamp\examples\lab19-crm" | Out-Null
Copy-Item -Recurse -Force ".\starter\*" "$env:USERPROFILE\java-bootcamp\examples\lab19-crm\"
cd $env:USERPROFILE\java-bootcamp\examples\lab19-crm
```

**macOS / Linux:**

```bash
mkdir -p ~/java-bootcamp/examples/lab19-crm
cp -R starter/. ~/java-bootcamp/examples/lab19-crm/
cd ~/java-bootcamp/examples/lab19-crm
```

Full GUIDE: [`../LAB-19-GUIDE.md`](../LAB-19-GUIDE.md)

## 45-minute checklist

- [ ] Implement `CustomerController` POST/GET with X-Correlation-Id
- [ ] Wire `customers.html` fetch + data-testid hooks
- [ ] Complete `CustomerApiIT` (get / create+correlation / 404)
- [ ] Implement `CustomerFormPage` + headless `CustomerUiIT`
- [ ] Fill `docs/regression-notes.md`; run smoke test

## Smoke test

```bash
mvn -B -Dtest=CustomerApiIT test
mvn -B -Dtest=CustomerUiIT test
```

Evidence under `~/java-bootcamp/notes/screenshots/lab-19/` (redact secrets).

## Timed-path Pass criteria

| Criterion | Pass / Fail |
| --------- | ----------- |
| CustomerApiIT green | Pass / Fail |
| CustomerUiIT green (Chrome/Chromium available) | Pass / Fail |
| UI uses data-testid + Page Object (no raw sleeps) | Pass / Fail |
| Correlation header echoed on create | Pass / Fail |

Continue remaining GUIDE steps as homework / full path if needed.
