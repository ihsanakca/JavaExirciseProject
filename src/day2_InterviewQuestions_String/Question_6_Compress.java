package day2_InterviewQuestions_String;

public class Question_6_Compress {
    public static void main(String[] args) {

        String str="aaabbcc33cddd bbeeeeeee4545eec    fffggab";
        System.out.println(compress(str));
    }

    public static String compress(String str){
        str=str.replaceAll("[^a-zA-Z\\s]", "");
        str=str.replaceAll("\\s+", " ").trim();

        String result="";
        String control=str.substring(0,1);
        int count=1;
        for (int i = 1; i < str.length(); i++) {
            if(control.equals(str.substring(i,i+1))){
                count++;
            }else{
                result+=control;
                if(count>1){
                    result+=count;
                }
              control=str.substring(i,i+1);
                count=1;
            }

        }
        result+=control;
        if(count>1){
            result+=count;
        }

        return result;
    }
}
