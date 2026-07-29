# Exercise 3 — Bean Graph Skeleton (TODOs)

**Module 22** · Hands-on exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/bean-graph-sketch.md` — complete a plain-Java skeleton that mimics constructor DI for CRM collaborators (no Spring runtime yet).

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-22-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-05-bean-graph-skeleton.md` (this file in the course repo) |
| Your notes file | `notes/bean-graph-sketch.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 22 — Bean Graph Skeleton (TODOs)

## Step 2 — Fill TODOs

Paste and complete:
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-22-exercises/`, create `notes/` if needed, then create `notes/bean-graph-sketch.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 22 — Bean Graph Skeleton (TODOs)

## Step 2 — Fill TODOs

Paste and complete:

```java
package com.northstar.crm;

interface CustomerRepository {
    String findName(String id);
}

class InMemoryCustomerRepository implements CustomerRepository {
    public String findName(String id) {
        // TODO: return "Amina Khan" when id equals "CUS-1001", else "UNKNOWN"
        if ("CUS-1001".equals(id)) return _____;
        return "UNKNOWN";
    }
}

class CustomerService {
    private final CustomerRepository _____;  // TODO: field name repo

    CustomerService(CustomerRepository repo) {
        this._____ = _____;  // TODO: assign
    }

    String describe(String id) {
        return id + " | " + repo.findName(id);
    }
}

public class IocDemo {
    public static void main(String[] args) {
        // TODO: wire repo → service without Spring (manual DI demo)
        CustomerRepository repo = new _____;
        CustomerService service = new CustomerService(_____);
        System.out.println(service.describe("CUS-1001"));
    }
}
```

## Step 3 — Compile and run

From `module-22-exercises`:

```text
javac -d mini-out mini-src/com/northstar/crm/*.java
java -cp mini-out com.northstar.crm.IocDemo
```

Expected: `CUS-1001 | Amina Khan`

## Step 4 — Reflect

In `notes/bean-graph-sketch.md`, draw arrows: `IocDemo` → `CustomerService` → `CustomerRepository`. Note: Lab 22 lets Spring create this graph.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Demo prints `CUS-1001 | Amina Khan` after filling blanks in `notes/bean-graph-sketch.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/bean-graph-sketch.md` |
| Leaving `_____` in source | Blanks are not valid Java — replace them |
| `new` inside CustomerService | Inject via constructor parameter instead |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/bean-graph-sketch.md`
- [ ] Every `_____` / TODO is replaced
- [ ] Compile and run succeed with expected output
- [ ] Notes show the dependency arrow

