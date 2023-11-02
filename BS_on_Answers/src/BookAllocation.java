public class BookAllocation {

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

    static int findNumberStudents(int[] arr, int n, int mid){
        int students = 1;
        int pages = 0;

        for (int i = 0; i < n; i++) {
            if (pages+arr[i] <= mid){
                pages += arr[i];
            } else {
                students++;
                pages = arr[i];
            }
        }

        return students;
    }

    static int countMaxPages(int[] arr, int m){

        int n = arr.length;

        if (m>n) return -1;

        int[] max_and_sum = find_max_and_sum(arr, n);

        int low = max_and_sum[0], high = max_and_sum[1];

        while (low <= high){
            int mid = (low+high)/2;
            int numberOfStudents = findNumberStudents(arr, n, mid);
            if (numberOfStudents > m){
                low = mid+1;
            } else {
                high = mid-1;
            }
        }

        return low;
    }

    public static void main(String[] args) {

        int[] arr = {12, 34, 67, 90};
        int m = 2;

        int res = countMaxPages(arr, m);
        System.out.println(res);
    }
}
