# LeetCode 661: Image Smoother

## Problem Statement

An image smoother is a `3 × 3` filter applied to each cell of an image.

For every cell, compute the **floor of the average** of:

- the cell itself
- all valid neighboring cells (up to 8 neighbors)

If a neighbor is outside the image boundaries, it is **ignored**.

Return the smoothed image.

---

## Examples

### Example 1

**Input**

img = [[1,1,1],
       [1,0,1],
       [1,1,1]]

**Output**

[[0,0,0],
 [0,0,0],
 [0,0,0]]

---

### Example 2

**Input**

img = [[100,200,100],
       [200,50,200],
       [100,200,100]]

**Output**

[[137,141,137],
 [141,138,141],
 [137,141,137]]

---

## Approach

For each cell `(i, j)`:

1. Check all 9 positions in the `3 × 3` area centered at `(i, j)`.
2. Add only the **valid** cells inside the matrix.
3. Count how many cells were added.
4. Store `sum / count` in the result matrix.

We use a separate result matrix so that already-smoothed values do not affect future calculations.

---

## Algorithm

For every cell:

- Initialize `sum = 0`, `count = 0`
- Loop through rows `i-1` to `i+1`
- Loop through columns `j-1` to `j+1`
- If the neighbor is inside the matrix:
  - add its value to `sum`
  - increment `count`
