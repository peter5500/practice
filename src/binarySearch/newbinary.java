package binarySearch;

public class newbinary {

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 7};

        System.out.println(binarySearch(A, 5));
    }

    public static int binarySearch(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left + 1 < right) {
            int mid = (left + right) / 2;

            if (nums[mid] < target ) {
                left = mid;
            }
            if( nums[mid] > target ) {
                right = mid;
            }
            if (nums[mid] == target ) {
                return mid;
            }
        }

        return Math.abs(target - nums[left]) < Math.abs(target - nums[right]) ? left : right;


    }
}
