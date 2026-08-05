# 1343. Number of Sub-arrays of Size K and Average Greater than or Equal to Threshold

## Problem Statement

Given an integer array `arr` and two integers `k` and `threshold`, return the number of **contiguous sub-arrays** of size `k` whose **average is greater than or equal to** `threshold`.

---

## Example 1

**Input:**
```text
arr = [2,2,2,2,5,5,5,8]
k = 3
threshold = 4
```

**Output:**
```text
3
```

**Explanation:**

The qualifying sub-arrays are:

- `[2,5,5]` → Average = 4
- `[5,5,5]` → Average = 5
- `[5,5,8]` → Average = 6

So, the answer is **3**.

---

## Example 2

**Input:**
```text
arr = [11,13,17,23,29,31,7,5,2,3]
k = 3
threshold = 5
```

**Output:**
```text
6
```

---

# Approach

Use the **Sliding Window** technique.

1. Compute the sum of the first `k` elements.
2. Check whether the average is greater than or equal to the threshold.
3. Slide the window by:
   - Removing the leftmost element.
   - Adding the next element.
4. Repeat until the end of the array.
5. Count every valid window.

Instead of calculating the average every time, compare:

```text
windowSum >= k × threshold
```

This avoids unnecessary division operations.

---


---

# Algorithm

1. Calculate the sum of the first window of size `k`.
2. Compare the window sum with `k × threshold`.
3. Slide the window one element at a time.
4. Update the sum efficiently by adding the new element and removing the old one.
5. Count each valid window.
6. Return the total count.

---

# Complexity Analysis

- **Time Complexity:** `O(n)`
  - Each element is visited at most once.

- **Space Complexity:** `O(1)`
  - Only a few extra variables are used.

---

# Key Concepts

- Sliding Window
- Array Traversal
- Window Sum
- Efficient Sum Update
- Time Optimization

---

# Why Sliding Window?

A brute-force approach would calculate the sum of every sub-array separately, resulting in **O(n × k)** time complexity.

The Sliding Window technique updates the window sum in constant time, reducing the overall complexity to **O(n)**.

---

## LeetCode

**Problem:** 1343. Number of Sub-arrays of Size K and Average Greater than or Equal to Threshold  
**Difficulty:** Medium