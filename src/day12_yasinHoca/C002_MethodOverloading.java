package day12_yasinHoca;

public class C002_MethodOverloading {
    public static void main(String[] args) {

        System.out.println("ikiRakamToplama(9,19) = " + toplama(9, 19));
        System.out.println("toplama(3,6,98) = " + toplama(3, 6, 98));
        System.out.println("toplama(3,6,55.8) = " + toplama(3, 6, 55.8));
        System.out.println("toplama(2,2) = " + toplama(2, 2));



    }
    public static int toplama (int a , int b){
        return a+b;
    }
    public static long toplama (int b , int a , long c){
        return a+b+c;
    }
    public static int toplama (int a , int b, int c){
        return a+b+c;
    }
    public static double toplama (int a , int b, double c){
        return a+b+c;
    }

    public static double toplama (int a , double b, int c){
        return a+b+c;
    }
}
