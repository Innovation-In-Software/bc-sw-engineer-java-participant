# Lab 10 — Instructor solution notes

## What was implemented

- Plain-Java `Customer` + `CustomerStatus` (no JPA/Spring).
- In-memory `CustomerService` with add/find/updateStatus/listAll/findByStatus.
- `Main` demos CUS-1001 ACTIVE and CUS-1002 PROSPECT→ACTIVE.
- Review log entries `lab10-001`–`lab10-004`.

## How to verify

```powershell
cd "labs\Week 2 - Backend, AI Tools and Testing\module-10\lab10\solution"
mvn -q clean compile
java -cp target\classes com.northstar.crm.Main
```

## Pitfalls

- Reject `@Entity` / `Long id` from Copilot.
- Prefer `java -cp target\classes` over fat JAR for this harness.
