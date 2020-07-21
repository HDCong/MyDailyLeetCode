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

## Day 05

### Jun 14 th, 2020

### Problem 05: Maximum Depth of Binary Tree

Using recursion, maximum is length of the longer child (left or right child)

### Jun 15th, 2020: Break :( 

 ## Day 06

 ### Jun 16th, 2020

 ### Problem 06: Minimum Depth of Binary Tree

Using recursion, minimum is length of the shorter child (left or right child).

But different from maximum, minimum length is the node that have no children.

So, use condition statement to check node is a leaf or not


 ## Day 07

 ### Jun 17th, 2020

 ### Problem 07: 136. Single Number

Using hash table

If the value not exist in hash, add this to hash table and value of this key is true, else change flag of this value to false

The value return is the key has value is true

## Day 08

### Jun 18th, 2020

### Problem 08:  Pascal's Triangle

Using array-list. Add the first row to result
Value of number from index 1..n-2 is the sum of the two numbers directly above it.
There are two list with same element, so must to remove one list (index 1 or 2) 

## Day 09

### Jun 19th, 2020

### Problem 09:  Best Time to Buy and Sell Stock

#### Way 1

Browse the whole list, get the max value of prices[j]-prices[i] (i<j)
The complexity is O(N^2)

#### Way 2

Find the smallest value and greatest in the rest of the array. The profit equal to the different between 2 values.

## Day 10

### Jun 20th, 2020

### Problem 10: Linked List Cycle

Define 2 pointers: the slow and fast pointer. 
Each loop, slow = slow.next, fast = fast.next.next
If fast is null or fast.next is null return false
If slow == fast return true.

## Day 11

### Jun 21th, 2020

### Problem 11: Rotate List

Firstly, find length of list
Value k = k % length 
Task to do is find the new tail and old tail. New tail is the k th node from tail of this list.
Now the next node of old tail is head, and new head is next node of the new tail. 

The complexity is O(N) [O(N) for find length, O(N) for find the new tail and old tail]

## Day 12

### Jun 22th, 2020

### Problem 12: Spiral matrix

Mark 4 corner of matrix, the value will follow (top-left to top-right, top-right  to bottom-right, bottom-right to bottom-left, bottom-left to top-left)

## Day 12.5

### Jun 23th, 2020

### Problem 12.5: Rotate Array

Move the k-th element from the end of array to front
Using temp array. Set value k element from end first. Set the remain value of nums array to this temp array. Copy value temp array to nums array

## Day 14

### Jun 24th, 2020

### Problem 14: Replace Elements with Greatest Element on Right Side

Define 2 variable storage max-value to set and the current-max is the value if current element is larger than max-value

Loop through the array from the end. Change value of each element


## Day 15

### Jun 25th, 2020

### Problem 15: Print FooBar Alternately

Using semaphore to solve this problem. When foo is processing, down value of foo (if value == 0, this process will wait until the value > 0), execute function run(), after that up value of bar to accept bar processing. Bar function is similar to foo function

## Day 16

### Jun 26th, 2020

### Problem 16: Add To Array Form of Integer

Add the value of each element to the unit number of the integer K. Loop the idx down from n-1 to 0, and the K value is different than 0.

## Day 17

### Jun 27th, 2020

### Problem 17: Remove Linked List Elements


## Day 18

### Jun 28th, 2020

### Problem 18: Reverse Linked List

Using recursion to solve. Simple case is list is null or only one node.
Recursion reverse the head.next
Set for the current head
    head.next.next = head;
    head.next = null;
       

## Day 19

### Jun 29th, 2020

### Problem 19: Balanced Binary Tree

Using recursion

Base conditional: root ==null :true

Recursion check the length of left child and right child. 

## Day 20

### Jun 30th, 2020

### Problem 20: Smaller number

Way #1: Brute force, for each position, browse the whole list to check.

The complexity should be O(N^2)

Way #2: Note that: 2 <= nums.length <= 500 and 0 <= nums[i] <= 100 . 

Init an array has 101 elements call array val, value of each element is the frequency of elements in nums array

Calc the number of values before current value: value[i]+=value[i-1]

Finally, init value for result array


## Day 21

### July 1st, 2020

### Problem 21: Running Sum

### Problem 22: Find Pivot Index

Calc sum of all value in array

Init the remain variable. Loop through array.

If the remain == sum -remain - nums[i]. index i is the pivot

Else update remain += nums[i]


## Day 22

### July 2nd, 2020

### Problem 23: Fibonacci number

Same solve with problem 01


## Day 23

### July 3rd, 2020

### Problem 24: Find lucky number in array

Note that: 1 <= arr.length <= 500 and 1 <= arr[i] <= 500

Create array count,and variable max to storage max value of array.

for each element update value count  and value of max , count[arr[i]]++  

From i = max value down to 1, if count[i]==i , return i

