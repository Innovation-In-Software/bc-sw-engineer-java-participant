# Lab 13 — Complete reference solution

> **Finished project** — every source file below is the completed answer (not a smoke checklist).
>
> Attempt [`../starter/`](../starter/) first. Guide: [`../LAB-13-GUIDE.md`](../LAB-13-GUIDE.md)

## Goal

**SOAP contract-first XSD/WSDL + sample envelopes (no Java server)**

## Run the finished project

```powershell
New-Item -ItemType Directory -Force -Path "$env:USERPROFILE\java-bootcamp\examples\lab13-crm" | Out-Null
Copy-Item -Recurse -Force ".\*" "$env:USERPROFILE\java-bootcamp\examples\lab13-crm\"
cd $env:USERPROFILE\java-bootcamp\examples\lab13-crm
# [xml] well-formedness on contracts/ + samples/
```

**Expected:** 10/10 well-formed XML

## File index (12 files)

| # | Path |
|---|------|
| 1 | `contracts/customer.xsd` |
| 2 | `contracts/CustomerService.wsdl` |
| 3 | `samples/createCustomerRequest.xml` |
| 4 | `samples/createCustomerResponse.xml` |
| 5 | `samples/fault-customerNotFound.xml` |
| 6 | `samples/fault-validation.xml` |
| 7 | `samples/getCustomerRequest.xml` |
| 8 | `samples/getCustomerResponse.xml` |
| 9 | `samples/updateCustomerRequest.xml` |
| 10 | `samples/updateCustomerResponse.xml` |
| 11 | `docs/operation-matrix.md` |
| 12 | `docs/soap-design-notes.md` |

## Full source

### `contracts/customer.xsd`

```xml
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

### `contracts/CustomerService.wsdl`

```xml
<?xml version="1.0" encoding="UTF-8"?>
<definitions name="CustomerService"
             targetNamespace="http://northstar.com/crm/customer"
             xmlns="http://schemas.xmlsoap.org/wsdl/"
             xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/"
             xmlns:tns="http://northstar.com/crm/customer"
             xmlns:xsd="http://www.w3.org/2001/XMLSchema">

  <types>
    <xsd:schema>
      <xsd:import namespace="http://northstar.com/crm/customer"
                  schemaLocation="customer.xsd"/>
    </xsd:schema>
  </types>

  <message name="CreateCustomerRequestMessage">
    <part name="body" element="tns:createCustomerRequest"/>
  </message>
  <message name="CreateCustomerResponseMessage">
    <part name="body" element="tns:createCustomerResponse"/>
  </message>
  <message name="UpdateCustomerRequestMessage">
    <part name="body" element="tns:updateCustomerRequest"/>
  </message>
  <message name="UpdateCustomerResponseMessage">
    <part name="body" element="tns:updateCustomerResponse"/>
  </message>
  <message name="GetCustomerRequestMessage">
    <part name="body" element="tns:getCustomerRequest"/>
  </message>
  <message name="GetCustomerResponseMessage">
    <part name="body" element="tns:getCustomerResponse"/>
  </message>

  <portType name="CustomerPortType">
    <operation name="CreateCustomer">
      <input message="tns:CreateCustomerRequestMessage"/>
      <output message="tns:CreateCustomerResponseMessage"/>
    </operation>
    <operation name="UpdateCustomer">
      <input message="tns:UpdateCustomerRequestMessage"/>
      <output message="tns:UpdateCustomerResponseMessage"/>
    </operation>
    <operation name="GetCustomer">
      <input message="tns:GetCustomerRequestMessage"/>
      <output message="tns:GetCustomerResponseMessage"/>
    </operation>
  </portType>

  <binding name="CustomerSoapBinding" type="tns:CustomerPortType">
    <soap:binding transport="http://schemas.xmlsoap.org/soap/http" style="document"/>
    <operation name="CreateCustomer">
      <soap:operation soapAction="http://northstar.com/crm/customer/CreateCustomer"/>
      <input><soap:body use="literal"/></input>
      <output><soap:body use="literal"/></output>
    </operation>
    <operation name="UpdateCustomer">
      <soap:operation soapAction="http://northstar.com/crm/customer/UpdateCustomer"/>
      <input><soap:body use="literal"/></input>
      <output><soap:body use="literal"/></output>
    </operation>
    <operation name="GetCustomer">
      <soap:operation soapAction="http://northstar.com/crm/customer/GetCustomer"/>
      <input><soap:body use="literal"/></input>
      <output><soap:body use="literal"/></output>
    </operation>
  </binding>

  <service name="CustomerService">
    <port name="CustomerSoapPort" binding="tns:CustomerSoapBinding">
      <!-- Placeholder only — Lab 24 hosts a real URL under /ws -->
      <soap:address location="http://localhost:8080/ws"/>
    </port>
  </service>
</definitions>
```

### `samples/createCustomerRequest.xml`

```xml
<?xml version="1.0" encoding="UTF-8"?>
<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
                  xmlns:cus="http://northstar.com/crm/customer">
  <soapenv:Header/>
  <soapenv:Body>
    <cus:createCustomerRequest>
      <cus:fullName>Amina Khan</cus:fullName>
      <cus:email>amina.khan@example.com</cus:email>
      <cus:phone>+1-555-0101</cus:phone>
      <cus:status>ACTIVE</cus:status>
      <cus:correlationId>lab-request-001</cus:correlationId>
    </cus:createCustomerRequest>
  </soapenv:Body>
