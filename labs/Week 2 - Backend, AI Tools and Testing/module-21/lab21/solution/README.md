# Lab 21 solution — complete reference

**Theme:** Actuator readiness group + Micrometer create/get metrics

This folder is the **finished lab** (not the timed starter). Participants: attempt `../starter/` first, then compare here.

| | |
| --- | --- |
| **What this is** | Working reference implementation + docs |
| **Verify** | `mvn -B clean test` |
| **Expected** | Tests run: 3 (ActuatorIT) |
| **Walkthrough** | [SOLUTION.md](SOLUTION.md) (full completed source embedded) |
| **Short notes** | [SOLUTION-NOTES.md](SOLUTION-NOTES.md) |
| **Guide** | [../LAB-21-GUIDE.md](../LAB-21-GUIDE.md) |

## Copy into your workspace

```powershell
New-Item -ItemType Directory -Force -Path "$env:USERPROFILE\java-bootcamp\examples\lab21-crm" | Out-Null
Copy-Item -Recurse -Force ".\*" "$env:USERPROFILE\java-bootcamp\examples\lab21-crm\"
cd $env:USERPROFILE\java-bootcamp\examples\lab21-crm
mvn -B clean test
```

Do **not** treat this as a TODO checklist — the code here is already complete.
