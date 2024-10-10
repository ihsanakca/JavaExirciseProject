package day18_errorsAndExceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C10_FileNotFoundExceptionPrintInt {
    public static void main(String[] args) {
        File file = new File("src/day18_errorsAndExceptions/Data.txt");

        Scanner dosyaOku;
        int sayi = 0;

        try {
            dosyaOku = new Scanner(file);
            System.out.println("Kayıtlar dosyadan okunuyor.");
            while (dosyaOku.hasNext()){
                try {
                    sayi += Integer.parseInt(dosyaOku.nextLine());
                    System.out.println(sayi);
                } catch (NumberFormatException nfe) {

                }
            }

        }catch (FileNotFoundException fnfe){
            System.out.println("Hata oluştu : "+fnfe.getMessage());
            System.out.println(fnfe);
        }catch (Exception e){
            System.out.println(e);
        }

        System.out.println("Program çalışmayı bitirdi..");


    }
}
