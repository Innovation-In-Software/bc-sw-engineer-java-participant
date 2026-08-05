# DTO boundary notes (Lab 14)

- API edge returns `CustomerResponseDTO` only — never `Customer` entity.
- Inbound payloads use `CustomerRequestDTO` with Jakarta Bean Validation.
- Mapping lives in `com.northstar.crm.mapper.CustomerMapper`.
- Facade validates first, then maps, then calls `createCustomer` / `getCustomer`.
- Correlation ID `lab-request-001` appears on validation and not-found failures.
- Timestamps: entity `LocalDateTime` → response `Instant` via UTC in the mapper.
