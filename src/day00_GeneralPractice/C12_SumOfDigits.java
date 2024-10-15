package day00_GeneralPractice;

public class C12_SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(10000));
    }
    /**
     * 123 -> 1+2+3 = 6
     * 598201 -> 5+9+8+2+0+1 = 25
     */

    public static int sumOfDigits(int n){
        int result = 0;
        while (n != 0){
            int lastDigit = n % 10;
            result += lastDigit;
            n /= 10;
        }
        return result;
    }
}
