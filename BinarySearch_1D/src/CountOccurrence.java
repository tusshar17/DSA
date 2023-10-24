// Count occurrence of a number + optimal approach to find first and last occurrence of a number

public class CountOccurrence {

    static int findFirstOccurrence(int arr[], int n, int target){

        int low = 0, high = n-1;
        int first = -1;

        while(low<=high){
            int mid = (low+high)/2;
            // may be an answer
            if (arr[mid]==target){
                first = mid;
                // look for smaller index
                high = mid-1;
            } else if (arr[mid]<target) low =  mid+1; // look in right
            else  high = mid-1; // look in left
        }

        return first;

    }

    static int findLastOccurrence(int arr[], int n, int target){

        int low = 0, high = n-1;
        int last = -1;

        while(low<=high){
            int mid = (low+high)/2;
            // may be an answer
            if (arr[mid]==target){
                last = mid;
                // look for higher index
                low = mid+1;
            } else if (arr[mid]<target) low =  mid+1; // look in right
            else  high = mid-1; // look in left
        }

        return last;

    }

    static int count(int arr[], int n, int target){
        int first = findFirstOccurrence(arr, n, target);
        int last = findLastOccurrence(arr, n, target);

        if (first==-1) return -1;
        else return (last-first+1);
    }


    public static void main(String[] args) {

        int[] arr =  {2, 4, 6, 8, 8, 8, 11, 13};
        int n = 8, x = 8;
        int ans = count(arr, n, x);
        System.out.println("The number of occurrences is: " + ans);
    }
}
