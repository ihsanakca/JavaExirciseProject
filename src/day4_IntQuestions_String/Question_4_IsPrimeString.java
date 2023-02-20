package day4_IntQuestions_String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question_4_IsPrimeString {
    public static void main(String[] args) {

        String str="abcab";

        System.out.println(isPrimeString(str));



    }
    /*
    Alice has just learnt about primeStrings. A string is a primeString if the number of
    distinct alphabets used in the string is a prime and also the number of occurrences of each alphabet in the string is also a prime.
    Given a String you need to tell if it is a primeString or not.

    Explanation
Case 1: "ababb" 2 different alphabets each occurring 2 and 3 times respectively so string "ababb" is a PrimeString.

Case 2: "abcab" In second string char 'a' occurs 2 times, char 'b' occurs 2 times but char 'c' occur only 1 time which is not
a prime number that's why string "abcab" is not a PrimeString.

Case 3: "aabbccdd" String contains 4 distinct alphabets and 4 is not a prime Number so the string "aabbccdd" is not a PrimeString.
     */

    public static boolean isPrime(int i) {
        if (i < 2|i==4) return false;
        if (i == 2) return true;
        for (int j = 2; j < i/2 ; j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrimeString(String str){
        String str1=str.replace(" ","").toLowerCase();

        List<Integer> list=new ArrayList<>();

        while (!str1.isEmpty()){
            String control=str1.substring(0,1);
            int i=str1.length()-str1.replaceAll(control,"").length();
            list.add(i);
            str1=str1.replaceAll(control,"");
        }

       /* String str2=str.replace(" ","").toLowerCase();
        String differentAlphabetics="";

        while (!str2.isEmpty()){
            String control=str2.substring(0,1);
            str2=str2.replaceAll(control,"");
            differentAlphabetics+=control;
        }
         list.add(differentAlphabetics.length());
        */

        str1=str.replace(" ","").toLowerCase();
        String[] strArr = str1.split("");
        int a = (int) Arrays.stream(strArr).distinct().count();

        list.add(a);

        System.out.println(list);

        for (int i:list) {
            if(!isPrime(i)) return false;
        }
        return true;
    }
}
