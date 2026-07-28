# Module 26 — Pre-Lab Exercises

> **Start here for Module 26:** [`../README.md`](../README.md) · **Clone + own repo:** [`../../../CLONE-AND-OWN-REPO-GUIDE.md`](../../../CLONE-AND-OWN-REPO-GUIDE.md)

**Module:** 26 — Spring Profiles and Configuration  
**Next:** [`../lab26/LAB-26-WINDOWS.md`](../lab26/LAB-26-WINDOWS.md) or [`../lab26/LAB-26-MACOS.md`](../lab26/LAB-26-MACOS.md) → [`../lab26/LAB-26-GUIDE.md`](../lab26/LAB-26-GUIDE.md)

> Complete these exercises **in order (1→6)** as they appear in the slides, then and before Lab 26.  
> Use JDK 21 and the tools this module requires.  
> These exercises design and test small pieces; Lab 26 builds the full graded deliverable.  
> Exercise 2 includes a **TODO / fill-in-the-blank starter** (not a complete solution). Replace every `_____` and `// TODO` / `<!-- TODO -->` before moving on.

## Scope boundary — do not build later technology yet

| Do now | Do not add yet |
| --- | --- |
| Split config into base + `dev` / `test` / `prod` profile files | `@Transactional` transfer demos (Lab 27) |
| Activate profiles via `-D` and `SPRING_PROFILES_ACTIVE` | JWT SecurityFilterChain (Lab 28) |
| Explain property override order | Terraform/Ansible secret injection (Week 5) |
| Plan `@ConfigurationProperties` binding for Northstar settings | Kafka topic config (Week 4) |
| Keep secrets in env vars / `.env.example` placeholders only | Committing real `DB_PASSWORD` values |

## Workspace

| Item | Windows | macOS |
| ---- | ------- | ----- |
| Exercises folder | `%USERPROFILE%\java-bootcamp\examples\module-26-exercises` | `~/java-bootcamp/examples/module-26-exercises` |
| Notes / mini work | `notes\` | `notes/` |

### Setup

**Windows (PowerShell):**

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-26-exercises | Out-Null
cd examples\module-26-exercises
java -version
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-26-exercises
cd examples/module-26-exercises
java -version
```

**Expected:** Java 21 is available (and any module-specific tools named in the exercises). If not, return to Lab 0 / setup before continuing.

## Exercise index

Complete in this sequence (matches Module slide order):

| # | Exercise | New skill | File |
| --- | --- | --- | --- |
| 1 | Profile Purposes | State why each profile exists | [`exercise-01-profile-purposes.md`](exercise-01-profile-purposes.md) |
| 2 | Profile YAML TODOs | Fill profile YAML blanks safely | [`exercise-02-profile-yaml-todos.md`](exercise-02-profile-yaml-todos.md) |
| 3 | ConfigurationProperties Sketch | Plan typed config binding | [`exercise-03-config-properties-sketch.md`](exercise-03-config-properties-sketch.md) |
| 4 | Property Override Order | Rank Spring property sources | [`exercise-04-override-order.md`](exercise-04-override-order.md) |
| 5 | Activation Command Drill | Write profile activation commands | [`exercise-05-activation-drill.md`](exercise-05-activation-drill.md) |
| 6 | Lab 26 Readiness Checklist | Confirm layered CRM before config lab | [`exercise-06-lab26-readiness.md`](exercise-06-lab26-readiness.md) |
