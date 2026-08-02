# Lab 24 starter — timed path (~45 minutes)

**Theme:** Spring-WS — contract-first endpoint, PayloadRoot, WSDL smoke

## Activity card

| | |
| --- | --- |
| **Objective** | Wire WebServiceConfig + getCustomer @PayloadRoot delegating to CustomerService |
| **Skills practiced** | Spring-WS config, @Endpoint, mapper TODOs, WSDL |
| **Expected outcome** | WSDL reachable · getCustomer path compiles/works · REST still works |
| **Estimated time** | ~45 minutes |
| **Files** | `examples/lab24-crm/` copied from this starter |

**Boilerplate reduced:** XSD + config stubs + `// TODO` — keep Lab 23 REST and shared service.

Pacing: [`../../PACING.md`](../../PACING.md) · Full steps: [`../LAB-24-GUIDE.md`](../LAB-24-GUIDE.md)

## Copy into your workspace

Do **not** grade work only inside the course `labs/` clone. Copy this `starter/` into your bootcamp examples tree as `lab24-crm`.

**Windows (PowerShell)** — from this lab folder:

```powershell
New-Item -ItemType Directory -Force -Path "$env:USERPROFILE\java-bootcamp\examples\lab24-crm" | Out-Null
Copy-Item -Recurse -Force ".\starter\*" "$env:USERPROFILE\java-bootcamp\examples\lab24-crm\"
cd $env:USERPROFILE\java-bootcamp\examples\lab24-crm
```

**macOS / Linux:**

```bash
mkdir -p ~/java-bootcamp/examples/lab24-crm
cp -R starter/. ~/java-bootcamp/examples/lab24-crm/
cd ~/java-bootcamp/examples/lab24-crm
```

Full GUIDE: [`../LAB-24-GUIDE.md`](../LAB-24-GUIDE.md)

## 45-minute checklist

- [ ] Confirm Spring-WS dependency in `pom.xml`
- [ ] Complete `WebServiceConfig` (MessageDispatcherServlet + WSDL bean)
- [ ] Implement `@Endpoint` / `@PayloadRoot` getCustomer in `CustomerEndpoint`
- [ ] Map SOAP payload ↔ domain in `CustomerSoapMapper` (TODO methods)
- [ ] Smoke: WSDL loads; secured/unsecured get notes in docs

## Smoke test

```bash
mvn -B test
mvn -B spring-boot:run
# WSDL: http://localhost:8080/ws/customers.wsdl
```

Evidence under `~/java-bootcamp/notes/screenshots/lab-24/` (redact secrets).

## Timed-path Pass criteria

| Criterion | Pass / Fail |
| --------- | ----------- |
| WSDL reachable (or config compiles) | Pass / Fail |
| `@PayloadRoot` getCustomer delegates to CustomerService | Pass / Fail |
| REST `/api/customers` still works for CUS-1001 | Pass / Fail |
| Sample XML under requests/ reviewed | Pass / Fail |

Continue remaining GUIDE steps as homework / full path if needed.
