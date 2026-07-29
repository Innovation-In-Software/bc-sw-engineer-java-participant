# Module 22 — Pre-Lab Exercises

> **Start here for Module 22:** [`../README.md`](../README.md) · **Clone + own repo:** [`../../../CLONE-AND-OWN-REPO-GUIDE.md`](../../../CLONE-AND-OWN-REPO-GUIDE.md)

**Module:** 22 — Spring Core and Inversion of Control (IoC)  
**Next:** [`../lab22/LAB-22-WINDOWS.md`](../lab22/LAB-22-WINDOWS.md) or [`../lab22/LAB-22-MACOS.md`](../lab22/LAB-22-MACOS.md) → [`../lab22/LAB-22-GUIDE.md`](../lab22/LAB-22-GUIDE.md)

> Complete these exercises **in order** after the slides and **before** Lab 22.  
> Use JDK 21 (and any tools named in the exercises). Work under `examples/module-22-exercises/` — these are **notes files**, not the graded lab project.  
> Lab 22 is the graded consolidation. Do **not** finish Lab 22 during pre-lab.

> **Tip:** Each exercise starts with a **Worked example** — read it, then produce your own file. Submit only the files listed under **What you produce**.

## What you produce (all exercises)

| # | Your deliverable file | Type |
| - | --------------------- | ---- |
| 1 | `notes/ioc-vs-new.md` | IoC Versus Manual Wiring |
| 2 | `notes/constructor-di.md` | Constructor Injection Preference |
| 3 | `notes/lab22-lifecycle-notes.md` | Bean Lifecycle Callbacks |
| 4 | `notes/stereotype-map.md` | Stereotype Annotation Map |
| 5 | `notes/bean-graph-sketch.md` | Bean Graph Skeleton (TODOs) |
| 6 | `notes/lab22-readiness.md` | Lab 22 Readiness Checklist |

Each exercise page has: **Goal → Deliverable → Steps (copy/paste template) → Expected result → If it fails → Pass criteria**.

## Scope boundary — do not build later technology yet

| Do now | Do not add yet |
| --- | --- |
| Explain IoC vs manual `new` for Northstar CRM collaborators | Spring Boot Initializr starters and embedded Tomcat (Lab 23) |
| Name stereotype roles: `@Service`, `@Repository`, `@Component` | Spring-WS SOAP endpoints or WSDL (Lab 24) |
| Prefer constructor injection with `final` fields | Full `dev`/`prod` profile YAML and secrets (Lab 26) |
| Sketch a bean graph for CustomerController → CustomerService → repository/notifier | `@Transactional` money transfers (Lab 27) |
| Plan unit tests that construct `CustomerService` without Spring | Spring Security JWT / roles (Lab 28) |

## Workspace

| Item | Windows | macOS |
| ---- | ------- | ----- |
| Exercises folder | `%USERPROFILE%\java-bootcamp\examples\module-22-exercises` | `~/java-bootcamp/examples/module-22-exercises` |
| Notes / mini work | `notes\` | `notes/` |

### Setup

**Windows (PowerShell):**

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-22-exercises\notes | Out-Null
cd examples\module-22-exercises
java -version
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-22-exercises/notes
cd examples/module-22-exercises
java -version
```

**Expected:** Java 21 is available. You create markdown notes here; Lab 22 uses its own `examples/lab22-*/` (or module lab folder) project.

## Exercise index

Complete in this sequence (matches Module slide order):

| # | Exercise | New skill | Deliverable | File |
| --- | --- | --- | --- | --- |
| 1 | IoC Versus Manual Wiring | Analysis exercise | `notes/ioc-vs-new.md` | [`exercise-01-ioc-vs-new.md`](exercise-01-ioc-vs-new.md) |
| 2 | Constructor Injection Preference | Documentation exercise | `notes/constructor-di.md` | [`exercise-02-constructor-injection.md`](exercise-02-constructor-injection.md) |
| 3 | Bean Lifecycle Callbacks | Analysis exercise | `notes/lab22-lifecycle-notes.md` | [`exercise-03-lifecycle-notes.md`](exercise-03-lifecycle-notes.md) |
| 4 | Stereotype Annotation Map | Architecture exercise | `notes/stereotype-map.md` | [`exercise-04-stereotype-map.md`](exercise-04-stereotype-map.md) |
| 5 | Bean Graph Skeleton (TODOs) | Hands-on exercise | `notes/bean-graph-sketch.md` | [`exercise-05-bean-graph-skeleton.md`](exercise-05-bean-graph-skeleton.md) |
| 6 | Lab 22 Readiness Checklist | Documentation exercise | `notes/lab22-readiness.md` | [`exercise-06-lab22-readiness.md`](exercise-06-lab22-readiness.md) |

## Done when

All notes files in **What you produce** exist, fixtures match Amina `CUS-1001`/`ACTIVE` and Ravi `CUS-1002`/`PROSPECT` when used, and the prep/readiness checklist self-mark is **Pass**. Then open the Lab 22 OS guide.
