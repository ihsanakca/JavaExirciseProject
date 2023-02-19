package day3_InterviewQuestions_String;

import java.util.HashSet;
import java.util.Set;

public class Question_2_FindDuplicates {
    public static void main(String[] args) {
        String str = "yakalıklık";
        System.out.println("findDublicates(str) = " + findDublicates(str));
        System.out.println("findDublicates2(str) = " + findDublicates2(str));

    }

    //Explain how you would find a duplicate character in a string.//all of them
    public static String findDublicates(String str) {
        str = str.toLowerCase().replace(" ", "");
        String result = "";
        while (!str.isEmpty()) {
            if (str.length() - str.replace(str.substring(0, 1), "").length() > 1) {
                result += str.substring(0, 1);
            }
            str = str.replace(str.substring(0, 1), "");
        }
        return result;
    }
    public static Set findDublicates2(String str) {
        str = str.toLowerCase().replace(" ", "");
        Set<Character> set=new HashSet<>();
        for (int i = 0; i <str.length() ; i++) {
            for (int j = i+1; j < str.length(); j++) {
                if (str.charAt(i)==str.charAt(j)){
                    set.add(str.charAt(i));
                }
            }
        }
        return set;
    }

}
