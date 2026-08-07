# 744. Find Smallest Letter Greater Than Target

## Problem Statement

You are given a sorted character array `letters` and a character `target`.

Return the **smallest character** in `letters` that is **lexicographically greater** than `target`.

If no such character exists, return the **first character** in the array.

---

## Example 1

**Input:**
```text
letters = ['c','f','j']
target = 'a'
```

**Output:**
```text
'c'
```

**Explanation:**

The smallest letter greater than `'a'` is `'c'`.

---

## Example 2

**Input:**
```text
letters = ['c','f','j']
target = 'c'
```

**Output:**
```text
'f'
```

**Explanation:**

The smallest letter greater than `'c'` is `'f'`.

---

## Example 3

**Input:**
```text
letters = ['x','x','y','y']
target = 'z'
```

**Output:**
```text
'x'
```

**Explanation:**

There is no character greater than `'z'`, so the answer wraps around to the first character.

---

# Approach

Use **Binary Search** because the array is already sorted.

1. Initialize two pointers:
   - `left = 0`
   - `right = letters.length - 1`
2. Find the first character greater than `target`.
3. If such a character exists, return it.
4. Otherwise, return `letters[0]` (wrap-around case).

---


---

# Algorithm

1. Set `left = 0` and `right = n - 1`.
2. Perform binary search:
   - If `letters[mid] <= target`, search the right half.
   - Otherwise, search the left half.
3. After the loop:
   - If `left == letters.length`, return `letters[0]`.
   - Otherwise, return `letters[left]`.
4. Using `left % letters.length` automatically handles the wrap-around.

---

# Complexity Analysis

- **Time Complexity:** `O(log n)`
  - Binary search halves the search space each iteration.

- **Space Complexity:** `O(1)`
  - Only a few extra variables are used.

---

# Key Concepts

- Binary Search
- Sorted Array
- Lexicographical Order
- Wrap-around Condition
- Efficient Searching

---

# Why Binary Search?

A linear search would require checking every character, resulting in **O(n)** time complexity.

Since the array is sorted, Binary Search efficiently finds the smallest character greater than the target in **O(log n)** time.

---

## LeetCode

**Problem:** 744. Find Smallest Letter Greater Than Target  
**Difficulty:** Easy