package day14_Methods;

public class C01_MethodsUsing {
    public static void main(String[] args) {

        int taban = 5;
        int yukseklik = 3;

        double alan = alanUcgen_1(taban,yukseklik);

        System.out.println(alan);


    }

    public static void alanUcgen(double taban, double yukseklik) {

        double result = taban * yukseklik / 2;

        System.out.println(result);
    }

    public static double alanUcgen_1(double taban, double yukseklik) {

        double result = taban * yukseklik / 2;

       return result;
    }
}
