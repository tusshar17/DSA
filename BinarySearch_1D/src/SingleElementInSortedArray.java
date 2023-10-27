public class SingleElementInSortedArray {


    static int findSingleElement(int arr[], int n){

        // if n ==0
        if (n==0) return 0;

        // if first element is single
        if (arr[0]!=arr[1]) return 0;

        // if last element is single
        if (arr[n]!=arr[n-1]) return n;

        //
        int low = 1, high = n-1;
        while(low<=high){

            int mid = (low+high)/2;

            if (arr[mid]!=arr[mid-1] && arr[mid]!=arr[mid+1]) return mid;

            else if ( (mid%2==0 && arr[mid]==arr[mid+1]) || (mid%2==1 && arr[mid]==arr[mid-1]) ) {
                low = mid+1;
            }
            else {
                high = mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int arr[] = {1,1,2,2,3,3,4,5,5,6,6};
        int n = arr.length-1;

        int res = findSingleElement(arr, n);

        System.out.println("The single guy is " + arr[res] + " which is present at " + res + " index");
    }
}
