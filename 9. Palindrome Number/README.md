# 9. Palindrome Number

## Problem Statement

Given an integer `x`, return `true` if `x` is a palindrome, and `false` otherwise.

A palindrome number reads the same forward and backward.

---

## Examples

### Example 1

**Input**

```text
x = 121
```

**Output**

```text
true
```

**Explanation**

Reading the number from left to right and right to left gives the same value.

---

### Example 2

**Input**

```text
x = -121
```

**Output**

```text
false
```

**Explanation**

Negative numbers are not palindromes because of the negative sign.

---

### Example 3

**Input**

```text
x = 10
```

**Output**

```text
false
```

**Explanation**

Reversing `10` gives `01`, which is `1`.

---

## Approach

The idea is to reverse the given integer and compare it with the original number.

1. If the number is negative, return `false`.
2. Store the original number in another variable.
3. Reverse the digits of the number using modulo (`%`) and division (`/`).
4. Compare the reversed number with the original number.
5. If both are equal, the number is a palindrome.

---

## Algorithm

1. Check if `x < 0`. If yes, return `false`.
2. Store the original number in `xcopy`.
3. Initialize `reverse = 0`.
4. While `x > 0`:
   - Extract the last digit using `x % 10`.
   - Append it to `reverse`.
   - Remove the last digit using `x /= 10`.
5. Compare `reverse` with `xcopy`.
6. Return the result.

---




## Time Complexity

- **O(log₁₀ n)**

The number of iterations depends on the number of digits in the integer.

---

## Space Complexity

- **O(1)**

Only a few integer variables are used.

---

## Concepts Used

- Mathematics
- Integer Manipulation
- Modulo Operator (`%`)
- Division Operator (`/`)
- While Loop

---

## Key Takeaway

By reversing the digits of the given integer and comparing the reversed value with the original number, we can determine whether the number is a palindrome. This solution uses constant extra space and is simple to understand.

---

## Difficulty

🟢 Easy

---

## Platform

**LeetCode - Problem 9: Palindrome Number**