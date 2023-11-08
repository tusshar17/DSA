public class RowWithMaximumOnes {


    static int findLowerBound(int arr[],int n, int x){

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


    static int findRow(int[][] mat, int n, int m){

        int indexOfRow = -1;
        int countOfOnes = 0;

        for (int i=0; i<n; i++){

            int countOfOnesCurrRow = m - findLowerBound(mat[i], m, 1);

            if (countOfOnesCurrRow>countOfOnes){
                indexOfRow = i;
                countOfOnes = countOfOnesCurrRow;
            }

        }

        return indexOfRow;

    }


    public static void main(String[] args) {
        int[][] mat = {{1, 1, 1}, {0, 0, 1}, {0, 0, 0}};
        int n = 3, m = 3;
        
        int res = findRow(mat, n, m);
        System.out.println(res);
    }
}
