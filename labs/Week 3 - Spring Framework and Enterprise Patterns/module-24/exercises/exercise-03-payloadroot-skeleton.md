# Exercise 4 — PayloadRoot Skeleton (TODOs)

**Module 24** · Hands-on exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab24-payloadroot-skeleton.md` — complete a pseudocode endpoint skeleton showing delegation to CustomerService.

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-24-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-03-payloadroot-skeleton.md` (this file in the course repo) |
| Your notes file | `notes/lab24-payloadroot-skeleton.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 24 — PayloadRoot Skeleton (TODOs)

## Step 2 — Fill TODOs
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-24-exercises/`, create `notes/` if needed, then create `notes/lab24-payloadroot-skeleton.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 24 — PayloadRoot Skeleton (TODOs)

## Step 2 — Fill TODOs

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

## Step 3 — Self-check

Confirm no business rules live inside the endpoint beyond mapping/delegation.

## Step 4 — Reflect

Write: UsernameToken interceptor is Lab 24 work — not completed in pre-lab.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Endpoint sketch blanks filled; delegation rule clear in `notes/lab24-payloadroot-skeleton.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab24-payloadroot-skeleton.md` |
| Putting uniqueness rules in endpoint | Keep rules in CustomerService |
| Using `@RestController` for SOAP | Spring-WS uses `@Endpoint` |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab24-payloadroot-skeleton.md`
- [ ] `@Endpoint` and GetCustomer localPart filled
- [ ] Service `get` delegation present
- [ ] No rule logic invented in the endpoint

