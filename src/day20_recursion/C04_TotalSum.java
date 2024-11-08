package day20_recursion;

public class C04_TotalSum {
    public static void main(String[] args) {
        System.out.println(totalSum(10));
        System.out.println(totalSum_1(10));
    }

    private static int totalSum(int n){
        if (n==1) return n;
        return n+totalSum(n-1);
    }

    private static int totalSum_1(int n){
        return n*(n+1)/2;
    }
}
