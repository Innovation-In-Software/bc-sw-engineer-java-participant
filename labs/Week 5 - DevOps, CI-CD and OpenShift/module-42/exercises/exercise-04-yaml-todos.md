# Exercise 4 — Fill Deployment YAML TODOs

**Module 42** · Hands-on exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab42-yaml-todos.md` — complete a Deployment skeleton with blanks (pre-lab only).

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-42-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-04-yaml-todos.md` (this file in the course repo) |
| Your notes file | `notes/lab42-yaml-todos.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 42 — Fill Deployment YAML TODOs

## Step 1 — Skeleton

In notes, draft:
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-42-exercises/`, create `notes/` if needed, then create `notes/lab42-yaml-todos.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 42 — Fill Deployment YAML TODOs

## Step 1 — Skeleton

In notes, draft:
```yaml
# deployment-skeleton.yaml
spec:
  replicas: _____
  template:
    spec:
      securityContext:
        runAsNonRoot: _____
        runAsUser: _____
      containers:
      - name: crm-api
        image: _____@sha256:_____
        ports:
        - containerPort: _____
        readinessProbe:
          httpGet:
            path: _____
            port: _____
```

## Step 2 — Fill

Fill replicas, non-root, image digest placeholder, port, readiness path.

## Step 3 — Resources block

Add `resources.requests/limits` placeholders for CPU/memory.

## Step 4 — Do not apply

Explicitly note: do not `kubectl apply` as completion of this exercise.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Filled Deployment skeleton with apply deferred to Lab 42 in `notes/lab42-yaml-todos.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab42-yaml-todos.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 42 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab42-yaml-todos.md`
- [ ] Skeleton blanks filled
- [ ] Resources placeholders present
- [ ] No apply claimed

