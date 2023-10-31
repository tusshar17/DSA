public class CapacityToShipPackages {

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

    static boolean canBeShipped(int[] arr, int n, int capacity, int days){
        int currentLoad = 0;
        int numberOfDays = 1;

        for (int i = 0; i < n; i++) {

            if ((currentLoad+arr[i])<=capacity){
                currentLoad += arr[i];
            }
            else {
                numberOfDays++;
                currentLoad = arr[i];
            }

        }

        return numberOfDays<=days;

    }

    static int findCapacity(int[] arr, int d){

        int n = arr.length;
        int[] max_and_sum = find_max_and_sum(arr, n);

        int low = max_and_sum[0], high = max_and_sum[1];

        while (low<=high){
            int mid = (low+high)/2;
            if (canBeShipped(arr, n, mid, d)){
                high = mid-1;
            } else {
                low = mid+1;
            }
        }

        return low;

    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,1,1};
        int d = 4;

        int res = findCapacity(arr, d);
        System.out.println(res);
    }
}
