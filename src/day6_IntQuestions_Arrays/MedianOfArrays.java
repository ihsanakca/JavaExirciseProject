package day6_IntQuestions_Arrays;

import java.util.Arrays;

public class MedianOfArrays {
    public static void main(String[] args) {
        int[] nums1 = {1, 2};
        int[] nums2 = {3,4};
        System.out.println(medianOfArrays(nums1, nums2));
    }

    public static double medianOfArrays(int[] nums1, int[] nums2) {
        int[] totalArr = new int[nums1.length + nums2.length];
        for (int i = 0; i < totalArr.length; i++) {
            if (i < nums1.length) {
                totalArr[i] = nums1[i];
            } else {
                totalArr[i] = nums2[i - nums1.length];
            }
        }
        Arrays.sort(totalArr);
        if (totalArr.length % 2 == 1) {
            return totalArr[totalArr.length / 2];
        }
        double i = totalArr[totalArr.length / 2];
        double x = totalArr[totalArr.length / 2 - 1];

        return (i+x)/2;
    }
}
