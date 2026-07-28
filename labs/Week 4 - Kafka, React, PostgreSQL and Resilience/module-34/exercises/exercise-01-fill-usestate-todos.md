# Exercise 5 — Fill useState TODOs

**Module 34** · Hands-on exercise · [setup](EXERCISES-INDEX.md)

## Goal

Fill TODOs in a tiny useState form snippet.

## Steps

### Step 1 — Paste

Create `notes/lab34-todos.md`:

```tsx
const [name, setName] = useState(_____);
const [status, setStatus] = useState<_____>(_____);
const [error, setError] = useState<string | null>(null);

function onSubmit(e: FormEvent) {
  e.preventDefault();
  if (!name.trim()) { setError(_____); return; }
  // TODO Lab 35: POST to API
  console.log({ name, status, correlation: "lab-request-001" });
}

<input value={name} onChange={(e) => _____(e.target.value)} />
```

### Step 2 — Fill

Suggested: `""`, `'ACTIVE' | 'SUSPENDED'`, `"ACTIVE"`, `"Name is required"`, `setName`.

### Step 3 — Amina seed

Optional alternate: initialize name to `"Amina Khan"` for an edit form TODO comment.

### Step 4 — Lift state note

Add TODO: selectedCustomerId lives in parent list container.

## Expected result

Filled useState/onChange snippet with validation and Lab 35 deferral.

## If it fails

| Problem | Fix |
| --- | --- |
| Problem | Fix |
| Forgetting preventDefault | Always preventDefault on form submit |
| Mutating state objects in place | Use setState with new values/objects |

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Blanks filled | Pass / Fail |
| 2 | preventDefault path clear | Pass / Fail |
| 3 | Lift-state TODO present | Pass / Fail |
