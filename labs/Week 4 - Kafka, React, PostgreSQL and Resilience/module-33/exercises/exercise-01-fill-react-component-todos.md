# Exercise 2 — Fill Component TODOs

**Module 33** · Hands-on exercise · [setup](EXERCISES-INDEX.md)

## Goal

Fill TODOs in a CustomerCard pseudocode component.

## Steps

### Step 1 — Paste

Create `notes/lab33-todos.md`:

```tsx
type CustomerCardProps = {
  customerId: string;
  name: string;
  status: _____;
  onSelect: (id: string) => void;
};

export function CustomerCard({ customerId, name, status, onSelect }: CustomerCardProps) {
  return (
    <article aria-label={_____}>
      <h3>{_____}</h3>
      <StatusBadge status={status} />
      <button type="button" onClick={() => onSelect(_____)}>View</button>
    </article>
  );
}
```

### Step 2 — Fill

Fill with: `'ACTIVE' | 'SUSPENDED'`, `` `${name} (${customerId})` ``, `name`, `customerId`.

### Step 3 — Sample usage

Add usage TODO filled: `<CustomerCard customerId="CUS-1001" name="Amina Khan" status="ACTIVE" onSelect={...} />`.

### Step 4 — A11y note

Write: button has visible text; avoid icon-only without aria-label.

## Expected result

Filled TSX stub with Amina usage and a11y note.

## If it fails

| Problem | Fix |
| --- | --- |
| Problem | Fix |
| Using array index as key | Use stable customerId |
| Div soup with click handlers and no button | Prefer semantic button for actions |

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | All blanks filled | Pass / Fail |
| 2 | Amina usage present | Pass / Fail |
| 3 | A11y note written | Pass / Fail |
