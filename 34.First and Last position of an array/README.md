# LeetCode 34: Find First and Last Position of Element in Sorted Array

## Problem Statement

Given an array of integers `nums` sorted in non-decreasing order, find the **starting and ending position** of a given `target` value.

If the target is not found in the array, return `[-1, -1]`.

The algorithm must run in **O(log n)** time complexity.

---

## Examples

### Example 1
Input:
nums = [5,7,7,8,8,10], target = 8

Output:
[3,4]

### Example 2
Input:
nums = [5,7,7,8,8,10], target = 6

Output:
[-1,-1]

### Example 3
Input:
nums = [], target = 0

Output:
[-1,-1]

---

## Approach

Since the array is sorted, we can use **Binary Search**.

We perform **two binary searches**:

1. **Find the first occurrence** of the target.
2. **Find the last occurrence** of the target.

### Why two searches?

- In the first search, when we find the target, we continue searching on the **left side**.
- In the second search, when we find the target, we continue searching on the **right side**.

This ensures both boundaries are found in logarithmic time.

---

## Algorithm

1. Run binary search to find the first index of `target`.
2. Run binary search to find the last index of `target`.
3. Return `[first, last]`.

---
