# Exercise 4 — Fill Deployment YAML TODOs

## Activity card

| | |
| --- | --- |
| **Time** | 12–15 minutes |
| **Checkpoint** | **B** (after slides 74–77) |
| **Deliverable** | `notes/lab42-yaml-todos.md` |
| **Fixtures** | CUS-1001 list smoke · Lab 41 image `crm-api:lab41` · no Secret values |

### What you will learn

Fill image tag `crm-api:lab41`, resources, securityContext, probes, labels TODOs.

### Enterprise context

Non-root + requests/limits required for training PSA.

### Predict

Selector labels mismatch Service — symptom?

### Debug

ImagePullBackOff — checklist?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Floating :latest only | Use tag `crm-api:lab41` and record Image Id |
| Missing resources | Set CPU/memory requests and limits |

**Module 42** · Hands-on exercise · [setup + file names](EXERCISES-INDEX.md)

## Deliverable

**Submit only** the file(s) below (not the graded lab).

| Item | Path (under `examples/module-42-exercises/`) |
| ---- | --------------------------------------------- |
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
        image: crm-api:lab41
        ports:
        - containerPort: 8080
        readinessProbe:
          httpGet:
            path: /actuator/health/readiness
            port: http
```

## Step 2 — Fill

Fill replicas (`1`), non-root UID `10001`, image tag `crm-api:lab41`, port `8080`, readiness path.

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

