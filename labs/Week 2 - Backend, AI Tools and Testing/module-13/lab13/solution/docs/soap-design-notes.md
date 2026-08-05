# SOAP design notes (Lab 13)

- Style: document/literal SOAP 1.1; namespace `http://northstar.com/crm/customer`.
- Correlation: optional `correlationId` on requests (example `lab-request-001`).
- Endpoint `http://localhost:8080/ws` is a **placeholder** — not live; Lab 24 hosts Spring-WS.
- UpdateCustomer status change maps to Lab 12 `updateStatus` conceptually.
- Faults: Client fault for not-found / validation; Lab 24 will map to Spring-WS fault resolvers.
- Auth: none required now; document future WS-Security / gateway later.
