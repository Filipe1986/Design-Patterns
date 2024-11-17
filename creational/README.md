# Singleton

### Lazy initialization
- The **_synchronized_** keyword ensures that only one thread can execute a given method at a time.

- The **_volatile_** keyword guarantees that a variable's latest value is always read directly from main memory,
  rather than relying on a cached value that might be in a thread's local CPU cache.

- **_Double check locking_**
    - First check without locking for better performance.
    - The second check is to ensure that only one instance is created.
    - The synchronized block is used only when the instance is null.
    

### Eager initialization
- If the singleton instance is resource-intensive to create, and it is not always needed, then eager initialization can be inefficient.
- Since the instance is created when the class is loaded, it can increase the application startup time, especially if the singleton is complex.
- No need to worry about thread safety, as the instance is created when the class is loaded, and no other thread can access it until the class is loaded.

### Bill Pugh Singleton Implementation
- The **_inner static class_** is not loaded until the getInstance() method is called.
- The **_inner static class_** is loaded only once, and the singleton instance is created only when the getInstance() method is called.
- This implementation is thread-safe and efficient.


