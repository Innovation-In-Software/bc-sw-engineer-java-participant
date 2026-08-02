# Module 24 — Classroom pacing (Learn → Practice → Review)

**For instructors and participants.** Do **not** finish every Module 24 slide before practicing.

Detailed author notes: `curriculum/Week 3 - Spring Framework and Enterprise Patterns/module-24/INSTRUCTOR-PACING.md`

## Checkpoint map

| Block | After slides | Practice |
| ----- | ------------ | -------- |
| **A** | 66–74 | [Ex 1](exercises/exercise-01-contract-first-recall.md) |
| **B** | 75–78 | [Ex 2](exercises/exercise-02-operation-map.md) · [Ex 3](exercises/exercise-03-payloadroot-skeleton.md) |
| **C** | 79–82 | [Ex 4](exercises/exercise-04-fault-vs-rest.md) |
| **D** | 83–86 | [Ex 5](exercises/exercise-05-usernametoken-plan.md) · [Ex 6](exercises/exercise-06-lab24-readiness.md) |
| **E** | 87–89 | [Lab 24](lab24/LAB-24-GUIDE.md) · Kahoot |

**Classroom practice order:** **1 → 2 → 3 → 4 → 5 → 6**

## Streamline overlapping topics

| Topic | Keep short | Why |
| ----- | ---------- | --- |
| Full WS-Security stack (signatures, SAML) | UsernameToken lab only | Timed path proves message-level auth |
| Replacing REST with SOAP | Forbidden | Both share `CustomerService` |
| Deep JAXB internals | Mapper TODOs | Lab focuses endpoint + contract |
| JWT / SecurityFilterChain | Later (Lab 28) | Different protocol security story |

## SOAP reminder

```text
XSD (contract-first) → WSDL → @Endpoint / @PayloadRoot
CustomerEndpoint → CustomerService (same as REST)
SOAP fault ≠ REST JSON error · UsernameToken = lab message security
```

## Incremental build

Exercises 1–6 notes → Lab 24 `examples/lab24-crm` (Spring-WS endpoint + WSDL + faults + UsernameToken).

Start here: [`README.md`](README.md) · Exercises: [`exercises/EXERCISES-INDEX.md`](exercises/EXERCISES-INDEX.md)
