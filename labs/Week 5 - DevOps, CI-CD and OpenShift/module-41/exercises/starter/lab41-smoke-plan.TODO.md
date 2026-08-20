# Smoke plan

Work in **`java-bootcamp`**. Do not `--env-file .env.example` with an empty password.

1. `docker build --pull -t crm-api:lab41 .` from `examples/lab41-crm`
2. `docker run -d --network lab37-crm_default --env-file .env.local …`
3. curl readiness
4. `GET /api/customers?status=ACTIVE` (Lab 40 has no `/api/v1/interactions`)
5. `docker stop --time 20` (graceful)

**Self-mark:** Pass / Fail
