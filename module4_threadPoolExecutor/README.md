## TheadPool
- It's a collection of threads (aka workers), which are available to perform the submitted tasks.
- Once task completed, worker get back to Thread Pool and wait for new task to assigned.
- Means theads can be reused.

## Advantages of Thread Pool
- Thread creation time can be saved
- Overhead of managing the Thread lifecycle can be removed
- Increased the performance


### Interview Question - why you have taken corePollSize as 2, why not 10 or 15 or another number, what's the logic?

### Answer -> It depends on various conditions - CPU cores,  JVM memory, task nature (cpu intensive (requires less thread) or I/O intensive (requires nore thread)), Concurrency requirements, memory required to process the request, throughput etc.