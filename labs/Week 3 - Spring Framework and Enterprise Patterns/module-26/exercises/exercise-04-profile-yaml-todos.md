# Exercise 4 — Profile YAML TODOs

**Module 26** · Hands-on exercise · [setup](EXERCISES-INDEX.md)

## Goal

Complete a YAML sketch distinguishing `dev` vs `prod` without secrets.

## Steps

### Step 1 — Create sketch files

Create `notes/application.yml`, `notes/application-dev.yml`, `notes/application-prod.yml`.

### Step 2 — Fill TODOs

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

### Step 3 — Self-check

Confirm prod file has no literal password strings.

### Step 4 — Reflect

Correlation for lab evidence: `lab26-001` (or `lab-request-001`).

## Expected result

YAML sketches filled; prod stays secret-free.

## If it fails

| Problem | Fix |
| --- | --- |
| Problem | Fix |
| Password in application-prod.yml | Use env var placeholders only |
| Same config for all profiles | Split dev/test/prod files |

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Base name/port filled | Pass / Fail |
| 2 | Dev logging set | Pass / Fail |
| 3 | Prod has no real secrets | Pass / Fail |
