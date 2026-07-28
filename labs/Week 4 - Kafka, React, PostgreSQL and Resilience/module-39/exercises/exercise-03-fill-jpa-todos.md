# Exercise 2 — Fill JPA TODOs

**Module 39** · Hands-on exercise · [setup](EXERCISES-INDEX.md)

## Goal

Fill TODOs in JPA entity and repository pseudocode.

## Steps

### Step 1 — Paste

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

### Step 2 — Fill

Suggested: `customerId`, `fullName`, `version`, `Pageable`, `jdbc:postgresql://localhost:5432/northstar`, `validate` (or `none`), `true`.

### Step 3 — Usage TODO

`// TODO: service.load("CUS-1001") → Optional<CustomerEntity> for Amina`

### Step 4 — Locking note

Write: concurrent updates to Ravi's status bump `@Version` or fail with optimistic lock exception.

## Expected result

Filled JPA/Flyway pseudocode with optimistic lock note.

## If it fails

| Problem | Fix |
| --- | --- |
| Problem | Fix |
| ddl-auto=create in shared DB | Prefer Flyway + validate/none |
| Exposing Entity as REST body forever | Prefer DTOs at the API boundary |

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Entity blanks filled | Pass / Fail |
| 2 | Datasource/Flyway blanks filled | Pass / Fail |
| 3 | Version semantics noted | Pass / Fail |
