# 733. Flood Fill

## Problem Statement

You are given an `m × n` integer grid `image`, where `image[i][j]` represents the color of a pixel.

You are also given:

- `sr` – Starting row
- `sc` – Starting column
- `color` – New color

Perform a **Flood Fill** starting from the pixel `(sr, sc)`.

A flood fill changes the color of the starting pixel and all **4-directionally connected** pixels (up, down, left, right) having the **same original color** to the new color.

Return the modified image.

---

## Example 1

**Input:**

```text
image = [[1,1,1],
         [1,1,0],
         [1,0,1]]

sr = 1
sc = 1
color = 2
```

**Output:**

```text
[[2,2,2],
 [2,2,0],
 [2,0,1]]
```

**Explanation:**

Starting from `(1,1)`, all connected pixels having color `1` are changed to `2`.

The bottom-right `1` is not changed because it is **not connected** horizontally or vertically.

---

## Example 2

**Input:**

```text
image = [[0,0,0],
         [0,0,0]]

sr = 0
sc = 0
color = 0
```

**Output:**

```text
[[0,0,0],
 [0,0,0]]
```

**Explanation:**

The starting pixel already has the target color, so no changes are required.

---

# Approach

Use **Depth-First Search (DFS)**.

1. Store the original color of the starting pixel.
2. If the original color is already equal to the new color, return the image.
3. Perform DFS from `(sr, sc)`:
   - Change the current pixel to the new color.
   - Visit all four neighboring pixels.
   - Continue only if the neighbor has the original color.
4. Return the updated image.



---

# Algorithm

1. Get the original color of the starting pixel.
2. If the original color equals the new color, return the image.
3. Start DFS from `(sr, sc)`.
4. For each valid neighboring pixel:
   - Check if it has the original color.
   - Change its color.
   - Continue DFS.
5. Return the modified image.

---

# Complexity Analysis

- **Time Complexity:** `O(m × n)`
  - In the worst case, every pixel is visited once.

- **Space Complexity:** `O(m × n)`
  - Due to the recursion stack in the worst case.

---

# Key Concepts

- Depth-First Search (DFS)
- Recursion
- Matrix Traversal
- Graph Traversal
- Boundary Checking

---

# Why DFS?

Each pixel can be treated as a node in a graph. DFS efficiently explores all connected pixels with the same original color, making it a natural choice for the Flood Fill problem.

---

## LeetCode

**Problem:** 733. Flood Fill  
**Difficulty:** Easy