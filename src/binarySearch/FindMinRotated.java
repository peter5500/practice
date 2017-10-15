package binarySearch;

public class FindMinRotated {
    public static void main(String[] args) {
        int [] nums = {4,6,7,9,1,3};
        System.out.println(find(nums));
    }
    public static int find(int[] nums){
        if (nums.length == 0 ){
            return 0;
        }

        if (nums.length == 1){
            return nums[0];
        }
        else if (nums.length == 2){
            return Math.max( nums[0], nums[1]);
        }

        int left = 0;
        int right = nums.length - 1;

        while (left + 1 < right){
            int mid = left + (right - left) / 2;

            if (nums[mid] < nums[right] && nums[mid] > nums[left]){
                return nums[0];
            }
            if (nums[left] < nums[mid]){
                left = mid;
            }else{
                right = mid;
            }
        }
        return nums[right];


    }
}
