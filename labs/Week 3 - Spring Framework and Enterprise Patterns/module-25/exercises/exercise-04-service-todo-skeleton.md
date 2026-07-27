# Exercise 4 — Service Layer Skeleton (TODOs)

**Module 25** · Hands-on exercise · [setup](EXERCISES-INDEX.md)

## Goal

Complete a tiny layered demo that rejects duplicate `CUS-1001` creates.

## Steps

### Step 1 — Files

Under `module-25-exercises/mini-src/com/northstar/crm/`, create `CustomerRepository.java`, `InMemoryCustomerRepository.java`, `CustomerService.java`, `LayerDemo.java`.

### Step 2 — Fill TODOs

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

### Step 3 — Compile and run

```text
javac -d mini-out mini-src/com/northstar/crm/*.java
java -cp mini-out com.northstar.crm.LayerDemo
```
Expected: `duplicate blocked`

### Step 4 — Reflect

Note: HTTP/controller is intentionally absent — that is Lab 25 starter work.

## Expected result

Demo prints `duplicate blocked` after filling blanks.

## If it fails

| Problem | Fix |
| --- | --- |
| Problem | Fix |
| Saving without exists check | Service must reject duplicates |
| Using ResponseEntity in service | Keep HTTP types in controllers (lab) |

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Seed and exists TODOs completed | Pass / Fail |
| 2 | Expected console output | Pass / Fail |
| 3 | Reflection notes HTTP is deferred | Pass / Fail |
