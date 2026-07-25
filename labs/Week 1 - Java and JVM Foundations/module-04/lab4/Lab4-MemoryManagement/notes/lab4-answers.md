### PerformanceTest Results Table

| Objects | Used Memory (approx) | Execution Time |
| ------- |----------------------|----------------|
| 10 | 0 MB                 | 3 ms           |
| 100 | 1 MB                 | 0 ms           |
| 1,000 | 1 MB                 | 0 ms           |
| 100,000 | 3 MB                 | 5 ms           |
| 1,000,000 | 20 MB                | 13 ms          |

### Reflection Questions
1. **Stack vs Heap?**\
The stack holds per-thread method call frames, storing primitive values and object references. The heap is a single shared memory area that holds the actual objects those references point to.\
2. **Why locals on the Stack?**\
Local variables only need to exist for the duration of the method call that declared them. Since frames are popped from the stack when they return, it makes local variable cleanup easy.\
3. **Why objects on the Heap?**\
Objects often need to outlive the methods that create them or be shared across frames and threads. The heap is shared and allows objects to remain for longer as long as there stays a valid reference to it.\
4. **When is an object GC-eligible?**\
An object becomes eligible for garbage collection when there is no reference path to that object, making it so that it cannot be reached anymore.\
5. **Does System.gc() guarantee collection?**\
No, it is only a request suggesting the JVM to run garbage collection soon. The JVM is free to follow the request or not based on its own rule-of-thumb.\ 
6. **What caused the leak?**\
Since `LEAKING_CACHE` is `static`, it becomes a permanent GC root for the life of the program. Every `EmployeeRecord` added to it remains reachable and thus never eligible for garbage collection.\
7. **How did clearing the list fix it?**\
Clearing the list removed the list's references to each `EmployeeRecord` object, severing the path from the list to those objects. Then, setting the list reference itself to `null` then removed the last path to the list. With no reachable path left, the records became GC-eligible.\
8. **Why are WeakReferences useful?**\
WeakReferences lets you hold onto an object without that reference alone keeping the object alive. Once no strong references are left of an object, the garbage collector can collect the object, even if there still exists a weak reference still pointing to it. This helps to avoid a cache growing silently because it's holding strong references.\
9. **What happens when the heap is exhausted?**\
When there is not enough space in the heap to allocate, the JVM will throw a `OutOfMemoryError`. This usually crashes the running program unless the error is caught and handled.\
10. **Which laptop tool would you try first for rising heap—and why?**\
I would use `jstat -gc` first because there is no extra setup beyond having a running JVM. It also quickly shows generation sizes and garbage collection counts over samples, which should be enough to confirm whether memory is climbing or just fluctuating but operating normally.\
11. **How could a CRM unbounded cache repeat this leak?**\
Every customer (or other object) would stay reachable forever, repeating almost exactly what happened in the `LEAKING_CACHE`. Memory usage would continue to rise and an `OutOfMemoryError` will be thrown eventually. A similar solution to the `fix` mode would be necessary.\