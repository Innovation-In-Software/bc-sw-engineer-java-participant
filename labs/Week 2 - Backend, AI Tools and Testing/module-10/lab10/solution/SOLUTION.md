# Lab 10 — Detailed solution (instructor / shared after class)

> **Audience:** Instructors and participants when the instructor releases `solution/`.  
> **Do not open this during the timed path** unless your instructor says so.  
> Timed starter card: [`../starter/README.md`](../starter/README.md) · Full steps: [`../LAB-10-GUIDE.md`](../LAB-10-GUIDE.md)

## Goal

**Copilot domain model**

## What you should end with

| Check | Expected |
| --- | --- |
| Verify command | `mvn -B clean compile; java -cp target/classes com.northstar.crm.Main` |
| Suite / smoke | Main demo with CUS-1001/CUS-1002 |
| Workspace copy (optional) | `%USERPROFILE%\java-bootcamp\examples\lab10-crm` from this `solution/` |

## Solution tree (key files)

### Java / sources
- `src/main/java/com/northstar/crm/Main.java`
- `src/main/java/com/northstar/crm/service/CustomerService.java`
- `src/main/java/com/northstar/crm/entity/Customer.java`
- `src/main/java/com/northstar/crm/entity/CustomerStatus.java`
- `src/main/java/com/northstar/crm/dto/CustomerRequest.java`
- `src/main/java/com/northstar/crm/dto/CustomerResponse.java`
- `src/main/java/com/northstar/crm/config/AppConfig.java`
- `src/main/java/com/northstar/crm/exception/CustomerNotFoundException.java`

### Docs / contracts
- (see solution tree)

## How this maps to the GUIDE

1. Copy `starter/` → `examples/lab10-crm` (timed path) **or** use this `solution/` as the completed reference.
2. Every `// TODO` in the starter has a filled implementation here — compare file-by-file with your work.
3. Run the verify command above from the project root (this folder or your `lab10-crm` copy).
4. Keep `docs/` notes that the GUIDE names (smells, isolation policy, monitoring report, etc.).

## Instructor notes (short)

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


## Step-by-step fill guide (participant walkthrough)

### A. Scaffold
- Open IntelliJ on `%USERPROFILE%\java-bootcamp`.
- Prefer timed path: copy `starter/*` into `examples\lab10-crm`.
- Confirm JDK **21** and Maven **3.9+** (`java -version`, `mvn -version`).

### B. Implement TODOs in GUIDE order
- Follow [`../LAB-10-GUIDE.md`](../LAB-10-GUIDE.md) Steps top-to-bottom.
- When stuck, open the matching file under this `solution/src` (or `contracts/` / `docs/`) and compare **behavior**, not just names.
- Do not paste blindly — check package names (especially Lab 14 `com.northstar.crm.mapper`).

### C. Verify on Windows (this machine baseline)
```powershell
cd $env:USERPROFILE\java-bootcamp\examples\lab10-crm
# Or from the repo solution folder:
# cd "...\module-10\lab10\solution"
mvn -B clean compile; java -cp target/classes com.northstar.crm.Main
```

### D. Common pitfalls for Lab 10
- Wrong **Tests run** count usually means a missing test class/method shell or leftover `PlaceholderTest`.
- Package / import drift vs GUIDE samples → fix imports to match solution packages.
- Never commit `target/`.

## Verified on instructor machine

**Date:** Tuesday, August 4, 2026  
**JDK:** Temurin OpenJDK **21.0.11**  
**Maven:** **3.9.9**  
**Result:** Solution suite/smoke **PASS** under `%USERPROFILE%\java-bootcamp\examples\_week2-verify\lab10-solution`.

