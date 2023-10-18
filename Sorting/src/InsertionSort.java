public class InsertionSort {


    static void sortInsertion(int arr[], int n){

        for (int i=0; i<n; i++){

            int currentIndex = i;
            int j = i-1;

            while (j>=0){
                if(arr[currentIndex]<arr[j]){
                    int temp = arr[currentIndex];
                    arr[currentIndex] = arr[j];
                    arr[j] = temp;
                    currentIndex = j;
                }
                j--;
            }

        }
    }


    public static void main(String[] args) {

        int[] arr = {13,46,24,52,20,9};

        System.out.println("Array Before Sorting:");
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        sortInsertion(arr, arr.length);

        System.out.println("\nArray After Sorting:");
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
