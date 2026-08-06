# 1732. Find the Highest Altitude

## Problem Statement

There is a biker going on a road trip. The trip consists of `n + 1` points at different altitudes.

You are given an integer array `gain` of length `n` where `gain[i]` is the **net gain in altitude** between points `i` and `i + 1`.

The biker starts the trip at altitude **0**.

Return the **highest altitude** reached during the trip.

---

## Example 1

**Input:**
```text
gain = [-5,1,5,0,-7]
```

**Output:**
```text
1
```

**Explanation:**

| Step | Gain | Current Altitude |
|------|------|------------------|
| Start | - | 0 |
| 1 | -5 | -5 |
| 2 | +1 | -4 |
| 3 | +5 | 1 |
| 4 | 0 | 1 |
| 5 | -7 | -6 |

The highest altitude reached is **1**.

---

## Example 2

**Input:**
```text
gain = [-4,-3,-2,-1,4,3,2]
```

**Output:**
```text
0
```

**Explanation:**

The biker never reaches an altitude higher than the starting altitude (0).

---

# Approach

Use a **running (prefix) sum** to keep track of the current altitude.

1. Start with altitude `0`.
2. Add each value from `gain` to the current altitude.
3. Update the maximum altitude whenever the current altitude becomes higher.
4. Return the maximum altitude after traversing the array.

---



---

# Algorithm

1. Initialize:
   - `altitude = 0`
   - `maxAltitude = 0`
2. Traverse the `gain` array.
3. Add the current gain to `altitude`.
4. Update `maxAltitude` if the current altitude is greater.
5. Return `maxAltitude`.

---

# Complexity Analysis

- **Time Complexity:** `O(n)`
  - The array is traversed once.

- **Space Complexity:** `O(1)`
  - Only two integer variables are used.

---

# Key Concepts

- Prefix Sum
- Running Sum
- Array Traversal
- Maximum Tracking

---

# Why This Approach?

Instead of storing every altitude, we continuously compute the current altitude using a running sum and keep track of the highest value encountered. This makes the solution both **efficient** and **space optimized**.

---

## LeetCode

**Problem:** 1732. Find the Highest Altitude  
**Difficulty:** Easy