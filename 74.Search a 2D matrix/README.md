# LeetCode 74: Search a 2D Matrix

## Problem Statement

You are given an `m x n` integer matrix `matrix` with the following properties:

- Each row is sorted in **non-decreasing order**.
- The first integer of each row is **greater than the last integer of the previous row**.

Given an integer `target`, return **true** if `target` is in the matrix, or **false** otherwise.

The solution must run in **O(log(m × n))** time complexity.

---

## Examples

### Example 1

Input:
matrix = [[1,3,5,7],
          [10,11,16,20],
          [23,30,34,60]]
target = 3

Output:
true

### Example 2

Input:
matrix = [[1,3,5,7],
          [10,11,16,20],
          [23,30,34,60]]
target = 13

Output:
false

---

## Approach

The matrix can be treated as a **single sorted 1D array** because:

- Rows are sorted.
- Every row starts with a value greater than the previous row’s last value.

For a matrix with `m` rows and `n` columns:

- Total elements = `m × n`
- Use **binary search** on indices from `0` to `m*n - 1`.

### Mapping 1D index to 2D coordinates

row = mid / n
col = mid % n

This allows us to access the correct matrix element during binary search.

---

## Algorithm

1. Let `m = matrix.length` and `n = matrix[0].length`.
2. Set `left = 0` and `right = m*n - 1`.
3. While `left <= right`:
   - Compute `mid`.
   - Convert `mid` to `(row, col)`.
   - Compare `matrix[row][col]` with `target`.
4. Return `true` if found; otherwise return `false`.

---
