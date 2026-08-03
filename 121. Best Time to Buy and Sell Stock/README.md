# 121. Best Time to Buy and Sell Stock

## Problem Statement

You are given an integer array `prices` where `prices[i]` represents the price of a stock on the `iᵗʰ` day.

You are allowed to complete **only one transaction**, which means:

- Buy one stock on a day.
- Sell the stock on a later day.

Return the **maximum profit** you can achieve. If no profit is possible, return `0`.

---

## Examples

### Example 1

**Input**

```text
prices = [7,1,5,3,6,4]
```

**Output**

```text
5
```

**Explanation**

- Buy at price **1**
- Sell at price **6**
- Profit = **6 - 1 = 5**

---

### Example 2

**Input**

```text
prices = [7,6,4,3,1]
```

**Output**

```text
0
```

**Explanation**

The stock price continuously decreases, so no profitable transaction is possible.

---

## Approach

We scan the array only once while maintaining:

- **Minimum price** encountered so far.
- **Maximum profit** obtained so far.

For every day's price:

1. Update the minimum buying price.
2. Calculate the profit if sold today.
3. Update the maximum profit if the current profit is larger.

This greedy approach ensures we always buy at the lowest price before selling.

---

## Algorithm

1. Initialize:
   - `minPrice = prices[0]`
   - `maxProfit = 0`
2. Traverse the array from left to right.
3. For each price:
   - Update `minPrice` if the current price is smaller.
   - Compute `profit = currentPrice - minPrice`.
   - Update `maxProfit`.
4. Return `maxProfit`.

---

## Dry Run

### Input

```text
prices = [7,1,5,3,6,4]
```

| Day | Price | Minimum Price | Profit | Maximum Profit |
|----:|------:|--------------:|-------:|---------------:|
| 1 | 7 | 7 | 0 | 0 |
| 2 | 1 | 1 | 0 | 0 |
| 3 | 5 | 1 | 4 | 4 |
| 4 | 3 | 1 | 2 | 4 |
| 5 | 6 | 1 | 5 | 5 |
| 6 | 4 | 1 | 3 | 5 |

**Final Answer:** `5`

---



---

## Complexity Analysis

- **Time Complexity:** `O(n)`
  - We traverse the array only once.

- **Space Complexity:** `O(1)`
  - Only two variables are used regardless of input size.

---

## Edge Cases

- Only one price is provided.
- Prices are in decreasing order.
- All prices are equal.
- Prices contain zero.
- Maximum profit occurs at the end of the array.

---

## Key Takeaways

- Use a **greedy approach** by tracking the minimum price seen so far.
- Update the maximum profit while traversing the array.
- No extra arrays or nested loops are required.
- Achieves optimal **O(n)** time and **O(1)** space complexity.

---

## Tags

- Array
- Greedy
- Dynamic Programming (Conceptually)
- Sliding Minimum

---

## LeetCode

**Problem:** 121. Best Time to Buy and Sell Stock  
**Difficulty:** Easy