package day2_InterviewQuestions_String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question_4 {
    public static void main(String[] args) {
        String s = "kalay";
        String s1 = "layka";

        System.out.println("isRotation(s,s1) = " + isRotation(s, s1));
        System.out.println("isRotation2(s,s1) = " + isRotation2(s, s1));
        System.out.println("isRotation3(s,s1) = " + isRotation3(s, s1));

    }
    //Which method would you use to learn if a string is a rotation of another string?
    //rotation of car->car, arc, rca
    //sarı->sarı,arıs,rısa,ısar  -->en baştaki harfin en sona geçmesiyle oluşan yeni kelime..sıra bozulmuyor
    //ve en fazla harf sayısı kadar oluyor

    public static boolean isRotation(String str, String str1) {
        if (str.length() != str1.length()) {
            return false;
        }
        String strstr = str + str;
        // return (str+str).contains(str1);
        return strstr.contains(str1);

    }

    public static boolean isRotation2(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        char[] charArray1 = s1.toCharArray();
        char[] charArray2 = s2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        return Arrays.equals(charArray1, charArray2);
    }

    public static boolean isRotation3(String str, String str1) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            str = str.substring(1) + str.substring(0, 1);
            list.add(str);
        }
        System.out.println("list = " + list);

        return list.contains(str1);
    }

}
