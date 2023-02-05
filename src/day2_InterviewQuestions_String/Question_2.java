package day2_InterviewQuestions_String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question_2 {
    public static void main(String[] args) {
        String str="Kara";
        String str1="Arka";
        System.out.println("anagramWords(str,str1) = " + anagramWords(str, str1));
        System.out.println("anagramWords2(str,str1) = " + anagramWords2(str, str1));
        System.out.println("anagramWords3(str, str1) = " + anagramWords3(str, str1));

        String [] s={"a"};
        String [] s1={"a"};

        System.out.println("s.equals(s1) = " + s.equals(s1));
        System.out.println("Arrays.equals(s,s1) = " + Arrays.equals(s, s1));
    }
    //How would you write a program to check whether two strings are anagrams?
    //yara'nın aragramları ->arya, aray, aary,ryaa ....
    public static boolean anagramWords(String str,String str1){
        str=str.toLowerCase();
        str1=str1.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (str.replace(str.substring(i,i+1),"").length()!=
                    str1.replace(str.substring(i,i+1),"").length()){
                return false;
            }
        }
        return true;
    }

    public static boolean anagramWords2(String str,String str1){
        str=str.toLowerCase();
        str1=str1.toLowerCase();
        List<String > strList=new ArrayList<>();
        List<String > str1List=new ArrayList<>();

        for (int i = 0; i <str.length() ; i++) {
            strList.add(str.substring(i,i+1));
        }
        for (int i = 0; i <str1.length() ; i++) {
            str1List.add(str1.substring(i,i+1));
        }

        if (strList.size()==str1List.size()&strList.containsAll(str1List)){
            return true;
        }
        return false;
    }

    public static boolean anagramWords3(String str,String str1){
        str=str.toLowerCase();
        str1=str1.toLowerCase();
        char[] charsStr = str.toCharArray();
        char[] charsStr1 = str1.toCharArray();
        Arrays.sort(charsStr);
        Arrays.sort(charsStr1);

        return Arrays.equals(charsStr,charsStr1);

    }
}
