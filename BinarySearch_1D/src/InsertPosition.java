public class InsertPosition {

    static int findInsertPosition(int arr[], int x){
        int n = arr.length;
        int ans = n;
        int low = 0, high = n-1;

        while (low<=high){
            int mid = (low+high)/2;

            if (arr[mid]>x){
                ans = mid;
                high = mid-1;
            } else if (arr[mid]==x) return mid;
                else low = mid+1;
        }

        return ans;
    }

    public static void main(String[] args) {

        int arr[] = {1,2,4,7,9};
        int x= 8;

        int res = findInsertPosition(arr, x);
        System.out.println(x+" is present at or can be inserted at : "+res);

    }
}
