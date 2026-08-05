# Lab 13 solution — complete reference

**Theme:** SOAP contract-first XSD/WSDL + sample envelopes (no Java server)

This folder is the **finished lab** (not the timed starter). Participants: attempt `../starter/` first, then compare here.

| | |
| --- | --- |
| **What this is** | Working reference implementation + docs |
| **Verify** | `# PowerShell [xml] well-formedness on contracts/ + samples/` |
| **Expected** | 10/10 well-formed XML |
| **Walkthrough** | [SOLUTION.md](SOLUTION.md) (full completed source embedded) |
| **Short notes** | [SOLUTION-NOTES.md](SOLUTION-NOTES.md) |
| **Guide** | [../LAB-13-GUIDE.md](../LAB-13-GUIDE.md) |

## Copy into your workspace

```powershell
New-Item -ItemType Directory -Force -Path "$env:USERPROFILE\java-bootcamp\examples\lab13-crm" | Out-Null
Copy-Item -Recurse -Force ".\*" "$env:USERPROFILE\java-bootcamp\examples\lab13-crm\"
cd $env:USERPROFILE\java-bootcamp\examples\lab13-crm
# PowerShell [xml] well-formedness on contracts/ + samples/
```

Do **not** treat this as a TODO checklist — the code here is already complete.
