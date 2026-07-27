# Exercise 5 — Read a Dependency Tree

**Module 9** · Analysis + CI habit exercise · [setup](EXERCISES-INDEX.md)

## Goal

Create `dependency-tree-notes.md` distinguishing direct vs transitive dependencies and recording why CI prefers `mvn -B verify`.

## Sample tree (study only)

```text
com.northstar:build-demo:jar:0.1.0-SNAPSHOT
+- org.junit.jupiter:junit-jupiter:jar:5.11.4:test
|  \- org.junit.jupiter:junit-jupiter-params:jar:5.11.4:test
\- (no production compile dependencies in the mini project)
```

| Term | Meaning |
| ---- | ------- |
| Direct dependency | Declared in **your** `pom.xml` |
| Transitive dependency | Pulled in because a direct dependency needs it |
| Scope column (`:test`) | Where that artifact is visible |

## Steps

### Step 1 — Classify rows

| Artifact | Direct or transitive? | Scope shown |
| -------- | --------------------- | ----------- |
| `junit-jupiter` | | |
| `junit-jupiter-params` | | |

### Step 2 — Check the reference

| Artifact | Direct or transitive? | Scope |
| -------- | --------------------- | ----- |
| `junit-jupiter` | Direct (you declared it) | `test` |
| `junit-jupiter-params` | Transitive (comes with Jupiter) | `test` |

### Step 3 — Classify from the sample now; run Maven after Exercise 6

Use the sample tree above for your notes. After you finish **Exercise 6** (mini POM), re-run from `mini-maven/`:

```bash
mvn -q dependency:tree
```

Optional (saves a file for Lab 9 practice):

```bash
mvn -q dependency:tree -DoutputFile=dependency-tree.txt
```

Paste or summarize the tree into `dependency-tree-notes.md`. Confirm JUnit appears with `:test`.

### Step 4 — CI command habit

Answer in notes:

| Question | Answer |
| -------- | ------ |
| What does `-B` mean? | Batch mode — less interactive prompts, friendlier for CI logs |
| Why `verify` instead of casual `install` on every push? | Proves package + checks without writing into every agent’s `~/.m2` unless the pipeline intentionally installs |
| Preferred CI-style command for this bootcamp | `mvn -B verify` |

Write one sentence you could put in a README:

> Teammates and CI should reproduce the build with `mvn -B verify`.

## Expected result

You can label direct vs transitive rows, spot `:test` scope in the tree, and document the CI verify habit before Lab 9’s full evidence pack.

## Pass criteria

| # | Confirm | Notes |
| - | ------- | ----- |
| 1 | Direct vs transitive for Jupiter rows is correct | Pass / Fail |
| 2 | You ran or explained `mvn dependency:tree` | Pass / Fail |
| 3 | Notes include `mvn -B verify` as the CI habit | Pass / Fail |
