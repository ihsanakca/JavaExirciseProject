package day4_IntQuestions_String;

import java.util.Arrays;
import java.util.Comparator;

public class Question_3_SortingString {
    public static void main(String[] args) {

        String str = "128 2 3693 65 89 25 10";

        System.out.println("sumOfString(str) = " + sumOfString(str));

        System.out.println("sumOfString2(str) = " + sumOfString2(str));
        System.out.println("sumOfString3(str) = " + sumOfString3(str));
        System.out.println("sumOfString4(str) = " + sumOfString4(str));


    }
    /*

String str="128 2 3693 65 89 25 10"; str içerisindeki boşlukla ayrılmış sayıların sayı değerleri
toplanarak küçükten büyüğe dizili olarak yeniden bir stringe tanımlayan metod nedir? Bu soru
için cevap String result="1 2 7 11 11 17 21"; şeklinde olmalıdır.
     */

    public static String sumOfString(String str) {
        String result = "";
        int valueOfSteps = 0;
        String[] strArr = str.split(" ");
        int[] intOfStrArr = new int[strArr.length];

        for (int i = 0; i < strArr.length; i++) {
            intOfStrArr[i] = Integer.parseInt(strArr[i]);
        }
        for (int i = 0; i < intOfStrArr.length; i++) {
            do {
                valueOfSteps += intOfStrArr[i] % 10;
                intOfStrArr[i] /= 10;
            } while ((intOfStrArr[i] != 0));
            intOfStrArr[i] += valueOfSteps;
            valueOfSteps = 0;
        }
        Arrays.sort(intOfStrArr);

        for (int i : intOfStrArr) {
            result += Integer.toString(i) + " ";
        }
        return result;
    }

    public static String sumOfString2(String str) {
        String result = "";
        String[] strArr = str.split(" ");
        int[] intArr = new int[strArr.length];
        int sum = 0;

        for (int i = 0; i < strArr.length; i++) {
            for (int j = 0; j < strArr[i].length(); j++) {
                sum += Integer.parseInt(strArr[i].substring(j, j + 1));
            }
            intArr[i] = sum;
            sum = 0;
        }
        Arrays.sort(intArr);

        for (int i : intArr) {
            result += Integer.toString(i) + " ";
        }
        return result;
    }
    public static String sumOfString3(String str){   // String str ="128 2 3693 65 89 25 10";

        String[] strArr =str.split(" ");

        int count=0;

        int[] intArr = new int[strArr.length];

        for (int i=0; i<strArr.length; i++){
            for (int j=0; j<strArr[i].length(); j++){
                count += Integer.parseInt(strArr[i].charAt(j)+"");
            }
            intArr[i]=count;
            count=0;
        }
        Arrays.sort(intArr);

        String result = "";
        for (int i:intArr) {
            result+= Integer.toString(i)+" ";
        }

        return result;
    }

    public static int sayiRakamToplami(String sayi){

        String trimSayi = sayi.trim();
        String[] rakamlar = trimSayi.split("");
        int sum=0;
        for (int i = 0; i < trimSayi.length(); i++) {
            sum += Integer.parseInt(rakamlar[i]);
        }
        return sum;
    }

    public static String sumOfString4(String str){

        String[] s = str.trim().split(" ");
        int[] newArr = new int[s.length];

        for (int i = 0; i < s.length; i++) {
            newArr[i]=sayiRakamToplami(s[i]);
        }

        Arrays.sort(newArr);
        String siralama="";
        for (int i = 0; i < newArr.length; i++) {
            siralama+=String.valueOf(newArr[i]);
            siralama+=" ";
        }

        return siralama.trim();
    }
}

