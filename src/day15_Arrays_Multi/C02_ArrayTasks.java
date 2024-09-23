package day15_Arrays_Multi;

import java.util.Arrays;

public class C02_ArrayTasks {
    public static void main(String[] args) {
        int[] numaralar = {2, 101, 2, 2, 23, 8};

        int[] karelerSonuc = kareler(numaralar);

        System.out.println("Arrays.toString(karelerSonuc) = " + Arrays.toString(karelerSonuc));

        System.out.println("Arrays.toString(tekler(numaralar)) = " + Arrays.toString(tekler(numaralar)));
    }

    // n elemenlı bir int arrayin bütün rakamlarının
    // karesini başka bir array içinde veren metod nedir?

    public static int[] kareler(int[] numbers) {
        int[] sonuclar = new int[numbers.length];

        for (int i = 0; i < sonuclar.length; i++) {
            sonuclar[i] = numbers[i] * numbers[i];
        }

        return sonuclar;
    }

    // n elemanlı bir arrayin tek elemanlarını alıp başka bir arraye atın
    // eğer sayı çiftse oraya 0 yazın.

    public static int [] tekler (int [] rakamlar){
        int[] result = new int[rakamlar.length];

        for (int i = 0; i < result.length; i++) {
            if (rakamlar[i] % 2 == 1){
                result[i] = rakamlar[i];
            }
        }

        return result;
    }

    // n elemanlı bir arrayin tek elemanlarını alıp başka bir arraye atın
    // eğer sayı çiftse oraya 100 yazın.


    // verilen bir cümledeki son kelimeyi tersten veren metod nedir.
}
