# Lab 13 — Instructor solution notes

## What was implemented

- Complete `customer.xsd` + `CustomerService.wsdl` (Create/Update/Get, document/literal).
- Eight sample envelopes (success + not-found + validation faults) with CUS-1001/CUS-1002/`lab-request-001`.
- Operation matrix + soap design notes.

## How to verify (Windows PowerShell)

```powershell
cd "labs\Week 2 - Backend, AI Tools and Testing\module-13\lab13\solution"
$ok = 0; Get-ChildItem contracts,samples -Recurse -File | ForEach-Object {
  try { [xml](Get-Content -Raw $_.FullName) | Out-Null; $ok++ ; "OK $($_.Name)" }
  catch { "FAIL $($_.Name): $_" }
}; "Well-formed: $ok / 10"
```

No Maven/Java server required. Port 8080 closed is expected.

## Pitfalls

- Keep XSD beside WSDL (`schemaLocation="customer.xsd"`).
- Do not start Spring Boot/Tomcat to “fix” the placeholder URL.
