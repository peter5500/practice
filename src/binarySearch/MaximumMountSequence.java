package binarySearch;

public class MaximumMountSequence {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,7,2};
        System.out.println(MaxFind(nums));
    }
    public static int MaxFind(int[] nums){
        int left = 0;
        int right = nums.length-1;

        while (left + 1 < right){
            int mid1 = left + (right - left) / 2;
            int mid2 = right - (right - mid1) / 2;

            if (nums[mid1] > nums[mid2]){
                right = mid2 - 1;
            }
            if (nums[mid1] < nums[mid2]){
                left = mid1 + 1;
            }
            else{
                left = mid1;
                right = mid2;
            }
        }

        return Math.max(nums[left],nums[right]);
    }
}
