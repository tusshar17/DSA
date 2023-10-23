public class FirstAndLastOccurrence {

    static int BinarySearch(int[] nums, int target, int low, int high){
        int mid = (low+high)/2;
        if(low>high) return -1;
        if(nums[mid]==target) return mid;
        else if(nums[mid]<target) return BinarySearch(nums, target, mid+1, high);
        return BinarySearch(nums, target, low, mid-1);
    }

    public static int[] searchRange(int[] nums, int target) {
        int BinaryRes = BinarySearch(nums, target, 0, nums.length-1);

        if(BinaryRes==-1){
            int output[] = {-1, -1};
            return output;
        }

        else{
            int startIndex = BinaryRes;
            int endIndex = BinaryRes;

            while(startIndex-1>=0 && nums[startIndex-1]==target){
                startIndex--;
            }
            while(endIndex+1<nums.length && nums[endIndex+1]==target){
                endIndex++;
            }

            int output[] = {startIndex, endIndex};
            return output;
        }
    }

    public static void main(String[] args) {
        int arr[] = {3,4,13,13,13,20,40};
        int x = 13;

        int res[] = searchRange(arr, x);

        System.out.println(x+"in given array start from "+res[0]+" index and till "+res[1]+" index");

    }
}
