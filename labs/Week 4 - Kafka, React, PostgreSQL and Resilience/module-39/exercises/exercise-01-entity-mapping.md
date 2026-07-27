# Exercise 1 — Entity Mapping

**Module 39** · Analysis exercise · [setup](EXERCISES-INDEX.md)

## Goal

Connect Lab 37 columns to JPA entity fields for Customer.

## Reference

| Column | Java field / annotation idea |
| --- | --- |
| customer_id | @Id String customerId |
| full_name | String fullName + @Column |
| status | String or enum status |
| created_at | Instant createdAt |

## Steps

### Step 1 — Copy map

Copy table into `notes/lab39-jpa.md`.

### Step 2 — Account

Add account mapping: Long id, String customerId, @ManyToOne optional note.

### Step 3 — Naming

Decide snake_case columns vs camelCase fields strategy.

### Step 4 — Fixture

Entity instance mental model: customerId=`CUS-1001`, fullName=`Amina Khan`.

## Expected result

Customer/account mapping notes with Amina fixture.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Customer map present | Pass / Fail |
| 2 | Account fields listed | Pass / Fail |
| 3 | Naming strategy chosen | Pass / Fail |
