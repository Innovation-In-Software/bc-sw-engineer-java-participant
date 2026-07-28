# Module 28 — Pre-Lab Exercises

> **Start here for Module 28:** [`../README.md`](../README.md) · **Clone + own repo:** [`../../../CLONE-AND-OWN-REPO-GUIDE.md`](../../../CLONE-AND-OWN-REPO-GUIDE.md)

**Module:** 28 — Spring Security Fundamentals  
**Next:** [`../lab28/LAB-28-WINDOWS.md`](../lab28/LAB-28-WINDOWS.md) or [`../lab28/LAB-28-MACOS.md`](../lab28/LAB-28-MACOS.md) → [`../lab28/LAB-28-GUIDE.md`](../lab28/LAB-28-GUIDE.md)

> Complete these exercises **in order (1→6)** as they appear in the slides, then and before Lab 28.  
> Use JDK 21 and the tools this module requires.  
> These exercises design and test small pieces; Lab 28 builds the full graded deliverable.  
> Exercise 3 includes a **TODO / fill-in-the-blank starter** (not a complete solution). Replace every `_____` and `// TODO` / `<!-- TODO -->` before moving on.

## Scope boundary — do not build later technology yet

| Do now | Do not add yet |
| --- | --- |
| Plan JWT login and Bearer access for CRM APIs | Full OAuth2 Authorization Server implementation |
| Distinguish 401 vs 403 for agent/admin roles | Bean Validation global ErrorResponse polish (Lab 29) |
| Sketch a stateless SecurityFilterChain | Kafka ACL security (Week 4) |
| Protect `/api/customers/**` and `/api/admin/**` differently | React token storage UI (Week 4) |
| Document production IdP / key-rotation checklist items | Committing real JWT signing secrets |

## Workspace

| Item | Windows | macOS |
| ---- | ------- | ----- |
| Exercises folder | `%USERPROFILE%\java-bootcamp\examples\module-28-exercises` | `~/java-bootcamp/examples/module-28-exercises` |
| Notes / mini work | `notes\` | `notes/` |

### Setup

**Windows (PowerShell):**

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-28-exercises | Out-Null
cd examples\module-28-exercises
java -version
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-28-exercises
cd examples/module-28-exercises
java -version
```

**Expected:** Java 21 is available (and any module-specific tools named in the exercises). If not, return to Lab 0 / setup before continuing.

## Exercise index

Complete in this sequence (matches Module slide order):

| # | Exercise | New skill | File |
| --- | --- | --- | --- |
| 1 | Authentication Versus Authorization | Separate 401 and 403 meanings | [`exercise-01-authn-vs-authz.md`](exercise-01-authn-vs-authz.md) |
| 2 | SecurityFilterChain Sketch | Outline a stateless JWT filter chain | [`exercise-02-filter-chain-sketch.md`](exercise-02-filter-chain-sketch.md) |
| 3 | JWT Login TODOs | Fill login/filter pseudocode blanks | [`exercise-03-jwt-login-todos.md`](exercise-03-jwt-login-todos.md) |
| 4 | MockMvc Evidence Matrix | Plan 401/403/200 automated proofs | [`exercise-04-mockmvc-matrix.md`](exercise-04-mockmvc-matrix.md) |
| 5 | Production IdP Checklist | List production security follow-ups | [`exercise-05-production-checklist.md`](exercise-05-production-checklist.md) |
| 6 | Lab 28 Readiness Checklist | Confirm API baseline before security lab | [`exercise-06-lab28-readiness.md`](exercise-06-lab28-readiness.md) |
