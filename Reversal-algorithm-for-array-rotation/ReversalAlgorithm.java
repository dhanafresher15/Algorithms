public class ReversalAlgorithm {

    public void reverse(int arr[], int start, int end){
        for(int i = start, j = end-1; i<j; i++,j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public void rotation(int arr[], int n, int k) {
        reverse(arr,0,k);
        reverse(arr,k,n);
        reverse(arr,0,n);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        ReversalAlgorithm ra = new ReversalAlgorithm();
        ra.rotation(arr, 5, 3);
        for(int i = 0; i<5; i++)
            System.out.print(arr[i]+" ");
    }
}