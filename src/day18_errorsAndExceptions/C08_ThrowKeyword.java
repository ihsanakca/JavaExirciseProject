package day18_errorsAndExceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C08_ThrowKeyword {
    public static void main(String[] args) {
        System.out.println("Test Başladı");
        System.out.println("Yaşınızı giriniz :");
        int girilenSayi = new Scanner(System.in).nextInt();

        if (girilenSayi < 0) {
            throw new InputMismatchException("Yaş eksi olmaz..");
        }

        if (girilenSayi > 18) {
            System.out.println("Sigara alabilirsiniz");
        }else {
            throw new RuntimeException("Sigara için yaşınız küçüktür.");
        }

        System.out.println("Test Bitti");

    }
}
