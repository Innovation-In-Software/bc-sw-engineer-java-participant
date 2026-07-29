# Exercise 1 — Fill Fetch TODOs

**Module 35** · Hands-on exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab35-todos.md` — fill TODOs in a TypeScript fetch helper for customers.

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-35-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-05-fill-fetch-todos.md` (this file in the course repo) |
| Your notes file | `notes/lab35-todos.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 35 — Fill Fetch TODOs

## Step 1 — Paste

Create `notes/lab35-todos.md`:
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-35-exercises/`, create `notes/` if needed, then create `notes/lab35-todos.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 35 — Fill Fetch TODOs

## Step 1 — Paste

Create `notes/lab35-todos.md`:

```ts
export type Customer = { customerId: string; name: string; status: string };

export async function listCustomers(signal?: AbortSignal): Promise<Customer[]> {
  const res = await fetch(_____, {
    headers: { "X-Correlation-Id": "_____" },
    signal,
  });
  if (!res.ok) throw new Error(`HTTP ${res.status}`);
  return (await res.json()) as _____;
}

export async function getCustomer(id: string): Promise<Customer> {
  const res = await fetch(`${_____}/${id}`);
  // TODO: handle 404 for unknown id
  return (await res.json()) as Customer;
}
```

## Step 2 — Fill

Use `"/api/customers"` or full `http://localhost:8080/api/customers`, `lab-request-001`, `Customer[]`, and same base for getCustomer.

## Step 3 — UI TODO

Add: `// TODO: on success setCustomers including Amina + Ravi fixtures from API`.

## Step 4 — Error TODO

Add: `// TODO: map 400 body.detail to form error string`.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Filled fetch helper with correlation and error TODOs in `notes/lab35-todos.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab35-todos.md` |
| Ignoring res.ok | Always check ok before json() |
| Forgetting AbortSignal | Pass signal from useEffect cleanup |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab35-todos.md`
- [ ] URL and correlation filled
- [ ] Return type filled
- [ ] Two UI/error TODOs present

