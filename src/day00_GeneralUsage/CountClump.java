package day00_GeneralUsage;

public class CountClump {
    public static void main(String[] args) {
        /**
         * Say that a "clump" in an array is a series of 2 or more adjacent elements of the same value.
         * Return the number of clumps in the given array.
         * examples :
         * countClumps([1, 2, 2, 3, 4, 4]) → 2
         * countClumps([1, 1, 2, 1, 1]) → 2
         * countClumps([1, 1, 1, 1, 1]) → 1
         */
        int[] nums = {1, 1, 1, 2, 2, 3, 4, 4, 1, 1, 1, 1, 1, 4, 3, 2, 1};

        System.out.println("countClumps(nums) = " + countClumps(nums));
    }

    public static int countClumps(int[] nums) {
        int count = 0;
        boolean inClumps = false;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                if (!inClumps) {
                    count++;
                    inClumps = true;
                }
            } else {
                inClumps = false;
            }
        }
        return count;
    }
}
