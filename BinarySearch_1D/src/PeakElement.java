public class PeakElement {

    static int findPeakElement(int arr[]){
        int n = arr.length-1;

        if (n==0) return 0;
        if (arr[0]>arr[1]) return 0;
        if (arr[n]>arr[n-1]) return n;

        int low = 1, high = n-1;

        while (low<=high){
            int mid = (low+high)/2;

            if (arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]) return mid;

            if (arr[mid-1]<arr[mid]){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return -1;
    }


    public static void main(String[] args) {

        int arr[] = {1,2,5,4,3,2,1};

        int peakIndex = findPeakElement(arr);

        System.out.println("The peak element is " + arr[peakIndex] + " at index " + peakIndex);
    }
}
