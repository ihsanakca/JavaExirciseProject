package day00_GeneralUsage;

public class MaxSpan {
    public static void main(String[] args) {
        int [] numbers = {1, 2, 1, 1, 3};
        System.out.println("maxSpan(numbers) = " + maxSpan(numbers));
    }

    /**
     * Consider the leftmost and righmost appearances of some value in an array.
     * We'll say that the "span" is the number of elements between the two inclusive.
     * A single value has a span of 1. Returns the largest span found in the given array.
     * (Efficiency is not a priority.)
     *
     *
     * maxSpan([1, 2, 1, 1, 3]) → 4
     * maxSpan([1, 4, 2, 1, 4, 1, 4]) → 6
     * maxSpan([1, 4, 2, 1, 4, 4, 4]) → 6
     */
    private static int maxSpan(int [] nums){
        if(nums.length == 0) return 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length-1; j >i ; j--) {
                if (nums[i] == nums[j]){
                    max = Math.max(Math.abs(i-j),max);
                }
            }
        }
        return max+1;
    }
}
