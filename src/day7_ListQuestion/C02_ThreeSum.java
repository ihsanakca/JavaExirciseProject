package day7_ListQuestion;

import java.util.*;

public class C02_ThreeSum {
    public static void main(String[] args) {

        int [] intArray = {-1, 0, 1, 2, -1, -4};

        System.out.println(threeSum(intArray));

    }
    // Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0?
    // Find all unique triplets in the array which gives the sum of zero.

    // Note: The solution set must not contain duplicate triplets.

    // For example, given array S = [-1, 0, 1, 2, -1, -4],

    // A solution set is:
    // [
    //   [-1, 0, 1],
    //   [-1, -1, 2]
    // ]

    public static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> resultSet = new HashSet<>();

        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if (sum == 0){
                        List<Integer> tempList = new ArrayList<>();
                        tempList.add(nums[i]);
                        tempList.add(nums[j]);
                        tempList.add(nums[k]);
                        Collections.sort(tempList);
                        resultSet.add(tempList);
                    }
                }
            }
        }

        return new ArrayList<>(resultSet);
    }
}
