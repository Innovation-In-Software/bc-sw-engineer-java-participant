# Exercise 1 — CrmApplication Stub (TODOs)

**Module 23** · Hands-on exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/health-sketch.md` — fill blanks on a `@SpringBootApplication` stub and a fake health line (compile as plain notes if Spring jars absent).

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-23-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-03-crm-application-stub.md` (this file in the course repo) |
| Your notes file | `notes/health-sketch.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 23 — CrmApplication Stub (TODOs)

## Step 2 — Fill TODOs
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-23-exercises/`, create `notes/` if needed, then create `notes/health-sketch.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 23 — CrmApplication Stub (TODOs)

## Step 2 — Fill TODOs

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

## Step 3 — Answer key self-check

`@SpringBootApplication`, `run`, path `health`, status `UP`. Do not invent JWT or SOAP stubs here.

## Step 4 — Reflect

One sentence: Boot entry point is tiny because auto-configuration supplies infrastructure.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Stub blanks and health sketch filled correctly in `notes/health-sketch.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/health-sketch.md` |
| Using `@Component` as entry point | Use `@SpringBootApplication` on the main class |
| Health at `/health` only | Default Boot Actuator path is `/actuator/health` |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/health-sketch.md`
- [ ] `@SpringBootApplication` and `run` filled
- [ ] Health path and UP recorded
- [ ] No JWT/SOAP scope creep

