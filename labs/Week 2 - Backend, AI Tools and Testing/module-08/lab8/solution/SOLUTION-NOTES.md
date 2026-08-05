# Lab 8 — Instructor solution notes

## What was implemented

- Seven-layer Maven skeleton under `com.northstar.crm` with compile-ready stubs.
- `Main` prints banner, package list, and fixtures `CUS-1001` / `CUS-1002`.
- Repository/service methods intentionally throw `UnsupportedOperationException` (Lab 8 scope).
- Controller delegates to service; `CustomerNotFoundException` message matches guide.
- `docs/layer-flow.md` and `docs/CODING-STANDARDS.md` filled.

## Key files

- `src/main/java/com/northstar/crm/Main.java`
- Layer stubs under `controller`, `service`, `repository`, `entity`, `dto`, `config`, `exception`
- `docs/layer-flow.md`, `docs/CODING-STANDARDS.md`

## How to verify (Windows PowerShell)

```powershell
cd "labs\Week 2 - Backend, AI Tools and Testing\module-08\lab8\solution"
mvn -q clean compile
java -cp target\classes com.northstar.crm.Main
```

Expected: banner + seven packages + `CUS-1001` / `CUS-1002`.

## Pitfalls vs starter TODOs

- Lab 8 success is stubs that throw — do not implement persistence yet.
- Do not add Spring/JPA/Kafka imports.
- Controller must delegate; exception message must be `Customer not found: {id}`.
