# Module 24 — Pre-Lab Exercises

> **Start here for Module 24:** [`../README.md`](../README.md) · **Clone + own repo:** [`../../../CLONE-AND-OWN-REPO-GUIDE.md`](../../../CLONE-AND-OWN-REPO-GUIDE.md)

**Module:** 24 — SOAP Web Services with Spring WS  
**Next:** [`../lab24/LAB-24-WINDOWS.md`](../lab24/LAB-24-WINDOWS.md) or [`../lab24/LAB-24-MACOS.md`](../lab24/LAB-24-MACOS.md) → [`../lab24/LAB-24-GUIDE.md`](../lab24/LAB-24-GUIDE.md)

> Complete these exercises **in order (1→6)** as they appear in the slides, then and before Lab 24.  
> Use JDK 21 and the tools this module requires.  
> These exercises design and test small pieces; Lab 24 builds the full graded deliverable.  
> Exercise 3 includes a **TODO / fill-in-the-blank starter** (not a complete solution). Replace every `_____` and `// TODO` / `<!-- TODO -->` before moving on.

## Scope boundary — do not build later technology yet

| Do now | Do not add yet |
| --- | --- |
| Recall contract-first XSD → WSDL flow from Lab 13 | Replace REST with SOAP (keep both sharing CustomerService) |
| Map four SOAP operations to CustomerService methods | Full Spring Security JWT filter chain (Lab 28) |
| Plan JAXB request/response types and a mapper | Kafka event publishing (Week 4) |
| Distinguish SOAP faults from REST error JSON | React UI for SOAP (N/A) |
| Sketch UsernameToken as message-level lab security | Production IdP / OAuth for SOAP partners |

## Workspace

| Item | Windows | macOS |
| ---- | ------- | ----- |
| Exercises folder | `%USERPROFILE%\java-bootcamp\examples\module-24-exercises` | `~/java-bootcamp/examples/module-24-exercises` |
| Notes / mini work | `notes\` | `notes/` |

### Setup

**Windows (PowerShell):**

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-24-exercises | Out-Null
cd examples\module-24-exercises
java -version
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-24-exercises
cd examples/module-24-exercises
java -version
```

**Expected:** Java 21 is available (and any module-specific tools named in the exercises). If not, return to Lab 0 / setup before continuing.

## Exercise index

Complete in this sequence (matches Module slide order):

| # | Exercise | New skill | File |
| --- | --- | --- | --- |
| 1 | Contract-First Recall | Restate XSD as source of truth | [`exercise-01-contract-first-recall.md`](exercise-01-contract-first-recall.md) |
| 2 | SOAP Operation Map | Map SOAP ops to service methods | [`exercise-02-operation-map.md`](exercise-02-operation-map.md) |
| 3 | PayloadRoot Skeleton (TODOs) | Fill `@Endpoint` / `@PayloadRoot` blanks | [`exercise-03-payloadroot-skeleton.md`](exercise-03-payloadroot-skeleton.md) |
| 4 | SOAP Fault Versus REST Error | Contrast fault envelopes with JSON errors | [`exercise-04-fault-vs-rest.md`](exercise-04-fault-vs-rest.md) |
| 5 | UsernameToken Plan | Plan message-level lab security | [`exercise-05-usernametoken-plan.md`](exercise-05-usernametoken-plan.md) |
| 6 | Lab 24 Readiness Checklist | Confirm Boot CRM exists before SOAP | [`exercise-06-lab24-readiness.md`](exercise-06-lab24-readiness.md) |
