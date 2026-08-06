# 724. Find Pivot Index

## Problem Statement

Given an integer array `nums`, find the **pivot index**.

The **pivot index** is the index where the **sum of all the numbers to the left** of the index is equal to the **sum of all the numbers to the right** of the index.

If the pivot index exists, return it. Otherwise, return `-1`.

**Note:**
- The left sum excludes the current element.
- The right sum excludes the current element.
- If there are multiple pivot indexes, return the **leftmost** one.

---

## Example 1

**Input:**
```text
nums = [1,7,3,6,5,6]
```

**Output:**
```text
3
```

**Explanation:**

- Left Sum = 1 + 7 + 3 = 11
- Right Sum = 5 + 6 = 11

Since both sums are equal, the pivot index is **3**.

---

## Example 2

**Input:**
```text
nums = [1,2,3]
```

**Output:**
```text
-1
```

**Explanation:**

No index satisfies the pivot condition.

---

## Example 3

**Input:**
```text
nums = [2,1,-1]
```

**Output:**
```text
0
```

**Explanation:**

- Left Sum = 0
- Right Sum = 1 + (-1) = 0

Hence, the pivot index is **0**.

---

# Approach

1. Calculate the total sum of the array.
2. Initialize `leftSum = 0`.
3. Traverse the array:
   - Compute `rightSum = totalSum - leftSum - nums[i]`.
   - If `leftSum == rightSum`, return the current index.
   - Otherwise, add the current element to `leftSum`.
4. If no pivot index is found, return `-1`.

---



---

# Algorithm

1. Find the total sum of the array.
2. Initialize `leftSum` to `0`.
3. Traverse each element:
   - Calculate the right sum.
   - Compare left and right sums.
   - Return the index if they are equal.
   - Update the left sum.
4. Return `-1` if no pivot index exists.

---

# Complexity Analysis

- **Time Complexity:** `O(n)`
  - One pass to calculate the total sum.
  - One pass to find the pivot index.

- **Space Complexity:** `O(1)`
  - Only a few extra variables are used.

---

# Key Concepts

- Prefix Sum
- Running Sum
- Array Traversal
- Space Optimization

---

# Why This Approach?

A brute-force solution computes the left and right sums for every index, resulting in **O(n²)** time complexity.

Using the total sum and a running left sum allows us to determine the right sum in constant time, reducing the complexity to **O(n)**.

---

## LeetCode

**Problem:** 724. Find Pivot Index  
**Difficulty:** Easy