# 674. Longest Continuous Increasing Subsequence

## Problem Statement

Given an unsorted array of integers `nums`, return the length of the longest continuous increasing subsequence (subarray). The subsequence must be strictly increasing.

A continuous increasing subsequence is defined by indices `l` and `r` (`l < r`) such that:

```text
[nums[l], nums[l+1], ..., nums[r]]
```

and for every `i` where `l <= i < r`:

```text
nums[i] < nums[i+1]
```

---

## Examples

### Example 1

**Input**

```text
nums = [1,3,5,4,7]
```

**Output**

```text
3
```

**Explanation**

The longest continuous increasing subsequence is `[1,3,5]` with length `3`.

---

### Example 2

**Input**

```text
nums = [2,2,2,2,2]
```

**Output**

```text
1
```

**Explanation**

The longest continuous increasing subsequence is `[2]` with length `1`.

---

## Approach

- Traverse the array once.
- Maintain:
  - `current` = length of the current increasing subarray.
  - `maxLen` = maximum length found so far.
- If `nums[i] > nums[i-1]`, extend the current sequence.
- Otherwise, reset `current` to `1`.

---

## Algorithm

1. Initialize:
   - `current = 1`
   - `maxLen = 1`
2. Traverse the array from index `1`.
3. If `nums[i] > nums[i-1]`:
   - Increment `current`.
4. Else:
   - Reset `current = 1`.
5. Update `maxLen = max(maxLen, current)`.
6. Return `maxLen`.

---

## Dry Run

### Input

```text
nums = [1,3,5,4,7]
```

| i | nums[i-1] | nums[i] | current | maxLen |
|--:|-----------:|--------:|--------:|-------:|
| 1 | 1 | 3 | 2 | 2 |
| 2 | 3 | 5 | 3 | 3 |
| 3 | 5 | 4 | 1 | 3 |
| 4 | 4 | 7 | 2 | 3 |

Final Result:

```text
3
```

---



---

## Time Complexity

- **O(n)**

The array is traversed exactly once.

---

## Space Complexity

- **O(1)**

Only two integer variables are used.

---

## Concepts Used

- Arrays
- Sliding / Running Count
- Greedy Traversal
- Subarray Processing

---

## Key Takeaway

The problem asks for a **continuous** increasing sequence, not a general subsequence. By keeping track of the current increasing streak and resetting whenever the order breaks, we can find the answer in a single linear pass.

---

## Difficulty

🟢 Easy

---

## Platform

**LeetCode - Problem 674: Longest Continuous Increasing Subsequence**