public class QuickSort {

    static int partitionFunction(int arr[], int low, int high){
        int pivotIndex = low;
        int lowIndex = low;
        int highIndex = high;

        while(lowIndex<highIndex){
            while (arr[lowIndex]<=arr[pivotIndex] && lowIndex<=high-1){
                lowIndex++;
            }
            while (arr[highIndex]>=arr[pivotIndex] && highIndex>=low+1){
                highIndex--;
            }
            if (lowIndex<highIndex){
                int temp = arr[lowIndex];
                arr[lowIndex] = arr[highIndex];
                arr[highIndex] = temp;
            }
        }
        int temp = arr[low];
        arr[low] = arr[highIndex];
        arr[highIndex] = temp;
        return highIndex;
    }

    static void sortQuick(int arr[], int low, int high){

        if( low < high){
            int partitionIndex = partitionFunction(arr, low, high);
            sortQuick(arr, low, partitionIndex-1);
            sortQuick(arr, partitionIndex+1, high);
        }
    }

    public static void main(String[] args) {

        int[] arr = {13,46,24,52,20,9};

        System.out.println("Array Before Sorting:");
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        sortQuick(arr, 0, arr.length-1);

        System.out.println("\nArray After Sorting:");
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
