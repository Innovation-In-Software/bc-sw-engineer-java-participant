# Northstar CRM Coding Standards (Lab 8)

## Layers

- controller: transport / API mapping only
- service: business rules
- repository: persistence
- entity: domain model
- dto: request/response contracts
- config: wiring
- exception: domain and API failures

## Dependency direction (hard rule)

```text
controller -> service -> repository -> entity
controller -> dto
service    -> dto, entity, exception
repository -> entity
entity     -> (nothing in other CRM layers)
```

## Naming

- Types: `CustomerService`, `CustomerRepository`, `CustomerController`
- Methods: `findById`, `create`, `getById`
- Stable example IDs: `CUS-####` (e.g. `CUS-1001`, `CUS-1002`)

## What must NOT live where

- Services must not depend on controllers.
- Entities must not carry HTTP or SOAP types.
- Repositories must not import controllers or DTOs.
- No production passwords or API keys in source or properties.
- Prefer JDK 21 + Maven; do not commit `target/` or secrets.
