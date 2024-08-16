package day11_recursion;

public class C001_Factorial {
    public static void main(String[] args) {
        System.out.println("factorial(5) = " + factorial(5));
    }

    public static int factorial(int n){
        if (n == 0) { // Temel durum
            return 1;
        } else { // Rekürsif durum
            return n * factorial(n - 1);
        }
    }
}
