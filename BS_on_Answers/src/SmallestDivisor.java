public class SmallestDivisor {

    static int findMax(int[] arr, int n) {
        int maxi = Integer.MIN_VALUE;

        //find the maximum:
        for (int i = 0; i < n; i++) {
            maxi = Math.max(maxi, arr[i]);
        }

        int max = maxi;
        return max;
    }

    static int findSum(int[] arr, int n, int divisor){
        int sum = 0;

        for (int i = 0; i <n; i++) {
            sum += Math.ceil((double) arr[i]/ (double) divisor);
        }

        return sum;
    }

    static int findSmallestDivisor(int[] arr, int limit){

        int n = arr.length;

        if (n>limit) return -1;

        int max = findMax(arr, n);
        int low = 1, high = max;

        while(low<=high){
            int mid = (low+high)/2;
            int sum = findSum(arr, n, mid);
            if (sum<=limit){
                high = mid-1;
            } else {
                low = mid+1;
            }
        }

        return low;

    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        int limit = 8;

        int res = findSmallestDivisor(arr, limit);

        System.out.println(res);
    }
}
