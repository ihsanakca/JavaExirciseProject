package day00_GeneralPractice;

public class C13_ReverseNumber {
    public static void main(String[] args) {

        System.out.println(reverseNumber(401));
    }

    /**
     * 123 -> 321
     * 5842 -> 2485
     */
    public static int reverseNumber(int n){
        int reversed = 0;
        for (; n !=0; ) {
            int lastDigit = n % 10;
            reversed = reversed*10 + lastDigit;
            n /=10;
        }
        return reversed;
    }

    public static int reverseNumber_1(int n){
        int reversed = 0;
        while (n !=0) {
            int lastDigit = n % 10;
            reversed = reversed*10 + lastDigit;
            n /=10;
        }
        return reversed;
    }
}
