public class BinarySearchInSorted2dMatrix {


    static int[] findNumber(int[][] mat, int target){

        int n = mat.length, m = mat[0].length;
        int row = 0, col = m-1;

        while (row<n && col>=0){

            if (mat[row][col]==target){
                int[] res = {row, col};
                return res;
            } else if (mat[row][col]<target) {
                row++;
            }else col--;
        }

        int[] res = {-1, -1};
        return res;
    }

    public static void main(String[] args) {

        int[][] mat = {{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};
        int target = 14;

        int[] res = findNumber(mat, target);
        System.out.println(res[0]+" "+res[1]);
    }
}
