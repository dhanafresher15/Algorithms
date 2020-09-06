# WINDOW SLIDING TECHNIQUE
Window sliding technique is a simple and effective technique, 
which is mostly used for k sub arrays problems .

We need to calculate the maximum sum of k (**3**) 
consecutive elements in the array. :
| *5* | *2* | *-1* | 0 | 3 |
| - | - | - | - | - |
> Maximum sum is 6
## Naive Solution
Checking all possible consecutive blocks of k elements :

**Algorithm :**
  ```sh
maximum_sum(arr[], k, n)
	max_sum = MIN_VALUE
	for i = 0 to i <= n-k
		cur_sum = 0
		for j = i to j <= k
			cur_sum += arr[j]
		max_sum = max(max_sum, cur_sum)
	return max_sum
```
> Time complexity of this approach is O(n*k). 

## Efficient Solution 
Window sliding technique illustration :

![one](https://media.geeksforgeeks.org/wp-content/uploads/sliding-window1.png)

![two](https://media.geeksforgeeks.org/wp-content/uploads/sliding-window2.png)

![three](https://media.geeksforgeeks.org/wp-content/uploads/sliding-window3.png)


**Algorithm :**
  ```sh
maxSum(arr[], n, k):
	max_sum = 0
	for i = 0 to i < k
		max_sum += arr[i]
		
	/* Compute remaining windows sum by
	removing first element of previous
	window and adding last element of
	current window. */
	
	cur_sum = max_sum
	for i = k to i < k
		cur_sum += arr[i] - arr[i - k]
		max_sum = max(cur_sum, max_sum)
	return max_sum
```
> Time complexity of this approach is O(n). 

>Java Implementation : [WindowSliding.java](https://github.com/dhanafresher15/Algorithms/blob/master/Window-sliding-technique/WindowSliding.java)

## Can solve problems like :
 1. [Maximum sum sub array - gfg](https://practice.geeksforgeeks.org/problems/max-sum-subarray-of-size-k/0)
2. [Maximum sum sub array](https://www.educative.io/courses/grokking-the-coding-interview/JPKr0kqLGNP)
