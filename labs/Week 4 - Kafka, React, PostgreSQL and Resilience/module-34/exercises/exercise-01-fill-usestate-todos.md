# Exercise 5 — Fill useState TODOs

**Module 34** · Hands-on exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab34-todos.md` — fill TODOs in a tiny useState form snippet.

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-34-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-01-fill-usestate-todos.md` (this file in the course repo) |
| Your notes file | `notes/lab34-todos.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 34 — Fill useState TODOs

## Step 1 — Paste

Create `notes/lab34-todos.md`:
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-34-exercises/`, create `notes/` if needed, then create `notes/lab34-todos.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 34 — Fill useState TODOs

## Step 1 — Paste

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

## Step 2 — Fill

Suggested: `""`, `'ACTIVE' | 'SUSPENDED'`, `"ACTIVE"`, `"Name is required"`, `setName`.

## Step 3 — Amina seed

Optional alternate: initialize name to `"Amina Khan"` for an edit form TODO comment.

## Step 4 — Lift state note

Add TODO: selectedCustomerId lives in parent list container.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Filled useState/onChange snippet with validation and Lab 35 deferral in `notes/lab34-todos.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab34-todos.md` |
| Forgetting preventDefault | Always preventDefault on form submit |
| Mutating state objects in place | Use setState with new values/objects |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab34-todos.md`
- [ ] Blanks filled
- [ ] preventDefault path clear
- [ ] Lift-state TODO present

