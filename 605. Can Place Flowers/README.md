# LeetCode 605: Can Place Flowers

## Problem Statement

You have a flowerbed represented by an integer array `flowerbed` containing:

- `0` → empty plot
- `1` → occupied plot

Flowers cannot be planted in **adjacent plots**.

Given an integer `n`, return **true** if `n` new flowers can be planted without violating the no-adjacent-flowers rule; otherwise return **false**.

---

## Examples

### Example 1

**Input**

flowerbed = [1,0,0,0,1], n = 1

**Output**

true

### Example 2

**Input**

flowerbed = [1,0,0,0,1], n = 2

**Output**

false

---

## Approach

We can greedily plant flowers whenever a position is safe.

A position `i` is safe if:

- `flowerbed[i] == 0`
- Left plot is empty or does not exist.
- Right plot is empty or does not exist.

When we plant a flower, we:

- Set `flowerbed[i] = 1`
- Decrease `n`

If `n` becomes `0`, return `true`.

---

## Algorithm

<List gap={1}><List.Item>Traverse the flowerbed from left to right.</List.Item><List.Item>For each position `i`:
    <List gap={1}><List.Item>Check if the current plot is empty.</List.Item><List.Item>Check left and right neighbors safely.</List.Item><List.Item>If both are empty, plant a flower and decrement `n`.</List.Item></List></List.Item><List.Item>After traversal, return `n <= 0`.</List.Item></List>

---
