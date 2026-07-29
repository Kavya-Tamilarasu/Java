# LeetCode 594: Longest Harmonious Subsequence

## Problem Statement

A **harmonious array** is an array where the difference between its maximum value and minimum value is **exactly 1**.

Given an integer array `nums`, return the length of its **longest harmonious subsequence**.

A subsequence can be formed by deleting some elements without changing the order of the remaining elements.

---

## Examples

### Example 1

**Input**
nums = [1,3,2,2,5,2,3,7]

**Output**
5

**Explanation**

The longest harmonious subsequence is:

[3,2,2,2,3]

Maximum = 3, Minimum = 2, Difference = 1, Length = 5.

---

### Example 2

**Input**
nums = [1,2,3,4]

**Output**
2

**Explanation**

Possible harmonious subsequences:

- [1,2]
- [2,3]
- [3,4]

Each has length 2.

---

### Example 3

**Input**
nums = [1,1,1,1]

**Output**
0

**Explanation**

No harmonious subsequence exists because the difference between max and min is 0.

---

## Approach

Use a **HashMap** to count the frequency of each number.

