
# TWO POINTER TECHNIQUE
Two pointer technique is a simple and effective technique, 
which is mostly used for searching pairs in a sorted array.

We need to check if there exists any pair of elements such that their sum is equal to X (**19**) in the given array :
| 1 | *5* | 9 | *14* | 23 |
| - | - | - | - | - |

## Naive Solution
We can check all the possible pairs using nested for loops.

**Algorithm :**
  ```sh
  boolean isPairSum(a[], N, X){
	  for (i = 0; i < N; i++) { 
        for (j = 0; j < N; j++) { 
            if (A[i] + A[j] == X) 
                return true;
        } 
     }  
     return false;
  }
```
> Time complexity of this approach is O(n^2). 
> It is same for unsorted array also.

## Efficient Solution 
Two pointer technique illusttration :

![enter image description here](https://media.geeksforgeeks.org/wp-content/uploads/two-pointer-technique.png)

**Algorithm :**
  ```sh
  boolean isPairSum(a[], N, X){
	    int i = 0, j = N - 1; 
	    while (i < j) { 
            if (A[i] + A[j] == X) 
	            return true; 
	        else if (A[i] + A[j] < X) 
	            i++; 
	        else
	            j--; 
	    } 
	    return false; 
  }
```
> Time complexity of this approach is O(n). 
Java Implementation : [TwoPointerTechnique.java](https://github.com/dhanafresher15/Algorithms/blob/master/Two-pointer-technique/TwoPointerTechnique.java)
## We can extend this Algorithm

 1. For unsorted array also, we can sort the array and apply this algorithm.
 > As the time complexity of this approach after sorting O(n*log n) is lesser than the naive one O(n^2).
 2. To find the triplet,  four elements an so on .. that sum to the given value.
 > We can use k-1 nested loops nesting this algorithm to find easily.
## Can solve problems like :
 1. [Find all triplets with zero sum](https://practice.geeksforgeeks.org/problems/find-triplets-with-zero-sum/1)
2. [Find a triplet such that sum of two equals to third element](https://www.geeksforgeeks.org/find-triplet-sum-two-equals-third-element/)
3. [Find four elements that sum to a given value](https://practice.geeksforgeeks.org/problems/four-elements/0)
