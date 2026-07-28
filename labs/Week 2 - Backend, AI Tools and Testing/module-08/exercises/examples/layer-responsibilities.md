## Exercise-03-layer-responsibilities:

### Layer map

| Layer/package | Owns | Does not own |
| ------------- | ---- | ------------ |
| `controller` | Transport boundary, request/response mapping | Business rules, storage |
| `service` | Validation, orchestration, business policy | HTTP details, SQL |
| `repository` | Save/find abstraction | UI formatting, business workflow |
| `entity` | Domain state/identity | HTTP request shape |
| `dto` | Boundary input/output shape | Persistence behavior |
| `config` | Object/application configuration | Customer operations |
| `exception` | Meaningful failure types | Catch-all utility logic |

### Assign the tasks

| Task | Layer      |
| ---- |------------|
| Accept future create-customer input | controller |
| Reject blank customer name | service    |
| Find customer by ID | repository |
| Represent customer ID/name/status | entity     |
| Represent create request fields | dto        |
| Define customer-not-found failure | exception  |
| Wire application objects later | config     |

### Repair a “god controller”

Bad flow:

```text
Controller validates every business rule
→ edits an in-memory list directly
→ constructs database queries
→ formats errors
```

Rewrite it:

```text
Controller maps request
→ Service validates/orchestrates
→ Repository saves/finds
→ Service returns result
→ Controller maps response
```

### Explain why boundaries help

Write 3–5 sentences covering:

- isolated testing;
- replacing storage without changing controller;
- keeping transport concerns out of business logic;
- making ownership discoverable.

Every responsibility has one primary home, and the repaired flow follows controller → service → repository.
