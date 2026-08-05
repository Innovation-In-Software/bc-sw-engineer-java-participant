# Before / after (Lab 12)

## Before

- API: `doStuff` / `get`
- Store: raw `List`
- Errors: return `null`
- Lookup bug: `==` on String IDs

## After

- API: `createCustomer` / `getCustomer` / `updateStatus`
- Store: `Map<String, Customer>`
- Errors: `IllegalArgumentException` / `IllegalStateException` with `correlationId=lab-request-001`
- Lookup: Map get works for `new String("CUS-1001")`

## Tests

`mvn -B clean test` → Tests run: 8, Failures: 0
