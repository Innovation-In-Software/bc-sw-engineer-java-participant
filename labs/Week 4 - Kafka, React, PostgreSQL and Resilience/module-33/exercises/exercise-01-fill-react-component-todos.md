# Exercise 2 — Fill Component TODOs

**Module 33** · Hands-on exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab33-todos.md` — fill TODOs in a CustomerCard pseudocode component.

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-33-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-01-fill-react-component-todos.md` (this file in the course repo) |
| Your notes file | `notes/lab33-todos.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 33 — Fill Component TODOs

## Step 1 — Paste

Create `notes/lab33-todos.md`:
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-33-exercises/`, create `notes/` if needed, then create `notes/lab33-todos.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 33 — Fill Component TODOs

## Step 1 — Paste

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

## Step 2 — Fill

Fill with: `'ACTIVE' | 'SUSPENDED'`, `` `${name} (${customerId})` ``, `name`, `customerId`.

## Step 3 — Sample usage

Add usage TODO filled: `<CustomerCard customerId="CUS-1001" name="Amina Khan" status="ACTIVE" onSelect={...} />`.

## Step 4 — A11y note

Write: button has visible text; avoid icon-only without aria-label.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Filled TSX stub with Amina usage and a11y note in `notes/lab33-todos.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab33-todos.md` |
| Using array index as key | Use stable customerId |
| Div soup with click handlers and no button | Prefer semantic button for actions |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab33-todos.md`
- [ ] All blanks filled
- [ ] Amina usage present
- [ ] A11y note written

