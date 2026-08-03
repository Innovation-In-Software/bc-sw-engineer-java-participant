# Lab 35 starter — timed path (~45 minutes)

**Theme:** Frontend ↔ API — http client, hooks, CORS notes

## Activity card

| | |
| --- | --- |
| **Checkpoint** | **E** |
| **Must prove** | ApiError · customersApi · abort · CORS note |
| **Hard gate** | Pre-lab Pass · `.env` from example |

## Copy into your workspace

Do **not** grade work only inside the course `labs/` clone. Copy this `starter/` into your bootcamp examples tree as `lab35-crm`.

**Windows (PowerShell)** — from this lab folder:

```powershell
New-Item -ItemType Directory -Force -Path "$env:USERPROFILE\java-bootcamp\examples\lab35-crm" | Out-Null
Copy-Item -Recurse -Force ".\starter\*" "$env:USERPROFILE\java-bootcamp\examples\lab35-crm\"
cd $env:USERPROFILE\java-bootcamp\examples\lab35-crm
```

**macOS / Linux:**

```bash
mkdir -p ~/java-bootcamp/examples/lab35-crm
cp -R starter/. ~/java-bootcamp/examples/lab35-crm/
cd ~/java-bootcamp/examples/lab35-crm
```

## 45-minute checklist

- [ ] cd crm-ui && npm install; copy `.env.example` → `.env`
- [ ] Complete `http.ts` (base URL, AbortSignal, ApiError mapping)
- [ ] Implement `customers.ts` list/get/create against Spring API
- [ ] Wire `useCustomers` + page loading/error states
- [ ] Smoke: list CUS-1001 with backend up; run unit tests

## Smoke test

```bash
cd crm-ui
npm install
npm run test -- --run
```

Evidence under `~/java-bootcamp/notes/screenshots/lab-35/` (redact secrets).

## Timed-path Pass criteria

| Criterion | Pass / Fail |
| --------- | ----------- |
| ApiError distinguishes network vs 4xx/5xx | Pass / Fail |
| customersApi list uses VITE_API_BASE_URL | Pass / Fail |
| AbortController wired on unmount or navigation | Pass / Fail |
| api-integration-notes.md mentions CORS origin | Pass / Fail |

Continue remaining GUIDE steps as homework / full path if needed.


### Troubleshooting

| Symptom | Fix |
| --- | --- |
| CORS in browser | Match Spring allowlist to Vite origin |
| Failed to fetch | curl API; fix VITE_CRM_API_URL; restart Vite |
| Abort toast | Ignore AbortError |
| /api/api | Normalize base URL + path join |
