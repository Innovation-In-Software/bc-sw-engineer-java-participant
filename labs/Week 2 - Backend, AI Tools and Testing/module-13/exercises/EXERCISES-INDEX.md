# Module 13 — Pre-Lab Exercises

> **Start here for Module 13:** [`../README.md`](../README.md) · **Clone + own repo:** [`../../../CLONE-AND-OWN-REPO-GUIDE.md`](../../../CLONE-AND-OWN-REPO-GUIDE.md)

**Module:** 13 — SOAP API Design with Java  
**Next:** [`../lab13/LAB-13-WINDOWS.md`](../lab13/LAB-13-WINDOWS.md) or [`../lab13/LAB-13-MACOS.md`](../lab13/LAB-13-MACOS.md) → [`../lab13/LAB-13-GUIDE.md`](../lab13/LAB-13-GUIDE.md)

> Complete these exercises **in order (1→6)** as they appear in the slides, then and before Lab 13.  
> Use JDK 21 and the tools this module requires.  
> These exercises design and test small pieces; Lab 13 builds the full graded deliverable.  
> Exercise 1 includes a **TODO / fill-in-the-blank starter** (not a complete solution). Replace every `_____` and `// TODO` / `<!-- TODO -->` before moving on.

## Scope boundary — do not build later technology yet

| Do now | Do not add yet |
| --- | --- |
| Practice contract-first thinking for Customer SOAP operations | Do not complete the full Lab 13 implementation in this pre-lab |
| Map Java fields to XSD types for Amina/Ravi payloads | Do not host with Spring-WS / Spring Boot yet (Lab 24) |
| Build an operation matrix (in/out/fault) | Do not invent live WSDL deployment on a server |
| Draft fault envelope TODOs for CUS-9999 not found | Do not deepen DTO validation frameworks (Lab 14) |
| State placeholder endpoint honesty before Spring-WS hosting | Do not skip documenting placeholder endpoint limits |

## Workspace

| Item | Windows | macOS |
| ---- | ------- | ----- |
| Exercises folder | `%USERPROFILE%\java-bootcamp\examples\module-13-exercises` | `~/java-bootcamp/examples/module-13-exercises` |
| Notes / mini work | `notes\` | `notes/` |

### Setup

**Windows (PowerShell):**

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-13-exercises | Out-Null
cd examples\module-13-exercises
java -version
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-13-exercises
cd examples/module-13-exercises
java -version
```

**Expected:** Java 21 is available (and any module-specific tools named in the exercises). If not, return to Lab 0 / setup before continuing.

## Exercise index

Complete in this sequence (matches Module slide order):

| # | Exercise | New skill | File |
| --- | --- | --- | --- |
| 1 | Fill Fault Envelope TODOs | Hands-on exercise | [`exercise-01-fill-fault-envelope-todos.md`](exercise-01-fill-fault-envelope-todos.md) |
| 2 | Operation Matrix | Architecture exercise | [`exercise-02-operation-matrix.md`](exercise-02-operation-matrix.md) |
| 3 | Java to XSD Map | Documentation exercise | [`exercise-03-java-xsd-map.md`](exercise-03-java-xsd-map.md) |
| 4 | Contract-First Mindset | Analysis exercise | [`exercise-04-contract-first.md`](exercise-04-contract-first.md) |
| 5 | Placeholder Endpoint Honesty | Documentation exercise | [`exercise-05-placeholder-endpoint-honesty.md`](exercise-05-placeholder-endpoint-honesty.md) |
| 6 | Lab 13 Prep Checklist | Documentation exercise | [`exercise-06-lab13-prep-checklist.md`](exercise-06-lab13-prep-checklist.md) |
