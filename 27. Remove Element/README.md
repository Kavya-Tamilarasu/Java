# 27. Remove Element

## Problem Statement

Given an integer array `nums` and an integer `val`, remove all occurrences of `val` **in-place**.

Return the number of elements `k` that are **not equal** to `val`.

The first `k` elements of the array should contain the elements that are not equal to `val`. The remaining elements beyond `k` are not important.

---

## Examples

### Example 1

**Input**

```text
nums = [3,2,2,3]
val = 3
```

**Output**

```text
2
```

**Modified Array**

```text
[2,2,_,_]
```

---

### Example 2

**Input**

```text
nums = [0,1,2,2,3,0,4,2]
val = 2
```

**Output**

```text
5
```

**Modified Array**

```text
[0,1,4,0,3,_,_,_]
```

---

## Approach

Use a pointer `k` to keep track of the position where the next valid element should be placed.

Traverse the array:

- If the current element is **not equal** to `val`, copy it to `nums[k]`.
- Increment `k`.
- Ignore elements equal to `val`.

After the traversal, the first `k` elements contain all the required values.

---

## Algorithm

1. Initialize `k = 0`.
2. Traverse the array.
3. If `nums[i] != val`:
   - Assign `nums[k] = nums[i]`.
   - Increment `k`.
4. Return `k`.

---




## Time Complexity

- **O(n)**

The array is traversed only once.

---

## Space Complexity

- **O(1)**

No extra space is used.

---

## Concepts Used

- Arrays
- Two Pointer Technique
- In-place Array Modification
- Traversal

---

## Key Takeaway

Use one pointer to overwrite the elements that should be kept. This removes the target value in-place without using an additional array.

---

## Difficulty

🟢 Easy

---

## Platform

**LeetCode - Problem 27: Remove Element**