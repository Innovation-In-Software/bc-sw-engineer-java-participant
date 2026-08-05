# Lab 17 solution — complete reference

**Theme:** Full JUnit suite + parameterized transitions + JaCoCo ≥80%

This folder is the **finished lab** (not the timed starter). Participants: attempt `../starter/` first, then compare here.

| | |
| --- | --- |
| **What this is** | Working reference implementation + docs |
| **Verify** | `mvn -B clean verify` |
| **Expected** | Tests run: 19; JaCoCo gate PASS |
| **Walkthrough** | [SOLUTION.md](SOLUTION.md) (full completed source embedded) |
| **Short notes** | [SOLUTION-NOTES.md](SOLUTION-NOTES.md) |
| **Guide** | [../LAB-17-GUIDE.md](../LAB-17-GUIDE.md) |

## Copy into your workspace

```powershell
New-Item -ItemType Directory -Force -Path "$env:USERPROFILE\java-bootcamp\examples\lab17-crm" | Out-Null
Copy-Item -Recurse -Force ".\*" "$env:USERPROFILE\java-bootcamp\examples\lab17-crm\"
cd $env:USERPROFILE\java-bootcamp\examples\lab17-crm
mvn -B clean verify
```

Do **not** treat this as a TODO checklist — the code here is already complete.
