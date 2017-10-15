package binarySearch;

public class Search2DMatrix {

    public static void main(String[] args) {
        int[][] nums = {{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12}};
        System.out.println(searchMatrix(nums, 0));

    }

    public static boolean searchMatrix(int[][] nums, int target) {

//定義row
        int left = 0, right = nums.length - 1;
        while (left + 1 < right) {
            int mid = (left + right) / 2;
            if (nums[mid][0] < target) {
                left = mid;
            } else if (nums[mid][0] > target) {
                right = mid;
            } else {
                return true;
            }
        }

//exception 最後一列
        int targetRow = left;
        if (nums[right][0] < target) {
            targetRow = nums.length - 1;
        }

// 定義coloumn
        left = 0;
        right = nums[0].length - 1;

        while (left + 1 < right) {
            int mid = (left + right) / 2;
            if (nums[targetRow][mid] < target) {
                left = mid;
            } else if (nums[targetRow][mid] > target) {
                right = mid;
            } else {
                return true;
            }
        }

//每一行的exception頭尾
        if (nums[targetRow][right] == target) {
            return true;
        }

        if (nums[targetRow][left] == target) {
            return true;
        }

        return false;

    }

}
