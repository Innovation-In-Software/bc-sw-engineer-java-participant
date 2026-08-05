# Operation matrix (Lab 13)

| Operation | Purpose | Key inputs | Key outputs |
| --------- | ------- | ---------- | ----------- |
| CreateCustomer | Register a new CRM customer | fullName, email, optional phone/status, correlationId | CustomerType (e.g. CUS-1001 ACTIVE) |
| UpdateCustomer | Change mutable fields / status | customerId, optional fields/status, correlationId | Updated CustomerType (e.g. CUS-1002 → ACTIVE) |
| GetCustomer | Fetch one customer by ID | customerId, optional correlationId | CustomerType or SOAP Fault not-found |
