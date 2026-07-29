# LeetCode 561: Array Partition

## Problem Statement

Given an integer array `nums` containing `2n` integers, group these integers into `n` pairs such that the sum of the minimum value in each pair is **maximized**.

Return the maximum possible sum.

---

## Examples

### Example 1

**Input**
nums = [1,4,3,2]

**Output**
4

**Explanation**

Possible pairings:

- (1,4), (2,3) → 1 + 2 = 3
- (1,3), (2,4) → 1 + 2 = 3
- (1,2), (3,4) → 1 + 3 = 4 ✅

Maximum sum = **4**

---

### Example 2

**Input**
nums = [6,2,6,5,1,2]

**Output**
9

**Explanation**

Sorted array: [1,2,2,5,6,6]

Pairs:

- (1,2)
- (2,5)
- (6,6)

Sum of minimums = 1 + 2 + 6 = **9**

---

## Approach

To maximize the sum of the minimums:

- **Sort the array in ascending order**
- Pair adjacent elements:
  - `(nums[0], nums[1])`
  - `(nums[2], nums[3])`
  - `(nums[4], nums[5])`
  - ...

The minimum of each pair will always be the **first element** of the pair.

Therefore, after sorting, we simply add every element at an **even index**.

---

## Why Does This Work?

Suppose the sorted array is:

[1,2,3,4,5,6]

If we pair adjacent elements:

- (1,2) → min = 1
- (3,4) → min = 3
- (5,6) → min = 5

Total = **1 + 3 + 5 = 9**

Any other pairing would waste larger numbers by pairing them with much smaller numbers.

This is a classic **greedy strategy**.

---

## Algorithm

1. Sort `nums`.
2. Initialize `sum = 0`.
3. Traverse the array with step `2`.
4. Add `nums[i]` to the sum.
5. Return the sum.

---
