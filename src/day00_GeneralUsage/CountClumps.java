package day00_GeneralUsage;

import java.util.Set;

public class CountClumps {
    public static void main(String[] args) {
        int[] numbers = {1, 1, 1, 2, 1, 1, 2, 1, 1};
        System.out.println("countClumps(numbers) = " + countClumps_2(numbers));

    }

    /**
     * Say that a "clump" in an array is a series of 2 or more adjacent elements of the same value.
     * Return the number of clumps in the given array.
     * <p>
     * <p>
     * countClumps([1, 2, 2, 3, 4, 4]) → 2
     * countClumps([1, 1, 2, 1, 1]) → 2
     * countClumps([1, 1, 1, 1, 1]) → 1
     */

    private static int countClumps(int[] nums) {
        int count = 0;
        boolean isClump = false;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                if (!isClump) {
                    isClump = true;
                    count++;
                }
            } else {
                isClump = false;
            }
        }

        return count;
    }

    private static int countClumps_1(int[] nums) {
        int clumps = 0;
        int i = 0;

        while (i < nums.length) {
            if (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                clumps++;
                // Skip all elements in this clump
                while (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                    i++;
                }
            }
            i++;
        }

        return clumps;
    }

    private static int countClumps_2(int[] nums) {
        int count = 0;
        boolean flag = false;

        for (int i = 0; i < nums.length -1;i++ ) {
            if (nums[i] == nums[i + 1]) {
                if (!flag) {
                    flag = true;
                    count++;
                }

            } else {
                flag = false;
            }
        }
        return count;
    }


}
