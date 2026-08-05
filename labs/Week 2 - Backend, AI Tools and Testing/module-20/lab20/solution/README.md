# Lab 20 solution — complete reference

**Theme:** CorrelationFilter MDC + PII-free logging + Logback pattern

This folder is the **finished lab** (not the timed starter). Participants: attempt `../starter/` first, then compare here.

| | |
| --- | --- |
| **What this is** | Working reference implementation + docs |
| **Verify** | `mvn -B clean test` |
| **Expected** | Tests run: 1 (CustomerLoggingIT) |
| **Walkthrough** | [SOLUTION.md](SOLUTION.md) (full completed source embedded) |
| **Short notes** | [SOLUTION-NOTES.md](SOLUTION-NOTES.md) |
| **Guide** | [../LAB-20-GUIDE.md](../LAB-20-GUIDE.md) |

## Copy into your workspace

```powershell
New-Item -ItemType Directory -Force -Path "$env:USERPROFILE\java-bootcamp\examples\lab20-crm" | Out-Null
Copy-Item -Recurse -Force ".\*" "$env:USERPROFILE\java-bootcamp\examples\lab20-crm\"
cd $env:USERPROFILE\java-bootcamp\examples\lab20-crm
mvn -B clean test
```

Do **not** treat this as a TODO checklist — the code here is already complete.
