package day20_recursion;

public class C03_Factorial {

    public static void main(String[] args) {


        // 1. Java runtime referansını al
        Runtime runtime = Runtime.getRuntime();

        // 2. Hafıza kullanımını ölçmeden önce çöpleri temizle
        runtime.gc();

        // 3. Başlangıç hafıza kullanımını al
        long beforeUsedMem = runtime.totalMemory() - runtime.freeMemory();

        // 4. Hafızasını ölçmek istediğiniz metodu çalıştırın
        System.out.println(factorial(10));
        System.out.println(factorialIteratively(10));

        // 5. Metot çalıştıktan sonraki hafıza kullanımını al
        long afterUsedMem = runtime.totalMemory() - runtime.freeMemory();

        // 6. Hafıza farkını hesapla
        long memoryUsed = afterUsedMem - beforeUsedMem;

        System.out.println("Method memory usage: " + memoryUsed + " bytes");
        //922872 bytes  1.nci
        //1384272 bytes  2.nci
    }

    private static int factorial(int n) {
        if (n == 1)
            return n;
        else
            return n * factorial(n - 1);
    }

    private static int factorialIteratively(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }


}
