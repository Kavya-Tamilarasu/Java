# **705. Design HashSet**

## **Problem Statement**

Design a **HashSet** without using any built-in hash table libraries.

Implement the `MyHashSet` class with the following operations:

* **`add(key)`** – Inserts the value `key` into the HashSet.
* **`remove(key)`** – Removes the value `key` from the HashSet if it exists.
* **`contains(key)`** – Returns `true` if the HashSet contains `key`; otherwise, returns `false`.

---

## **Example**

### **Input**

```text
["MyHashSet","add","add","contains","contains","add","contains","remove","contains"]
[[],[1],[2],[1],[3],[2],[2],[2],[2]]
```

### **Output**

```text
[null,null,null,true,false,null,true,null,false]
```

### **Explanation**

```java
MyHashSet myHashSet = new MyHashSet();

myHashSet.add(1);        // Set = [1]
myHashSet.add(2);        // Set = [1, 2]
myHashSet.contains(1);   // Returns true
myHashSet.contains(3);   // Returns false
myHashSet.add(2);        // Already exists, no change
myHashSet.contains(2);   // Returns true
myHashSet.remove(2);     // Removes 2
myHashSet.contains(2);   // Returns false
```

---

# **Approach**

This implementation uses a **boolean array** to simulate a HashSet.

* The index of the array represents the **key**.
* The value stored at each index indicates whether the key exists in the set.
* Initially, all positions are set to `false`.
* When a key is added, its corresponding index is marked as `true`.
* When a key is removed, the value is changed back to `false`.
* The `contains()` method simply checks the value stored at the given index.

Since the constraints guarantee that:

```text
0 <= key <= 10^6
```

a boolean array of size **1,000,001** is sufficient.

---

# **Algorithm**

1. Create a boolean array of size `1000001`.
2. For **add(key)**:

   * Set `hashSet[key] = true`.
3. For **remove(key)**:

   * Set `hashSet[key] = false`.
4. For **contains(key)**:

   * Return `hashSet[key]`.

---

```

---

# **Complexity Analysis**

| **Operation**          | **Time Complexity** | **Space Complexity** |
| ---------------------- | ------------------- | -------------------- |
| **add()**              | **O(1)**            | **O(1)**             |
| **remove()**           | **O(1)**            | **O(1)**             |
| **contains()**         | **O(1)**            | **O(1)**             |
| **Overall Space Used** | —                   | **O(10⁶)**           |

---

# **Key Highlights**

* **Does not use any built-in HashSet or HashMap.**
* **Provides constant-time operations for add, remove, and contains.**
* **Simple and efficient implementation using a boolean array.**
* **Ideal for the given constraints where keys range from `0` to `10⁶`.**
* **Easy to understand and suitable for coding interviews and learning data structures.**
