# Exercise 2 — Fill JPA TODOs

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **B** (after slides 217–220) |
| **Deliverable** | `notes/lab39-todos.md` |
| **Fixtures** | CUS-1001 / CUS-1002 · Lab 37/38 column names |

### What you will learn

List datasource, Flyway, entity, repo, service, 409 mapping TODOs.

### Enterprise context

Env-based secrets; OSIV off; transactional service layer.

### Predict

Where do duplicate email conflicts become HTTP 409?

### Debug

Secrets in committed application.yml — fix?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| H2 pretending to be Postgres in IT | Use Postgres/Testcontainers |
| Open Session in View on | Keep OSIV false in lab |

**Module 39** · Hands-on exercise · [setup + file names](EXERCISES-INDEX.md)

## Deliverable

**Submit only** the file(s) below (not the graded lab).

| Item | Path (under `examples/module-39-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab39-todos.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 39 — Fill JPA TODOs

## Step 1 — Paste

Create `notes/lab39-todos.md`:
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-39-exercises/`, create `notes/` if needed, then create `notes/lab39-todos.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 39 — Fill JPA TODOs

## Step 1 — Paste

Create `notes/lab39-todos.md`:

```java
@Entity
@Table(name = "customer")
class CustomerEntity {
  @Id
  private String _____;
  @Column(name = "full_name", nullable = false)
  private String _____;
  @Column(nullable = false)
  private String status;
  @Version
  private long _____; // optimistic lock
}

interface CustomerRepository extends JpaRepository<CustomerEntity, String> {
  Page<CustomerEntity> findByStatus(String status, _____ pageable);
}

// application.yml ideas
spring.datasource.url: _____
spring.jpa.hibernate.ddl-auto: _____
spring.flyway.enabled: _____
```

## Step 2 — Fill

Suggested: `customerId`, `fullName`, `version`, `Pageable`, `jdbc:postgresql://localhost:5432/northstar`, `validate` (or `none`), `true`.

## Step 3 — Usage TODO

`// TODO: service.load("CUS-1001") → Optional<CustomerEntity> for Amina`

## Step 4 — Locking note

Write: concurrent updates to Ravi's status bump `@Version` or fail with optimistic lock exception.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Filled JPA/Flyway pseudocode with optimistic lock note in `notes/lab39-todos.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab39-todos.md` |
| ddl-auto=create in shared DB | Prefer Flyway + validate/none |
| Exposing Entity as REST body forever | Prefer DTOs at the API boundary |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab39-todos.md`
- [ ] Entity blanks filled
- [ ] Datasource/Flyway blanks filled
- [ ] Version semantics noted

