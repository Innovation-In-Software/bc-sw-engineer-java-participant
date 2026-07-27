# Exercise 4 — Choose Dependency Scopes

**Module 9** · Analysis exercise · [setup](EXERCISES-INDEX.md)

## Goal

Create `dependency-scopes-notes.md` and assign the correct Maven scope so libraries land on the right classpath.

## Scope map

| Scope | On compile classpath? | On runtime classpath? | Typical use |
| ----- | --------------------- | --------------------- | ------------ |
| `compile` (default) | Yes | Yes | Application libraries you call from production code |
| `test` | Tests only | Tests only | JUnit, Mockito, test helpers |
| `runtime` | No | Yes | Drivers needed to run but not compile against |
| `provided` | Yes | No (container supplies) | Servlet API on an app server; JDK-provided APIs |

## Steps

### Step 1 — Assign a scope

| Dependency need | Scope |
| --------------- | ----- |
| JUnit Jupiter used only in `src/test/java` | |
| Spring Context API called from production sources (Lab 9 learning placeholder) | |
| JDBC driver you never import in Java source but need at runtime later | |
| API the application server will provide in production | |

### Step 2 — Check the reference

| Dependency need | Scope |
| --------------- | ----- |
| JUnit Jupiter | `test` |
| Spring Context (placeholder) | `compile` (default) |
| JDBC driver (no compile-time imports) | `runtime` |
| Server-provided API | `provided` |

### Step 3 — Explain a bad default

Bad:

```xml
<dependency>
  <groupId>org.junit.jupiter</groupId>
  <artifactId>junit-jupiter</artifactId>
  <version>5.11.4</version>
  <!-- no scope — defaults to compile -->
</dependency>
```

Write why this is wrong:

> JUnit becomes a production dependency: it is packaged/resolved for the main app, pollutes the runtime classpath, and signals the wrong intent to teammates and CI.

### Step 4 — Write one team rule

Add to `dependency-scopes-notes.md`:

```markdown
Test libraries always use `<scope>test</scope>`.
Do not leave JUnit on the default `compile` scope.
```

## Expected result

You can pick scopes for test vs production vs runtime-only vs provided dependencies.

## Pass criteria

| # | Confirm | Notes |
| - | ------- | ----- |
| 1 | Four scope assignments match the reference | Pass / Fail |
| 2 | You explain the JUnit-without-scope mistake | Pass / Fail |
| 3 | Team rule is written | Pass / Fail |
