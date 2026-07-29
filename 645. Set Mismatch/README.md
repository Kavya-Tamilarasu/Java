
# LeetCode 645: Set Mismatch

## Problem Statement

You have a set of integers `s` that originally contains all numbers from `1` to `n`.

Due to an error:

- One number is **duplicated**.
- One number is **missing**.

You are given an integer array `nums` representing the corrupted set.

Return an array:

[duplicate, missing]

---

## Examples

### Example 1

**Input**

nums = [1,2,2,4]

**Output**

[2,3]

### Example 2

**Input**

nums = [1,1]

**Output**

[1,2]

---

## Approach

Use a **counting array** to track how many times each number appears.

### Idea

- The number that appears **twice** has frequency `2`.
- The number that is **missing** has frequency `0`.

---

## Algorithm

1. Create an array `count` of size `n + 1`.
2. Count the occurrences of each number.
3. Traverse from `1` to `n`:
   - If `count[i] == 2`, `i` is the duplicate.
   - If `count[i] == 0`, `i` is the missing number.
4. Return `[duplicate, missing]`.

---
