package Basic;

public class Power {

    static double myPow(double x, int n){

        double result=0;
        if(n==1){
            return x;
        }
        else if (n==0) {
            return 1;
        }
        else if (n<0) {
            int y=-n;
            result= x*myPow(x,y-1);
            return 1/result;
        }
        else{
            result= myPow(x,n/2);
            if(n%2==0){
                return result*result;
            }
            else {
                return x*result*result;
            }
        }
    }




    public static void main(String[] args) {
        System.out.println(myPow(2, -2));
    }
}
