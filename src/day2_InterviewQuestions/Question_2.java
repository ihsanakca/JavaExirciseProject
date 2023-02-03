package day2_InterviewQuestions;

public class Question_2 {
    public static void main(String[] args) {
        String str="Karı";
        String str1="Arık";
        System.out.println("anagramWords(str,str1) = " + anagramWords(str, str1));

    }
    //How would you write a program to check whether two strings are anagrams?
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
}
