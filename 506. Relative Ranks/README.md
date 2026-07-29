# LeetCode 506: Relative Ranks

## Problem Statement

You are given an integer array `score` where `score[i]` is the score of the `i-th` athlete in a competition. All scores are **unique**.

Athletes are ranked based on their scores:

- **1st place** → `Gold Medal`
- **2nd place** → `Silver Medal`
- **3rd place** → `Bronze Medal`
- **4th place onward** → their placement number as a string

Return an array `answer` where `answer[i]` is the rank of the `i-th` athlete.

---

## Examples

### Example 1

Input:
score = [5,4,3,2,1]

Output:
["Gold Medal","Silver Medal","Bronze Medal","4","5"]

### Example 2

Input:
score = [10,3,8,9,4]

Output:
["Gold Medal","5","Bronze Medal","Silver Medal","4"]

---

## Approach

We need to assign ranks while preserving the **original order** of athletes.

### Steps

1. Store each athlete's score along with their original index.
2. Sort the athletes by score in **descending order**.
3. Assign medals to the top three athletes.
4. Assign rank numbers (`4`, `5`, ...) to the remaining athletes.
5. Place the ranks back into the result array using the original indices.

---

## Algorithm

1. Create an array of pairs `(score, index)`.
2. Sort pairs by score descending.
3. Traverse the sorted array:
   - `0` → Gold Medal
   - `1` → Silver Medal
   - `2` → Bronze Medal
   - otherwise → `i + 1`
4. Return the result array.

---
