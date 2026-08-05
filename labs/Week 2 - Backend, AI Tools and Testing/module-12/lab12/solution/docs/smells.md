# Code smells (Lab 12 baseline)

| # | Smell | CRM impact | Fix applied |
| - | ----- | ---------- | ----------- |
| 1 | Poor naming (`doStuff`, `data`) | Unreadable API for Lab 13+ | `createCustomer` / `getCustomer` / `customersById` |
| 2 | Raw types | ClassCast risk | `Map<String, Customer>` |
| 3 | Long method / mixed responsibilities | Hard to test | Extracted validation helpers |
| 4 | Stringly-typed status | Typo bugs | Typed `CustomerStatus` parameter |
| 5 | Incorrect equality (`==`) | Missed lookups | Map key + `equals` |
| 6 | Null as control flow | NPEs in callers | Exceptions with messages |
| 7 | Side-effect logging | Noisy / uncorrelated | Correlation in exception messages |
| 8 | Magic `"UPDATE"` behavior | Undocumented updates | Removed; use `updateStatus` only |
