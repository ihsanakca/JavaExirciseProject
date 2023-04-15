package day4_IntQuestions_String;

public class ReverseInteger {
    public static void main(String[] args) {
        int i = -2147483641;
        System.out.println(reverseInteger(i));
    }
    /*
    Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value
    to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).



Example 1:

Input: x = 123
Output: 321
Example 2:

Input: x = -123
Output: -321
Example 3:

Input: x = 120
Output: 21
     */

    public static int reverseInteger(int x) {
        int count = 0;
        if (x == -2147483648) return 0;
        if (x < 0) {
            x = Math.abs(x);
            count++;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(x));
        String str = sb.reverse().toString();
        double result = Double.parseDouble(str);
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            return 0;
        }
        if (count == 1) {
            return (int) -result;
        }
        return (int) result;
    }
}
