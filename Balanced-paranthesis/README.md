# BALANCED PARANTHESIS

We need to whether the pairs and the orders of “{“, “}”, “(“, “)”, “[“, “]” are correct in the given expression.
 
 
 >**Input**:  [()]{}[()()]
 
 >**Output**: Balanced
 
 >**Input**:  [(])
 
 >**Output**: Not Balanced
 

## Algorithm Idea

-   Now traverse the expression.
    -  If the character is a starting bracket (**‘(‘ or ‘{‘ or ‘[‘**) 
	    -  	push it to stack.
    -  If the character is a closing bracket (**‘)’ or ‘}’ or ‘]’**) 
	    -   pop from stack.
	    -  if the popped character is not the matching starting bracket.
		    - then not balanced.
-   After traversal, if there is some starting bracket left in stack
	- then not balanced .
-  Else, balanced .
 
**Algorithm illustration :**

![balanced-paranthesis](https://media.geeksforgeeks.org/wp-content/cdn-uploads/20190626134001/ForBalancedParanthesisInanExoression1.png)
**Algorithm :**

  ```sh
   paranthesisBalanced(expr)  
    for char in expr: 
        if char in ["(", "{", "["]: 
            stack.append(char) 
        else:  
            if not stack: 
                return False
            current_char = stack.pop() 
            if current_char == '(': 
                if char != ")": 
                    return False
            if current_char == '{': 
                if char != "}": 
                    return False
            if current_char == '[': 
                if char != "]": 
                    return False
    if stack: 
        return False
    return True
```

## Can solve problems like :

 1. [Parenthesis Checker](https://practice.geeksforgeeks.org/problems/parenthesis-checker/0)
 2. [Balanced Brackets](https://www.hackerrank.com/challenges/balanced-brackets/problem)

