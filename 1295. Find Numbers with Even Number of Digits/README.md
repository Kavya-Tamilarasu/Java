# 1295. Find Numbers with Even Number of Digits

## Problem Statement

Given an integer array `nums`, return the number of elements that contain an **even number of digits**.

---

## Examples

### Example 1

**Input**

```text
nums = [12,345,2,6,7896]
```

**Output**

```text
2
```

**Explanation**

- 12 → 2 digits ✅
- 345 → 3 digits ❌
- 2 → 1 digit ❌
- 6 → 1 digit ❌
- 7896 → 4 digits ✅

There are **2** numbers with an even number of digits.

---

### Example 2

**Input**

```text
nums = [555,901,482,1771]
```

**Output**

```text
1
```

**Explanation**

- 555 → 3 digits ❌
- 901 → 3 digits ❌
- 482 → 3 digits ❌
- 1771 → 4 digits ✅

Only **1771** has an even number of digits.

---

## Approach

- Traverse each element in the array.
- Convert the integer to a string.
- Find the length of the string (number of digits).
- If the length is even, increment the count.
- Return the final count.

---

## Algorithm

1. Initialize `count = 0`.
2. Traverse each number in the array.
3. Convert the number to a string using `Integer.toString(num)`.
4. Find the length of the string.
5. If the length is even, increment `count`.
6. Return `count`.

---





## Time Complexity

- **O(n × d)**

Where:
- `n` = number of elements
- `d` = number of digits in each number (conversion to string)

Since the number of digits in an integer is small, this is effectively **O(n)**.

---

## Space Complexity

- **O(d)**

Extra space is used to create the string representation of each number.

---

## Concepts Used

- Arrays
- String Conversion
- String Length
- For-each Loop
- Modulo Operator

---

## Key Takeaway

Convert each integer into a string, count its digits using the string length, and check whether the number of digits is even.

---

## Difficulty

🟢 Easy

---

## Platform

**LeetCode - Problem 1295: Find Numbers with Even Number of Digits**