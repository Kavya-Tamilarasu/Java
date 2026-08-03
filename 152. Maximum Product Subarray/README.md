# 152. Maximum Product Subarray

## Problem Statement

Given an integer array `nums`, find a contiguous subarray that has the largest product and return the product.

The product of a subarray with a single element is the value of that element.

---



## Edge Cases

### Single Element

**Input**

```text
nums = [5]
```

**Output**

```text
5
```

---

### All Negative Numbers

**Input**

```text
nums = [-2,-3,-4]
```

**Output**

```text
12
```

**Explanation**

The subarray `[-3,-4]` gives product `12`.

---

### Contains Zero

**Input**

```text
nums = [-2,0,-1]
```

**Output**

```text
0
```

**Explanation**

Zero breaks the product chain, so the maximum product is `0`.

---

## Why Do We Track Both Maximum and Minimum?

Consider:

```text
nums = [-2, 3, -4]
```

At index `1`:

```text
maxEnding = 3
minEnding = -6
```

At index `2` (`-4`):

- `3 × -4 = -12`
- `-6 × -4 = 24`

The previous minimum becomes the new maximum.

This is the core idea of the algorithm.

---

## Comparison with Brute Force

### Brute Force

- Check every possible subarray.
- Compute its product.

**Time Complexity:** `O(n²)`

### Optimized Solution

- Maintain rolling maximum and minimum products.

**Time Complexity:** `O(n)`

---

## Visual Explanation

```text
Index:   0   1    2   3
Nums :   2   3   -2   4

max :    2   6   -2   4
min :    2   3  -12 -48
ans :    2   6    6   6
```

---

## Interview Tips

- This is a variation of **Kadane’s Algorithm**.
- Remember:
  - **Maximum Sum → track one value**
  - **Maximum Product → track two values**
- Always handle:
  - negative numbers,
  - zeros,
  - single-element arrays.

---

## Related Problems

- 53. Maximum Subarray
- 121. Best Time to Buy and Sell Stock
- 918. Maximum Sum Circular Subarray

---

## Final Takeaway

The trick is not to lose information about negative products. By carrying both the **largest** and **smallest** products ending at each index, we can correctly handle sign changes and compute the maximum product subarray in linear time.

---

⭐ Efficient, interview-friendly, and optimal solution with **O(n)** time and **O(1)** extra space.