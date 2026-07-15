# Remove Duplicates from Sorted Array

## Problem Statement

Given an integer array `nums` sorted in **non-decreasing order**, remove the duplicates **in-place** such that each unique element appears only once. The relative order of the elements should remain the same.

Return the number of unique elements `k`.

The first `k` elements of the array should contain the unique values in sorted order. The remaining elements beyond index `k - 1` can be ignored.

---

## Examples

### Example 1

**Input**

```text
nums = [1,1,2]
```

**Output**

```text
2
```

**Modified Array**

```text
[1,2,_]
```

---

### Example 2

**Input**

```text
nums = [0,0,1,1,1,2,2,3,3,4]
```

**Output**

```text
5
```

**Modified Array**

```text
[0,1,2,3,4,_,_,_,_,_]
```

---

## Approach

Since the array is already sorted, duplicate elements appear next to each other.

We use the **Two Pointer Technique**:

- Use pointer `i` to keep track of the last unique element.
- Use pointer `j` to traverse the array.
- If `nums[j]` is different from `nums[i]`, a new unique element is found.
- Increment `i` and copy `nums[j]` to `nums[i]`.
- Continue until the end of the array.
- Return `i + 1`, which represents the total number of unique elements.

---

## Algorithm

1. If the array is empty, return `0`.
2. Initialize `i = 0`.
3. Traverse the array from index `1` using pointer `j`.
4. Compare `nums[i]` and `nums[j]`.
5. If they are different:
   - Increment `i`.
   - Copy `nums[j]` to `nums[i]`.
6. Return `i + 1`.

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
- Sorting Property
- Time Optimization
- Space Optimization

---


## Difficulty

🟢 Easy

---

## Platform

**LeetCode - Problem 26: Remove Duplicates from Sorted Array**