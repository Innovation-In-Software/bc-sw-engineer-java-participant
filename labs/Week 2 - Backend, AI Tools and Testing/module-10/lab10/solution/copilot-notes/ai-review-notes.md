## lab10-001 — weak vs strong (entity)

- Date: 2026-08-03
- Weak prompt used: `// customer class`
- Output summary: Invented Long id / JPA-style fields
- Strong prompt used: named fields, CustomerStatus enum, equals on customerId only, no JPA
- Output summary: Plain POJO matching Lab 10 shape
- Decision: accept-with-edits
- Reason: Rejected phantom JPA; kept String customerId.

## lab10-002 — weak vs strong (addCustomer)

- Date: 2026-08-03
- Weak prompt used: `// add a customer`
- Output summary: Happy path only
- Strong prompt used: blank/duplicate guards with IllegalStateException
- Output summary: Guard clauses present
- Decision: accept
- Reason: Rules match enterprise validation needs.

## lab10-003 — human review checklist

| # | Confirm | Notes |
| - | ------- | ----- |
| 1 | Imports resolve (no phantom JPA/Spring) | Pass |
| 2 | Blank/duplicate/unknown ID rules present | Pass |
| 3 | equals/hashCode on customerId only | Pass |
| 4 | Explainable without Copilot | Pass |
| 5 | No secrets / real PII | Pass |

Caught/corrected: rejected `@Entity`/`@Id` suggestion for Customer.

## lab10-004 — AI risk awareness

1. Avoided real SSNs/passwords; used CUS-1001 / CUS-1002 sample emails only.
2. If suggestion looks copied from a library, verify license/provenance before accepting.
3. Team rule: no merge of AI code the author cannot explain offline.
