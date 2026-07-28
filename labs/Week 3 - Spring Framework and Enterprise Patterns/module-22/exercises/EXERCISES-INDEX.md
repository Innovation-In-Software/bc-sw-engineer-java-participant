# Module 22 — Pre-Lab Exercises

> **Start here for Module 22:** [`../README.md`](../README.md) · **Clone + own repo:** [`../../../CLONE-AND-OWN-REPO-GUIDE.md`](../../../CLONE-AND-OWN-REPO-GUIDE.md)

**Module:** 22 — Spring Core and Inversion of Control (IoC)  
**Next:** [`../lab22/LAB-22-WINDOWS.md`](../lab22/LAB-22-WINDOWS.md) or [`../lab22/LAB-22-MACOS.md`](../lab22/LAB-22-MACOS.md) → [`../lab22/LAB-22-GUIDE.md`](../lab22/LAB-22-GUIDE.md)

> Complete these exercises **in order (1→6)** as they appear in the slides, then and before Lab 22.  
> Use JDK 21 and the tools this module requires.  
> These exercises design and test small pieces; Lab 22 builds the full graded deliverable.  
> Exercise 5 includes a **TODO / fill-in-the-blank starter** (not a complete solution). Replace every `_____` and `// TODO` / `<!-- TODO -->` before moving on.

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
New-Item -ItemType Directory -Force -Path examples\module-22-exercises | Out-Null
cd examples\module-22-exercises
java -version
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-22-exercises
cd examples/module-22-exercises
java -version
```

**Expected:** Java 21 is available (and any module-specific tools named in the exercises). If not, return to Lab 0 / setup before continuing.

## Exercise index

Complete in this sequence (matches Module slide order):

| # | Exercise | New skill | File |
| --- | --- | --- | --- |
| 1 | IoC Versus Manual Wiring | Contrast IoC with `new` coupling | [`exercise-01-ioc-vs-new.md`](exercise-01-ioc-vs-new.md) |
| 2 | Constructor Injection Preference | Prefer constructor DI over field `@Autowired` | [`exercise-02-constructor-injection.md`](exercise-02-constructor-injection.md) |
| 3 | Bean Lifecycle Callbacks | Predict `@PostConstruct` / `@PreDestroy` evidence | [`exercise-03-lifecycle-notes.md`](exercise-03-lifecycle-notes.md) |
| 4 | Stereotype Annotation Map | Assign Spring stereotypes to CRM types | [`exercise-04-stereotype-map.md`](exercise-04-stereotype-map.md) |
| 5 | Bean Graph Skeleton (TODOs) | Fill constructor-injection TODOs in a tiny sketch | [`exercise-05-bean-graph-skeleton.md`](exercise-05-bean-graph-skeleton.md) |
| 6 | Lab 22 Readiness Checklist | Prepare workspace for the timed Lab 22 path | [`exercise-06-lab22-readiness.md`](exercise-06-lab22-readiness.md) |
