import java.util.Arrays;
import java.util.Collections;

public class KoKoBananas {

    static int findMax(int[] arr) {
        int maxi = Integer.MIN_VALUE;;
        int n = arr.length;
        //find the maximum:
        for (int i = 0; i < n; i++) {
            maxi = Math.max(maxi, arr[i]);
        }
        return maxi;
    }

    static int calculateTotalHours(int[] arr, int k){
        int n = arr.length;
        int totalHours = 0;
        for (int i=0; i<n; i++){
            totalHours += Math.ceil((double)arr[i]/(double)k);
        }
        return totalHours;
    }

    static int findBananaPerHour(int[] arr, int h){

        int low = 1, high = findMax(arr);

        while (low<=high){
            int mid = (low+high)/2;
            int totalHours = calculateTotalHours(arr, mid);
            if (totalHours<=h){
                high = mid-1;
            } else {
                low = mid+1;
            }
        }

        return low;

    }

    public static void main(String[] args) {
        int[] arr = {7, 15, 6, 3};
        int h = 8;
        int ans = findBananaPerHour(arr, h);
        System.out.println("Koko should eat at least " + ans + " bananas/hr.");
    }
}
