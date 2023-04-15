package day8_StringQuestions;

public class MirrorEnd {
    public static void main(String[] args) {

       String str="ama";
        System.out.println(mirrorEnds(str));
        System.out.println(mirrorEnds2(str));
        System.out.println(mirrorEnds3(str));

    }
    /*
    Given a string, look for a mirror image (backwards) string at both the beginning and end of the given string.
    In other words, zero or more characters at the very begining of the given string, and at the very end of the
    string in reverse order (possibly overlapping). For example, the string "abXYZba" has the mirror end "ab".

mirrorEnds("abXYZba") → "ab"
mirrorEnds("abca") → "a"
mirrorEnds("aba") → "aba"
     */

    public static String mirrorEnds(String string){
        String result="";
        if (string.equals( new StringBuffer(string).reverse().toString())){
            return string;
        }
        for (int i = 0; i < string.length()/2; i++) {
            if (string.charAt(i)==string.charAt(string.length()-1-i)){
                result+=string.charAt(i);
            }else{
                break;
            }
        }
        return result;
    }

    public static String mirrorEnds2(String str){
        String result="";
        for (int i = 0; i < str.length(); i++) {
            if(str.substring(i,i+1).equals(str.substring(str.length()-1-i,str.length()-i))){
                result+=str.charAt(i);
            }else {
                break;
            }
        }
        return result;
    }

    public static String mirrorEnds3(String str){
        String mirrorStr = "";
        if (str.length()==0){
            return "\"\"";
        }
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(0) != str.charAt(str.length() - 1)) {
                mirrorStr = "\"\"";
                break;
            }
            if (str.charAt(i)!=str.charAt(str.length()-(i+1))){
                break;
            }
            mirrorStr += str.charAt(i);
        }
        return mirrorStr;
    }
}
