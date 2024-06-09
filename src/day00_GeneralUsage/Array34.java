package day00_GeneralUsage;

import java.util.Arrays;

public class Array34 {
    public static void main(String[] args) {
        int[] numbers = {4,3,1, 3, 1, 4, 4, 3, 1};

        System.out.println("Arrays.toString(fix34(numbers)) = " + Arrays.toString(fix34(numbers)));
    }

    /**
     * Return an array that contains exactly the same numbers as the given array,
     * but rearranged so that every 3 is immediately followed by a 4. Do not move the 3's,
     * but every other number may move. The array contains the same number of 3's and 4's,
     * every 3 has a number after it that is not a 3, and a 3 appears in the array before any 4.
     * <p>
     * <p>
     * fix34([1, 3, 1, 4]) → [1, 3, 4, 1]
     * fix34([1, 3, 1, 4, 4, 3, 1]) → [1, 3, 4, 1, 1, 3, 4]
     * fix34([3, 2, 2, 4]) → [3, 4, 2, 2]
     */

    public static int[] fix34(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3 && nums[i + 1] != 4) {
                int temp = nums[i + 1];
                for (int j = 0; j < nums.length; j++) {
                    if (j==0 && nums[j] == 4){
                        nums[i+1] = nums[j];
                        nums[j] = temp;
                        break;
                    }
                    if (nums[j] == 4 &&  nums[j-1] != 3) {
                        nums[i+1] = nums[j];
                        nums[j] = temp;
                        break;
                    }
                }
            }
        }

        return nums;
    }
}
