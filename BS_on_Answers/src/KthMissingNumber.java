public class KthMissingNumber {

    static int findNumber(int[] arr, int k){

        int n = arr.length;

        int low = 0, high = n-1;

        while (low<=high){
            int mid = (low+high)/2;
            int missingNumbers = arr[mid]-(mid+1);

            if (missingNumbers<k) low = mid+1;
            else high = mid-1;
        }

        return low+k;
    }

    public static void main(String[] args) {
        int[] arr = {4,7,9,10};
        int k = 4;

        int res = findNumber(arr, k);
        System.out.println(res);
    }
}
