# Module 36 — Learn → Practice → Review (participant)

**Theme:** Frontend Security  
**CRM:** in-memory JWT · ProtectedRoute (UX only) · XSS-safe rendering · Spring = authz

## Checkpoint map

| CP | After slides | Practice | Minutes |
| -- | ------------ | -------- | ------- |
| **A** | 141–145 threats | [Ex 1](exercises/exercise-01-threat-sketch.md) | ~10–12 |
| **B** | 146–148 JWT storage | [Ex 2](exercises/exercise-02-token-storage.md) | ~12–15 |
| **C** | 149–152 XSS/CSRF | [Ex 3](exercises/exercise-03-xss-csp.md) → [4](exercises/exercise-04-csrf-notes.md) | ~20–24 |
| **D** | 153–157 secure UI | [Ex 5](exercises/exercise-05-fill-guard-todos.md) → [6](exercises/exercise-06-lab36-readiness.md) | ~18–22 |
| **E** | 158–161 | [Lab 36](lab36/LAB-36-GUIDE.md) timed ~45 min | ~45 |

## Practice order

**1 → 2 → 3 → 4 → 5 → 6** then Lab 36.

## Do / don't

| Do now | Don't yet |
| --- | --- |
| In-memory token; origin-scoped Authorization | Tokens in localStorage (this lab) |
| XSS text rendering; CSRF notes / N/A | Trusting UI guards as authorization |
| Login + ProtectedRoute UX | Full OAuth/OIDC provider setup / Module 37 DB |

## Hard gate before Lab 36

- [ ] Ex 1–6 notes exist
- [ ] Lab 35 http boundary available (or starter)
- [ ] No real secrets in notes/screenshots
