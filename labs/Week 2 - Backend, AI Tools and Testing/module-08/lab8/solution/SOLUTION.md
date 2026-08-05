# Lab 8 — Detailed solution (instructor / shared after class)

> **Audience:** Instructors and participants when the instructor releases `solution/`.  
> **Do not open this during the timed path** unless your instructor says so.  
> Timed starter card: [`../starter/README.md`](../starter/README.md) · Full steps: [`../LAB-8-GUIDE.md`](../LAB-8-GUIDE.md)

## Goal

**Project structure / layers**

## What you should end with

| Check | Expected |
| --- | --- |
| Verify command | `mvn -B clean compile; java -cp target/classes com.northstar.crm.Main` |
| Suite / smoke | compile + Main smoke (no Surefire suite required) |
| Workspace copy (optional) | `%USERPROFILE%\java-bootcamp\examples\lab8-crm` from this `solution/` |

## Solution tree (key files)

### Java / sources
- `src/main/java/com/northstar/crm/Main.java`
- `src/main/java/com/northstar/crm/controller/CustomerController.java`
- `src/main/java/com/northstar/crm/service/CustomerService.java`
- `src/main/java/com/northstar/crm/repository/CustomerRepository.java`
- `src/main/java/com/northstar/crm/entity/Customer.java`
- `src/main/java/com/northstar/crm/dto/CustomerRequest.java`
- `src/main/java/com/northstar/crm/dto/CustomerResponse.java`
- `src/main/java/com/northstar/crm/config/AppConfig.java`
- `src/main/java/com/northstar/crm/exception/CustomerNotFoundException.java`

### Docs / contracts
- `CODING-STANDARDS.md`
- `layer-flow.md`

## How this maps to the GUIDE

1. Copy `starter/` → `examples/lab8-crm` (timed path) **or** use this `solution/` as the completed reference.
2. Every `// TODO` in the starter has a filled implementation here — compare file-by-file with your work.
3. Run the verify command above from the project root (this folder or your `lab8-crm` copy).
4. Keep `docs/` notes that the GUIDE names (smells, isolation policy, monitoring report, etc.).

## Instructor notes (short)

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


## Step-by-step fill guide (participant walkthrough)

### A. Scaffold
- Open IntelliJ on `%USERPROFILE%\java-bootcamp`.
- Prefer timed path: copy `starter/*` into `examples\lab8-crm`.
- Confirm JDK **21** and Maven **3.9+** (`java -version`, `mvn -version`).

### B. Implement TODOs in GUIDE order
- Follow [`../LAB-8-GUIDE.md`](../LAB-8-GUIDE.md) Steps top-to-bottom.
- When stuck, open the matching file under this `solution/src` (or `contracts/` / `docs/`) and compare **behavior**, not just names.
- Do not paste blindly — check package names (especially Lab 14 `com.northstar.crm.mapper`).

### C. Verify on Windows (this machine baseline)
```powershell
cd $env:USERPROFILE\java-bootcamp\examples\lab8-crm
# Or from the repo solution folder:
# cd "...\module-08\lab8\solution"
mvn -B clean compile; java -cp target/classes com.northstar.crm.Main
```

### D. Common pitfalls for Lab 8
- Wrong **Tests run** count usually means a missing test class/method shell or leftover `PlaceholderTest`.
- Package / import drift vs GUIDE samples → fix imports to match solution packages.
- Never commit `target/`.

## Verified on instructor machine

**Date:** Tuesday, August 4, 2026  
**JDK:** Temurin OpenJDK **21.0.11**  
**Maven:** **3.9.9**  
**Result:** Solution suite/smoke **PASS** under `%USERPROFILE%\java-bootcamp\examples\_week2-verify\lab8-solution`.

