# Exercise 4 — PayloadRoot Skeleton (TODOs)

**Module 24** · Hands-on exercise · [setup](EXERCISES-INDEX.md)

## Goal

Complete a pseudocode endpoint skeleton showing delegation to CustomerService.

## Steps

### Step 1 — Create sketch

Create `notes/CustomerEndpointSketch.java` (sketch only).

### Step 2 — Fill TODOs

```java
// TODO annotations — replace blanks
@_____
public class CustomerEndpoint {
    private final CustomerService service;

    public CustomerEndpoint(CustomerService service) {
        this.service = service;
    }

    @PayloadRoot(namespace = "http://northstar.example/customer", localPart = "_____")
    @ResponsePayload
    public GetCustomerResponse get(@RequestPayload GetCustomerRequest request) {
        // TODO: call service.get(request.getCustomerId()) then map to JAXB response
        var customer = service._____(request.getCustomerId());
        return CustomerSoapMapper.toGetResponse(customer);
    }
}
```
Hints: class annotation `@Endpoint`; localPart `GetCustomerRequest`; method `get`.

### Step 3 — Self-check

Confirm no business rules live inside the endpoint beyond mapping/delegation.

### Step 4 — Reflect

Write: UsernameToken interceptor is Lab 24 work — not completed in pre-lab.

## Expected result

Endpoint sketch blanks filled; delegation rule clear.

## If it fails

| Problem | Fix |
| --- | --- |
| Problem | Fix |
| Putting uniqueness rules in endpoint | Keep rules in CustomerService |
| Using `@RestController` for SOAP | Spring-WS uses `@Endpoint` |

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | `@Endpoint` and GetCustomer localPart filled | Pass / Fail |
| 2 | Service `get` delegation present | Pass / Fail |
| 3 | No rule logic invented in the endpoint | Pass / Fail |
