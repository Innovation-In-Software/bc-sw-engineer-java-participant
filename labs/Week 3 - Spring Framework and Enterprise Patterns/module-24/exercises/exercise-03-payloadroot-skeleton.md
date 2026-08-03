# Exercise 3 — PayloadRoot Skeleton (TODOs)

**Module 24** · Checkpoint B · Exercises 1–6 Pass then Lab 24

## Activity card

| | |
| --- | --- |
| **Objective** | Fill a @PayloadRoot skeleton for getCustomer |
| **Skills practiced** | PayloadRoot sketching |
| **Expected outcome** | notes/lab24-payloadroot-skeleton.md |
| **Estimated time** | 10–12 minutes |
| **File to create** | `examples/module-24-exercises/` → notes/lab24-payloadroot-skeleton.md |
| **Checkpoint** | B (after slides 75–78) |

## What you will learn

- @Endpoint on CustomerEndpoint
- namespace + localPart must match XSD
- Delegate to CustomerService after mapping

**Enterprise context:** A one-character namespace drift means the dispatcher never finds your method.

## Deliverable

**Submit only** the file(s) below (not the graded lab).

| Item | Path (under `examples/module-24-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab24-payloadroot-skeleton.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 24 — PayloadRoot Skeleton

@Endpoint class CustomerEndpoint
@PayloadRoot(namespace = NAMESPACE, localPart = "GetCustomerRequest")
method getCustomer(@RequestPayload GetCustomerRequest req)
→ map → customerService.get(...) → map response

NAMESPACE must match customer.xsd targetNamespace.

## Scope
Pre-lab only.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-24-exercises/`, create `notes/` if needed, then create `notes/lab24-payloadroot-skeleton.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 24 — PayloadRoot Skeleton

## Class annotation
_____

## @PayloadRoot localPart
_____

## Method inputs/outputs
_____

## Delegation line (words)
_____

## Scope
Pre-lab only.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab24-001` (or `lab-request-001` on REST). Replace every `_____` before Pass.

## Expected result

PayloadRoot skeleton in `notes/lab24-payloadroot-skeleton.md`.

## Debug / design challenge

If localPart is GetCustomer but XSD says GetCustomerRequest, what happens?

## Predict the Output / Behavior

Does @PayloadRoot replace the need for MessageDispatcherServlet config?

## Troubleshooting

### If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab24-payloadroot-skeleton.md` |
| Using @GetMapping | This is SOAP — @PayloadRoot |
| No delegation note | Call CustomerService |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab24-payloadroot-skeleton.md`
- [ ] @Endpoint noted
- [ ] localPart noted
- [ ] Service delegation
