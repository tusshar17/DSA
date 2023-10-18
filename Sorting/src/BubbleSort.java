public class BubbleSort {

    static void sortBubble(int arr[], int n){

        for (int i=n; i>0; i--){

            for (int j=0; j<i-1; j++){
                if (arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

    }

    public static void main(String[] args) {

        int[] arr = {13,46,24,52,20,9};

        System.out.println("Array Before Sorting:");
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        sortBubble(arr, arr.length);

        System.out.println("\nArray After Sorting:");
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
