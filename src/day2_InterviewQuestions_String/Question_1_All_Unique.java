package day2_InterviewQuestions_String;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Question_1_All_Unique {
    public static void main(String[] args) {
        String str="Artpya";
        System.out.println("allUnique(str) = " + allUnique(str));
        System.out.println("allUnique2(str) = " + allUnique2(str));
        System.out.println("allUnique3(str) = " + allUnique3(str));
        System.out.println("allUnique4(str) = " + allUnique4(str));
        System.out.println("allUnique5(str) = " + allUnique5(str));
        System.out.println("allUnique6(str) = " + allUnique6(str));
        System.out.println("allUnique7(str) = " + allUnique7(str));

    }

 //How would you determine whether a string’s characters are all unique?
    // bütün harfleri benzeresiz (unique ise true değilse false) olmalı..(büyük/küçük harf ayrımı olmaksızın... )

    public static boolean allUnique(String str){
        str=str.toLowerCase();
        Set<Character> set=new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            if (!set.add(str.charAt(i))){
                return false;
            }
        }
        return true;
    }
    public static boolean allUnique2(String str){
        str=str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j <str.length() ; j++) {
                if (str.charAt(i)==str.charAt(j))
                    return false;
            }
        }
        return true;
    }
    public static boolean allUnique3(String str){
        str=str.toLowerCase();
        List<Character> characterList=new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            characterList.add(str.charAt(i));
        }
        return characterList.size()==characterList.stream().distinct().count();
    }
    public static boolean allUnique4(String str) {
        int checker = 0;
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i) - 'a';
            if ((checker & (1 << val)) > 0) {
                return false;
            }
            checker |= (1 << val);
        }
        return true;
    }
    public static boolean allUnique5(String str){
        str=str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (str.length()-str.replace(str.substring(i,i+1),"").length()!=1){
                return false;
            }
        }
      return true;
    }
    public static boolean allUnique6(String str){
        str=str.toLowerCase();
        Set<Character> set=new HashSet<>();
        List<Character> list=new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i));
        }
        for (int i = 0; i <str.length() ; i++) {
            list.add(str.charAt(i));
        }
        return set.size()==list.size();
    }

    public static boolean allUnique7(String str){
        str=str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i))!=str.lastIndexOf(str.charAt(i))){
                return false;
            }
        }
        return true;
    }

}

