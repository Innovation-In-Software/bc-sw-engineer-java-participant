# Lab 48 starter — session block (~45 minutes)

**Theme:** Capstone planning templates (ADRs, context diagram stub, plan docs)  

## Activity card

| | |
| --- | --- |
| **Checkpoint** | **E** |
| **Must prove** | context + fixtures · ≥1 ADR · backlog/risk seeds |
| **Hard gate** | Pre-lab Pass · docs before Lab 49 code |

**Target tree:** `~/java-bootcamp/examples/customer-management-platform/` (Windows: `%USERPROFILE%\java-bootcamp\examples\customer-management-platform`)

This starter is for the **scheduled class block**. Multi-day architecture depth stays on the full GUIDE path.

Timed-path policy: [`labs/_STARTER-PATH.md`](../../../../_STARTER-PATH.md)

## Copy into your workspace

**Windows (PowerShell)** — from this lab folder:

```powershell
$dest = "$env:USERPROFILE\java-bootcamp\examples\customer-management-platform"
New-Item -ItemType Directory -Force -Path $dest | Out-Null
Copy-Item -Recurse -Force ".\starter\*" $dest\
cd $dest
```

**macOS / Linux:**

```bash
mkdir -p ~/java-bootcamp/examples/customer-management-platform
cp -R starter/. ~/java-bootcamp/examples/customer-management-platform/
cd ~/java-bootcamp/examples/customer-management-platform
```

If the platform tree already exists, merge carefully — do not overwrite filled ADRs without backing them up.

## 45-minute session checklist

- [ ] Copy starter docs into `customer-management-platform/`
- [ ] Fill product outcome + actors in `docs/architecture/context.md`
- [ ] Sketch C4 context (boxes + trust boundaries) in the stub
- [ ] Draft **one** ADR from `docs/adrs/_ADR-TEMPLATE.md` (e.g. PostgreSQL or Kafka)
- [ ] Sketch 3 vertical backlog rows in `docs/backlog.md` (include CAP-12 / interaction for `CUS-1001`)
- [ ] Note 2 scored risks in `docs/risk-register.md`

## Smoke test

```bash
# Docs-only — no Maven required for Lab 48 session block
ls docs/architecture/context.md docs/adrs/_ADR-TEMPLATE.md docs/backlog.md
```

Evidence under `~/java-bootcamp/notes/screenshots/lab-48/` (redact secrets).

## Timed-path Pass criteria

| Criterion | Pass / Fail |
| --------- | ----------- |
| `context.md` names outcome + Amina/Ravi fixtures | Pass / Fail |
| Context diagram stub has ≥3 containers / actors | Pass / Fail |
| ≥1 ADR filled (Status + Decision + Consequences) | Pass / Fail |
| Backlog includes interaction story for `CUS-1001` | Pass / Fail |

Continue remaining GUIDE steps (all 5 ADRs, NFRs, team plan, full risk register) as homework / multi-day work.


### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Overwriting existing ADRs | Backup before copy; merge carefully |
| Vague NFRs in context | Move metrics to nfrs.md with targets |
| No acceptance on backlog rows | Add Given/When/Then or checklist |
| Secret in ADR | Remove; rotate if real |
