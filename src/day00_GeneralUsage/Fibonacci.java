package day00_GeneralUsage;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

    private static long [] fibonacciCache;
    public static void main(String[] args) {
     //   System.out.println("fibonacciSeries(5) = " + fibonacciSeries(10));
        int n = 92;

        fibonacciCache = new long[n+1];

    //    System.out.println("nthFibonacciNumber(n) = " + nthFibonacciNumber(n));

        for (int i = 0; i <=n; i++) {
            System.out.print(nthFibonacciNumberWithCache(i)+ " ");
        }

    }

    private static List<Integer> fibonacciSeries(int n){
        List<Integer> result = new ArrayList<>();
        result.add(0);
        result.add(1);
        for (int i = 0; i <= n; i++) {
           result.add(result.get(i)+ result.get(i+1));
        }

        return result;
    }

    private static long nthFibonacciNumber(int n){

        if (n <=1){
            return n;
        }
        return (nthFibonacciNumber(n-1) + nthFibonacciNumber(n-2));
    }

    private static long nthFibonacciNumberWithCache(int n){

        if (n <=1){
            return n;
        }

        if (fibonacciCache[n] !=0){
            return fibonacciCache[n];
        }

        long nthFibonacciNumber = (nthFibonacciNumberWithCache(n-1) + nthFibonacciNumberWithCache(n-2));

        fibonacciCache[n] = nthFibonacciNumber;
        return nthFibonacciNumber;
    }

}
