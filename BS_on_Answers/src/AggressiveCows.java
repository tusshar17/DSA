import java.util.Arrays;

public class AggressiveCows {


    static boolean canWePlace(int[] arr, int n, int distance, int k) {
        int cowsCount = 1;
        int last = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i]-last>=distance){
                cowsCount++;
                last = arr[i];
            }
            if (cowsCount>=k) return true;
        }

        return false;

    }

    static int findMaxOfMinDistance(int[] arr, int k){

        int n = arr.length;
        Arrays.sort(arr);

        int low = 1, high = arr[n-1] - arr[0];

        while (low<=high){
            int mid = (low+high)/2;
            if (canWePlace(arr, n, mid, k)){
                low = mid+1;
            } else {
                high = mid-1;
            }
        }

        return high;
    }


    public static void main(String[] args) {

        int[] arr = {0,3,4,7,10,9};
        int k = 4;

        int res = findMaxOfMinDistance(arr, k);
        System.out.println(res);
    }
}
