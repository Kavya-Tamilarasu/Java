# LeetCode 643: Maximum Average Subarray I

## Problem Statement

You are given an integer array `nums` consisting of `n` elements and an integer `k`.

Find a **contiguous subarray** whose length is exactly `k` that has the **maximum average value** and return this value.

Any answer with a calculation error less than `10^-5` will be accepted.

---

## Examples

### Example 1

**Input**

nums = [1,12,-5,-6,50,3], k = 4

**Output**

12.75000

**Explanation**

Subarray with maximum average:

[12, -5, -6, 50]

Sum = 51

Average = 51 / 4 = 12.75

---

### Example 2

**Input**

nums = [5], k = 1

**Output**

5.00000

---

## Approach

This is a classic **Sliding Window** problem.

### Key Idea

- Compute the sum of the first `k` elements.
- Slide the window one step at a time:
  - Add the new element entering the window.
  - Remove the element leaving the window.
- Keep track of the maximum window sum.

Since the window size is fixed, this avoids recalculating the sum for every subarray.

---

## Algorithm

<List gap={1}><List.Item>Compute the sum of the first `k` elements.</List.Item><List.Item>Initialize `maxSum` with this value.</List.Item><List.Item>For each index `i` from `k` to `n-1`:
    <List gap={1}><List.Item>Add `nums[i]`.</List.Item><List.Item>Subtract `nums[i-k]`.</List.Item><List.Item>Update `maxSum`.</List.Item></List></List.Item><List.Item>Return `(double) maxSum / k`.</List.Item></List>

---
