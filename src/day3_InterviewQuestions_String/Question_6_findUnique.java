package day3_InterviewQuestions_String;

public class Question_6_findUnique {
    public static void main(String[] args) {
        String str="antalya yaylassııtni";
        System.out.println("findUnique(str) = " + findUnique(str));
    }
    public static String findUnique(String str){
        str=str.replace(" ","");

        for (int i = 0; i < str.length(); ) {
            String control=str.substring(0,1);
            if (str.indexOf(control)==str.lastIndexOf(control)){
                return control;
            }else{
                str=str.replace(control,"");
            }
        }
        return null;
    }
}
