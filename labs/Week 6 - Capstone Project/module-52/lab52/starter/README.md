# Lab 52 starter — session block (~45 minutes)

**Theme:** Defense slide outline + demo script template  

## Activity card

| | |
| --- | --- |
| **Checkpoint** | **E** |
| **Must prove** | outline · timed demo · ≥5 evidence · deny/fallback |
| **Hard gate** | Pre-lab Pass · Labs 48–51 paths listed |

**Target:** `~/java-bootcamp/examples/customer-management-platform/defense/`

Timed-path policy: [`labs/_STARTER-PATH.md`](../../../../_STARTER-PATH.md)

## Copy into your workspace

**Windows (PowerShell)** — from this lab folder:

```powershell
$dest = "$env:USERPROFILE\java-bootcamp\examples\customer-management-platform"
New-Item -ItemType Directory -Force -Path "$dest\defense" | Out-Null
Copy-Item -Recurse -Force ".\starter\*" $dest\
cd $dest\defense
```

**macOS / Linux:**

```bash
mkdir -p ~/java-bootcamp/examples/customer-management-platform
cp -R starter/. ~/java-bootcamp/examples/customer-management-platform/
cd ~/java-bootcamp/examples/customer-management-platform/defense
```

## 45-minute session checklist

- [ ] Fill slide outline titles/speakers in `defense/slide-outline.md`
- [ ] Time-box demo beats in `defense/demo-script.md` (Amina + `lab-request-001`)
- [ ] List ≥5 evidence links in `defense/evidence-index.md` stub rows
- [ ] Draft 3 Q&A cards (security, data, messaging)
- [ ] Note fallback if live infra fails (screenshot / curl)

## Smoke test

```bash
ls defense/slide-outline.md defense/demo-script.md defense/evidence-index.md
# Rehearse demo script aloud once (timer ~8–10 min happy path + deny beat)
```

Evidence under `~/java-bootcamp/notes/screenshots/lab-52/`. Scrub secrets from portfolio pack.

## Timed-path Pass criteria

| Criterion | Pass / Fail |
| --------- | ----------- |
| Slide outline covers business → architecture → demo → ops | Pass / Fail |
| Demo script timed with fixture IDs | Pass / Fail |
| Evidence index has paths for Labs 48–51 artifacts | Pass / Fail |
| Failover / deny-path beat documented | Pass / Fail |

Full path (multi-day): PDF export, full Q&A deck, retrospective, self-assessment, panel delivery — see GUIDE.


### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Evidence rows empty | Paste real Labs 48–51 relative paths |
| Demo untimed | Add minute marks + speaker/operator |
| No fallback | Screenshot or curl deny/happy path |
| Secret in outline | Remove before rehearsal |