## Day 24

### July 4th, 2020

### Problem 25: Middle of the Linked List

Base condition: linked list has 1 or 2 node(s). 

Init 2 node: slow, fast. Each loop update slow = slow.next, fast= fast.next.next

If fast.next ==null return slow.next [For case number of nodes is odd]

Other, return slow.next.next [For case number of nodes is even]


## Day 25

### July 5th, 2020

### Problem 26: Palindrome Linked List

Reverse the first half of the list. Then check the 2 halves


## Day 26

### July 6th, 2020

### Problem 27: Convert Binary Number in a Linked List to Integer

Each value of node from head to tail update result =( result <<1 ) + node.val

## Day 27

### July 7th, 2020

### Problem 28: Intersection of Two Linked Lists

Way 1: Use stack
Loop through each list from head to tail, storage in stack
Compare each top element of stack, if it different each other. 


Way 2: Balance length of two list.

Then loop from head of new list, until two nodes of 2 list is the same reference

### Problem 29: Valid Palindrome

Init two variables i = 0 , j = length(s)-1
Compare 2 char at index i and j. If char at(i) is different char at (j) return false
if i>=j return true
## Day 28

### July 8th, 2020

### Problem 30: Swap Nodes in Pairs

Change reference value of next each node

First node reference to third node, seconde node reference to first node

## Day 29

### July 9th, 2020

### Problem 31: Reverse Linked List II

Find the m-th node (storage in 2 variables: cur, third). Storage the reference of m-th node and the (m-1)-th node (storage in variable: sec)

Reverse nodes from m to n.
Set third.next= (n+1)-th node. sec.next= n-th node or n-th node is new head.

## Day 30

### July 10th, 2020

### Problem 32: Reorder List

Reverse the second half of list. 

Change the reference each node of first half.

### Problem 33:   Remove Duplicates from Sorted Array

Init 2 variable: idx and val;
idx storage current number of the different value
val storage current value of array, if the nums[i]!=val then set this nums[idx]=nums[i];

### Problem 34: contains Duplicate

Use HashMap to storage value
If this value is exist in map, then return true.
Else add this value to map

## Day 31

### July 11th, 2020

### Problem 35: Odd Even Linked List

Storage address of current odd and even node
Set odd.next = even.next
even.next= odd.next

## Day 32

### July 12th, 2020

### Problem 36: Move zeroes
Use two pointers

### Problem 37:  Add Two Numbers
Traversal list from head to tail, add val 

## Day 33

### July 13th, 2020

### Problem 38: Search a 2D Matrix II

Approach 1: Traversal column of matrix, if first element <= target and last element >=target. Search binary this column

Approach 2: Binary search the whole matrix

### Problem 39: Sort Colors

Similar to counting sort
## Day 34
### July 14th, 2020
### Problem 40: Tree In-order Traversal 
Recursion visit the left,mid and right subtree of tree.

## Day 35
### July 15th, 2020
### Problem 41: Set Matrix Zeroes

Visit all cell in matrix, if value in current cell is zero, set the value of first cell of current row and column to zero

Update all the cell by the value of first cell of current row and column (if 0 then set 0)

Update cell of first row and first column
## Day 36
### July 16th, 2020
### Problem 42: Path Sum

Using recursion. Traversal all possible node, if this node is a leaf, compare current sum and target
## Day 37
### July 17th, 2020
### Problem 43: Two Sum II

##### Approach 1:
Traversal list, in each element, use binary search for value (target - element) in the rest of list. If index return of binary search is bigger than index of element, return 2 index+1

##### Approach 2:
Use two pointer: left= 0, right = numbers.length-1
if sum of two element is equal to target, return 2 index+1
if numbers at left +numbers at right > target then set right-1
else set left+1

### Problem 44: Kth largest element in array
Sort the array then return nums[nums.length-k]


## Day 38
### July 18th, 2020
### Problem 45:   Kth Smallest Element in a BST

In-order traversal tree, storage all val in a list. Return the k-1 element in this list
### Problem 46: Reverse String
## Day 39
### July 19th, 2020
### Problem 47: Pre-order Traversal

1. Use recursion, visit root node, then visit left node, and right node
2. Use stack, loop while the stack and root is not null, add the current root node to stack, then set current root node = left node. If current root node is null, set current root node is the right child of parent of the current root node

## Day 40
### July 20th, 2020
### Problem 48: Longest Well-Performing Interval

Follow up the hint, create a prefix sum, and find the longest sub-array with positive sum
Note that, the sub-array "well-performing" is max(last element - first element)

## Day 41
### July 21th, 2020
### Problem 49: Plus one
### Problem 50: 

Approach 1: Brute force O(N^3): for each index, search from the next index, and so on 

Approach 2: Create 2 variable, var a storage min value, var b storage value larger than a. 
If the value is bigger than two var, return true
