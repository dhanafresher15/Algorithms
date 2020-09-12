
import java.util.*; 

public class MinStack 
{ 
	Stack<Integer> s; 
	int minEle; 
   
	MinStack() { 
      s = new Stack<Integer>();
   } 
   
	int getMin() 
	{  
		if (s.isEmpty()) 
			return -1;
		return minEle;
	} 

	int pop() 
	{ 
		if(!s.isEmpty()) { 
          int y = s.pop(); 
          if (y >= minEle) 
             return y; 
          int oldMin = minEle;
          minEle = 2*minEle - y; 
          return oldMin;
       } 
       return -1; 
	} 
   
	void push(int x) 
	{ 
		if(s.isEmpty()) { 
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
   
}


 
