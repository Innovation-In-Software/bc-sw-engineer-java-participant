# Lab 18 — Detailed solution (instructor / shared after class)

> **Audience:** Instructors and participants when the instructor releases `solution/`.  
> **Do not open this during the timed path** unless your instructor says so.  
> Timed starter card: [`../starter/README.md`](../starter/README.md) · Full steps: [`../LAB-18-GUIDE.md`](../LAB-18-GUIDE.md)

## Goal

**Mockito isolation**

## What you should end with

| Check | Expected |
| --- | --- |
| Verify command | `mvn -B clean test` |
| Suite / smoke | Tests run: 6 (baseline 2 + Mockito 3 + BDD 1) |
| Workspace copy (optional) | `%USERPROFILE%\java-bootcamp\examples\lab18-crm` from this `solution/` |

## Solution tree (key files)

### Java / sources
- `src/main/java/com/northstar/crm/Main.java`
- `src/main/java/com/northstar/crm/entity/Customer.java`
- `src/main/java/com/northstar/crm/entity/CustomerStatus.java`
- `src/main/java/com/northstar/crm/dto/CustomerMapper.java`
- `src/main/java/com/northstar/crm/dto/CustomerRequestDTO.java`
- `src/main/java/com/northstar/crm/dto/CustomerResponseDTO.java`
- `src/main/java/com/northstar/crm/exception/BusinessException.java`
- `src/main/java/com/northstar/crm/exception/CustomerNotFoundException.java`
- `src/main/java/com/northstar/crm/exception/ErrorResponse.java`
- `src/main/java/com/northstar/crm/exception/GlobalExceptionHandler.java`
- `src/main/java/com/northstar/crm/config/AppConfig.java`
- `src/main/java/com/northstar/crm/repository/CustomerRepository.java`
- `src/main/java/com/northstar/crm/repository/InMemoryCustomerRepository.java`
- `src/main/java/com/northstar/crm/service/CustomerService.java`
- `src/main/java/com/northstar/crm/service/CustomerValidator.java`
- `src/main/java/com/northstar/crm/service/DefaultCustomerService.java`
- `src/main/java/com/northstar/crm/api/ApiResult.java`
- `src/main/java/com/northstar/crm/api/CustomerApiFacade.java`
- `src/test/java/com/northstar/crm/service/CustomerServiceBddMockTest.java`
- `src/test/java/com/northstar/crm/service/CustomerServiceMockitoTest.java`
- `src/test/java/com/northstar/crm/service/CustomerServiceTests.java`

### Docs / contracts
- `isolation-policy.md`

## How this maps to the GUIDE

1. Copy `starter/` → `examples/lab18-crm` (timed path) **or** use this `solution/` as the completed reference.
2. Every `// TODO` in the starter has a filled implementation here — compare file-by-file with your work.
3. Run the verify command above from the project root (this folder or your `lab18-crm` copy).
4. Keep `docs/` notes that the GUIDE names (smells, isolation policy, monitoring report, etc.).

## Instructor notes (short)

# Lab 18 solution notes

## What / why

Mockito isolation for `DefaultCustomerService`: mock repository, keep validator real, prove activate Ravi with stub/verify, `never().save` on `CUS-9999`, and `ArgumentCaptor` on add Amina. BDDMockito twin covers given/then/should style.

## Verify

```powershell
cd "labs\Week 2 - Backend, AI Tools and Testing\module-18\lab18\solution"
mvn -B clean test
mvn -q test -Dtest=CustomerServiceMockitoTest,CustomerServiceBddMockTest
```

Run twice for determinism. Expect BUILD SUCCESS.

## Pitfalls

- Missing `@ExtendWith(MockitoExtension.class)` → NPE on `@Mock`.
- Mocking the SUT → honor violation.
- Unused stubs → `UnnecessaryStubbingException`.
- Different mock instances for validator vs service → uniqueness stubs miss.


## Step-by-step fill guide (participant walkthrough)

### A. Scaffold
- Open IntelliJ on `%USERPROFILE%\java-bootcamp`.
- Prefer timed path: copy `starter/*` into `examples\lab18-crm`.
- Confirm JDK **21** and Maven **3.9+** (`java -version`, `mvn -version`).

### B. Implement TODOs in GUIDE order
- Follow [`../LAB-18-GUIDE.md`](../LAB-18-GUIDE.md) Steps top-to-bottom.
- When stuck, open the matching file under this `solution/src` (or `contracts/` / `docs/`) and compare **behavior**, not just names.
- Do not paste blindly — check package names (especially Lab 14 `com.northstar.crm.mapper`).

### C. Verify on Windows (this machine baseline)
```powershell
cd $env:USERPROFILE\java-bootcamp\examples\lab18-crm
# Or from the repo solution folder:
# cd "...\module-18\lab18\solution"
mvn -B clean test
```

### D. Common pitfalls for Lab 18
- Wrong **Tests run** count usually means a missing test class/method shell or leftover `PlaceholderTest`.
- Package / import drift vs GUIDE samples → fix imports to match solution packages.
- Never commit `target/`.

## Verified on instructor machine

**Date:** Tuesday, August 4, 2026  
**JDK:** Temurin OpenJDK **21.0.11**  
**Maven:** **3.9.9**  
**Result:** Solution suite/smoke **PASS** under `%USERPROFILE%\java-bootcamp\examples\_week2-verify\lab18-solution`.

