package day2_InterviewQuestions_String;

public class Question_5_EraseIfLessThanNumber {
    public static void main(String[] args) {
        String str="aaaffccceee        1 12dda 123 ffc!aaf";
        System.out.println(eraseIfLessThanNumber(str, 5));
        System.out.println(eraseIfLessThanNumber_2(str, 5));
    }

    public static String eraseIfLessThanNumber(String str,int number){
        str=str.replaceAll("\\s+", " ");
        String control="";

        for (int i = 0; i < str.length(); i++) {
            if(Character.isAlphabetic(str.charAt(i))){
               int length=str.length()-str.replace(str.substring(i,i+1),"").length();
               if(length<number){
                  control+=str.substring(i,i+1);
               }
            }
        }

        for (int i = 0; i < control.length(); i++) {
            str=str.replace(control.substring(i,i+1),"");
        }

        return str.trim();
    }

    public static String eraseIfLessThanNumber_2(String str,int number){
        str=str.replaceAll("\\s+", " ");

        for (int i = 0; i < str.length(); i++) {
            if(Character.isAlphabetic(str.charAt(i))){
                int length=str.length()-str.replace(str.substring(i,i+1),"").length();
                if(length<number){
                    str=str.replace(str.substring(i,i+1),"");
                }
            }
        }

        return str.trim();
    }

}
