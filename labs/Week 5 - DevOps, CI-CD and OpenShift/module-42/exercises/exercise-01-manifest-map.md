# Exercise 1 — Map k3s Manifests

**Module 42** · Architecture exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab42-manifest-map.md` — name the objects required to run `crm-api` on the cohort k3s cluster.

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-42-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-01-manifest-map.md` (this file in the course repo) |
| Your notes file | `notes/lab42-manifest-map.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 42 — Map k3s Manifests

## Reference

| Object | Holds | Must not hold |
| --- | --- | --- |
| ConfigMap | Non-secret URLs/flags | DB passwords |
| Secret | Credentials (out-of-band) | Values in Git |
| Deployment | Pod template, probes | HostPath secrets |
| Service | ClusterIP ports | TLS private keys |
| Ingress | Host/path/TLS redirect | App business logic |

## Step 1 — Objects

List: Namespace (student), ConfigMap, Secret (ref only), Deployment, Service, Ingress (Traefik).

## Step 2 — Check the reference

Cohort cluster uses shared k3s with Traefik Ingress and per-student namespaces—use `kubectl` and instructor kubeconfig (never commit it).

## Step 3 — Labels

Propose app labels: `app=crm-api`, `lab=42`, `customer-fixture=synthetic`.

## Step 4 — Image pin

Note image must be digest-pinned from Lab 41—not `:latest` alone.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-42-exercises/`, create `notes/` if needed, then create `notes/lab42-manifest-map.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 42 — Map k3s Manifests

## Reference

| Object | Holds | Must not hold |
| --- | --- | --- |
| ConfigMap | Non-secret URLs/flags | DB passwords |
| Secret | Credentials (out-of-band) | Values in Git |
| Deployment | Pod template, probes | HostPath secrets |
| Service | ClusterIP ports | TLS private keys |
| Ingress | Host/path/TLS redirect | App business logic |

## Step 1 — Objects

List: Namespace (student), ConfigMap, Secret (ref only), Deployment, Service, Ingress (Traefik).

## Step 2 — Check the reference

Cohort cluster uses shared k3s with Traefik Ingress and per-student namespaces—use `kubectl` and instructor kubeconfig (never commit it).

## Step 3 — Labels

Propose app labels: `app=crm-api`, `lab=42`, `customer-fixture=synthetic`.

## Step 4 — Image pin

Note image must be digest-pinned from Lab 41—not `:latest` alone.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

A manifest object map with labels and digest-pin note in `notes/lab42-manifest-map.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab42-manifest-map.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 42 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab42-manifest-map.md`
- [ ] Six object types listed
- [ ] Traefik Ingress noted
- [ ] Digest pin required

