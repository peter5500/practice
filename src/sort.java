public class sort {

    int[] nums = {5,7,-2,4,9};
    int temp;

    public static void main(String[] args) {
        sort t = new sort();
        t.select();

    }
    public void select(){
        for (int i = 0; i < nums.length - 1; i++){
            int min = nums[i];
            int minIndex = i;

            for (int j = i+1; j < nums.length; j++){
                if (min > nums[j]){
                    min = nums[j];
                    minIndex = j;
                }
            }
            temp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = temp;

        }
        for (int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }
    }

    public void bubble(){
        for (int i = 0; i < nums.length - 1; i++){
            for (int j = 0; j < nums.length - 1 - i; j++){
                if (nums[j] > nums[j + 1]){
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }
    }
}
