import java.util.ArrayList;

public class MergeSort {

    public static void merge(int[] arr, int low, int mid, int high){
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid+1;

        while (left <= mid && right <= high){
            if (arr[left]<=arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                right++;
            }
        }

        while (left<=mid){
            temp.add(arr[left]);
            left++;
        }

        while (right<=high){
            temp.add(arr[right]);
            right++;
        }

        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }

    static void sortMerge(int arr[], int low, int high){
        if (low >= high) return;
        int mid = (low+high)/2;
        sortMerge(arr, low, mid);
        sortMerge(arr, mid+1, high);
        merge(arr, low, mid, high);

    }

    public static void main(String[] args) {
        int[] arr = {13,46,24,52,20,9};

        System.out.println("Array Before Sorting:");
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        sortMerge(arr, 0, arr.length-1);

        System.out.println("\nArray After Sorting:");
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
