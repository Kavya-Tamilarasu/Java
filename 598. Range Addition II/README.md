# LeetCode 598: Range Addition II

## Problem Statement

You are given an `m x n` matrix `M` initialized with all `0`s and a list of operations `ops`.

Each operation:

ops[i] = [ai, bi]

means increment every cell `M[x][y]` where:

- `0 <= x < ai`
- `0 <= y < bi`

After performing all operations, return the **number of maximum integers** in the matrix.

---

## Examples

### Example 1

**Input**
m = 3, n = 3
ops = [[2,2],[3,3]]

**Output**
4

### Example 2

**Input**
m = 3, n = 3
ops = [[2,2],[3,3],[3,3],[3,3]]

**Output**
4

### Example 3

**Input**
m = 3, n = 3
ops = []

**Output**
9

---

## Key Observation

Each operation increments a **top-left submatrix**.

The cells that receive the **maximum number of increments** are the cells that belong to the **intersection of all operation ranges**.

So we only need:

- minimum `ai`
- minimum `bi`

The answer is:

minRow * minCol

---

## Why?

Suppose:

ops = [[2,2],[3,3]]

- First operation affects a `2 × 2` area.
- Second operation affects a `3 × 3` area.

The overlapping area is `2 × 2`, so these 4 cells are incremented twice and become the maximum.

---

## Approach

1. Initialize:
   - `minRow = m`
   - `minCol = n`
2. For every operation `[a, b]`:
   - `minRow = min(minRow, a)`
   - `minCol = min(minCol, b)`
3. Return `minRow * minCol`.

If `ops` is empty, the whole matrix remains `0`, so all `m * n` cells are maximum.

---

