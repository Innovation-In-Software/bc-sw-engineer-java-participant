# Lab 34 starter — timed path (~45 minutes)

**Theme:** React state & events — lift state, validation, flows

## Activity card

| | |
| --- | --- |
| **Checkpoint** | **E** |
| **Must prove** | create/edit/cancel · field errors · tests green |
| **Hard gate** | Pre-lab Pass · Node 22+ |

## Copy into your workspace

Do **not** grade work only inside the course `labs/` clone. Copy this `starter/` into your bootcamp examples tree as `lab34-crm`.

**Windows (PowerShell)** — from this lab folder:

```powershell
New-Item -ItemType Directory -Force -Path "$env:USERPROFILE\java-bootcamp\examples\lab34-crm" | Out-Null
Copy-Item -Recurse -Force ".\starter\*" "$env:USERPROFILE\java-bootcamp\examples\lab34-crm\"
cd $env:USERPROFILE\java-bootcamp\examples\lab34-crm
```

**macOS / Linux:**

```bash
mkdir -p ~/java-bootcamp/examples/lab34-crm
cp -R starter/. ~/java-bootcamp/examples/lab34-crm/
cd ~/java-bootcamp/examples/lab34-crm
```

## 45-minute checklist

- [ ] cd crm-ui && npm install
- [ ] Lift customers + mode into App; wire create/edit/cancel handlers
- [ ] Complete `customerValidation` field errors
- [ ] Disable Save while saving; discard draft on cancel
- [ ] Green `App.test.tsx` flow tests + `npm run test -- --run`

## Smoke test

```bash
cd crm-ui
npm install
npm run test -- --run
```

Evidence under `~/java-bootcamp/notes/screenshots/lab-34/` (redact secrets).

## Timed-path Pass criteria

| Criterion | Pass / Fail |
| --------- | ----------- |
| Create path adds a customer in UI state | Pass / Fail |
| Edit path updates existing by customerId | Pass / Fail |
| Invalid submit shows field errors | Pass / Fail |
| Cancel discards draft | Pass / Fail |

Continue remaining GUIDE steps as homework / full path if needed.


### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Input not typing | Controlled value + onChange |
| Stale list after edit | Immutable map/clone |
| Infinite render | Don’t setState derived filter in useEffect |
| Cancel leaves draft | Reset draft + errors + mode |
