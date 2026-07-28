# Exercise 4 — Fill Route Guard TODOs

**Module 36** · Hands-on exercise · [setup](EXERCISES-INDEX.md)

## Goal

Fill TODOs for a RequireAuth wrapper protecting CRM routes.

## Steps

### Step 1 — Paste

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

### Step 2 — Fill

Suggested: `getAccessToken()`, `"/login"`, `<>{children}</>`, `lab-token-001` (fake).

### Step 3 — Role note

Optional TODO: `// TODO: hide AdminMenu unless role===ADMIN` (UI only).

### Step 4 — Backend reminder

Write: Spring Security still must reject unauthorized API calls for CUS data.

## Expected result

Filled guard stub with Bearer TODO and backend reminder.

## If it fails

| Problem | Fix |
| --- | --- |
| Problem | Fix |
| Trusting only frontend redirects | Enforce authz on every API call |
| Putting real JWTs in markdown notes committed to git | Use fake lab tokens only |

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Blanks filled | Pass / Fail |
| 2 | Token logging avoided | Pass / Fail |
| 3 | Backend enforcement note | Pass / Fail |
