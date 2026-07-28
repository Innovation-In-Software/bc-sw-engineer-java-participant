# Exercise 1 — CrmApplication Stub (TODOs)

**Module 23** · Hands-on exercise · [setup](EXERCISES-INDEX.md)

## Goal

Fill blanks on a `@SpringBootApplication` stub and a fake health line (compile as plain notes if Spring jars absent).

## Steps

### Step 1 — Create stub file

Create `notes/CrmApplicationStub.java` (notes only — Lab 23 uses the real starter).

### Step 2 — Fill TODOs

```java
package com.northstar.crm;

// TODO: Spring Boot annotation that enables auto-config + component scan
@_____
public class CrmApplication {
    public static void main(String[] args) {
        // TODO: method that boots the context — SpringApplication._____(CrmApplication.class, args)
        SpringApplication._____(CrmApplication.class, args);
    }
}
```

Also complete in `notes/health-sketch.md`:
> Actuator health URL path: `/actuator/_____`
> Expected status for a healthy process: `_____`

### Step 3 — Answer key self-check

`@SpringBootApplication`, `run`, path `health`, status `UP`. Do not invent JWT or SOAP stubs here.

### Step 4 — Reflect

One sentence: Boot entry point is tiny because auto-configuration supplies infrastructure.

## Expected result

Stub blanks and health sketch filled correctly.

## If it fails

| Problem | Fix |
| --- | --- |
| Problem | Fix |
| Using `@Component` as entry point | Use `@SpringBootApplication` on the main class |
| Health at `/health` only | Default Boot Actuator path is `/actuator/health` |

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | `@SpringBootApplication` and `run` filled | Pass / Fail |
| 2 | Health path and UP recorded | Pass / Fail |
| 3 | No JWT/SOAP scope creep | Pass / Fail |
