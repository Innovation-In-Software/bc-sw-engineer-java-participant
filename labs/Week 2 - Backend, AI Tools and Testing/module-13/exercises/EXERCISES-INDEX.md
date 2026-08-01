# Module 13 — Pre-Lab Exercises

> **Learn → Practice → Review:** Do **not** wait until every Module 13 slide is finished. Work each checkpoint when the instructor pauses ([`../PACING.md`](../PACING.md)).  
> **Tip:** Each exercise starts with an **Activity card** + **What you will learn**. Prefer [`starter/`](starter/README.md).  
> **Start here for Module 13:** [`../README.md`](../README.md)

**Module:** 13 — SOAP API Design with Java  
**Next (after all 6 Pass):** OS how-to → [`../lab13/LAB-13-WINDOWS.md`](../lab13/LAB-13-WINDOWS.md) or [`../lab13/LAB-13-MACOS.md`](../lab13/LAB-13-MACOS.md) → [`../lab13/LAB-13-GUIDE.md`](../lab13/LAB-13-GUIDE.md)

> **Gate for Lab 13:** All **six** exercises must be Pass.  
> **JDK:** 21 · Practice notes: `examples/module-13-exercises/` · Lab: `examples/lab13-crm/`  
> **Classroom order:** **1 → 2 → 3 → 4 → 5 → 6**  
> **No SOAP server** in pre-lab or Lab 13.

## Checkpoint map

| When (after slides) | Do these | Pattern |
| ------------------- | -------- | ------- |
| Checkpoint A (112–120) | Ex 1 fault envelope | Learn → Practice |
| Checkpoint B (121–123) | Ex 2–3 ops + XSD map | Learn → Practice |
| Checkpoint C (124–126) | Ex 4 contract-first | Learn → Practice |
| Checkpoint D (127–128) | Ex 5–6 honesty + prep | Learn → Practice |
| Checkpoint E (129–131) | Lab 13 | Practice → Lab |

## Scope boundary

| Do now | Do not add yet |
| ------ | -------------- |
| Six `notes/lab13-*.md` files | Full Spring-WS hosting (Lab 24) |
| Fault / ops / XSD thinking | Live WSDL deployment |
| Contract-first mindset | Bean Validation deep dive (Lab 14) |
| Placeholder endpoint honesty | Pretend `:8080/ws` is up |

## Workspace setup

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-13-exercises\notes | Out-Null
cd examples\module-13-exercises
java -version
```

```bash
cd ~/java-bootcamp && mkdir -p examples/module-13-exercises/notes && cd examples/module-13-exercises
java -version
```

Prefer copy from [`starter/`](starter/README.md).

## Exercise index

| # | Exercise | Est. | Type | Guide | Notes file |
| - | -------- | ---- | ---- | ----- | ---------- |
| 1 | Fault Envelope TODOs | 10–12 min | Hands-on | [`exercise-01-fill-fault-envelope-todos.md`](exercise-01-fill-fault-envelope-todos.md) | `notes/lab13-fault-todos.md` |
| 2 | Operation Matrix | 12–15 min | Architecture | [`exercise-02-operation-matrix.md`](exercise-02-operation-matrix.md) | `notes/lab13-operation-matrix.md` |
| 3 | Java to XSD Map | 10–12 min | Docs | [`exercise-03-java-xsd-map.md`](exercise-03-java-xsd-map.md) | `notes/lab13-java-xsd-map.md` |
| 4 | Contract-First Mindset | 10–12 min | Analysis | [`exercise-04-contract-first.md`](exercise-04-contract-first.md) | `notes/lab13-contract-first.md` |
| 5 | Placeholder Honesty | 8–10 min | Docs | [`exercise-05-placeholder-endpoint-honesty.md`](exercise-05-placeholder-endpoint-honesty.md) | `notes/lab13-placeholder-honesty.md` |
| 6 | Lab 13 Prep Checklist | 8–10 min | Checklist | [`exercise-06-lab13-prep-checklist.md`](exercise-06-lab13-prep-checklist.md) | `notes/lab13-prep-checklist.md` |

When all **six** Pass → OS how-to → [`../lab13/LAB-13-GUIDE.md`](../lab13/LAB-13-GUIDE.md).
