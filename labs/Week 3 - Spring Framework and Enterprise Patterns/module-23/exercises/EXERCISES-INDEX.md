# Module 23 — Pre-Lab Exercises

> **Start here for Module 23:** [`../README.md`](../README.md) · **Clone + own repo:** [`../../../CLONE-AND-OWN-REPO-GUIDE.md`](../../../CLONE-AND-OWN-REPO-GUIDE.md)

**Module:** 23 — Spring Boot Auto-Configuration  
**Next:** [`../lab23/LAB-23-WINDOWS.md`](../lab23/LAB-23-WINDOWS.md) or [`../lab23/LAB-23-MACOS.md`](../lab23/LAB-23-MACOS.md) → [`../lab23/LAB-23-GUIDE.md`](../lab23/LAB-23-GUIDE.md)

> Complete these exercises **in order (1→6)** as they appear in the slides, then and before Lab 23.  
> Use JDK 21 and the tools this module requires.  
> These exercises design and test small pieces; Lab 23 builds the full graded deliverable.  
> Exercise 2 includes a **TODO / fill-in-the-blank starter** (not a complete solution). Replace every `_____` and `// TODO` / `<!-- TODO -->` before moving on.

## Scope boundary — do not build later technology yet

| Do now | Do not add yet |
| --- | --- |
| Identify Spring Boot starters (`web`, `actuator`, `test`) | Contract-first Spring-WS SOAP (Lab 24) |
| Sketch `CrmApplication` + `application.yml` basics | Deep profile/secret externalization (Lab 26) |
| Plan REST `/api/customers` smoke for CUS-1001 / CUS-1002 | `@Transactional` transfers (Lab 27) |
| Explain Actuator `/actuator/health` as a smoke check | JWT SecurityFilterChain (Lab 28) |
| Separate auto-config gifts from ownership (domain rules) | Kafka / React / PostgreSQL (Week 4) |

## Workspace

| Item | Windows | macOS |
| ---- | ------- | ----- |
| Exercises folder | `%USERPROFILE%\java-bootcamp\examples\module-23-exercises` | `~/java-bootcamp/examples/module-23-exercises` |
| Notes / mini work | `notes\` | `notes/` |

### Setup

**Windows (PowerShell):**

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-23-exercises | Out-Null
cd examples\module-23-exercises
java -version
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-23-exercises
cd examples/module-23-exercises
java -version
```

**Expected:** Java 21 is available (and any module-specific tools named in the exercises). If not, return to Lab 0 / setup before continuing.

## Exercise index

Complete in this sequence (matches Module slide order):

| # | Exercise | New skill | File |
| --- | --- | --- | --- |
| 1 | Auto-Config Versus Ownership | Distinguish Boot gifts from design work | [`exercise-01-autoconfig-vs-ownership.md`](exercise-01-autoconfig-vs-ownership.md) |
| 2 | Boot Starters Inventory | Name what each starter contributes | [`exercise-02-starters-inventory.md`](exercise-02-starters-inventory.md) |
| 3 | CrmApplication Stub (TODOs) | Complete a minimal Boot entry-point sketch | [`exercise-03-crm-application-stub.md`](exercise-03-crm-application-stub.md) |
| 4 | application.yml Sketch | Draft minimal Boot YAML keys | [`exercise-04-application-yml-sketch.md`](exercise-04-application-yml-sketch.md) |
| 5 | REST Smoke Plan | Plan create/get evidence for CRM fixtures | [`exercise-05-rest-smoke-plan.md`](exercise-05-rest-smoke-plan.md) |
| 6 | Lab 23 Readiness Checklist | Confirm tools and lab23-crm path | [`exercise-06-lab23-readiness.md`](exercise-06-lab23-readiness.md) |
