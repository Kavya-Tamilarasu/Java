# 977. Squares of a Sorted Array

## Problem Statement

Given an integer array `nums` sorted in **non-decreasing order**, return an array containing the **square of each number**, also sorted in **non-decreasing order**.

### Example 1

**Input:**
```text
nums = [-4, -1, 0, 3, 10]
```

**Output:**
```text
[0, 1, 9, 16, 100]
```

**Explanation:**

- Squares: `[16, 1, 0, 9, 100]`
- After sorting: `[0, 1, 9, 16, 100]`

---

### Example 2

**Input:**
```text
nums = [-7, -3, 2, 3, 11]
```

**Output:**
```text
[4, 9, 9, 49, 121]
```

---

# Approach

1. Traverse the array.
2. Replace every element with its square.
3. Sort the squared array.
4. Return the sorted array.



---

# Algorithm

1. Iterate through the array.
2. Square each element.
3. Use `Arrays.sort()` to sort the squared values.
4. Return the sorted array.

---

# Complexity Analysis

- **Time Complexity:** `O(n log n)`
  - Squaring each element takes **O(n)**.
  - Sorting the array takes **O(n log n)**.

- **Space Complexity:** `O(1)`
  - The array is modified in place (excluding the sorting algorithm's internal space).

---

# Key Concepts

- Array Traversal
- Squaring Numbers
- Sorting Arrays
- Java `Arrays.sort()`

---

# Note

Although this solution is simple and accepted, the optimal solution uses the **Two Pointers** technique and achieves **O(n)** time complexity by taking advantage of the array already being sorted.

---

## LeetCode

**Problem:** 977. Squares of a Sorted Array  
**Difficulty:** Easy