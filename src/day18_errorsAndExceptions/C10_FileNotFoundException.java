package day18_errorsAndExceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C10_FileNotFoundException {
    public static void main(String[] args) {
        File file = new File("src/day18_errorsAndExceptions/Data.txt");

        Scanner dosyaOku;

        try {
            dosyaOku = new Scanner(file);
            System.out.println("Kayıtlar dosyadan okunuyor.");
            while (dosyaOku.hasNext()){
                System.out.println(dosyaOku.nextLine());
            }
            //bir satır daha oku... ama satır kalmadı.. olmayan satırı okumaya çalışıyoruz.
            System.out.println(dosyaOku.nextInt());
        }catch (FileNotFoundException fnfe){
            System.out.println("Hata oluştu : "+fnfe.getMessage());
            System.out.println(fnfe);
        }catch (Exception e){
            System.out.println(e);
        }

        System.out.println("Program çalışmayı bitirdi..");


    }
}
