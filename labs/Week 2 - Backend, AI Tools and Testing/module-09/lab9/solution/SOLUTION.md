# Lab 9 — Detailed solution (instructor / shared after class)

> **Audience:** Instructors and participants when the instructor releases `solution/`.  
> **Do not open this during the timed path** unless your instructor says so.  
> Timed starter card: [`../starter/README.md`](../starter/README.md) · Full steps: [`../LAB-9-GUIDE.md`](../LAB-9-GUIDE.md)

## Goal

**Maven packaging / profiles**

## What you should end with

| Check | Expected |
| --- | --- |
| Verify command | `mvn -B clean verify` |
| Suite / smoke | Tests run: 1 (PlaceholderTest) |
| Workspace copy (optional) | `%USERPROFILE%\java-bootcamp\examples\lab9-crm` from this `solution/` |

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
- `src/test/java/com/northstar/crm/PlaceholderTest.java`

### Docs / contracts
- `CODING-STANDARDS.md`
- `dependency-tree.txt`
- `layer-flow.md`
- `lifecycle-evidence.md`

## How this maps to the GUIDE

1. Copy `starter/` → `examples/lab9-crm` (timed path) **or** use this `solution/` as the completed reference.
2. Every `// TODO` in the starter has a filled implementation here — compare file-by-file with your work.
3. Run the verify command above from the project root (this folder or your `lab9-crm` copy).
4. Keep `docs/` notes that the GUIDE names (smells, isolation policy, monitoring report, etc.).

## Instructor notes (short)

# Lab 9 — Instructor solution notes

## What was implemented

- Full Maven POM: coordinates, Spring placeholder + JUnit test scope, compiler/Surefire/jar plugins, `finalName=customer-service`.
- Profiles `dev` (default), `test`, `prod`.
- `PlaceholderTest` green; Lab 8 layer stubs retained.
- Lifecycle evidence + annotated dependency tree docs.

## Key files

- `pom.xml`, `src/test/.../PlaceholderTest.java`, `Main.java`
- `docs/lifecycle-evidence.md`, `docs/dependency-tree.txt`
- `src/main/resources/application-dev.properties`

## How to verify

```powershell
cd "labs\Week 2 - Backend, AI Tools and Testing\module-09\lab9\solution"
mvn -q clean test
mvn -q clean package
java -jar target\customer-service.jar
mvn -B verify
```

## Pitfalls

- Do not use `-q` when capturing `dependency:tree`.
- Keep JUnit `test` scope; no `@SpringBootApplication` in Week 2.


## Step-by-step fill guide (participant walkthrough)

### A. Scaffold
- Open IntelliJ on `%USERPROFILE%\java-bootcamp`.
- Prefer timed path: copy `starter/*` into `examples\lab9-crm`.
- Confirm JDK **21** and Maven **3.9+** (`java -version`, `mvn -version`).

### B. Implement TODOs in GUIDE order
- Follow [`../LAB-9-GUIDE.md`](../LAB-9-GUIDE.md) Steps top-to-bottom.
- When stuck, open the matching file under this `solution/src` (or `contracts/` / `docs/`) and compare **behavior**, not just names.
- Do not paste blindly — check package names (especially Lab 14 `com.northstar.crm.mapper`).

### C. Verify on Windows (this machine baseline)
```powershell
cd $env:USERPROFILE\java-bootcamp\examples\lab9-crm
# Or from the repo solution folder:
# cd "...\module-09\lab9\solution"
mvn -B clean verify
```

### D. Common pitfalls for Lab 9
- Wrong **Tests run** count usually means a missing test class/method shell or leftover `PlaceholderTest`.
- Package / import drift vs GUIDE samples → fix imports to match solution packages.
- Never commit `target/`.

## Verified on instructor machine

**Date:** Tuesday, August 4, 2026  
**JDK:** Temurin OpenJDK **21.0.11**  
**Maven:** **3.9.9**  
**Result:** Solution suite/smoke **PASS** under `%USERPROFILE%\java-bootcamp\examples\_week2-verify\lab9-solution`.

