# Exercise — List All Names

**Module 6** · Pre-lab practice · then open [`../../lab6/README.md`](../lab6/README.md)

## Goal

From a `List<Employee>`, print all names with stream `map` + `forEach` or `collect`.

## Starter / reference

```java
record Employee(int id, String name, String department, double salary) {}
// Seed: Alice/HR/72000, Bob/IT/65000, Charlie/HR/80000, Diana/Finance/90000, Evan/IT/55000
```

## Do this

- `employees.stream().map(Employee::name).forEach(System.out::println)`

## Expected result

All five names print.

## Done when

- [ ] Code compiles and runs (or notes complete if analysis-only)
- [ ] You can explain the result in one sentence
