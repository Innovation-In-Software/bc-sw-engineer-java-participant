# Module 22 — Classroom pacing (Learn → Practice → Review)

**For instructors and participants.** Do **not** finish every Module 22 slide before practicing.

Detailed author notes: `curriculum/Week 3 - Spring Framework and Enterprise Patterns/module-22/INSTRUCTOR-PACING.md`

## Checkpoint map

| Block | After slides | Practice |
| ----- | ------------ | -------- |
| **A** | 1–13 | [Ex 1](exercises/exercise-01-ioc-vs-new.md) |
| **B** | 14–18 | [Ex 2](exercises/exercise-02-constructor-injection.md) |
| **C** | 19–23 | [Ex 3](exercises/exercise-03-lifecycle-notes.md) |
| **D** | 24–28 | [Ex 4](exercises/exercise-04-stereotype-map.md) |
| **E** | 29–31 | [Ex 5](exercises/exercise-05-bean-graph-skeleton.md) · [Ex 6](exercises/exercise-06-lab22-readiness.md) |
| **F** | 32–34 | [Lab 22](lab22/LAB-22-GUIDE.md) · Kahoot |

**Classroom practice order:** **1 → 2 → 3 → 4 → 5 → 6**

## Streamline overlapping topics

| Topic | Keep short | Why |
| ----- | ---------- | --- |
| Setter / field `@Autowired` | Awareness — prefer constructor | Lab requires constructor + `final` |
| Prototype scope deep dive | Awareness — default singleton | CRM services are singletons |
| Spring Boot Initializr / profiles | Later (Lab 23+) | Lab 22 focuses IoC wiring |
| SOAP / Security / `@Transactional` | Later modules | Out of Module 22 scope |

## IoC reminder

```text
Container creates + wires beans
CustomerController → CustomerService → CustomerRepository + NotificationService
Constructor DI + stereotypes · no new of Spring-managed collaborators in services
```

## Incremental build

Exercises 1–6 notes → Lab 22 `examples/lab22-crm` (stereotypes + constructor DI + lifecycle + dependency-graph.md).

Start here: [`README.md`](README.md) · Exercises: [`exercises/EXERCISES-INDEX.md`](exercises/EXERCISES-INDEX.md)
