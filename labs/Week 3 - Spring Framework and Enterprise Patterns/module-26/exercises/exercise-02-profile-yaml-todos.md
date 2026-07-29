# Exercise 4 — Profile YAML TODOs

**Module 26** · Hands-on exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab26-profile-yaml-todos.md` — complete a YAML sketch distinguishing `dev` vs `prod` without secrets.

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-26-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-02-profile-yaml-todos.md` (this file in the course repo) |
| Your notes file | `notes/lab26-profile-yaml-todos.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 26 — Profile YAML TODOs

## Step 2 — Fill TODOs

**application.yml**
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-26-exercises/`, create `notes/` if needed, then create `notes/lab26-profile-yaml-todos.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 26 — Profile YAML TODOs

## Step 2 — Fill TODOs

**application.yml**
```yaml
spring:
  application:
    name: _____
server:
  port: _____
```

**application-dev.yml**
```yaml
northstar:
  integration:
    api-base-url: http://localhost:_____
logging:
  level:
    com.northstar: _____
```

**application-prod.yml**
```yaml
# TODO: do NOT put real passwords here — reference env vars only
northstar:
  integration:
    api-base-url: ${NORTHSTAR_API_BASE_URL:_____}
```
Hints: name `northstar-crm`, port `8080`, debug logging `DEBUG`, prod default placeholder `CHANGE_ME` or empty with fail-fast elsewhere.

## Step 3 — Self-check

Confirm prod file has no literal password strings.

## Step 4 — Reflect

Correlation for lab evidence: `lab26-001` (or `lab-request-001`).

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

YAML sketches filled; prod stays secret-free in `notes/lab26-profile-yaml-todos.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| Password in application-prod.yml | Use env var placeholders only |
| Same config for all profiles | Split dev/test/prod files |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab26-profile-yaml-todos.md`
- [ ] Base name/port filled
- [ ] Dev logging set
- [ ] Prod has no real secrets

