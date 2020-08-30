public class WindowSliding {

    public int maximumSum (int arr[], int n, int k) {
        int max_sum = 0, i;
        for(i=0; i<k; i++)
            max_sum += arr[i];

        int cur_sum = max_sum;
        for(; i<n; i++){
            cur_sum += arr[i] - arr[i - k];
            max_sum = Math.max(cur_sum, max_sum);
        }
        return max_sum;
    }
    public static void main(String[] args) {
        int arr[] ={6, 3, -2, 1, 4};
        WindowSliding ws = new WindowSliding();
        System.out.println(ws.maximumSum(arr, 5, 3));
    }
}