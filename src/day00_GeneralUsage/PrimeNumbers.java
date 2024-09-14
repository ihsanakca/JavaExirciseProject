package day00_GeneralUsage;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println("primeNumbers(100) = " + primeNumbers(100));
    }

    public static List<Integer> primeNumbers(int n) {
        List<Integer> primes = new ArrayList<>();
        primes.add(2);
        for (int i = 3; i <= n; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }
        return primes;
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i < n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
