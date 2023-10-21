public class LowerBound {

    //arr[ans]>=x

    static int findLowerBound(int arr[], int x){

        int n = arr.length;
        int ans = n+1;
        int low = 0, high = n-1;

        while (low<=high){
            int mid = (low+high)/2;

            if (arr[mid]>=x){
                ans = mid;
                high = mid-1;
            } else low = mid+1;
        }

        return ans;

    }

    public static void main(String[] args) {

        int arr[] = {3,5,8,15,19};
        int x = 9;

        int res = findLowerBound(arr, x);

        System.out.println("Lower Bound of " + x + " is : " + arr[res] + " at index " + res);

    }
}
