# Exercise 1 — Fill Fetch TODOs

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **B** (after slides 126–130) |
| **Deliverable** | `notes/lab35-todos.md` |
| **Fixtures** | CUS-1001 / CUS-1002 · `X-Correlation-Id: lab-request-001` |

### What you will learn

List ApiError, http helper, customersApi, env base URL TODOs.

### Enterprise context

One HTTP boundary so Lab 36 can inject Authorization later.

### Predict

Where does VITE_CRM_API_URL get read?

### Debug

Env change with no Vite restart — what happens?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Axios vs fetch | Lab uses fetch helper; Axios concepts still apply |
| Missing 204 handling | No JSON parse on empty body |

**Module 35** · Hands-on exercise · [setup + file names](EXERCISES-INDEX.md)

## Deliverable

**Submit only** the file(s) below (not the graded lab).

| Item | Path (under `examples/module-35-exercises/`) |
| ---- | --------------------------------------------- |
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

