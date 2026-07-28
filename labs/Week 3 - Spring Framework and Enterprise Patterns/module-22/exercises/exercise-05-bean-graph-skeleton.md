# Exercise 3 — Bean Graph Skeleton (TODOs)

**Module 22** · Hands-on exercise · [setup](EXERCISES-INDEX.md)

## Goal

Complete a plain-Java skeleton that mimics constructor DI for CRM collaborators (no Spring runtime yet).

## Steps

### Step 1 — Create files

Under `module-22-exercises/mini-src/com/northstar/crm/`, create `CustomerRepository.java`, `InMemoryCustomerRepository.java`, `CustomerService.java`, and `IocDemo.java`.

### Step 2 — Fill TODOs

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

### Step 3 — Compile and run

From `module-22-exercises`:

```text
javac -d mini-out mini-src/com/northstar/crm/*.java
java -cp mini-out com.northstar.crm.IocDemo
```

Expected: `CUS-1001 | Amina Khan`

### Step 4 — Reflect

In `notes/bean-graph-sketch.md`, draw arrows: `IocDemo` → `CustomerService` → `CustomerRepository`. Note: Lab 22 lets Spring create this graph.

## Expected result

Demo prints `CUS-1001 | Amina Khan` after filling blanks.

## If it fails

| Problem | Fix |
| --- | --- |
| Problem | Fix |
| Leaving `_____` in source | Blanks are not valid Java — replace them |
| `new` inside CustomerService | Inject via constructor parameter instead |

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Every `_____` / TODO is replaced | Pass / Fail |
| 2 | Compile and run succeed with expected output | Pass / Fail |
| 3 | Notes show the dependency arrow | Pass / Fail |
