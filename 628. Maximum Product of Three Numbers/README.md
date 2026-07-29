# LeetCode 628: Maximum Product of Three Numbers

## Problem Statement

Given an integer array `nums`, find **three numbers whose product is maximum** and return that maximum product.

---

## Examples

### Example 1

**Input**

nums = [1,2,3]

**Output**

6

### Example 2

**Input**

nums = [1,2,3,4]

**Output**

24

### Example 3

**Input**

nums = [-1,-2,-3]

**Output**

-6

---

## Key Observation

The maximum product of three numbers can come from **two possible cases**:

### Case 1: Three largest numbers

largest1 × largest2 × largest3

### Case 2: Two smallest (most negative) numbers and the largest number

smallest1 × smallest2 × largest1

Why? Because multiplying two negative numbers gives a positive number.

---

## Approach 1: Sorting

1. Sort the array.
2. Compute:
   - Product of the three largest numbers.
   - Product of the two smallest numbers and the largest number.
3. Return the maximum of the two.

---
