# Lab 10 starter — timed path (~45 minutes)

**Theme:** GitHub Copilot for plain Java CRM domain

## Copy into your workspace

**Windows (PowerShell)** — from this lab folder:

```powershell
New-Item -ItemType Directory -Force -Path "$env:USERPROFILE\java-bootcamp\examples\lab10-crm" | Out-Null
Copy-Item -Recurse -Force ".\starter\*" "$env:USERPROFILE\java-bootcamp\examples\lab10-crm\"
cd $env:USERPROFILE\java-bootcamp\examples\lab10-crm
```

**macOS / Linux:**

```bash
mkdir -p ~/java-bootcamp/examples/lab10-crm
cp -R starter/. ~/java-bootcamp/examples/lab10-crm/
cd ~/java-bootcamp/examples/lab10-crm
```

Full GUIDE: [`../LAB-10-GUIDE.md`](../LAB-10-GUIDE.md)

## 45-minute checklist

- [ ] Sign in Copilot; sanity-check ghost text on Main TODO
- [ ] Fill `CustomerStatus` + `Customer` with strong prompts; reject JPA
- [ ] Draft `CustomerService` (add/find/updateStatus)
- [ ] Complete `Main` demo for CUS-1001 / CUS-1002
- [ ] Log entries lab10-001–lab10-004 in `copilot-notes/ai-review-notes.md`
- [ ] Run smoke test

## Smoke test

```bash
mvn clean compile
java -cp target/classes com.northstar.crm.Main
```

## Timed-path Pass criteria

| Criterion | Pass / Fail |
| --------- | ----------- |
| Compiles; Main shows both sample customers | Pass / Fail |
| No JPA/Spring on entity | Pass / Fail |
| ai-review-notes has accept/reject decisions | Pass / Fail |

Continue remaining GUIDE steps as homework / full path if needed.
