# LeetCode 575: Distribute Candies

## Problem Statement

Alice has `n` candies, where `candyType[i]` represents the type of the `i-th` candy.

The doctor advises Alice to eat only **n / 2** candies (where `n` is always even).

Alice wants to eat the **maximum number of different candy types** while following the doctor's advice.

Return the maximum number of different candy types she can eat.

---

## Examples

### Example 1

**Input**
candyType = [1,1,2,2,3,3]

**Output**
3

**Explanation**

- Total candies = 6
- Alice can eat = 3 candies
- Different types = {1,2,3} → 3 types

She can eat one candy of each type.

---

### Example 2

**Input**
candyType = [1,1,2,3]

**Output**
2

**Explanation**

- Total candies = 4
- Alice can eat = 2 candies
- Different types = {1,2,3} → 3 types

She can eat at most 2 different types.

---

### Example 3

**Input**
candyType = [6,6,6,6]

**Output**
1

**Explanation**

- Total candies = 4
- Alice can eat = 2 candies
- Different types = {6} → 1 type

---

## Approach

We need to maximize the number of **different types**.

