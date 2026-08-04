# **697. Degree of an Array**

## **Problem Statement**

Given a non-empty array of non-negative integers `nums`, the **degree** of an array is defined as the **maximum frequency of any one of its elements**.

Your task is to determine the **smallest possible length of a contiguous subarray** that has the **same degree** as the original array.

---

## **Examples**

### **Example 1**

**Input**

```text
nums = [1,2,2,3,1]
```

**Output**

```text
2
```

**Explanation**

* Frequency of `1` = **2**
* Frequency of `2` = **2**
* Degree of the array = **2**
* The shortest subarray with degree **2** is **[2,2]**, whose length is **2**.

---

### **Example 2**

**Input**

```text
nums = [1,2,2,3,1,4,2]
```

**Output**

```text
6
```

**Explanation**

* Frequency of `2` = **3**
* Degree of the array = **3**
* The shortest subarray with degree **3** is **[2,2,3,1,4,2]**, whose length is **6**.

---

# **Approach**

Since the solution **does not use a HashMap**, a **2D array** is created to store:

* **Array value**
* **Original index**

The array is then **sorted by value**. Sorting places identical values together, making it easy to calculate:

* **Frequency** of each element
* **First occurrence**
* **Last occurrence**

For every distinct element:

* Compute its frequency.
* Determine the length of the subarray using:

```text
Length = Last Index − First Index + 1
```

* Update the array degree whenever a higher frequency is found.
* If another element has the same degree, keep the **minimum subarray length**.

---

# **Algorithm**

1. Store each array element along with its original index.
2. Sort the 2D array based on element values.
3. Traverse the sorted array.
4. Count the occurrences of each distinct element.
5. Record its first and last original indices.
6. Update:

   * **Degree of the array**
   * **Minimum subarray length**
7. Return the minimum length.

---


---

# **Complexity Analysis**

| **Metric**           | **Complexity** |
| -------------------- | -------------- |
| **Time Complexity**  | **O(n log n)** |
| **Sorting**          | **O(n log n)** |
| **Traversal**        | **O(n)**       |
| **Space Complexity** | **O(n)**       |

---

# **Key Highlights**

*  **No HashMap is used.**
*  **Uses sorting to group identical elements.**
*  **Maintains original indices to determine subarray length.**
*  **Efficiently computes the degree and the shortest valid subarray.**
*  **Simple, readable, and interview-friendly implementation.**
