public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int i, j = 0;
        int sum = 0;
        for (i = 0; i < nums.length; i++) {
            for (j = i + 1; j < nums.length; j++) {
                sum = nums[i] + nums[j];
                if(sum == target) {
                   int[] ans = {i, j};
                   System.out.println( "[" + ans[0] + "," + ans[1] + "]");
                   return ans;
                }
            }

        }
        return null;
    }

    public static void main(String[] args) {
        int[][] nums = {{2,7,11,15},{3,2,4},{3,3}};
        int[] target = {9, 6, 6};
        TwoSum sum = new TwoSum();
        for (int i = 0; i < target.length; i++) {
            sum.twoSum(nums[i], target[i]);
        }
    }
}
