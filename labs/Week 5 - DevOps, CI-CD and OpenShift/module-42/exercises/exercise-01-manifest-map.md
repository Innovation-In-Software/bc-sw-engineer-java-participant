# Exercise 1 — Map k3s Manifests

## Activity card

| | |
| --- | --- |
| **Time** | 12–15 minutes |
| **Checkpoint** | **A** (after slides 61–73) |
| **Deliverable** | `notes/lab42-manifest-map.md` |
| **Fixtures** | CUS-1001 list smoke · Lab 41 image `crm-api:lab41` · no Secret values |

### What you will learn

Map Deployment, Service, ConfigMap, Ingress for CRM image from Lab 41.

### Enterprise context

Declarative deploy beats 'works on my Docker laptop' as done.

### Predict

What selects Pods for a Service?

### Debug

Using OpenShift Route YAML on Traefik-only k3s — fix?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| No Lab 41 image | Build `crm-api:lab41` in Lab 41; record Image Id |
| Applying to cluster in pre-lab | Notes/dry-run only until Lab 42 |

**Module 42** · Architecture exercise · [setup + file names](EXERCISES-INDEX.md)

## Deliverable

**Submit only** the file(s) below (not the graded lab).

| Item | Path (under `examples/module-42-exercises/`) |
| ---- | --------------------------------------------- |
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

Default student cluster is **local k3d** (`lab42`, Traefik Ingress). Use `kubectl` with the k3d kubeconfig (never commit it). A shared instructor cluster is optional and only if the instructor publishes it.

## Step 3 — Labels

Propose app labels: `app=crm-api`, `lab=42`, `customer-fixture=synthetic`.

## Step 4 — Image pin

Note image is Lab 41 tag `crm-api:lab41` (record Image Id). Do not deploy `:latest` alone. A registry digest is optional until you push.

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

Default student cluster is **local k3d** (`lab42`, Traefik Ingress). Use `kubectl` with the k3d kubeconfig (never commit it). A shared instructor cluster is optional and only if the instructor publishes it.

## Step 3 — Labels

Propose app labels: `app=crm-api`, `lab=42`, `customer-fixture=synthetic`.

## Step 4 — Image pin

Note image is Lab 41 tag `crm-api:lab41` (record Image Id). Do not deploy `:latest` alone. A registry digest is optional until you push.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

A manifest object map with labels and Lab 41 image-id note in `notes/lab42-manifest-map.md`.

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
- [ ] Image tag `crm-api:lab41` + Image Id noted

