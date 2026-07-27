### Exercise-05-map-raise:

`map` produced a new list of proposed values; it did not modify the immutable `Employee` records in the source list.

### Exercise-06-group-count:

**1. Why is the value type Long, not Integer?**\
`Collectors.counting()` returns a Long, not an Integer. Likely to account for large count values in bigger collections.\
**2. What would the values contain if you removed Collectors.counting()?**\
**3. Why is a TreeMap used only for presentation here?**\

### Exercise-07-hr-names:

**Why should department filtering happen before mapping to names?**\
Because `Employee` contains the department information in its fields. If we mapped to a `String` before we filter, we no longer will have access to department.\

### Exercise-08-parallel-bonus:

| Run | Sequential ns | Parallel ns | Faster     |
|-----|---------------|-------------|------------| 
| 1   | 1193100       | 2754100     | Sequential |
| 2   | 1184500       | 2464600     | Sequential |
| 3   | 966000        | 5805400     | Sequential |
| 4   | 1160600       | 3260300     | Sequential |
| 5   | 864300        | 3459000     | Sequential |

Parallel is slower on all runs. This is expected for tiny datasets; splitting and scheduling add overhead. This exercise demonstrates correctness, not a performance win.\

**Identify unsafe alternative:** Shared mutable counters lose updates under concurrent workers. Multiple worker threads can update the same mutable value concurrently and lose updates. Use the built-in `count()` reduction.\