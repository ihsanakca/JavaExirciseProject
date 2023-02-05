package day4_IntQuestions_String;

public class Question_2 {
    public static void main(String[] args) {

        System.out.println("isPrime(\"5\") = " + isPrime("5"));
        System.out.println("isPrime(\"21\") = " + isPrime("21"));
        System.out.println("isPrime(\"3803\") = " + isPrime("3803"));

    }

    //How would you determine if a number is a prime number in a string?
    public static boolean isPrime(String str) {
        int i = Integer.parseInt(str);
        if (i == 2) return true;
        for (int j = 2; j < i; j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }
}
