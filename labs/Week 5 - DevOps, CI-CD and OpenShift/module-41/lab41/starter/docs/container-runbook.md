# Lab 41 — Container runbook

Work in **`java-bootcamp/examples/lab41-crm`** (not the course clone).

## Build

```bash
# TODO(lab41): Record exact command + image id (RepoDigests empty until push)
docker build --pull -t crm-api:lab41 .
```

## Run

```bash
# TODO(lab41): Copy .env.example → .env.local; set CRM_DB_PASSWORD=change-me
docker run -d --name crm-lab41 --network lab37-crm_default \
  --memory=512m --env-file .env.local -p 8080:8080 crm-api:lab41
```

## Verify

- Readiness: `TODO(lab41): curl …/actuator/health/readiness`
- CRM smoke: `GET /api/customers?status=ACTIVE` with `X-Correlation-Id: lab-request-001` (Lab 40 has no `/api/v1/interactions`)
- User inside container: `TODO(lab41): docker exec crm-lab41 id` → expect UID 10001

## Stop / graceful shutdown

```bash
docker stop --time 20 crm-lab41
```

## Registry (notes only — no credentials)

TODO(lab41): Tagging scheme, digest pin for Lab 42, where auth lives (not Git).
