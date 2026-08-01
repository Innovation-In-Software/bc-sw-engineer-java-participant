# Module 21 — Classroom pacing (Learn → Practice → Review)

**For instructors and participants.** Do **not** finish every Module 21 slide before practicing.

Detailed author notes: `curriculum/Week 2 - Backend, AI Tools and Testing/module-21/INSTRUCTOR-PACING.md`

## Checkpoint map

| Block | After slides | Practice |
| ----- | ------------ | -------- |
| **A** | 255–260 | [Ex 1](exercises/exercise-01-cardinality-antipatterns.md) |
| **B** | 261–262 | [Ex 2](exercises/exercise-02-actuator-allowlist.md) |
| **C** | 263 | [Ex 3](exercises/exercise-03-liveness-vs-readiness.md) |
| **D** | 264–269 | [Ex 4](exercises/exercise-04-fill-metric-sketch-todos.md) · [Ex 5](exercises/exercise-05-alert-from-failure-total.md) · [Ex 6](exercises/exercise-06-lab21-prep-checklist.md) |
| **E** | 270–272 | [Lab 21](lab21/LAB-21-GUIDE.md) · Kahoot |
| — | 274 | Week 2 review (awareness; optional close) |

**Classroom practice order:** **1 → 2 → 3 → 4 → 5 → 6**

## Streamline overlapping topics

| Topic | Keep short | Why |
| ----- | ---------- | --- |
| Full distributed tracing stack (Jaeger/Zipkin) | Awareness | Lab focuses Actuator + Micrometer |
| Full Grafana dashboards | Sketch / report only | Lab proves probes + counters |
| Exposing all Actuator endpoints | Forbidden in prod mindset | Allow-list + lab-only exposure |
| customerId as metric label | Anti-pattern | High cardinality |

## Observability reminder

```text
Logs (Lab 20) + Metrics/Actuator (Lab 21) + Traces (awareness)
Liveness ≠ Readiness · create_success / create_failure (low-cardinality tags)
```

## Incremental build

Exercises 1–6 notes → Lab 21 `examples/lab21-crm` (probes + CustomerMetrics + ActuatorIT).

Start here: [`README.md`](README.md) · Exercises: [`exercises/EXERCISES-INDEX.md`](exercises/EXERCISES-INDEX.md)
