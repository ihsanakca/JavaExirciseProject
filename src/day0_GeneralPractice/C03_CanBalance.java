package day0_GeneralPractice;

public class C03_CanBalance {
    public static void main(String[] args) {
        int[] nums = {2, 2};
        System.out.println("canBalance(nums) = " + canBalance(nums));
    }

    /**
     * Given a non-empty array, return true if there is a place to split the array so that
     * the sum of the numbers on one side is equal to the sum of the numbers on the other side.
     * <p>
     * canBalance([1, 1, 1, 2, 1]) → true
     * canBalance([2, 1, 1, 2, 1]) → false
     * canBalance([10, 10]) → true
     */
    public static boolean canBalance(int[] nums) {
        int totalSum = 0;
        int leftSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        for (int i = 0; i < nums.length; i++) {
            leftSum += nums[i];

            if (leftSum == totalSum - leftSum) {
                return true;
            }
        }
        return false;
    }

}
