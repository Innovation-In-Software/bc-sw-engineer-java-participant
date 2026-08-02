# Module 24 — Start here

**Topic:** SOAP Web Services with Spring WS

Full course rule: [Which file do I open?](../../_PARTICIPANT-FILE-GUIDE.md) · [Clone + own repo](../../CLONE-AND-OWN-REPO-GUIDE.md)

---

## Your sequence today (Learn → Practice → Review)

Do **not** sit through the entire Module 24 deck before practicing. Follow checkpoints.

| Step | When | Open this (only) |
| ---- | ---- | ---------------- |
| — | Optional → [`ACRONYM-CHEATSHEET.md`](ACRONYM-CHEATSHEET.md) · pacing → [`PACING.md`](PACING.md) |
| A | After slides **66–74** (Checkpoint A) | [`exercise-01-contract-first-recall.md`](exercises/exercise-01-contract-first-recall.md) |
| B | After slides **75–78** (Checkpoint B) | [`exercise-02`](exercises/exercise-02-operation-map.md) · [`exercise-03`](exercises/exercise-03-payloadroot-skeleton.md) |
| C | After slides **79–82** (Checkpoint C) | [`exercise-04-fault-vs-rest.md`](exercises/exercise-04-fault-vs-rest.md) |
| D | After slides **83–86** (Checkpoint D) | [`exercise-05`](exercises/exercise-05-usernametoken-plan.md) · [`exercise-06`](exercises/exercise-06-lab24-readiness.md) |
| E | After Exercises **1–6** Pass | **One** OS how-to: [`lab24/LAB-24-WINDOWS.md`](lab24/LAB-24-WINDOWS.md) **or** [`lab24/LAB-24-MACOS.md`](lab24/LAB-24-MACOS.md) |
| F | Graded lab (Checkpoint E) | [`lab24/LAB-24-GUIDE.md`](lab24/LAB-24-GUIDE.md) — timed path [`lab24/starter/`](lab24/starter/README.md) (~45 min) |
| G | Done | Mark Pass/Fail · Kahoot if scheduled |

**Classroom practice order:** **1 → 2 → 3 → 4 → 5 → 6**

**Pre-lab vs lab:** Notes under `examples/module-24-exercises/`. Graded project under `examples/lab24-crm/`.

**Critical:** **Contract-first** (XSD → WSDL). `@Endpoint` / `@PayloadRoot` delegate to **one** `CustomerService` (REST stays). SOAP **faults** ≠ REST JSON errors. **UsernameToken** = lab message security (not JWT). Fixtures `CUS-1001` / `CUS-1002`; SOAP correlation `lab24-001`.

Full exercise list: [`exercises/EXERCISES-INDEX.md`](exercises/EXERCISES-INDEX.md)
