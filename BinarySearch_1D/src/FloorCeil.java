public class FloorCeil {

    static int findFloor(int arr[], int x){

        int n = arr.length;
        int ans = n;
        int low = 0, high = n-1;

        while (low<=high){
            int mid = (low+high)/2;

            if (arr[mid]<=x){
                ans = mid;
                low = mid+1;
            } else high = mid-1;
        }

        return ans;

    }

    static int findCeil(int arr[], int x){

        int n = arr.length;
        int ans = n;
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

        int arr[] = {3, 4, 4, 7, 8, 10};
        int x = 5;

        int ceil = arr[findCeil(arr, x)];
        int floor = arr[findFloor(arr, x)];

        System.out.println("Ceiling of "+x+" is: "+ceil);
        System.out.println("Floor of "+x+" is: "+floor);
    }
}
