# Longest Common Prefix

## Problem Statement

Write a function to find the **longest common prefix string** among an array of strings.

If there is no common prefix, return an empty string `""`.



## Example 1

**Input**

```text
strs = ["flower", "flow", "flight"]
```

**Output**

```text
"fl"
```



## Example 2

**Input**

```text
strs = ["dog", "racecar", "car"]
```

**Output**

```text
""
```



## Approach

1. Sort the array of strings.
2. After sorting:
   - The first string will be the lexicographically smallest.
   - The last string will be the lexicographically largest.
3. Compare the characters of the first and last strings one by one.
4. Append matching characters to the answer.
5. Stop when characters differ.
6. Return the accumulated prefix.

Since all strings lie between the first and last strings after sorting, the common prefix of these two strings is the common prefix of the entire array.



## Algorithm

1. Sort the input array.
2. Store the first and last strings.
3. Traverse both strings character by character.
4. If characters match, add them to the result.
5. Stop at the first mismatch.
6. Return the result.



## Time Complexity

- Sorting: **O(n log n)** (where `n` is the number of strings)
- Comparing characters: **O(m)** (where `m` is the length of the shortest prefix)

**Overall:** `O(n log n + m)`



## Space Complexity

- **O(1)** (Ignoring the space used by sorting)







## Concepts Used

- Arrays
- Sorting
- String Manipulation
- Character Comparison



## Difficulty

🟢 Easy


## Platform

LeetCode - Problem 14: Longest Common Prefix