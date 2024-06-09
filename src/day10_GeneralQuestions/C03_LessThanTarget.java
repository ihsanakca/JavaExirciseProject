package day10_GeneralQuestions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class C03_LessThanTarget {
    public static void main(String[] args) {
        int[] arr = {-2, 0, 1, 3, -1};
        System.out.println("threeSumSmaller(arr) = " + threeSumSmaller(arr, 2));
    }

    public static int threeSumSmaller(int[] nums, int target) {
        int count = 0;
              for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] < target) {
                        count++;

                    }
                }
            }
        }
        return count;
    }
}
