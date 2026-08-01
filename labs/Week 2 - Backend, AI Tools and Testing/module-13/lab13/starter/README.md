# Lab 13 starter — timed path (~45 minutes)

**Theme:** Contract-first SOAP (XSD + WSDL + samples) — no Java server

## Activity card

| | |
| --- | --- |
| **Objective** | Complete Customer XSD/WSDL TODOs + success/fault samples + docs |
| **Skills practiced** | Contract-first artifacts, namespaces, well-formedness checks |
| **Expected outcome** | 10/10 well-formed XML files + operation-matrix / design notes |
| **Estimated time** | ~45 minutes |
| **Files** | `examples/lab13-crm/` copied from this starter |

**Boilerplate reduced:** Contract shells + sample names given — fill types/ops/faults; do **not** host `/ws`.

Pacing: [`../../PACING.md`](../../PACING.md) · Full steps: [`../LAB-13-GUIDE.md`](../LAB-13-GUIDE.md)

**Honesty:** `http://localhost:8080/ws` is a placeholder (Lab 24 hosts).

## Copy into your workspace

**Windows (PowerShell)** — from this lab folder:

```powershell
New-Item -ItemType Directory -Force -Path "$env:USERPROFILE\java-bootcamp\examples\lab13-crm" | Out-Null
Copy-Item -Recurse -Force ".\starter\*" "$env:USERPROFILE\java-bootcamp\examples\lab13-crm\"
cd $env:USERPROFILE\java-bootcamp\examples\lab13-crm
```

**macOS / Linux:**

```bash
mkdir -p ~/java-bootcamp/examples/lab13-crm
cp -R starter/. ~/java-bootcamp/examples/lab13-crm/
cd ~/java-bootcamp/examples/lab13-crm
```

Full GUIDE: [`../LAB-13-GUIDE.md`](../LAB-13-GUIDE.md)

## 45-minute checklist

- [ ] Complete `contracts/customer.xsd` TODOs (types + request/response elements)
- [ ] Complete `contracts/CustomerService.wsdl` (3 ops, document/literal, placeholder address)
- [ ] Fill success + fault samples under `samples/`
- [ ] Finish operation-matrix + soap-design-notes TODOs
- [ ] Smoke-validate well-formed XML

## Smoke test

**Windows PowerShell:**

```powershell
Get-ChildItem contracts,samples -Filter *.xml | ForEach-Object { [xml](Get-Content -Raw $_.FullName) | Out-Null; "OK $($_.Name)" }
Get-ChildItem contracts -Filter *.xsd | ForEach-Object { [xml](Get-Content -Raw $_.FullName) | Out-Null; "OK $($_.Name)" }
Get-ChildItem contracts -Filter *.wsdl | ForEach-Object { [xml](Get-Content -Raw $_.FullName) | Out-Null; "OK $($_.Name)" }
```

**macOS / Linux** (if `xmllint` available):

```bash
xmllint --noout contracts/* samples/*
```

Do **not** start a server on port 8080.

## Timed-path Pass criteria

| Criterion | Pass / Fail |
| --------- | ----------- |
| XSD + WSDL well-formed; schemaLocation beside WSDL | Pass / Fail |
| Three operations + success/fault samples | Pass / Fail |
| Docs name CUS-1001 / CUS-1002 / lab-request-001 | Pass / Fail |
| Placeholder URL documented as not live | Pass / Fail |

Continue remaining GUIDE steps as homework / full path if needed.
