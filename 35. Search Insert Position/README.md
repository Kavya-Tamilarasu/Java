# 35. Search Insert Position

## Problem Statement

Given a sorted array of distinct integers `nums` and a target value `target`, return the index if the target is found. If not, return the index where it would be inserted to maintain the sorted order.

The solution must have **O(log n)** runtime complexity.

---

## Examples

### Example 1

**Input**

```text
nums = [1,3,5,6], target = 5
```

**Output**

```text
2
```

---

### Example 2

**Input**

```text
nums = [1,3,5,6], target = 2
```

**Output**

```text
1
```

---

### Example 3

**Input**

```text
nums = [1,3,5,6], target = 7
```

**Output**

```text
4
```

---

## Approach

- Use Binary Search to search for the target.
- If the target is found, return its index.
- If the target is not found, return the position where it should be inserted.
- The insertion position is given by the `left` pointer after the loop ends.

---

## Algorithm

1. Initialize `left = 0` and `right = nums.length - 1`.
2. Find the middle index.
3. Compare the middle element with the target.
4. Move the search range accordingly.
5. Return `left` if the target is not found.

---



## Dry Run

### Input

```text
nums = [1,3,5,6]
target = 2
```

| left | right | mid | nums[mid] | Action |
|-----:|------:|----:|----------:|--------|
| 0 | 3 | 1 | 3 | right = 0 |
| 0 | 0 | 0 | 1 | left = 1 |

Return:

```text
1
```

---

## Time Complexity

- **O(log n)**

---

## Space Complexity

- **O(1)**

---

## Concepts Used

- Binary Search
- Arrays
- Divide and Conquer

---

## Key Takeaway

Binary Search efficiently finds the target or its correct insertion position in a sorted array with logarithmic time complexity.

---

## Difficulty

🟢 Easy

---

## Platform

**LeetCode - Problem 35: Search Insert Position**