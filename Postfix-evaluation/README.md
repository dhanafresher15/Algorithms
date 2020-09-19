
# POSTFIX EVALUATION

Postfix expressions are the alternative way to write arithmetic expressions. 
"Postfix" refers to the fact that the operator is at the end.
They can be evaluated much faster that infix expressions as,
- We don’t need rules of precedence
- We don’t need rules for right and left associativity
- We don’t need parentheses to override the above rules

![Postfix-eval
](https://img.techpowerup.org/200919/postfix-evaluation306.png)

## Algorithm Idea

 - Create a stack to store values.  
 - Scan the given expression from left to right
	- If the element is a number, push it into the stack.
	- Else if the element is a operator, 
		- pop two operands stack. 
		- Evaluate the operator and push the result back to the stack
 - When the expression is ended, pop the stack to get the result.
 
**Algorithm illustration :**

![postfix-evaluation](https://runestone.academy/runestone/books/published/pythonds/_images/evalpostfix1.png)

**Algorithm :**

  ```sh
    evaluatePostfix(exp) 
    { 
        for i=0; i<exp.length() 
        { 
            if(isDigit(c)) 
            	stack.push(); 
            else
            { 
                val1 = stack.pop(),val2 = stack.pop(); 
                switch(c) 
                { 
                    case '+': 
                    	stack.push(val2+val1); 
                    	break; 
                    case '-': 
                    	stack.push(val2- val1); 
                    	break;
                    case '/': 
                    	stack.push(val2/val1); 
                    	break; 
                    case '*': 
                    	stack.push(val2*val1);
              } 
           } 
        } 
        return stack.pop();     
    } 
```

>C++ Implementation :  [Postfix-evaluation.cpp](https://github.com/dhanafresher15/Algorithms/blob/master/Postfix-evaluation/Postfix-evaluation.cpp)

## Can solve problems like :

 1. [Evaluation of Postfix Expression](https://practice.geeksforgeeks.org/problems/evaluation-of-postfix-expression/0)
 2. [Evaluate Reverse Polish Notation](https://leetcode.com/problems/evaluate-reverse-polish-notation/)
