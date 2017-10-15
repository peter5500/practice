package binarySearch;

public class FindPeakElement {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,2,7,8,3};
        System.out.println(find(nums));
    }
    public static int find(int[] nums){

        if (nums.length < 3){
            return 0;
        }

        int start = 1;
        int end = nums.length-2;
        while (start + 1 < end){
            int mid = start + (end - start) / 2;

            if (nums[mid] < nums[mid+1]){
                start = mid;
            }
            else if (nums[mid-1] > nums[mid]){
                end = mid;
            }
            else if (nums[mid-1] < nums[mid] && nums[mid] < nums[mid+1]){
                return mid;
                }
            else {
                start = mid;
            }

        }
        return nums[start] < nums [end] ? end:start;
    }
}
