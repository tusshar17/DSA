public class MinimumInRotatedSorted {

    static int findMinimum(int arr[]){

        int low = 0, high = arr.length-1;
        int ans = Integer.MAX_VALUE;

        while (low<=high){
            int mid = (low+high)/2;

            // left part is sorted
            if (arr[low]<=arr[mid]){
                ans = Math.min(ans, arr[low]);
                // eliminate left half
                low = mid+1;
            } else{ // right part is sorted
                ans = Math.min(ans, arr[mid]);
                // eliminate right half
                high = mid-1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2, 3};
        int ans = findMinimum(arr);
        System.out.println("The minimum element is: " + ans );
    }
}
