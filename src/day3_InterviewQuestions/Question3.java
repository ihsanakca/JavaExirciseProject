package day3_InterviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class Question3 {
    public static void main(String[] args) {
        String str="aantn";

        System.out.println("firstNonDuplicateLetter(str) = " + firstNonDuplicateLetter(str));
        System.out.println("firstNonDuplicateLetter2(str) = " + firstNonDuplicateLetter2(str));
        System.out.println("firstNonDuplicateLetter3(str) = " + firstNonDuplicateLetter3(str));

    }
    public static String firstNonDuplicateLetter(String str){
       String result="";
        str=str.toLowerCase().replace(" ","");
        while (!str.isEmpty()){
            if (str.length()-str.replace(str.substring(0,1),"").length()==1){
                result=str.substring(0,1);
                break;
            }
            str=str.replace(str.substring(0,1),"");
        }
        return result;
    }
    public static String firstNonDuplicateLetter2(String str) {
        str = str.toLowerCase();
        Map<Character, Integer> countMap = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }
        System.out.println("countMap = " + countMap);
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (countMap.get(c) == 1) {
                return Character.toString(c);
            }
        }
        return "";
    }
    public static String firstNonDuplicateLetter3(String str) {
        int[] count = new int[26];
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            count[c - 'a']++;
        }
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (count[c - 'a'] == 1) {
                return Character.toString(str.charAt(i));
            }
        }
        return "";
    }


}
