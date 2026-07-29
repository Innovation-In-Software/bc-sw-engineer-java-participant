# Lab guide style (participant-facing)

Use this structure for `LAB-N-GUIDE.md` files. The script `scripts/improve_all_labs.py` encodes the same rules.

## Required order (lean)

1. Title + meta (module, duration, OS how-to links, env reminder)
2. Timed path (if starter exists)
3. **How to follow this lab** (short checklist)
4. **What you'll submit** — single source of truth (Must / Do not submit)
5. Lab Overview + Learning Objectives + Business Scenario
6. Architecture Context (keep diagrams short)
7. Prerequisites / project files (keep brief)
8. **Key ideas (skim — no write-up)** — max ~6 bullets, no essays
9. **Worked example (read before you code)** — one concrete sample
10. Implementation Steps (`Why` → `Do this` → `Expected result` → `If it fails`)
11. Checkpoints + Reference + Manual Verification + Failure Experiments + Troubleshooting
12. Security review (optional, ≤3 prompts)
13. Cleanup
14. Expected Deliverables → pointer to “What you'll submit”
15. Rubric
16. **Reflection** — max **3** questions, **1–3 sentences** each
17. Bonus — optional, ≤3 items
18. Instructor Notes

## Do not add

- Long “Concepts to Discuss” essay homework before coding
- Duplicate Success Criteria that restate deliverables/checkpoints
- 8–15 generic reflection questions
- Pass/Fail tables that only repeat the same checklist three times without new signal

## Pre-lab exercises

Each `exercise-*.md` should open with Goal → Deliverable → **Worked example** → Steps → Expected result.
