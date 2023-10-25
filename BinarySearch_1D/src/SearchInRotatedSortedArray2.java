public class SearchInRotatedSortedArray2 {

    static int search(int arr[], int n, int target){

        int low = 0, high = n-1;

        while (low<=high){
            int mid = (low+high)/2;

            if (arr[mid]==target) return mid;

            if (arr[mid] == arr[low] && arr[low] == arr[high]){
                low++;
                high--;
                continue;
            }

            if (arr[low]<=arr[mid]) // left part is sorted
            {
                if (arr[low]<=target && target<=arr[mid]) high = mid-1;
                else low = mid+1;
            }

            else // right part is sorted
            {
                if (arr[mid]<=target && target<=arr[high]) low = mid+1;
                else high = mid-1;
            }
        }

        return -1;
    }


    public static void main(String[] args) {

        int arr[] = {7, 8, 1, 2, 3, 3, 3, 4, 5, 6};
        int n = 10   , target = 1;
        int ans = search(arr, n, target);
        if (ans == -1)
            System.out.println("Target is not present.");
        else
            System.out.println("The index is: " + ans);    }
}
