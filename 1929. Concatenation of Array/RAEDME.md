# 1929. Concatenation of Array

## Problem Statement

Given an integer array `nums` of length `n`, create an array `ans` of length `2n` such that:

- `ans[i] = nums[i]`
- `ans[i + n] = nums[i]`

for `0 <= i < n`.

Return the concatenated array `ans`.

---

## Examples

### Example 1

**Input**

```text
nums = [1,2,1]
```

**Output**

```text
[1,2,1,1,2,1]
```

---

### Example 2

**Input**

```text
nums = [1,3,2,1]
```

**Output**

```text
[1,3,2,1,1,3,2,1]
```

---

## Approach

- Find the length of the input array.
- Create a new array of size `2 * n`.
- Traverse the original array.
- Copy each element to:
  - the same index in the new array.
  - the index `i + n`.
- Return the new array.

---

## Algorithm

1. Find the length `n` of the array.
2. Create an array `ans` of size `2n`.
3. Traverse the array from `0` to `n - 1`.
4. Store:
   - `ans[i] = nums[i]`
   - `ans[i + n] = nums[i]`
5. Return `ans`.

---




## Time Complexity

- **O(n)**

The array is traversed only once.

---

## Space Complexity

- **O(n)**

An additional array of size `2n` is created.

---

## Concepts Used

- Arrays
- Array Traversal
- Array Manipulation
- Indexing

---

## Key Takeaway

Create a new array of size `2n` and copy each element of the original array twice: once in the first half and once in the second half.

---

## Difficulty

🟢 Easy

---

## Platform

**LeetCode - Problem 1929: Concatenation of Array**