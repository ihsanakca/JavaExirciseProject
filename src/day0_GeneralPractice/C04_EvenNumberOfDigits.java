package day0_GeneralPractice;

public class C04_EvenNumberOfDigits {
    public static void main(String[] args) {
        int [] numbers = {1000,-1001,-1002,1003,1004,1005,10001};
        System.out.println("evenNumberOfDigits(numbers) = " + evenNumberOfDigits(numbers));
    }
    public static int evenNumberOfDigits(int [] nums){
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Math.abs(nums[i]);
        }
        int count = 0;
        for (int n : nums){
            String s = String.valueOf(n);
            if (s.length() % 2 == 0){
                count++;
            }
        }
        return count;
    }
}
