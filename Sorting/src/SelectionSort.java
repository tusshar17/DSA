public class SelectionSort {


    static void sortSelection(int arr[], int n){

//        outer loop
        for (int i=0; i<n; i++){

            int minIndex = i;

            // inner loop
            for (int j=i; j<n; j++)
                if (arr[j]< arr[minIndex]) minIndex = j;

//          swap
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

    }


    public static void main(String[] args) {

        int[] arr = {13,46,24,52,20,9};

        System.out.println("Array Before Sorting:");
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        sortSelection(arr, arr.length);

        System.out.println("\nArray After Sorting:");
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
