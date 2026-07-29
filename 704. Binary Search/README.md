# LeetCode 704: Binary Search

## Problem Statement

Given a sorted array of integers `nums` in **ascending order** and an integer `target`, return the **index of target** if it exists in the array. Otherwise, return `-1`.

The algorithm must run in **O(log n)** time complexity.

---

## Examples

### Example 1

**Input**

nums = [-1,0,3,5,9,12], target = 9

**Output**

4

**Explanation**

`9` exists in the array at index `4`.

---

### Example 2

**Input**

nums = [-1,0,3,5,9,12], target = 2

**Output**

-1

**Explanation**

`2` does not exist in the array.

---

## Approach

Since the array is already sorted, we can use **Binary Search**.

### Key Idea

- Compare the middle element with the target.
- If they are equal, return the index.
- If the target is smaller, search the left half.
- If the target is larger, search the right half.

This reduces the search space by **half** in every step.

---

## Algorithm

<List gap={1}><List.Item>Initialize `left = 0` and `right = nums.length - 1`.</List.Item><List.Item>While `left <= right`:
    <List gap={1}><List.Item>Compute `mid`.</List.Item><List.Item>If `nums[mid] == target`, return `mid`.</List.Item><List.Item>If `nums[mid] < target`, search the right half.</List.Item><List.Item>Otherwise, search the left half.</List.Item></List></List.Item><List.Item>If the loop ends, return `-1`.</List.Item></List>

---
