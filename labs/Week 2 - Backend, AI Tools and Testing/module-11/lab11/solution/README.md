# Lab 11 solution — complete reference

**Theme:** JUnit 5 suite + CustomerNotifier Mockito extract

This folder is the **finished lab** (not the timed starter). Participants: attempt `../starter/` first, then compare here.

| | |
| --- | --- |
| **What this is** | Working reference implementation + docs |
| **Verify** | `mvn -B clean test` |
| **Expected** | Tests run: 8, Failures: 0 |
| **Walkthrough** | [SOLUTION.md](SOLUTION.md) (full completed source embedded) |
| **Short notes** | [SOLUTION-NOTES.md](SOLUTION-NOTES.md) |
| **Guide** | [../LAB-11-GUIDE.md](../LAB-11-GUIDE.md) |

## Copy into your workspace

```powershell
New-Item -ItemType Directory -Force -Path "$env:USERPROFILE\java-bootcamp\examples\lab11-crm" | Out-Null
Copy-Item -Recurse -Force ".\*" "$env:USERPROFILE\java-bootcamp\examples\lab11-crm\"
cd $env:USERPROFILE\java-bootcamp\examples\lab11-crm
mvn -B clean test
```

Do **not** treat this as a TODO checklist — the code here is already complete.
