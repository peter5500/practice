package binarySearch;

public class MaximumMountSequence2 {
    public static void main(String[] args) {
        int nums[] = {1,2,3,5,7,8,9,2};
        System.out.println(find(nums));
    }

    public static int find( int[] nums){

        int start = 0;
        int end = nums.length - 1;

        while( start + 1 < end){
            int mid = start + (end - start)/2;

            if (nums[mid-1] < nums[mid] && nums[mid] < nums[mid+1]){
                start = mid;
            }
            else if (nums[mid-1] > nums[mid] && nums[mid] > nums[mid+1]){
                end = mid;
            }
            else {
                return nums[mid];
            }
        }
        return nums[start] < nums[end] ? nums[end] : nums[start];
    }
}
