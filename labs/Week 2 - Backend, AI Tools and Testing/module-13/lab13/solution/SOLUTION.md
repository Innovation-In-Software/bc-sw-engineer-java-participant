# Lab 13 — Detailed solution (instructor / shared after class)

> **Audience:** Instructors and participants when the instructor releases `solution/`.  
> **Do not open this during the timed path** unless your instructor says so.  
> Timed starter card: [`../starter/README.md`](../starter/README.md) · Full steps: [`../LAB-13-GUIDE.md`](../LAB-13-GUIDE.md)

## Goal

**SOAP contract-first (no Java server)**

## What you should end with

| Check | Expected |
| --- | --- |
| Verify command | `PowerShell [xml] load on contracts+samples` |
| Suite / smoke | 10/10 well-formed XML; no Maven |
| Workspace copy (optional) | `%USERPROFILE%\java-bootcamp\examples\lab13-crm` from this `solution/` |

## Solution tree (key files)

### Java / sources
- (no Java — docs/contracts only)

### Docs / contracts
- `operation-matrix.md`
- `soap-design-notes.md`
- `contracts/customer.xsd`
- `contracts/CustomerService.wsdl`
- `samples/createCustomerRequest.xml`
- `samples/createCustomerResponse.xml`
- `samples/fault-customerNotFound.xml`
- `samples/fault-validation.xml`
- `samples/getCustomerRequest.xml`
- `samples/getCustomerResponse.xml`
- `samples/updateCustomerRequest.xml`
- `samples/updateCustomerResponse.xml`

## How this maps to the GUIDE

1. Copy `starter/` → `examples/lab13-crm` (timed path) **or** use this `solution/` as the completed reference.
2. Every `// TODO` in the starter has a filled implementation here — compare file-by-file with your work.
3. Run the verify command above from the project root (this folder or your `lab13-crm` copy).
4. Keep `docs/` notes that the GUIDE names (smells, isolation policy, monitoring report, etc.).

## Instructor notes (short)

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


## Step-by-step fill guide (participant walkthrough)

### A. Scaffold
- Open IntelliJ on `%USERPROFILE%\java-bootcamp`.
- Prefer timed path: copy `starter/*` into `examples\lab13-crm`.
- Confirm JDK **21** and Maven **3.9+** (`java -version`, `mvn -version`).

### B. Implement TODOs in GUIDE order
- Follow [`../LAB-13-GUIDE.md`](../LAB-13-GUIDE.md) Steps top-to-bottom.
- When stuck, open the matching file under this `solution/src` (or `contracts/` / `docs/`) and compare **behavior**, not just names.
- Do not paste blindly — check package names (especially Lab 14 `com.northstar.crm.mapper`).

### C. Verify on Windows (this machine baseline)
```powershell
cd $env:USERPROFILE\java-bootcamp\examples\lab13-crm
# Or from the repo solution folder:
# cd "...\module-13\lab13\solution"
PowerShell [xml] load on contracts+samples
```

### D. Common pitfalls for Lab 13
- Wrong **Tests run** count usually means a missing test class/method shell or leftover `PlaceholderTest`.
- Package / import drift vs GUIDE samples → fix imports to match solution packages.
- Never commit `target/`.

## Verified on instructor machine

**Date:** Tuesday, August 4, 2026  
**JDK:** Temurin OpenJDK **21.0.11**  
**Maven:** **3.9.9**  
**Result:** Solution suite/smoke **PASS** under `%USERPROFILE%\java-bootcamp\examples\_week2-verify\lab13-solution`.



## Reference implementation — customer.xsd

Path: `contracts/customer.xsd`

```text
<?xml version="1.0" encoding="UTF-8"?>
<xs:schema xmlns:xs="http://www.w3.org/2001/XMLSchema"
           xmlns:tns="http://northstar.com/crm/customer"
           targetNamespace="http://northstar.com/crm/customer"
           elementFormDefault="qualified">

  <xs:simpleType name="CustomerStatus">
    <xs:restriction base="xs:string">
      <xs:enumeration value="PROSPECT"/>
      <xs:enumeration value="ACTIVE"/>
      <xs:enumeration value="SUSPENDED"/>
      <xs:enumeration value="CLOSED"/>
    </xs:restriction>
  </xs:simpleType>

  <xs:complexType name="CustomerType">
    <xs:sequence>
      <xs:element name="customerId" type="xs:string"/>
      <xs:element name="fullName" type="xs:string"/>
      <xs:element name="email" type="xs:string"/>
      <xs:element name="phone" type="xs:string" minOccurs="0"/>
      <xs:element name="status" type="tns:CustomerStatus"/>
      <xs:element name="createdAt" type="xs:dateTime"/>
    </xs:sequence>
  </xs:complexType>

  <xs:element name="createCustomerRequest">
    <xs:complexType>
      <xs:sequence>
        <xs:element name="fullName" type="xs:string"/>
        <xs:element name="email" type="xs:string"/>
        <xs:element name="phone" type="xs:string" minOccurs="0"/>
        <xs:element name="status" type="tns:CustomerStatus" minOccurs="0"/>
        <xs:element name="correlationId" type="xs:string" minOccurs="0"/>
      </xs:sequence>
    </xs:complexType>
  </xs:element>
  <xs:element name="createCustomerResponse">
    <xs:complexType>
      <xs:sequence>
        <xs:element name="customer" type="tns:CustomerType"/>
      </xs:sequence>
    </xs:complexType>
  </xs:element>

  <xs:element name="updateCustomerRequest">
    <xs:complexType>
      <xs:sequence>
        <xs:element name="customerId" type="xs:string"/>
        <xs:element name="fullName" type="xs:string" minOccurs="0"/>
        <xs:element name="email" type="xs:string" minOccurs="0"/>
        <xs:element name="phone" type="xs:string" minOccurs="0"/>
        <xs:element name="status" type="tns:CustomerStatus" minOccurs="0"/>
        <xs:element name="correlationId" type="xs:string" minOccurs="0"/>
      </xs:sequence>
    </xs:complexType>
  </xs:element>
  <xs:element name="updateCustomerResponse">
    <xs:complexType>
      <xs:sequence>
        <xs:element name="customer" type="tns:CustomerType"/>
      </xs:sequence>
    </xs:complexType>
  </xs:element>

  <xs:element name="getCustomerRequest">
    <xs:complexType>
      <xs:sequence>
        <xs:element name="customerId" type="xs:string"/>
        <xs:element name="correlationId" type="xs:string" minOccurs="0"/>
      </xs:sequence>
    </xs:complexType>
  </xs:element>
  <xs:element name="getCustomerResponse">
    <xs:complexType>
      <xs:sequence>
        <xs:element name="customer" type="tns:CustomerType"/>
      </xs:sequence>
    </xs:complexType>
  </xs:element>
</xs:schema>

```



## Reference implementation — operation-matrix

Path: `docs/operation-matrix.md`

```markdown
# Operation matrix (Lab 13)

| Operation | Purpose | Key inputs | Key outputs |
| --------- | ------- | ---------- | ----------- |
| CreateCustomer | Register a new CRM customer | fullName, email, optional phone/status, correlationId | CustomerType (e.g. CUS-1001 ACTIVE) |
| UpdateCustomer | Change mutable fields / status | customerId, optional fields/status, correlationId | Updated CustomerType (e.g. CUS-1002 → ACTIVE) |
| GetCustomer | Fetch one customer by ID | customerId, optional correlationId | CustomerType or SOAP Fault not-found |

```

