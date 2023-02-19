package day2_InterviewQuestions_String;

public class Question_3_ReverseString {
    public static void main(String[] args) {

        String str ="Ahmet Aykaç";
        System.out.println("reverseWord(str) = " + reverseWord(str));
        System.out.println("reverseWord2(str) = " + reverseWord2(str));
        System.out.println("reverseWord3(str) = " + reverseWord3(str));
        System.out.println("reverseWord4(str) = " + reverseWord4(str));
    }
    //How would you reverse strings in Java? Ahmet Aykaç -> çakyA temhA
    public static String reverseWord(String str){
        StringBuffer sb=new StringBuffer(str);
        sb.reverse();
        return sb.toString();
    }
    public static String reverseWord2(String str){
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }
    public static String reverseWord3(String str){
       String reverse="";
        for (int i = str.length()-1; i >=0 ; i--) {
            reverse+=str.charAt(i);
        }
        return reverse;
    }
    public static String reverseWord4(String str){
        String reverse="";
        while(!str.isEmpty()){
            String control=str.substring(str.length()-1);
            reverse+=control;
            str=str.substring(0,str.length()-1);
        }
        return reverse;
    }
}
