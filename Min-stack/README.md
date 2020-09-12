# MIN STACK

We need to design a data structure **MinStack** that supports all the standard stack operations and an additional operation **getMin()** which returns the minimum element in O(1) Time and space complexity.

 **Intial  stack**
|6| 
|-|
|5|
|9|
|7|
|8|

> getMin() --> 5

 **After two pop() operations** 

|9|
|-|
|7|
|8|

> getMin() --> 7

## Algorithm Idea

### push(x) :

 -   If stack is empty,
	 -  insert x into the stack and make minEle equal to x.
-   Else,
	 -  If x is >= minEle, simply insert x.
	 -  Else, insert (2*x – minEle) into the stack and make minEle equal to x.
	    
**Push illustration :**

![Push](https://media.geeksforgeeks.org/wp-content/uploads/stackTable.png)

### pop() :

Let the popped element be y. 
-   If y >= minEle,
	-  the minimum element is still minEle. 
	-  return y.
-   Else, 
	- the minimum element is only popped.
	- store minEle in oldMin.
	- update (minEle = 2*minEle – y). 
	- return oldMin.
	
**Pop illustration :**

![pop](https://media.geeksforgeeks.org/wp-content/uploads/poptable.png)

**Algorithm :**
  ```sh
    void push(Integer x) { 
        if (s.isEmpty()) { 
            minEle = x; 
            s.push(x); 
        } else {
	        if(x >= minEle)
			    s.push(x);     
	        else {
		        s.push(2*x - minEle); 
	            minEle = x; 
	        }
        } 
    }

    int pop() { 
        if (!s.isEmpty()) { 
	        y = s.pop(); 
	        if (y >= minEle) 
		        return y; 
	        oldMin = minEle
	        minEle = 2*minEle - y; 
	        return oldMin;
	     } 
	     return -1;
    } 
```

>Java Implementation : [MinStack.java](https://github.com/dhanafresher15/Algorithms/blob/master/Min-stack/MinStack.java)

## Can solve problems like :
1. [Special Stack](https://practice.geeksforgeeks.org/problems/special-stack/1)
2. [Min Stack](https://leetcode.com/problems/min-stack/)
3. [Max Stack](https://leetcode.com/problems/max-stack/)

