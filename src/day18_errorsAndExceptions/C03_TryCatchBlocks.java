package day18_errorsAndExceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C03_TryCatchBlocks {
    public static void main(String[] args) {
        System.out.println("------------Unchecked Exceptions-------------");

        System.out.println("Test 1 başladı..");

        int i = 25;
        int j = 0;

        try {
            System.out.println(i/j);
        } catch (ArithmeticException e) {
            System.out.println("1. catch blok çalıştı.");
            System.out.println(j/i);
            System.err.println(e.getMessage());
            e.printStackTrace();

        }

        System.out.println("Test 1 bitti..");


        System.out.println("Test 2 başladı..");


        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\ihsan\\OneDrive\\Masaüstü\\sss.txt");
            System.out.println("dosya bulundu");
        } catch (FileNotFoundException e) {

            System.out.println("dosya bulunamadı..");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }


        System.out.println("Test 2 bitti..");


        System.out.println("Test 3 başladı..");

        try {
            Thread.sleep(-5000);
        } catch (Exception e) {
            System.out.println("Test 3 catch çalıştı");
            e.printStackTrace();
        }

        System.out.println("Test 3 bitti..");
    }
}
