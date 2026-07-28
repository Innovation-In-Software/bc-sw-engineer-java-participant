# Exercise 1 — Fill Fetch TODOs

**Module 35** · Hands-on exercise · [setup](EXERCISES-INDEX.md)

## Goal

Fill TODOs in a TypeScript fetch helper for customers.

## Steps

### Step 1 — Paste

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

### Step 2 — Fill

Use `"/api/customers"` or full `http://localhost:8080/api/customers`, `lab-request-001`, `Customer[]`, and same base for getCustomer.

### Step 3 — UI TODO

Add: `// TODO: on success setCustomers including Amina + Ravi fixtures from API`.

### Step 4 — Error TODO

Add: `// TODO: map 400 body.detail to form error string`.

## Expected result

Filled fetch helper with correlation and error TODOs.

## If it fails

| Problem | Fix |
| --- | --- |
| Problem | Fix |
| Ignoring res.ok | Always check ok before json() |
| Forgetting AbortSignal | Pass signal from useEffect cleanup |

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | URL and correlation filled | Pass / Fail |
| 2 | Return type filled | Pass / Fail |
| 3 | Two UI/error TODOs present | Pass / Fail |
