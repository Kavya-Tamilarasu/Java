# LeetCode 167: Two Sum II - Input Array Is Sorted

## Problem Statement

Given a **1-indexed** array of integers `numbers` that is already sorted in **non-decreasing order**, find two numbers such that they add up to a specific `target`.

Return the indices of the two numbers as:

[index1, index2]

Where:

- `1 <= index1 < index2 <= numbers.length`
- There is **exactly one solution**
- You may **not use the same element twice**
- The solution must use **constant extra space**

---

## Examples

### Example 1

Input:
numbers = [2,7,11,15], target = 9

Output:
[1,2]

### Example 2

Input:
numbers = [2,3,4], target = 6

Output:
[1,3]

### Example 3

Input:
numbers = [-1,0], target = -1

Output:
[1,2]

---

## Approach

Since the array is already sorted, we can use the **Two Pointer Technique**.

### Idea

- Start one pointer at the beginning (`left`)
- Start another pointer at the end (`right`)
- Calculate the sum of both numbers

### Rules

- If `sum == target` → return the indices.
- If `sum < target` → move `left` forward to increase the sum.
- If `sum > target` → move `right` backward to decrease the sum.

This works because the array is sorted.

---

## Algorithm

1. Initialize `left = 0` and `right = numbers.length - 1`.
2. While `left < right`:
   - Compute `sum = numbers[left] + numbers[right]`.
   - If `sum == target`, return `[left + 1, right + 1]`.
   - If `sum < target`, increment `left`.
   - Else decrement `right`.

---
