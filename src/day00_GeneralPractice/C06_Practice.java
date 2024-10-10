package day00_GeneralPractice;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class C06_Practice {
    public static void main(String[] args) {


        getSum();


    }

    public static void getInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen adınızı giriniz : ");
        String ad = sc.nextLine();
        System.out.println("Lütfen soyadınızı giriniz : ");
        String soyad = sc.nextLine();
        System.out.println("Lütfen doğum tarihinizi giriniz : ");
        int yas = LocalDate.now().getYear() - sc.nextInt();

        System.out.println(ad.toUpperCase()+" "+soyad.toUpperCase()+ " ----> "+yas+" yaşındadır.");

    }

    public static void getSum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen adınızı giriniz : ");
        String ad = sc.nextLine();
        if (ad.equals("Ali")) {
            System.out.println("Ali olmaz...!!");
            return;
        }
        System.out.println("Lütfen soyadınızı giriniz : ");
        String soyad = sc.nextLine();
        System.out.println("Lütfen doğum tarihinizi giriniz : ");
        int yas = LocalDate.now().getYear() - sc.nextInt();

        System.out.println(ad.toUpperCase()+" "+soyad.toUpperCase()+ " ----> "+yas+" yaşındadır.");

    }


}
