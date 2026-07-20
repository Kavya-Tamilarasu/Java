# 88. Merge Sorted Array

## Problem Statement

You are given two sorted integer arrays `nums1` and `nums2`, along with integers `m` and `n` representing the number of valid elements in each array.

Merge `nums2` into `nums1` so that `nums1` becomes one sorted array.

The merged array should be stored in `nums1` itself.

---

## Examples

### Example 1

**Input**

```text
nums1 = [1,2,3,0,0,0]
m = 3

nums2 = [2,5,6]
n = 3
```

**Output**

```text
[1,2,2,3,5,6]
```

---

### Example 2

**Input**

```text
nums1 = [1]
m = 1

nums2 = []
n = 0
```

**Output**

```text
[1]
```

---

### Example 3

**Input**

```text
nums1 = [0]
m = 0

nums2 = [1]
n = 1
```

**Output**

```text
[1]
```

---

## Approach

- Use three pointers:
  - `i` points to the last valid element of `nums1`.
  - `j` points to the last element of `nums2`.
  - `k` points to the last position of `nums1`.
- Compare elements from the end of both arrays.
- Place the larger element at position `k`.
- Continue until all elements of `nums2` are merged.

---

## Algorithm

1. Initialize:
   - `i = m - 1`
   - `j = n - 1`
   - `k = m + n - 1`
2. Compare `nums1[i]` and `nums2[j]`.
3. Place the larger element at `nums1[k]`.
4. Move the corresponding pointer.
5. Continue until all elements of `nums2` are copied.

---

## Dry Run

### Input

```text
nums1 = [1,2,3,0,0,0]
nums2 = [2,5,6]
```

| i | j | k | Action | nums1 |
|--:|--:|--:|--------|--------|
| 2 | 2 | 5 | Place 6 | [1,2,3,0,0,6] |
| 2 | 1 | 4 | Place 5 | [1,2,3,0,5,6] |
| 2 | 0 | 3 | Place 3 | [1,2,3,3,5,6] |
| 1 | 0 | 2 | Place 2 | [1,2,2,3,5,6] |

Final Result:

```text
[1,2,2,3,5,6]
```

---

## Time Complexity

- **O(m + n)**

---

## Space Complexity

- **O(1)**

---

## Concepts Used

- Arrays
- Two Pointer Technique
- In-place Array Modification
- Reverse Traversal

---

## Key Takeaway

By merging the arrays from the end, we avoid shifting elements and achieve an efficient in-place solution with constant extra space.

---

## Difficulty

🟢 Easy

---

## Platform

**LeetCode - Problem 88: Merge Sorted Array**