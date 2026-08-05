# Lab 10 solution — complete reference

**Theme:** Customer domain + in-memory CustomerService (add/find/updateStatus)

This folder is the **finished lab** (not the timed starter). Participants: attempt `../starter/` first, then compare here.

| | |
| --- | --- |
| **What this is** | Working reference implementation + docs |
| **Verify** | `mvn -B clean compile; java -cp target/classes com.northstar.crm.Main` |
| **Expected** | Main prints CUS-1001 / CUS-1002 demo |
| **Walkthrough** | [SOLUTION.md](SOLUTION.md) (full completed source embedded) |
| **Short notes** | [SOLUTION-NOTES.md](SOLUTION-NOTES.md) |
| **Guide** | [../LAB-10-GUIDE.md](../LAB-10-GUIDE.md) |

## Copy into your workspace

```powershell
New-Item -ItemType Directory -Force -Path "$env:USERPROFILE\java-bootcamp\examples\lab10-crm" | Out-Null
Copy-Item -Recurse -Force ".\*" "$env:USERPROFILE\java-bootcamp\examples\lab10-crm\"
cd $env:USERPROFILE\java-bootcamp\examples\lab10-crm
mvn -B clean compile; java -cp target/classes com.northstar.crm.Main
```

Do **not** treat this as a TODO checklist — the code here is already complete.
