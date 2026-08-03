# Lab 33 starter — timed path (~45 minutes)

**Theme:** React components — StatusBadge, CustomerCard, list

## Activity card

| | |
| --- | --- |
| **Checkpoint** | **E** |
| **Must prove** | Amina/Ravi · key=customerId · RTL · build |
| **Hard gate** | Pre-lab Pass · Node 22+ |

## Copy into your workspace

Do **not** grade work only inside the course `labs/` clone. Copy this `starter/` into your bootcamp examples tree as `lab33-crm`.

Starter includes `crm-ui/` Vite React-TS scaffold.

**Windows (PowerShell)** — from this lab folder:

```powershell
New-Item -ItemType Directory -Force -Path "$env:USERPROFILE\java-bootcamp\examples\lab33-crm" | Out-Null
Copy-Item -Recurse -Force ".\starter\*" "$env:USERPROFILE\java-bootcamp\examples\lab33-crm\"
cd $env:USERPROFILE\java-bootcamp\examples\lab33-crm
```

**macOS / Linux:**

```bash
mkdir -p ~/java-bootcamp/examples/lab33-crm
cp -R starter/. ~/java-bootcamp/examples/lab33-crm/
cd ~/java-bootcamp/examples/lab33-crm
```

## 45-minute checklist

- [ ] cd crm-ui && npm install
- [ ] Complete `Customer` types + seed fixtures CUS-1001 / CUS-1002
- [ ] Implement StatusBadge, CustomerCard, CustomerList (key=customerId)
- [ ] Wire App with list + empty/loading shells
- [ ] Run `npm run test -- --run` and `npm run build`

## Smoke test

```bash
cd crm-ui
npm install
npm run test -- --run
npm run build
```

Evidence under `~/java-bootcamp/notes/screenshots/lab-33/` (redact secrets).

## Timed-path Pass criteria

| Criterion | Pass / Fail |
| --------- | ----------- |
| Dashboard shows Amina and Ravi | Pass / Fail |
| List keys use customerId (not index) | Pass / Fail |
| RTL test queries by role | Pass / Fail |
| build succeeds | Pass / Fail |

Continue remaining GUIDE steps as homework / full path if needed.


### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Vite/npm errors | `cd crm-ui` then npm install |
| getByRole fails | Add accessible name / label |
| Index keys warning | key={customer.customerId} |
| Blank page | Check import paths |
