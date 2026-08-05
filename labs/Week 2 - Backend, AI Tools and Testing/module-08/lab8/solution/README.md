# Lab 8 solution — complete reference

**Theme:** Maven/Java package skeleton (controller → service → repository)

This folder is the **finished lab** (not the timed starter). Participants: attempt `../starter/` first, then compare here.

| | |
| --- | --- |
| **What this is** | Working reference implementation + docs |
| **Verify** | `mvn -B clean compile; java -cp target/classes com.northstar.crm.Main` |
| **Expected** | BUILD SUCCESS + Main banner (service stubs intentional until Lab 10) |
| **Walkthrough** | [SOLUTION.md](SOLUTION.md) (full completed source embedded) |
| **Short notes** | [SOLUTION-NOTES.md](SOLUTION-NOTES.md) |
| **Guide** | [../LAB-8-GUIDE.md](../LAB-8-GUIDE.md) |

## Copy into your workspace

```powershell
New-Item -ItemType Directory -Force -Path "$env:USERPROFILE\java-bootcamp\examples\lab8-crm" | Out-Null
Copy-Item -Recurse -Force ".\*" "$env:USERPROFILE\java-bootcamp\examples\lab8-crm\"
cd $env:USERPROFILE\java-bootcamp\examples\lab8-crm
mvn -B clean compile; java -cp target/classes com.northstar.crm.Main
```

Do **not** treat this as a TODO checklist — the code here is already complete.
