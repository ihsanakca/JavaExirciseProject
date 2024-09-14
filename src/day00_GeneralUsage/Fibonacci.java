package day00_GeneralUsage;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("fibonacciSeries(5) = " + fibonacciSeries(10));
    }

    public static List<Integer> fibonacciSeries(int n){
        List<Integer> result = new ArrayList<>();
        result.add(0);
        result.add(1);
        for (int i = 0; i <= n; i++) {
           result.add(result.get(i)+ result.get(i+1));
        }

        return result;
    }
}
