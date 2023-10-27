public class NumberOfRotations {

    static int findNumberOfRotations(int arr[]){

        int low = 0, high = arr.length-1;
        int ans = Integer.MAX_VALUE;
        int index = -1;

        while (low<=high){
            int mid = (low+high)/2;

            // left part is sorted
            if (arr[low]<=arr[mid]){
                if (arr[low]<ans){
                    ans = arr[low];
                    index = low;
                }
                // eliminate left half
                low = mid+1;
            } else{ // right part is sorted
                if (arr[mid]<ans){
                    ans = arr[mid];
                    index = mid;
                }
                // eliminate right half
                high = mid-1;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2, 3};
        int ans = findNumberOfRotations(arr);
        System.out.println("The array is rotated " + ans + " times" );
    }
}
