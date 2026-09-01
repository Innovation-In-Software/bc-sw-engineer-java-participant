# Final defense — slide outline (session stub)

Fill **[presentation-template.md](presentation-template.md)** first (**20** PowerPoint slides + hidden appendix), then keep this table as the run-of-show. Export to `defense/final-presentation.pdf` on the full path.

| # | Slide title | Speaker | Time | Evidence link (must exist) |
| - | ----------- | ------- | ---- | -------------------------- |
| 1 | Title / team | _____ | 20 s | — |
| 2 | Agenda | _____ | 20 s | — |
| 3 | Problem / outcome | _____ | 45 s | `docs/architecture/context.md` |
| 4 | In / out of scope | _____ | 45 s | `docs/backlog.md` |
| 5 | Demo people (Amina / Ravi) | _____ | 45 s | `docs/backlog.md` |
| 6 | Architecture — context | _____ | 1 min | `docs/architecture/context.md` |
| 7 | Architecture — containers / flow | _____ | 1 min | `docs/architecture/container.md` |
| 8 | Why PostgreSQL | _____ | 40 s | `docs/adrs/` |
| 9 | Why Kafka + persist first | _____ | 45 s | `docs/adrs/` |
| 10 | Why JWT on the API | _____ | 40 s | `docs/adrs/` |
| 11 | Why pinned container | _____ | 40 s | `docs/adrs/`, artifact manifest |
| 12 | Demo map | _____ | 30 s | `docs/backend-demo.md` |
| 13 | **Live demo** (title card only) | _____ | 8–10 min | demo-script + evidence-index |
| 14 | Security — login and roles | _____ | 45 s | tests / security demo |
| 15 | Security — tokens, secrets, scans | _____ | 40 s | threat model / reports |
| 16 | Release — identity and rollback | _____ | 45 s | `docs/security-deploy-demo.md` |
| 17 | Quality — tests | _____ | 40 s | `reports/test-evidence.md` |
| 18 | Performance and operability | _____ | 45 s | `docs/nfrs.md` |
| 19 | Residual risk and retrospective | _____ | 45 s | risk register, retro |
| 20 | Q&A | all | remaining | `defense/technical-q-and-a.md` |
| A1–A4 | Appendix (hidden) | — | 0 unless asked | screenshots, scans |

## Rules

- No claim without an `evidence-index.md` row.
- Never show live JWTs, kubeconfigs, or real emails.
- Guest-facing titles (no homework jargon on the projector).
- Do not cram slides 8–11 or 14–18 back onto one slide.
