# Lab 36 starter — timed path (~45 minutes)

**Theme:** Frontend security — token memory, protected routes, XSS

## Activity card

| | |
| --- | --- |
| **Checkpoint** | **E** |
| **Must prove** | No web-storage token · ProtectedRoute · XSS test |
| **Hard gate** | Pre-lab Pass · Lab 35 http boundary |

## Copy into your workspace

Do **not** grade work only inside the course `labs/` clone. Copy this `starter/` into your bootcamp examples tree as `lab36-crm`.

**Windows (PowerShell)** — from this lab folder:

```powershell
New-Item -ItemType Directory -Force -Path "$env:USERPROFILE\java-bootcamp\examples\lab36-crm" | Out-Null
Copy-Item -Recurse -Force ".\starter\*" "$env:USERPROFILE\java-bootcamp\examples\lab36-crm\"
cd $env:USERPROFILE\java-bootcamp\examples\lab36-crm
```

**macOS / Linux:**

```bash
mkdir -p ~/java-bootcamp/examples/lab36-crm
cp -R starter/. ~/java-bootcamp/examples/lab36-crm/
cd ~/java-bootcamp/examples/lab36-crm
```

## 45-minute checklist

- [ ] cd crm-ui && npm install
- [ ] Implement in-memory `tokenStore` (no localStorage)
- [ ] Complete AuthContext + LoginPage + ProtectedRoute
- [ ] Attach bearer only to CRM API origin in `http.ts`
- [ ] Pass XSS RTL test; fill security-decisions.md

## Smoke test

```bash
cd crm-ui
npm install
npm run test -- --run
```

Evidence under `~/java-bootcamp/notes/screenshots/lab-36/` (redact secrets).

## Timed-path Pass criteria

| Criterion | Pass / Fail |
| --------- | ----------- |
| Anonymous users redirected to login | Pass / Fail |
| Token not present in localStorage/sessionStorage | Pass / Fail |
| Authorization header only for API origin | Pass / Fail |
| XSS test does not use dangerous HTML APIs | Pass / Fail |

Continue remaining GUIDE steps as homework / full path if needed.


### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Token in Application tab | Use in-memory tokenStore only |
| Bearer on wrong host | Attach only when URL matches apiOrigin |
| 403 logs out | Do not reuse 401 logout handler |
| XSS test finds HTML nodes | Render text; remove HTML sinks |
