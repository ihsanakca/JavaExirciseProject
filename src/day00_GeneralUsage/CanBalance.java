package day00_GeneralUsage;

public class CanBalance {
    public static void main(String[] args) {
        int[] numbers = {2, 1, 1, 2, 1};
        System.out.println("canBalance(numbers) = " + canBalance(numbers));
        System.out.println("canBalance_1(numbers) = " + canBalance_1(numbers));

    }

    /**
     * Given a non-empty array, return true if there is a
     * place to split the array so that the sum of the numbers on
     * one side is equal to the sum of the numbers on the other side.
     * <p>
     * <p>
     * canBalance([1, 1, 1, 2, 1]) → true
     * canBalance([2, 1, 1, 2, 1]) → false
     * canBalance([10, 10]) → true
     */

    public static boolean canBalance(int[] nums) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < nums.length; i++) {
            sum1 += nums[i];
            for (int j = nums.length - 1, k = 1; j >= 0; j--, k++) {
                sum2 += nums[j];
                if (sum1 == sum2 && (i + k) == nums.length - 1) return true;
            }
            sum2 = 0;
        }
        return false;
    }

    public static boolean canBalance_1(int[] nums) {
        int totalSum = 0;
        int leftSum = 0;

        // Calculate the total sum of all elements in the array
        for (int num : nums) {
            totalSum += num;
        }

        // Iterate through the array and keep track of the left sum,
        // if left sum equals totalSum - leftSum, then the array is balanced
        for (int num : nums) {
            leftSum += num;
            if (leftSum == totalSum - leftSum) {
                return true;
            }
        }

        // If no such point is found, return false
        return false;

    }

}
