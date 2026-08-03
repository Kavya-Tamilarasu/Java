# 209. Minimum Size Subarray Sum

## Problem Statement

Given an array of positive integers `nums` and a positive integer `target`, return the minimal length of a contiguous subarray whose sum is greater than or equal to `target`. If there is no such subarray, return `0`.

---

## Examples

### Example 1

**Input**

```text
target = 7
nums = [2,3,1,2,4,3]
```

**Output**

```text
2
```

**Explanation**

The subarray `[4,3]` has the minimal length under the problem constraint.

---

### Example 2

**Input**

```text
target = 4
nums = [1,4,4]
```

**Output**

```text
1
```

---

### Example 3

**Input**

```text
target = 11
nums = [1,1,1,1,1,1,1,1]
```

**Output**

```text
0
```

---

## Approach

- Use a sliding window with two pointers.
- Expand the window by moving `right` and adding elements to `sum`.
- When `sum` becomes greater than or equal to `target`, shrink the window from the left to find the minimum length.
- Keep track of the smallest valid window.

---

## Algorithm

1. Initialize:
   - `left = 0`
   - `sum = 0`
   - `minLen = Integer.MAX_VALUE`
2. Traverse the array with `right`.
3. Add `nums[right]` to `sum`.
4. While `sum >= target`:
   - Update `minLen`.
   - Subtract `nums[left]` from `sum`.
   - Increment `left`.
5. If `minLen` was never updated, return `0`.

---

## Dry Run

### Input

```text
target = 7
nums = [2,3,1,2,4,3]
```

| left | right | sum | Action | minLen |
|-----:|------:|----:|--------|-------:|
| 0 | 0 | 2 | Expand | ∞ |
| 0 | 1 | 5 | Expand | ∞ |
| 0 | 2 | 6 | Expand | ∞ |
| 0 | 3 | 8 | Valid window | 4 |
| 1 | 3 | 6 | Shrink | 4 |
| 1 | 4 | 10 | Valid window | 4 |
| 2 | 4 | 7 | Valid window | 3 |
| 3 | 4 | 6 | Shrink | 3 |
| 3 | 5 | 9 | Valid window | 3 |
| 4 | 5 | 7 | Valid window | 2 |
| 5 | 5 | 3 | Shrink | 2 |

Final Result:

```text
2
```

---


---

## Time Complexity

- **O(n)**

Each element enters and leaves the window at most once.

---

## Space Complexity

- **O(1)**

Only a few variables are used.

---

## Concepts Used

- Sliding Window
- Two Pointers
- Array Traversal
- Greedy Shrinking of Window

---

## Key Takeaway

Because all numbers are positive, expanding the window increases the sum and shrinking the window decreases it. This property makes the sliding window technique the optimal solution for finding the minimum valid subarray length in linear time.

---

## Difficulty

🟡 Medium

---

## Platform

**LeetCode - Problem 209: Minimum Size Subarray Sum**