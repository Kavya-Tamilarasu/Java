# 53. Maximum Subarray

## Problem Statement

Given an integer array `nums`, find the **contiguous subarray** (containing at least one element) that has the **largest sum**, and return its sum.

---

## Examples

### Example 1

**Input**

```text
nums = [-2,1,-3,4,-1,2,1,-5,4]
```

**Output**

```text
6
```

**Explanation**

The subarray `[4, -1, 2, 1]` has the largest sum.

```text
4 + (-1) + 2 + 1 = 6
```

---

### Example 2

**Input**

```text
nums = [1]
```

**Output**

```text
1
```

**Explanation**

The only subarray is `[1]`.

---

### Example 3

**Input**

```text
nums = [5,4,-1,7,8]
```

**Output**

```text
23
```

**Explanation**

The entire array has the maximum sum.

```text
5 + 4 + (-1) + 7 + 8 = 23
```

---

# Approach (Kadane's Algorithm)

Kadane's Algorithm efficiently finds the maximum subarray sum in a single traversal.

At every element:

- Decide whether to:
  - Start a new subarray from the current element, or
  - Extend the previous subarray.
- Keep track of the maximum sum found so far.

This guarantees the optimal answer in **O(n)** time.

---

## Algorithm

1. Initialize:
   - `currentSum = nums[0]`
   - `maxSum = nums[0]`
2. Traverse the array starting from index `1`.
3. Update:

```text
currentSum = max(nums[i], currentSum + nums[i])
```

4. Update:

```text
maxSum = max(maxSum, currentSum)
```

5. Return `maxSum`.

---

## Dry Run

### Input

```text
nums = [-2,1,-3,4,-1,2,1,-5,4]
```

| Index | Value | Current Sum | Maximum Sum |
|------:|------:|------------:|------------:|
| 0 | -2 | -2 | -2 |
| 1 | 1 | 1 | 1 |
| 2 | -3 | -2 | 1 |
| 3 | 4 | 4 | 4 |
| 4 | -1 | 3 | 4 |
| 5 | 2 | 5 | 5 |
| 6 | 1 | 6 | 6 |
| 7 | -5 | 1 | 6 |
| 8 | 4 | 5 | 6 |

**Maximum Subarray Sum = 6**

Subarray:

```text
[4, -1, 2, 1]
```

---



---

## Complexity Analysis

- **Time Complexity:** `O(n)`
  - The array is traversed only once.

- **Space Complexity:** `O(1)`
  - Only two variables are used.

---

## Edge Cases

- Array contains only one element.
- All elements are negative.
- All elements are positive.
- Maximum subarray is the entire array.
- Maximum subarray contains a single element.

---

## Why Kadane's Algorithm Works

If the running sum becomes smaller than the current element itself, keeping the previous sum only reduces future sums.

Therefore, we start a **new subarray** from the current element whenever it gives a larger sum.

This greedy decision ensures the optimal solution.

---

## Follow-up: Divide and Conquer

Another solution uses the **Divide and Conquer** technique.

- Split the array into two halves.
- Compute:
  - Maximum subarray in the left half.
  - Maximum subarray in the right half.
  - Maximum crossing subarray.
- Return the maximum of these three values.

**Time Complexity:** `O(n log n)`

---

## Tags

- Array
- Dynamic Programming
- Kadane's Algorithm
- Divide and Conquer
- Greedy

---

## LeetCode

**Problem:** 53. Maximum Subarray  
**Difficulty:** Medium