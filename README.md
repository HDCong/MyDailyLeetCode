# My Daily LeetCode

This is my daily challenge to improve my skill in programming, algorithm and data structure 

Begin in Jun 6th, 2020

## Day 01:
### Jun 10th, 2020
Let's begin with easy level 
Actually, i'm not good at algorithm, so i decided to start from easy level to get more motivated

### Problem 1: Climbing Stairs
Such a classic problem
If take 1 step, there are n-1 steps left
If take 2 step, there are n-2 steps left
We notice that, f(n) = f(n-1) + f(n-2), this is the same as fibonacci number
The base solution is n=1, there is 1 step, n =2 => 2 steps

* Use recursion to solve this will take the O(2^n) complexity
* Improve this by dynamic programming, take O(N) complexity
* And in my Discrete mathematics subject, the recursion expression above can be solve 
![image expression](./resource/Day01-RecursionExpression.png)

## Day 02
### Jun 11th, 2020

### Problem 2: Remove Duplicates from Sorted List

Just browse list from head. There are 2 pointers, one is prev node, one is current node. 
If prev.val = current.val, then set the next node of prev node is the current.next

The complexity is O(N)

## Day 03

### Jun 12th, 2020

### Problem 03: Merge Sorted Array

Merge 2 array into one temp array.

Merge: compare value of each array, add the smaller value to temp array

Then copy this temp array to nums1

## Day 04

### Jun 13th, 2020

### Problem 04: Same Tree

Using recursion, and pre-order traversal
If p, q not null, compare value, if value is the same, check left child, right child. Else false
If p, q is null return true
If p, q is different each other return false;