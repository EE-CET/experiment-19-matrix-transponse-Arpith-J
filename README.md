# Experiment 19: Matrix Transpose

## Problem Statement

Write a program to find the transpose of a square matrix of size $N \times N$.
Transpose of a matrix is obtained by changing rows to columns and columns to rows.

**Constraints:**
* Expected Time Complexity: $O(N \times N)$
* Expected Space Complexity: **Inplace** (Modify the existing matrix, do not create a new one).

## Input Format

* The first line contains an integer $N$.
* The next $N$ lines contain $N$ spaced integers each, elements of the matrix.

## Output Format

Print the transposed matrix.

### Example 1

**Input:**

```text
4
1 1 1 1
2 2 2 2
3 3 3 3
4 4 4 4
```

**Output:**

```text
1 2 3 4
1 2 3 4
1 2 3 4
1 2 3 4
```

**Explanation:**
The rows of the input matrix become the columns of the output matrix.
* Row 1 (1 1 1 1) -> Column 1
* Row 2 (2 2 2 2) -> Column 2
* etc.
