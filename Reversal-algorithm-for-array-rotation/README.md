# REVERSAL ALGORITHM
Two pointer technique is a simple and effective technique, 
which is mostly used for array rotation.

We need to rotate the array for K (**3**)  times :
| 1 | 2 | 3 | 4 | 5 |
| - | - | - | - | - |

| 4 | 5 | 1 | 2 | 3 |
| - | - | - | - | - |

## Naive Solution
Literally rotating 3 times by swapping.

**Algorithm :**
  ```sh
  rotate(arr[], d, n)
	for i = 0 to i < d
		rotate all elements of arr[] by one ;
```
> Time complexity of this approach is O(n*k). 

## Efficient Solution 
Reversal algorithm illustration :

| 1 | 2 | 3 | 4 | 5 |
| - | - | - | - | - |

| *3* | *2* | *1* | 4 | 5 |
| - | - | - | - | - |

| 3 | 2 | 1 | *5* | *4* |
| - | - | - | - | - |

| *4* | *5* | *1* | *2* | *3* |
| - | - | - | - | - |

**Algorithm :**
  ```sh
  rotate(arr[], k, n)
		reverse(arr[], 1, k) ;
		reverse(arr[], k + 1, n);
		reverse(arr[], 1, n);
```
> Time complexity of this approach is O(n). 

>Java Implementation : [ReversalAlgorithm.java](https://github.com/dhanafresher15/Algorithms/blob/master/Reversal-algorithm-for-array-rotation/ReversalAlgorithm.java)

>Haskell Implementation : [ReversalAlgorithm.hs](https://github.com/dhanafresher15/Algorithms/blob/master/Reversal-algorithm-for-array-rotation/ReversalAlgorithm.hs)

## Can solve problems like :
 1. [Rototae Array](https://practice.geeksforgeeks.org/problems/rotate-array-by-n-elements/0)
2. [Rotate Array - LeetCode](https://leetcode.com/problems/rotate-array/)
3. [Reversal Algorithm](https://practice.geeksforgeeks.org/problems/reversal-algorithm/0)
