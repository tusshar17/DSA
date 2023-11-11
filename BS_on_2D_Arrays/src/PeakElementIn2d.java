public class PeakElementIn2d {

    static int rowNumberOfMax(int[][] mat, int n, int m, int col){
        int maxRow = -1;
        int maxElement = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (mat[i][col]>maxElement){
                maxElement = mat[i][col];
                maxRow = i;
            }
        }

        return maxRow;
    }


    static int[] findPeak(int[][] mat, int n, int m){

        int low = 0, high = m-1;

        while(low<=high){
            int mid = (low+high)/2;
            int row = rowNumberOfMax(mat, n, m, mid);

            int left = mid-1>=0?mat[row][mid-1]:-1;
            int right = mid+1<m?mat[row][mid+1]:-1;
            
            if (mat[row][mid]>left && mat[row][mid]>right){
                int[] ans = {row, mid};
                return ans;
            } else if (mat[row][mid]<left) {
                high = mid-1;
            } else {
                low = mid+1;
            }
        }

        int[] ans = {-1, -1};
        return ans;
    }



    public static void main(String[] args) {

        int[][] mat = {{10,20,15},{21,30,14},{7,16,32}};
        int n = 3, m = 3;

        int[] res = findPeak(mat, n, m);
        System.out.println(res[0]+" "+res[1]);
    }
}
