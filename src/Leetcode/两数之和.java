package Leetcode;

public class 两数之和 {
    public static void main(String[] args) {
        两数之和 solutio = new 两数之和();
        int[] nums = {3, 2, 4};
        int[] result = solutio.twoSum(nums, 6);
        System.out.println("[" + result[0] + "," + result[1] + "]");
    }

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                System.out.println(nums[i]+nums[j]);
                if ((nums[i] + nums[j]) == target && i != j) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }

        return result;
    }
}
