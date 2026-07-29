# Exercise 4 — Service Layer Skeleton (TODOs)

**Module 25** · Hands-on exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab25-service-todo-skeleton.md` — complete a tiny layered demo that rejects duplicate `CUS-1001` creates.

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-25-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-03-service-todo-skeleton.md` (this file in the course repo) |
| Your notes file | `notes/lab25-service-todo-skeleton.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 25 — Service Layer Skeleton (TODOs)

## Step 1 — Files

Under `module-25-exercises/mini-src/com/northstar/crm/`, create `CustomerRepository.java`, `InMemoryCustomerRepository.java`, `CustomerService.java`, `LayerDemo.java`.

## Step 2 — Fill TODOs
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-25-exercises/`, create `notes/` if needed, then create `notes/lab25-service-todo-skeleton.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 25 — Service Layer Skeleton (TODOs)

## Step 1 — Files

Under `module-25-exercises/mini-src/com/northstar/crm/`, create `CustomerRepository.java`, `InMemoryCustomerRepository.java`, `CustomerService.java`, `LayerDemo.java`.

## Step 2 — Fill TODOs

```java
package com.northstar.crm;

import java.util.*;

interface CustomerRepository {
    boolean exists(String id);
    void save(String id, String name);
    String getName(String id);
}

class InMemoryCustomerRepository implements CustomerRepository {
    private final Map<String, String> store = new HashMap<>();
    InMemoryCustomerRepository() {
        // TODO: seed CUS-1001 → Amina Khan
        store.put(_____, _____);
    }
    public boolean exists(String id) { return store.containsKey(id); }
    public void save(String id, String name) { store.put(id, name); }
    public String getName(String id) { return store.get(id); }
}

class CustomerService {
    private final CustomerRepository repo;
    CustomerService(CustomerRepository repo) { this.repo = repo; }
    void create(String id, String name) {
        // TODO: if exists, throw IllegalStateException("duplicate")
        if (repo._____(id)) throw new IllegalStateException("duplicate");
        repo.save(id, name);
    }
}

public class LayerDemo {
    public static void main(String[] args) {
        CustomerService svc = new CustomerService(new InMemoryCustomerRepository());
        try {
            svc.create("CUS-1001", "Amina Khan");
            System.out.println("UNEXPECTED");
        } catch (IllegalStateException ex) {
            System.out.println("duplicate blocked");
        }
    }
}
```

## Step 3 — Compile and run

```text
javac -d mini-out mini-src/com/northstar/crm/*.java
java -cp mini-out com.northstar.crm.LayerDemo
```
Expected: `duplicate blocked`

## Step 4 — Reflect

Note: HTTP/controller is intentionally absent — that is Lab 25 starter work.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Demo prints `duplicate blocked` after filling blanks in `notes/lab25-service-todo-skeleton.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab25-service-todo-skeleton.md` |
| Saving without exists check | Service must reject duplicates |
| Using ResponseEntity in service | Keep HTTP types in controllers (lab) |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab25-service-todo-skeleton.md`
- [ ] Seed and exists TODOs completed
- [ ] Expected console output
- [ ] Reflection notes HTTP is deferred

