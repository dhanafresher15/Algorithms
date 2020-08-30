public class PrefixSumArray{

    public void update_value(int arr[], int n, int q[][], int k) {
        int value = 10;
        for(int i=0; i<k; i++){
            int a = q[i][0], b = q[i][1];
            arr[a] += value;
            if(b+1 < n)
                arr[b+1] -= value;
        }
        int max = arr[0];
        for(int i=1; i<n; i++){
            arr[i] += arr[i-1];
        }

    }

    public static void main(String[] args) {
        int arr [] = new int[5];
        int q [][] = {{0,4}, {1,3}, {2,2}};
        PrefixSumArray psa = new PrefixSumArray();
        psa.update_value(arr, 5, q, 3);
        for(int i=0; i<5; i++)
            System.out.print(arr[i]+" ");
    }
}