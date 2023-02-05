package day4_IntQuestions_String;

import java.util.ArrayList;
import java.util.List;

public class Question_1 {
    public static void main(String[] args) {
        String str = "Yhyas";
        System.out.println("isContainsVowel(str) = " + isContainsVowel(str));
        System.out.println("isContainsVowel2(str) = " + isContainsVowel2(str));
        System.out.println("isContainsVowel3(str) = " + isContainsVowel3(str));

    }

    //How would you find out if there is a vowel in a string?
    public static boolean isContainsVowel(String str) {
        String vowelOfStr = str.replaceAll("[^aeiouAEIOU]", "");
        return vowelOfStr.length() > 0;
    }

    public static boolean isContainsVowel2(String str) {
        str=str.toLowerCase();
        if (str.contains("a")||str.contains("e")||str.contains("i")||str.contains("o")
        ||str.contains("u")){
            return true;
        }
        return false;
    }

        public static boolean isContainsVowel3(String str) {
            List<Character> vowels = new ArrayList<>();
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                        c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                    vowels.add(c);
                }
            }
            return vowels.size()>0;
        }

    }


