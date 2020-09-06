# PREFIX SUM ARRAY
Prefix sum array is a simple and effective technique, 
which is mostly used for range queries .

We need to K (**3**) add operations from index ‘a’ to ‘b’. An add operation adds 10 to all elements from a to b in an array :
| 0 | 0 | 0 | 0 | 0 |
| - | - | - | - | - |
> Initial Array

| a | b |
|--|--|
| 1 | 5 |
| 2 | 4 |
| 3 | 3 |

> K ranges

| 10 | 20 | 30 | 20 | 10 |
| - | - | - | - | - |

> Resultant array
## Naive Solution
Literally updating the value for the elements in the range :

**Algorithm :**
  ```sh
update_value(arr[], n, q[][], k, val)
	for i = 0 to i < k
		a = q[0], b = q[1]
		for j = a to j <= b
			arr[i] += val
```
> Time complexity of this approach is O(k*d). 

## Efficient Solution 
Prefix sum array illustration :

| *10* | 0 | 0 | 0 | 0 |
| - | - | - | - | - |

| 10 | *10* | 0 | 0 | *-10* |
| - | - | - | - | - |

| 10 | 10 | *10* | *-10* | -10 |
| - | - | - | - | - |

| *10* | *20* | *30* | *20* | *10* |
| - | - | - | - | - |

> Resultant array

**Algorithm :**
  ```sh
update_value(arr[], n, q[][], k, val)
	for i = 0 to i < k
		a = q[0], b = q[1]
		arr[a] += val
		if(b+1 < n)
			arr[b+1] -= val
			
	/* apply prefix sum array technique
	to get the resultant array */
	
	for i = 1 to i < n
		arr[i] += arr[i-1]
```
> Time complexity of this approach is O(n). 

>Java Implementation : [PrefixSumArray.java](https://github.com/dhanafresher15/Algorithms/blob/master/Prefix-sum-array/PrefixSumArray.java)

## Can solve problems like :
 1. [Adding Ones](https://practice.geeksforgeeks.org/problems/adding-ones/0)
2. [Array Manipulation](https://www.hackerrank.com/challenges/crush/problem)
