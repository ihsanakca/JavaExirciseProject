package day5_IntQuestions_Arrays;

import java.util.Arrays;

public class Question_3 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,5,6};
        System.out.println("findMissingNumber(nums) = " + findMissingNumber(nums));

        int[] evenNums = {6,8,10,14,16};
        System.out.println("findMissingEvenNumber(evenNums) = " + findMissingEvenNumber(evenNums));
    }

    //How would you find a missing number in an array?
    // 1,2,3,5,6-->4 or 4,6,8,12,14-->10
    public static int findMissingNumber(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i + 1] - arr[i] != 1) {
                return arr[i] + 1;
            }
        }
        return -1;
    }
    public static int findMissingEvenNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i+1] - nums[i] == 4) {
                return nums[i] + 2;
            }
        }
        return -1;
    }
}
