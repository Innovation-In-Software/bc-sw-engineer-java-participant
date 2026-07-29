# Exercise 4 — Fill Route Guard TODOs

**Module 36** · Hands-on exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab36-todos.md` — fill TODOs for a RequireAuth wrapper protecting CRM routes.

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-36-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-05-fill-guard-todos.md` (this file in the course repo) |
| Your notes file | `notes/lab36-todos.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 36 — Fill Route Guard TODOs

## Step 1 — Paste

Create `notes/lab36-todos.md`:
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-36-exercises/`, create `notes/` if needed, then create `notes/lab36-todos.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 36 — Fill Route Guard TODOs

## Step 1 — Paste

Create `notes/lab36-todos.md`:

```tsx
function RequireAuth({ children }: { children: React.ReactNode }) {
  const token = _____; // read from your chosen storage
  if (!token) {
    return <Navigate to="_____" replace />;
  }
  return _____;
}

// TODO: attach Authorization: Bearer _____ on API fetch (Lab 35+36)
// TODO: never log full token; log correlation lab-request-001 instead
```

## Step 2 — Fill

Suggested: `getAccessToken()`, `"/login"`, `<>{children}</>`, `lab-token-001` (fake).

## Step 3 — Role note

Optional TODO: `// TODO: hide AdminMenu unless role===ADMIN` (UI only).

## Step 4 — Backend reminder

Write: Spring Security still must reject unauthorized API calls for CUS data.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Filled guard stub with Bearer TODO and backend reminder in `notes/lab36-todos.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab36-todos.md` |
| Trusting only frontend redirects | Enforce authz on every API call |
| Putting real JWTs in markdown notes committed to git | Use fake lab tokens only |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab36-todos.md`
- [ ] Blanks filled
- [ ] Token logging avoided
- [ ] Backend enforcement note

