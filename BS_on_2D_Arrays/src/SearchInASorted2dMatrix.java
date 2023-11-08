public class SearchInASorted2dMatrix {


    // good approach
    static int binarySearch(int[] arr, int m, int target){

        int low = 0, high = m-1;

        while (low<=high){
            int mid = (low+high)/2;

            if (arr[mid] == target) return mid;

            if (arr[mid]<target){
                low = mid+1;
            }
            else high = mid-1;
        }

        return -1;

    }

    static boolean isElementPresent(int[][] matrix, int n, int m, int target){

        for (int i = 0; i < n; i++) {
            if (matrix[i][0] <= target && matrix[i][m-1]>=target){
                int indexOfTarget = binarySearch(matrix[i], m, target);
                if (indexOfTarget!=-1) return true;
            }
        }

        return false;
    }


    // optimal approach
    static boolean isTargetPresent(int[][] matrix, int n, int m, int target){

        int low = 0, high = (n*m)-1;

        while (low<=high){
            int mid = (low+high)/2;
            int row = mid/m, column = mid%m;

            if (matrix[row][column]==target) return true;
            else if (matrix[row][column]<target) low = mid+1;
            else high = mid -1;
        }

        return false;
    }

    public static void main(String[] args) {

        int[][] matrix = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};
        int n = 3, m = 4, target=8;

        boolean res = isElementPresent(matrix, n, m, target);
        System.out.println(res);

        System.out.println("---------------");

        System.out.println("Using optimal approach:");
        boolean res1 = isTargetPresent(matrix, n, m, target);
        System.out.println(res1);

    }
}
