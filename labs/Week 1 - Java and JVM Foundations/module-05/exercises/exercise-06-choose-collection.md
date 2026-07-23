# Exercise 6 — Choose the Right Collection

**Module 5** · Pre-lab practice · finish all 7 Pass, then OS how-to → [`../lab5/LAB-5-GUIDE.md`](../lab5/LAB-5-GUIDE.md)  
**Folder:** `examples/module-05-exercises/` ([setup](EXERCISES-INDEX.md))

> **Analysis exercise:** No Java code is required. Choose from requirements instead of defaulting to `ArrayList` for everything.

## Goal

Create `collection-choices.md`. For each scenario, choose an interface and implementation, then explain order, duplicates, lookup pattern, and mutation needs.

## Decision questions

Ask in order:

1. Is this a key → value relationship? Choose `Map`.
2. Otherwise, must values be unique? Choose `Set`.
3. Otherwise, do order/index/duplicates matter? Choose `List`.
4. Must iteration be sorted? Consider `TreeSet` or `TreeMap`.
5. Must insertion order be preserved? Consider `LinkedHashSet` or `LinkedHashMap`.

## Steps

### Step 1 — Copy the scenario table

Create `collection-choices.md` and paste this worksheet. Fill **Interface** first (from the decision questions), then **Implementation**, then a short **Why** that names the property that drove the choice (order, uniqueness, key lookup, or sorted iteration).

```markdown
# Collection choices

| # | Scenario | Need (order / unique / key→value / sorted) | Interface | Implementation | Why |
| - | -------- | ------------------------------------------ | --------- | -------------- | --- |
| 1 | Ordered catalog; duplicate titles allowed | | `_____` | `_____` | |
| 2 | Unique registered book IDs | | `_____` | `_____` | |
| 3 | Book ID → current borrower ID | | `_____` | `_____` | |
| 4 | Alphabetically sorted categories | | `_____` | `_____` | |
| 5 | Category → count, sorted by category | | `_____` | `_____` | |
| 6 | Checkout history in event order | | `_____` | `_____` | |
```

**How to fill one row (example shape — do not copy the answer yet):**

```text
#3  Book ID → borrower
    Need: key → value
    Interface: Map<String, String>
    Implementation: HashMap<>
    Why: lookup borrower by book ID
```

### Step 2 — Complete it before reading the reference

**Why:** The valuable skill is translating requirements, not memorizing one implementation.

### Step 3 — Check against the reference

| # | Scenario | Interface | Implementation | Why |
| - | -------- | --------- | -------------- | --- |
| 1 | Ordered catalog; duplicate titles allowed | `List<Book>` | `ArrayList<>` | Indexed sequence; duplicates OK |
| 2 | Unique registered book IDs | `Set<String>` | `HashSet<>` | No duplicates; fast membership |
| 3 | Book ID → current borrower ID | `Map<String, String>` | `HashMap<>` | Direct key → value lookup |
| 4 | Alphabetically sorted categories | `Set<String>` | `TreeSet<>` | Unique values; natural sort order |
| 5 | Category → count, sorted by category | `Map<String, Integer>` | `TreeMap<>` | Key → value with sorted keys |
| 6 | Checkout history in event order | `List<BorrowRecord>` | `ArrayList<>` | Append + iterate in insertion order |

### Step 4 — Handle ambiguous requirements

Add answers:

1. If unique IDs must also preserve registration order, what changes?  
   **Reference:** `LinkedHashSet`.
2. If borrower lookup must preserve insertion order for display, what changes?  
   **Reference:** `LinkedHashMap`.
3. If many insertions/removals occur in the middle, is `LinkedList` automatically best?  
   **Reference:** No. Access pattern and traversal cost matter; measure rather than assume.

## Expected result

Six choices match the domain requirement, and every explanation mentions the relevant property rather than saying only “it is faster.”

## Common mistakes

| Mistake | Better reasoning |
| ------- | ---------------- |
| `Set` for a catalog because books should be unique | Uniqueness depends on correctly defined equality/ID rules |
| `List` for ID lookup | A map expresses direct key lookup |
| `HashMap` when sorted report is required | Use `TreeMap` or sort a view |
| Claim all operations are `O(1)` | Complexity depends on operation and implementation |

## Pass criteria

| # | Confirm | Your notes |
| - | ------- | ---------- |
| 1 | All six scenarios have interface + implementation | Pass / Fail |
| 2 | Choices account for order, uniqueness, or key lookup | Pass / Fail |
| 3 | You can explain when linked or sorted variants matter | Pass / Fail |
