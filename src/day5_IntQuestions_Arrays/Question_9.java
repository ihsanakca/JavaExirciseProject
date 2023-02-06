package day5_IntQuestions_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question_9 {
    public static void main(String[] args) {
        int nums[] = {9, 5, 11};
        System.out.println("missingOdd1(nums) = " + missingOdd1(nums));
        System.out.println("missingOdd2(nums) = " + missingOdd2(nums));
        System.out.println("missingOdd3(nums) = " + missingOdd3(nums));
        System.out.println("missingOdd4(nums) = " + missingOdd4(nums));
    }
    // found the missing odd number in the array ->  7,9,13,15 -->11
    public static int missingOdd1(int[] nums) {
        Arrays.sort(nums);
        int[] nums2 = new int[nums.length + 1];
        for (int i = nums[0], j = 0; i <= nums[nums.length - 1]; i++) {
            if (i % 2 == 1) {
                nums2[j++] = i;
            }
        }

        for (int i = 0; i < nums2.length; i++) {
            boolean found = false;
            for (int j = 0; j < nums.length; j++) {
                if (nums2[i] == nums[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return nums2[i];
            }
        }

        return -1;
    }

    public static int missingOdd2(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i+1] - nums[i] == 4) {
                return nums[i] + 2;
            }
        }
        return -1;
    }

    public static int missingOdd3(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] % 2 != 0 && nums[i + 1] - nums[i] > 1) {
                for (int j = nums[i] + 1; j < nums[i + 1]; j++) {
                    if (j % 2 != 0) {
                        return j;
                    }
                }
            }
        }
        return -1;
    }

    public static int missingOdd4(int[] nums) {
        Arrays.sort(nums);
        List<Integer> numsList = new ArrayList<>();
        List<Integer> numsList2 = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            numsList.add(nums[i]);
        }
        for (int i = nums[0]; i <= nums[nums.length - 1]; i++) {
            if (i % 2 == 1) {
                numsList2.add(i);
            }
        }
        numsList2.removeAll(numsList);
        if (!numsList2.isEmpty()) {
            return numsList2.get(0);
        } else {
            return -1;
        }
    }
}
