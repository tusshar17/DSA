public class UpperBound {

    //arr[ans]>=x

    static int findUpperBound(int arr[], int x){

        int n = arr.length;
        int ans = n;
        int low = 0, high = n-1;

        while (low<=high){
            int mid = (low+high)/2;

            if (arr[mid]>x){
                ans = mid;
                high = mid-1;
            } else low = mid+1;
        }

        return ans;

    }

    public static void main(String[] args) {

        int arr[] = {3,5,8,9,15,19};
        int x = 9;

        int res = findUpperBound(arr, x);

        System.out.println("Upper Bound of " + x + " is : " + arr[res] + " at index " + res);

    }
}
