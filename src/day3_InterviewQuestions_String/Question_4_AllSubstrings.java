package day3_InterviewQuestions_String;

import java.util.ArrayList;
import java.util.List;

public class Question_4_AllSubstrings {
    public static void main(String[] args) {
        String str="kale";
        System.out.println("allSubstrings(str) = " + allSubstrings(str));
        System.out.println("allSubstrings2(str) = " + allSubstrings2(str));
    }
    //How would you find all the substrings of a string?
    //

    public static List<String> allSubstrings(String str){
        List<String> result=new ArrayList<>();
        for (int i=0;i<str.length();i++){
            for (int j = str.length(); j >i ; j--) {
                result.add(str.substring(i,j));
            }
        }
        return result;
    }

    public static List<String>  allSubstrings2(String str){
        List<String > resultList=new ArrayList<>();
        for (int i=0; i<str.length();i++){
            for (int j = 1; j <=str.length()-i ; j++) {
                String sub=str.substring(i,j+i);
                resultList.add(sub);
            }
        }

        return resultList;
    }
}
