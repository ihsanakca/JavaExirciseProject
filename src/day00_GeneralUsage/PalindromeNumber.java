package day00_GeneralUsage;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindromeNumber(121));
    }

    public static boolean isPalindromeNumber (int n){
        int original = n;
        if (n<0) return false;
        int reverse = 0;
         while(n > 0){
             int lastDigit = n % 10;
             reverse = reverse*10 + lastDigit;
             n /=10;
         }
        System.out.println(reverse);
        return original == reverse;
    }
}
