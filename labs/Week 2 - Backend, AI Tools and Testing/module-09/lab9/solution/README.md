# Lab 9 solution — complete reference

**Theme:** Maven packaging, plugins, profiles, PlaceholderTest

This folder is the **finished lab** (not the timed starter). Participants: attempt `../starter/` first, then compare here.

| | |
| --- | --- |
| **What this is** | Working reference implementation + docs |
| **Verify** | `mvn -B clean verify` |
| **Expected** | Tests run: 1; customer-service.jar built |
| **Walkthrough** | [SOLUTION.md](SOLUTION.md) (full completed source embedded) |
| **Short notes** | [SOLUTION-NOTES.md](SOLUTION-NOTES.md) |
| **Guide** | [../LAB-9-GUIDE.md](../LAB-9-GUIDE.md) |

## Copy into your workspace

```powershell
New-Item -ItemType Directory -Force -Path "$env:USERPROFILE\java-bootcamp\examples\lab9-crm" | Out-Null
Copy-Item -Recurse -Force ".\*" "$env:USERPROFILE\java-bootcamp\examples\lab9-crm\"
cd $env:USERPROFILE\java-bootcamp\examples\lab9-crm
mvn -B clean verify
```

Do **not** treat this as a TODO checklist — the code here is already complete.