</soapenv:Envelope>
```

### `samples/createCustomerResponse.xml`

```xml
<?xml version="1.0" encoding="UTF-8"?>
<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
                  xmlns:cus="http://northstar.com/crm/customer">
  <soapenv:Header/>
  <soapenv:Body>
    <cus:createCustomerResponse>
      <cus:customer>
        <cus:customerId>CUS-1001</cus:customerId>
        <cus:fullName>Amina Khan</cus:fullName>
        <cus:email>amina.khan@example.com</cus:email>
        <cus:phone>+1-555-0101</cus:phone>
        <cus:status>ACTIVE</cus:status>
        <cus:createdAt>2026-07-14T17:00:00Z</cus:createdAt>
      </cus:customer>
    </cus:createCustomerResponse>
  </soapenv:Body>
</soapenv:Envelope>
```

### `samples/fault-customerNotFound.xml`

```xml
<?xml version="1.0" encoding="UTF-8"?>
<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/">
  <soapenv:Body>
    <soapenv:Fault>
      <faultcode>soapenv:Client</faultcode>
      <faultstring>Customer not found: CUS-9999 (correlationId=lab-request-001)</faultstring>
      <detail>
        <errorCode>CUSTOMER_NOT_FOUND</errorCode>
      </detail>
    </soapenv:Fault>
  </soapenv:Body>
</soapenv:Envelope>
```

### `samples/fault-validation.xml`

```xml
<?xml version="1.0" encoding="UTF-8"?>
<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/">
  <soapenv:Body>
    <soapenv:Fault>
      <faultcode>soapenv:Client</faultcode>
      <faultstring>Validation failed: fullName must not be blank (correlationId=lab-request-001)</faultstring>
      <detail>
        <errorCode>VALIDATION_ERROR</errorCode>
        <field>fullName</field>
      </detail>
    </soapenv:Fault>
  </soapenv:Body>
</soapenv:Envelope>
```

### `samples/getCustomerRequest.xml`

```xml
<?xml version="1.0" encoding="UTF-8"?>
<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
                  xmlns:cus="http://northstar.com/crm/customer">
  <soapenv:Header/>
  <soapenv:Body>
    <cus:getCustomerRequest>
      <cus:customerId>CUS-1002</cus:customerId>
      <cus:correlationId>lab-request-001</cus:correlationId>
    </cus:getCustomerRequest>
  </soapenv:Body>
</soapenv:Envelope>
```

### `samples/getCustomerResponse.xml`

```xml
<?xml version="1.0" encoding="UTF-8"?>
<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
                  xmlns:cus="http://northstar.com/crm/customer">
  <soapenv:Header/>
  <soapenv:Body>
    <cus:getCustomerResponse>
      <cus:customer>
        <cus:customerId>CUS-1002</cus:customerId>
        <cus:fullName>Ravi Singh</cus:fullName>
        <cus:email>ravi.singh@example.com</cus:email>
        <cus:phone>+1-555-0102</cus:phone>
        <cus:status>PROSPECT</cus:status>
        <cus:createdAt>2026-07-14T17:00:00Z</cus:createdAt>
      </cus:customer>
    </cus:getCustomerResponse>
  </soapenv:Body>
</soapenv:Envelope>
```

### `samples/updateCustomerRequest.xml`

```xml
<?xml version="1.0" encoding="UTF-8"?>
<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
                  xmlns:cus="http://northstar.com/crm/customer">
  <soapenv:Header/>
  <soapenv:Body>
    <cus:updateCustomerRequest>
      <cus:customerId>CUS-1002</cus:customerId>
      <cus:status>ACTIVE</cus:status>
      <cus:correlationId>lab-request-001</cus:correlationId>
    </cus:updateCustomerRequest>
  </soapenv:Body>
</soapenv:Envelope>
```

### `samples/updateCustomerResponse.xml`

```xml
<?xml version="1.0" encoding="UTF-8"?>
<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
                  xmlns:cus="http://northstar.com/crm/customer">
  <soapenv:Header/>
  <soapenv:Body>
    <cus:updateCustomerResponse>
      <cus:customer>
        <cus:customerId>CUS-1002</cus:customerId>
        <cus:fullName>Ravi Singh</cus:fullName>
        <cus:email>ravi.singh@example.com</cus:email>
        <cus:phone>+1-555-0102</cus:phone>
        <cus:status>ACTIVE</cus:status>
        <cus:createdAt>2026-07-14T17:00:00Z</cus:createdAt>
      </cus:customer>
    </cus:updateCustomerResponse>
  </soapenv:Body>
</soapenv:Envelope>
```

### `docs/operation-matrix.md`

```markdown
# Operation matrix (Lab 13)

| Operation | Purpose | Key inputs | Key outputs |
| --------- | ------- | ---------- | ----------- |
| CreateCustomer | Register a new CRM customer | fullName, email, optional phone/status, correlationId | CustomerType (e.g. CUS-1001 ACTIVE) |
| UpdateCustomer | Change mutable fields / status | customerId, optional fields/status, correlationId | Updated CustomerType (e.g. CUS-1002 → ACTIVE) |
| GetCustomer | Fetch one customer by ID | customerId, optional correlationId | CustomerType or SOAP Fault not-found |
```

### `docs/soap-design-notes.md`

```markdown
# SOAP design notes (Lab 13)

- Style: document/literal SOAP 1.1; namespace `http://northstar.com/crm/customer`.
- Correlation: optional `correlationId` on requests (example `lab-request-001`).
- Endpoint `http://localhost:8080/ws` is a **placeholder** — not live; Lab 24 hosts Spring-WS.
- UpdateCustomer status change maps to Lab 12 `updateStatus` conceptually.
- Faults: Client fault for not-found / validation; Lab 24 will map to Spring-WS fault resolvers.
- Auth: none required now; document future WS-Security / gateway later.
```

## Instructor notes

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


