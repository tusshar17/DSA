public class BinarySearch {

    static int searchBinary(int arr[], int x, int low, int high){
        int mid = (low+high)/2;

        if (arr[mid]==x) return mid;

        if(low>high) return -1;
        else if (x<arr[mid]) return searchBinary(arr, x, low, mid-1);
        return searchBinary(arr, x, mid+1, high);
    }

    public static void main(String[] args) {

        int[] arr = {13,46,24,52,20,9};
        int x = 24;

        int res = searchBinary(arr, x, 0, arr.length-1);

        if (res>=0) System.out.println(x+" is present at "+res+" index.");
        else System.out.println(x+"is not in the given array.");
    }
}
