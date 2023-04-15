package day3_InterviewQuestions_String;

import java.util.*;

public class Question_5_CountLetters {
    public static void main(String[] args) {
        String str = "Karakusak kalesi";

        System.out.println("countsLetters(str) = " + countLetters(str));
        System.out.println("countLetters2(str) = " + countLetters2(str));
        System.out.println("countLetters3(str) = " + countLetters3(str));
        System.out.println("countLetters4(str) = " + countLetters4(str));
        System.out.println("countLetters5(str) = " + countLetters5(str));

//        List<String> list = countLetters5(str);
//        List<String> list1 = countLetters(str);
//        Collections.sort(list);
//        Collections.sort(list1);
//        System.out.println("list = " + list);
//        System.out.println("list1 = " + list1);
//        System.out.println("list.equals(list1) = " + list.equals(list1));

    }


    // count letters in a string --> "Yayla"->y2,a2,l1
    public static List<String> countLetters(String str) {
        str = str.toLowerCase().replace(" ", "");
        List<String> resultList = new ArrayList<>();
        while (!str.isEmpty()) {
            String control = str.substring(0, 1);
            int count = str.length() - str.replace(control, "").length();
            resultList.add(control + count);
            str = str.replace(control, "");
        }
        return resultList;
    }

    public static List<String> countLetters2(String str) {
        str = str.toLowerCase().replace(" ", "");
        List<String> resultList = new ArrayList<>();
        int count = 1;
        for (int i = 0; i < str.length(); ) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            resultList.add("" + str.charAt(i) + count);
            str = str.replace(str.substring(0, 1), "");
            count = 1;
        }
        return resultList;
    }

    public static List<String> countLetters3(String str) {
        str = str.toLowerCase().replace(" ", "");
        HashMap<Character, Integer> frequency = new HashMap<>();
        List<String> resultList = new ArrayList<>();
        for (char c : str.toCharArray()) {
            if (!frequency.containsKey(c)) {
                frequency.put(c, 1);
            } else {
                frequency.put(c, frequency.get(c) + 1);
            }
        }
        for (char c : frequency.keySet()) {
            resultList.add(c + "" + frequency.get(c));
        }
        return resultList;
    }

    public static List<String > countLetters4(String str){
        str = str.toLowerCase().replace(" ", "");
        List<String> resultList=new ArrayList<>();
        Map<Character,Integer> frequencyMap=new HashMap<>();
        for (Character c:str.toCharArray()) {
            if (!frequencyMap.containsKey(c)) {
                frequencyMap.put(c, 1);
            } else {
                frequencyMap.put(c, frequencyMap.get(c) + 1);
            }
        }
            for (char c : frequencyMap.keySet()) {
                resultList.add(""+c + frequencyMap.get(c));
            }
            return resultList;
    }

    public  static List<String > countLetters5(String str){
        str = str.toLowerCase().replace(" ", "");
        List<String> resultList=new ArrayList<>();
        int[] frequencyArray=new int[26];
        for (Character c:str.toCharArray()) {
            frequencyArray[c-'a']++;
        }

        for (int i = 0; i <26; i++) {
            if (frequencyArray[i]>0){
                resultList.add((char)(i+'a')+""+frequencyArray[i]);
            }
        }

        return resultList;
    }


}
