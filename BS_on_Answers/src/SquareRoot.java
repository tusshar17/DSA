public class SquareRoot {

    static int findSquareRoot(int n){
        int low = 1, high = n;
        int ans = 0;

        while (low<=high){
            int mid = (low+high)/2;
            if (mid*mid<=n){
                ans = mid;
                low = mid+1;
            }
            else high = mid-1;
        }

        return ans;
    }

    public static void main(String[] args) {
        int n = 28;
        int ans = findSquareRoot(n);
        System.out.println("Square Root of " + n + " is " + ans);
    }
}
