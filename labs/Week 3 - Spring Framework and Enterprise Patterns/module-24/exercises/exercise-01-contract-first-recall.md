# Exercise 1 — Contract-First Recall

**Module 24** · Analysis exercise · [setup](EXERCISES-INDEX.md)

## Goal

Explain why the partner XSD—not Java classes—owns the SOAP contract.

## Reference

| Artifact | Role |
| --- | --- |
| `customer.xsd` | Source of truth |
| Generated JAXB types | Derived from XSD |
| Dynamic WSDL | Published from XSD + Spring-WS |

## Steps

### Step 1 — One-paragraph rule

In `notes/contract-first.md`, write why editing Java first would drift the partner contract.

### Step 2 — Check the reference

Align with XSD → JAXB → WSDL order.

### Step 3 — Lab 13 link

Note Lab 24 implements Lab 13’s customer operations over Spring-WS.

### Step 4 — Boundary

State you will not author the full XSD in this pre-lab.

## Expected result

Contract-first rule and Lab 13 link are documented.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | XSD named as source of truth | Pass / Fail |
| 2 | JAXB/WSDL called derived | Pass / Fail |
| 3 | Pre-lab boundary clear | Pass / Fail |
