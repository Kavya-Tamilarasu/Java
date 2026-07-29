# LeetCode 566: Reshape the Matrix

## Problem Statement

In MATLAB, there is a handy function called **reshape** which can reshape an `m × n` matrix into a new one with a different size `r × c` while keeping its original data.

You are given an `m × n` matrix `mat` and two integers `r` and `c` representing the number of rows and columns of the desired reshaped matrix.

The reshaped matrix must contain **all elements of the original matrix in the same row-traversing order**.

If reshaping is not possible, return the **original matrix**.

---

## Examples

### Example 1

**Input**
mat = [[1,2],[3,4]], r = 1, c = 4

**Output**
[[1,2,3,4]]

### Example 2

**Input**
mat = [[1,2],[3,4]], r = 2, c = 4

**Output**
[[1,2],[3,4]]

---

## Approach

First, check whether reshaping is possible.

- Original matrix has `m × n` elements.
- Reshaped matrix must have `r × c` elements.

If these counts are different, return the original matrix.

### Key Idea

Traverse the original matrix in **row-major order** and place elements into the new matrix in the same order.

Instead of using an extra list, we can use a single index:

- Original position:
  - `row = idx / n`
  - `col = idx % n`
- New position:
  - `newRow = idx / c`
  - `newCol = idx % c`

---

## Algorithm

<List gap={1}><List.Item>Compute `m` and `n`.</List.Item><List.Item>If `m * n != r * c`, return `mat`.</List.Item><List.Item>Create a new matrix `res[r][c]`.</List.Item><List.Item>For each index `idx` from `0` to `m*n - 1`:
    <List gap={1}><List.Item>Read from original matrix.</List.Item><List.Item>Write to reshaped matrix.</List.Item></List></List.Item><List.Item>Return `res`.</List.Item></List>

---
