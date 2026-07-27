### Manual Verification:

Using an employee sample designed to replicate the solution seed, all manual verification steps passed.\

### Reflection Questions:

**1. What are the advantages of Streams over loops?**\
Streams show clearly the intended result of operations on a collection, rather than showing the step-by-step process on how to achieve this result when using loops. This allows for easier readability of code and makes it harder to miss small bugs, removing the need for counters or temp variables entirely. Streams are also composable and can chain easily, showing operations in the order they execute conceptually (`filter().map().sorted())`).\
**2. When should Streams be preferred?**\
You should use streams when you're simply transforming or querying a collection. You should not use a stream when doing something that has side effects in a broader domain, such as mutating something external. A simple mutation of a single collection is often clearer and more concise when using a stream.\
**3. What is the difference between `filter()` and `map()`?**\
`filter()` keeps element type the same and only removes elements that fail to pass its predicate. Thus, the output is just a subset of the input, with the input type preserved. On the other hand, `map()` keeps all elements from the input but transforms each based on its passed function. Thus, the output can be a different type with the same number of elements. For example, `Stream<Employee>` to `Stream<String>` in this lab.\
**4. Why is `reduce()` useful?**\
It generalizes the process of combining everything into one value behind a consistent API instead of building a different method for each case. This is used for sum, min, max, etc. In this lab, we used it for `Double::max`/`Double::min` on the salaries, but the same logic works for similar combining operations.\
**5. What does `Collectors.groupingBy()` do?**\
It partitions a stream into a `Map` keyed by a passed function. It then buckets each element into a `List` under that key. In this lab, `Employee::getDepartment` turns the 25 employees into 5 partitions split by department. It can also perform operations on each bucket instead of simply listing elements.\
**6. What is the benefit of using `Optional`?**\
It forces the caller to explicitly handle an empty case (`ifPresent` / `orElse`) instead of risking running into a `NullPointerException` later. In this lab, `findHighestPaidEmployee()` returns `Optional<Employee>`, handling the empty case in a way the `Employee` return itself wouldn't.\
**7. Why are Lambda Expressions more readable?**\
They remove the need for boilerplate code of an anonymous class, leaving just the parameter and logic. This allows easier readability, showing the logic rule clearly without the intermediate steps. In this lab, we have the `Predicate<Employee>` with logic `employee -> employee.getSalary() > 100_000`.\
**8. When should method references be used?**\
You should use them when a lambda expression does nothing but call a single mthod. For example, `employee -> employee.getName()` is harder to read than just `Employee::getName`. If a lambda needs extra logic, operations, or method calls, a regular lambda is often clearer.\
**9. Which stream operation is terminal? Give three examples from your lab.**\
A terminal operation triggers execution and produces a non-stream result. Three examples from this lab can be found in `EmployeeService`: `forEach` in `displayAllEmployees`, `count()` in `displayCounts`, and `collect()` in `demonstrateCollectors`/`getDepartmentStatistics`.\
**10. How do Streams improve enterprise Java applications?**\
They turn multistep transformations on data into short pipelines that are easier to read, edit, and test than loops with counters and temp variables. Not only that, but since they are composable and chain clearly, code becomes closer to actual business questions / solutions.\
**11. (Forward look) How would a future CRM use `filter` / `map` / `groupingBy` on customers the same way this lab uses them on employees—without claiming the CRM is implemented today?**\
A CRM could run the same `filter -> map -> collect` pipeline over `Customer` objects instead of `Employee` objects. For example, to show active customers by membership level, you could use `customers.stream().filter(Customer::isActive).collect(groupingBy(Customer::getMembership))`. As seen, the pattern is the same, it is just the question being asked that is different.\