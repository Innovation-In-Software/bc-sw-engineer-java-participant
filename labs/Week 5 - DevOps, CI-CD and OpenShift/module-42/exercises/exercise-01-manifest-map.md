# Exercise 1 — Map k3s Manifests

**Module 42** · Architecture exercise · [setup](EXERCISES-INDEX.md)

## Goal

Name the objects required to run `crm-api` on the cohort k3s cluster.

## Reference

| Object | Holds | Must not hold |
| --- | --- | --- |
| ConfigMap | Non-secret URLs/flags | DB passwords |
| Secret | Credentials (out-of-band) | Values in Git |
| Deployment | Pod template, probes | HostPath secrets |
| Service | ClusterIP ports | TLS private keys |
| Ingress | Host/path/TLS redirect | App business logic |

## Steps

### Step 1 — Objects

List: Namespace (student), ConfigMap, Secret (ref only), Deployment, Service, Ingress (Traefik).

### Step 2 — Check the reference

Cohort cluster uses shared k3s with Traefik Ingress and per-student namespaces—use `kubectl` and instructor kubeconfig (never commit it).

### Step 3 — Labels

Propose app labels: `app=crm-api`, `lab=42`, `customer-fixture=synthetic`.

### Step 4 — Image pin

Note image must be digest-pinned from Lab 41—not `:latest` alone.

## Expected result

A manifest object map with labels and digest-pin note.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Six object types listed | Pass / Fail |
| 2 | Traefik Ingress noted | Pass / Fail |
| 3 | Digest pin required | Pass / Fail |
