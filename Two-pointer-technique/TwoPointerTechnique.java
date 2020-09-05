public class TwoPointerTechnique{

	public boolean isPairSum(int A[], int N, int X) { 
	    int i = 0; 
	    int j = N - 1; 
	  
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

	public static void main(String[] args) {
		TwoPointerTechnique tpt = new TwoPointerTechnique();
		int a[] = {1,5,9,14,23};
		System.out.println(tpt.isPairSum(a,5,19));
	}
}