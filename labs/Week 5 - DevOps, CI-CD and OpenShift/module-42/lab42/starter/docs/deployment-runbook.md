# Lab 42 — Deployment runbook

## Prerequisites

- Work in **`java-bootcamp/examples/lab42-crm`**, not the course clone
- k3d cluster `lab42` (`rancher/k3s:v1.28.15-k3s1`, `-p 8088:80@loadbalancer`)
- Kubeconfig rewritten so `server:` uses `127.0.0.1` (not `host.docker.internal`)
- Namespace: `crm-training`
- Image: `crm-api:lab41` imported (`k3d image import crm-api:lab41 -c lab42`)
- Lab 41 Image Id recorded: `TODO(lab42)`
- Database `crm_lab42` on host Postgres; user `crm`

## Apply

Never `kubectl apply -f k8s/` — that applies `secret.example.yaml`.

```bash
kubectl apply -f k8s/configmap.yaml -n crm-training
kubectl -n crm-training create secret generic crm-api-secrets \
  --from-literal=CRM_DB_PASSWORD='change-me' \
  --dry-run=client -o yaml | kubectl apply -f -
kubectl apply -f k8s/deployment.yaml -n crm-training
kubectl apply -f k8s/service.yaml -n crm-training
kubectl apply -f k8s/ingress.yaml -n crm-training
kubectl rollout status deployment/crm-api -n crm-training --timeout=180s
```

## Smoke

Host header (no hosts-file required):

```bash
curl -fsS -H "Host: crm-api.training.example.test" \
  http://127.0.0.1:8088/actuator/health/readiness
curl -fsS -H "Host: crm-api.training.example.test" \
  -H "X-Correlation-Id: lab-request-001" \
  "http://127.0.0.1:8088/api/customers?status=ACTIVE"
```

## Rollback rehearsal

```bash
kubectl -n crm-training set image deployment/crm-api crm-api=crm-api:does-not-exist
kubectl -n crm-training rollout undo deployment/crm-api
kubectl -n crm-training rollout status deployment/crm-api --timeout=180s
```
