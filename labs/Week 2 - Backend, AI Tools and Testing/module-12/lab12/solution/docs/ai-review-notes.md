## lab12-001 — manual refactor substitute

- Prompt/choice: extract validation helpers + Map store (manual; Copilot optional)
- Decision: accept-with-edits
- Risk caught: would have reintroduced silent upsert on duplicate — rejected; keep IllegalStateException
