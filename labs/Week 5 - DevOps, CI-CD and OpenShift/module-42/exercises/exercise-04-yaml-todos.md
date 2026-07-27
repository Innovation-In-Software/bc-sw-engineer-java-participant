# Exercise 4 — Fill Deployment YAML TODOs

**Module 42** · Hands-on exercise · [setup](EXERCISES-INDEX.md)

## Goal

Complete a Deployment skeleton with blanks (pre-lab only).

## Steps

### Step 1 — Skeleton

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

### Step 2 — Fill

Fill replicas, non-root, image digest placeholder, port, readiness path.

### Step 3 — Resources block

Add `resources.requests/limits` placeholders for CPU/memory.

### Step 4 — Do not apply

Explicitly note: do not `kubectl apply` as completion of this exercise.

## Expected result

Filled Deployment skeleton with apply deferred to Lab 42.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Skeleton blanks filled | Pass / Fail |
| 2 | Resources placeholders present | Pass / Fail |
| 3 | No apply claimed | Pass / Fail |
