# Lab 19 solution — complete reference

**Theme:** Spring Boot API IT + Selenium Page Object UI IT

This folder is the **finished lab** (not the timed starter). Participants: attempt `../starter/` first, then compare here.

| | |
| --- | --- |
| **What this is** | Working reference implementation + docs |
| **Verify** | `mvn -B clean test` |
| **Expected** | Tests run: 4 (ApiIT 3 + UiIT 1) |
| **Walkthrough** | [SOLUTION.md](SOLUTION.md) (full completed source embedded) |
| **Short notes** | [SOLUTION-NOTES.md](SOLUTION-NOTES.md) |
| **Guide** | [../LAB-19-GUIDE.md](../LAB-19-GUIDE.md) |

## Copy into your workspace

```powershell
New-Item -ItemType Directory -Force -Path "$env:USERPROFILE\java-bootcamp\examples\lab19-crm" | Out-Null
Copy-Item -Recurse -Force ".\*" "$env:USERPROFILE\java-bootcamp\examples\lab19-crm\"
cd $env:USERPROFILE\java-bootcamp\examples\lab19-crm
mvn -B clean test
```

Do **not** treat this as a TODO checklist — the code here is already complete.
