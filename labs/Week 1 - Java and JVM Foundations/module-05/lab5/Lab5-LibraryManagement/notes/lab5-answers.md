### Reflection Questions

**1. When choose `List` over `Set`?**\
You would choose a `List` when order and index access matter, or when duplicates are allowed. In this case, `books` would satisfy both conditions, as a book catalog would likely need to be ordered and titles aren't guaranteed to be unique. A `Set` is good for enforcing uniqueness and when order doesn't matter.\
**2. Why `HashSet` before inserting a book ID?**\
Checking to see if a `HashSet` contains a certain `bookId` before inserting checks for duplicates in O(1) time. If this wasn't done, scanning the whole `books` list for a matching ID would take O(n) on average. Thus, it is an efficient and clean way to check for duplicates.\
**3. Why a `Map` for "currently borrowed" vs only a boolean?**\
Only a boolean for `available` would quickly tell you if a book is being borrowed, but not **who** borrowed it. Having a `Map` like `borrowRecords` can answer both with a single O(1) lookup.\
**4. `HashMap` vs `TreeMap` in this lab?**\
`borrowRecords` uses a `HashMap` because nothing needs current borrows in any particular order in this program, only a fast lookup for `bookId` is required. On the other hand, `categoryBookCount` uses a `TreeMap` because reports print category counts in a sorted order.\
**5. `Comparable` vs `Comparator` for books?**\
`Comparable<Book>` allows for ordering by title that belongs to the class itself. `BookComparator` is a separate ordering strategy that orders by price when passed into `sort()`. These are interchangeable, allowing the class to have unlimited comparators.\
**6. Which iteration style would you use most in production - and why?**\
Enhanced for is what I would choose, since it is readable and the least error-prone when simply reading elements. The `Iterator` is good when you need to remove elements efficiently **while** looping. The indexed for loop is useful when you need to display or use the index.\
**7. CRM: which collection for customer list / unique emails / id → customer lookup?**\
For customer list, I would use an `ArrayList` for ordered and iterable storage. For unique emails, a `HashSet` would be good ot allow for easy duplicate rejection. For the ID --> customer lookup, I would use a `HashMap` for key-value retrieval, similar to the implementation of `borrowRecords`.\