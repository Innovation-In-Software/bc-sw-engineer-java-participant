### Exercise-02:

An object is not collectible merely because one reference becomes null.
It becomes GC-eligible only when no live strong-reference path can reach it.
Eligibility does not guarantee immediate collection, and System.gc() is only
a request.

### Exercise-03:
[info][gc] Using G1
[info][gc] GC(0) Pause Young (Normal) (G1 Evacuation Pause) ...
Completed round 5
...
Completed round 20
Allocated bytes over time: 262144000

The program allocated about 250 MB over time despite a 64 MB maximum heap.
GC log entries appeared between rounds. A before/after value that decreased
shows that memory was reclaimed. Exact pause times varied on my machine.

### Exercise-04:

Command:
java -XX:+UseG1GC -Xms16m -Xmx64m -Xlog:gc GcObserve

Evidence:
The log began with "Using G1" and showed G1 evacuation pauses.
The collector flag selects G1; it does not guarantee a particular pause time.

### Exercise-05:
Command:
java -XX:+UseZGC -Xms16m -Xmx64m -Xlog:gc GcObserve

[0.024s][info][gc] Using The Z Garbage Collector
[0.143s][info][gc] Allocation Stall (main) 14.007ms
[0.145s][info][gc] GC(0) Garbage Collection (Allocation Stall) 64M(100%)->16M(25%)
Completed round 5
[0.167s][info][gc] Allocation Stall (main) 6.269ms
[0.169s]Completed round 10
[info][gc] GC(1) Garbage Collection (Allocation Stall) 64M(100%)->30M(47%)
[0.178s][info][gc] Allocation Stall (main) 5.662ms
[0.179s][info][gc] GC(2) Garbage Collection (Allocation Stall) 64M(100%)->30M(47%)
Completed round 15
[0.189s][info][gc] Allocation Stall (main) 7.407ms
[0.192s][info][gc] Completed round 20
GC(3) Garbage Collection (Allocation Stall) 64M(100%)->52M(81%)
Allocated bytes over time: 262144000

Evidence:
The log began with "Using The Z Garbage Collector" instead of "Using G1".
Pause-related log lines look different — ZGC does most of its work concurrently,
so it does not report the same kind of stop-the-world "Evacuation Pause" G1 does.

### Exercise-06:

loaded RetentionDemo class
→ static CACHE field
→ ArrayList entries
→ byte[] objects

Root cause: a long-lived static collection retained strong references after
the data was no longer needed. GC could not reclaim reachable entries.

Fix: clear/remove entries, bound the cache, apply eviction, or use a more
appropriate lifecycle. Weak references are not a universal cache fix.

### Exercise-07:

| Run | String ms | StringBuilder ms |
| --- |-----------|------------------|
| 1 | 300.813   | 1.77             |
| 2 | 266.292   | 1.909            |
| 3 | 229.189   | 1.795            |

Use StringBuilder when constructing text repeatedly in a loop. Ordinary + remains readable and appropriate for a small, fixed expression.