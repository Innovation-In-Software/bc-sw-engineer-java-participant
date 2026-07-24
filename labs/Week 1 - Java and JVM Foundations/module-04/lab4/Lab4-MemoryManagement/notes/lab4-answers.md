### PerformanceTest Results Table

| Objects | Used Memory (approx) | Execution Time |
| ------- |----------------------|----------------|
| 10 | 0 MB                 | 3 ms           |
| 100 | 1 MB                 | 0 ms           |
| 1,000 | 1 MB                 | 0 ms           |
| 100,000 | 3 MB                 | 5 ms           |
| 1,000,000 | 20 MB                | 13 ms          |

### Reflection Questions
1. Stack vs Heap?
2. Why locals on the Stack?
3. Why objects on the Heap?
4. When is an object GC-eligible?
5. Does System.gc() guarantee collection?
6. What caused the leak?
7. How did clearing the list fix it?
8. Why are WeakReferences useful?
9. What happens when the heap is exhausted?
10. Which laptop tool would you try first for rising heap—and why?
11. How could a CRM unbounded cache repeat this leak?