public class SplitArrayLargestSum {

    static int[] find_max_and_sum(int[] arr, int n){
        int maxi = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            maxi = Math.max(maxi, arr[i]);
            sum += arr[i];
        }

        int[] max_and_sum = {maxi, sum};
        return max_and_sum;
    }

    static int countPartitions(int[] arr, int n, int mid){
        int partitions = 1;
        int subArraySum = 0;

        for (int i = 0; i < n; i++) {
            if (subArraySum+arr[i] <= mid){
                subArraySum += arr[i];
            } else {
                partitions++;
                subArraySum = arr[i];
            }
        }

        return partitions;
    }

    static int largestSubArraysSumMinimized(int[] arr, int m){

        int n = arr.length;

        if (m>n) return -1;

        int[] max_and_sum = find_max_and_sum(arr, n);

        int low = max_and_sum[0], high = max_and_sum[1];

        while (low <= high){
            int mid = (low+high)/2;
            int numberOfPartitions = countPartitions(arr, n, mid);
            if (numberOfPartitions > m){
                low = mid+1;
            } else {
                high = mid-1;
            }
        }

        return low;
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        int m = 3;

        int res = largestSubArraysSumMinimized(arr, m);
        System.out.println(res);
    }
}
