# Lab guide style (participant-facing)

Lean participant guides. Apply with `scripts/declutter_all_lab_guides.py` (and `scripts/dedupe_all_lab_instructions.py` for setup boilerplate).

## Required order (lean)

1. Title + Participants banner + **Activity card** + lab-specific callouts (Incremental build / Critical scope / Pacing)
2. Timed path (if starter exists)
3. **What you'll submit** — single source of truth (Must / Do not submit)
4. **Lab Overview** — ≤2 short paragraphs (no Purpose / What you build / What success essays)
5. **Learning Objectives** — max **5** bullets
6. **Business Scenario** — fixtures table + leadership freeze (keep short)
7. **Architecture Context** — at most **one** diagram; no second “lab flow” mermaid; no NOW vs LATER table that restates Critical scope
8. **Prerequisites** — brief (Lab 0 assumed)
9. **Worked example** — one concrete sample
10. **Implementation Steps** (`Why` → `Do this` → `Expected result` → `If it fails`)
11. **Implementation Checkpoints**
12. **Reference** — short commands / one code sample only (≤80 lines)
13. **Failure Experiments** + **Troubleshooting** (≤8 rows)
14. **Security** — optional, ≤3 prompts
15. **Cleanup**
16. **Rubric**
17. **Reflection** — max **3** questions, **1–3 sentences** each

## Remove (clutter)

- **How to follow this lab** when the Participants banner + timed path already cover it
- Environment reminder / Hard-gate callouts that restate the banner
- **Manual Verification** (duplicates checkpoints)
- **Expected Deliverables** pointer section (submit list already at top)
- **Suggested Project Files** trees (starter + Activity card paths are enough)
- **Key ideas** essays (pre-lab exercises cover concepts)
- **Bonus Challenges**
- **Instructor Notes** inside participant GUIDEs (use module `PACING.md` instead)
- Pass/Fail tables that only repeat the same checklist three times

## Pre-lab exercises

Each `exercise-*.md`: **Activity card** → Deliverable → **Worked example** → Steps → Expected result.  
Do **not** paste a Goal section that restates the Activity card objective.
