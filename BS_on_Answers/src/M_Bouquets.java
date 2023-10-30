public class M_Bouquets {

    static int[] findMinMax(int[] arr) {
        int maxi = Integer.MIN_VALUE;
        int mini = Integer.MAX_VALUE;

        int n = arr.length;
        //find the maximum:
        for (int i = 0; i < n; i++) {
            maxi = Math.max(maxi, arr[i]);
            mini = Math.min(mini, arr[i]);
        }

        int[] min_max = {mini, maxi};
        return min_max;
    }


    static boolean canMakeBouquets(int[] arr, int x, int m, int k){
        int N = arr.length;
        int flowerCount = 0;
        int bouquetCount = 0;

        for (int i=0; i<N; i++){
            if (arr[i]<=x){
                flowerCount++;
                if (flowerCount==k){
                    flowerCount = 0;
                    bouquetCount++;
                }
            } else flowerCount = 0;
        }

        if (bouquetCount>=m) return true;

        return false;
    }

    static int minimumDays(int[] arr, int m, int k){
        int N = arr.length;
        // k -> no. of flowers in each bouquet
        // m -> no. of required bouquets

        if (N < k*m) return -1;

        int low = findMinMax(arr)[0], high = findMinMax(arr)[1];


        while (low<=high){
            int mid = (low+high)/2;
            if (canMakeBouquets(arr, mid, m, k)){
                high = mid-1;
            } else{
                low = mid+1;
            }

        }

        return low;

    }

    public static void main(String[] args) {

        int[] arr = {7, 7, 7, 7, 13, 11, 12, 7};
        int m = 2, k = 3;

        int res = minimumDays(arr, m, k);

        System.out.println(res);

    }
}
