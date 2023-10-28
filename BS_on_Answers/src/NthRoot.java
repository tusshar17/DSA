public class NthRoot {

    static int findPow(int x, int n){
        int res = 1;
        for (int i=0; i<n; i++){
            res*=x;
        }
        return res;
    }

    static int findNthRoot(int n, int m){
        int low = 1, high = m;
        int ans = -1;

        while (low<=high){
            int mid = (low+high)/2;
            if (findPow(mid,n)==m){
                return mid;
            } else if (findPow(mid, n)>m) {
                high = mid-1;
            } else {
                low = mid+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 4, m = 69;
        int ans = findNthRoot(n, m);
        System.out.println(n + " Root of " + m + " is " + ans);
    }
}
