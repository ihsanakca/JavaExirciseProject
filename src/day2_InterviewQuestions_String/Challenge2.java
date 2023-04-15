package day2_InterviewQuestions_String;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Challenge2 {
    public static void main(String[] args) {

        String str = "aabbcf";
        System.out.println(isValid5(str));
        System.out.println(isValid2(str));


    }
     /*
    In this challenge, we want to iterate through on the characters of the input string and check whether the number of the
    occurrences for each characters are equal. For example, "abcde" is a valid string, on the other hand,
    "abcdeee" is not because count of 'e' is 3, not 1 as the others.
    Moreover, we have chance to remove only one character from the string in order to make it valid.
    Think of a scenario: "xyzz" is given to us and we should remove one of these 'z' characters.
    In this case, we can assume that the string is valid since each existing characters exist only single time after the removal operation.
    Specification

    .isValid(str)--->Method Name
    Decide the given string is valid in terms of character counts including possibility of one character removal
    Parameters
    str: String - input to be searched
    Return Value
    boolean - final decision about that string, true or false
    Constraints
    •    Input string consists of English alphabet characters
    •    All of the characters are lowercase
    Examples   aaabbbssss
    "cac" => true - we can get rid of one these 'c' chars
    "aabcc" => true - if we remove 'b', then it is ok
    "efgh" => true - we even don't need to use remove operation
    "mumukkpp" => true - all of them occurred twice
    "pppenm" => false - even tough we delete one 'p', thats not enough, still one more 'p' exists
    "ekekua" => false - we can either remove 'u' or 'a', but in any case, the remaining one breaks the rule
     */
     public static boolean isValid4(String str) {
         String str1 = str.toLowerCase();
         List<Integer> list = new ArrayList<>();

         for (int i = 0; i < str1.length(); ) {
             int count;
             String control = str1.substring(0, 1);
             count = str1.length() - str1.replace(control, "").length();
             list.add(count);
             str1 = str1.replace(control, "");
         }
         if (list.stream().distinct().count() == 1) {
             return true;


         }
         for (int i = 0; i < str.length(); i++) {
             String newStr = str.substring(0, i) + str.substring(i + 1);
             List<Integer> list1 = new ArrayList<>();
             for (int j = 0; j < newStr.length(); ) {
                 int count;
                 String control = newStr.substring(0, 1);
                 count = newStr.length() - newStr.replace(control, "").length();
                 list1.add(count);
                 newStr = newStr.replace(control, "");
             }
             if (list1.stream().distinct().count() == 1) {
                 return true;
             }
         }
         return false;
     }

    public static void rotateAndErase(String str){

        for (int i = 0; i < str.length(); i++) {
            String newStr = str.substring(0, i) + str.substring(i + 1);
            System.out.println(newStr);
        }

    }
    public static boolean isValid5(String str){
        boolean bl=false;
        List<Integer> list=new ArrayList<>();
        String result="";
        for (int i = 0; i <str.length() ; i++) {
            if(!result.contains(str.substring(i,i+1))){
                int count=str.length()-str.replace(str.substring(i,i+1),"").length();
                result+=count+str.substring(i,i+1);
                list.add(count);
            }
        }
        /*
        System.out.println("str = " + str);
        System.out.println("result = " + result);
        System.out.println(list);
        System.out.println(list);
         */
        Collections.sort(list);

        if(list.size()==0 || list.size()==1)
            return true;
            /**/     else if (list.size() == 2) {
            if(list.get(1)- list.get(0)==1)
                return true;
        }
        else {
            int count=0;   // 1 3 3 3
            for (int i = 0; i < list.size(); i++) {
                if(list.get(i) != list.get(1)){
                    count++;
                }
            }
            if(count==0){
                return true;
            } else if (count == 1) {
                if((list.get(0)==1 && list.get(0) != list.get(1))|| (list.get(list.size()-1)- list.get(1)==1)){
                    return true;
                }
            }
        }
        return bl;
    }

    public static boolean isValid2(String str) {
        ArrayList<Integer> intList = new ArrayList<>();
        int result = 0;
        String s = "";
        String charatcers = "";
        for (int i = 0; i < str.length(); i++) {
            result = str.length() - str.replace(str.substring(i, i + 1), "").length();
            charatcers = str.substring(i, i + 1);
            if (!s.contains(charatcers)) {
                s += charatcers;
                intList.add(result);
            }
        }
        Collections.sort(intList);
        boolean bl = true;
        for (int i = 0; i < intList.size(); i++) {
            for (int j = i + 1; j < intList.size(); j++) {
                if (intList.get(i) != intList.get(j) && bl) {
                    bl = false;
                    if (intList.get(i) == 1) intList.remove(intList.get(i));
                    else intList.set(j, intList.get(j) - 1);
                }
            }
        }
        for (int i = 0; i < intList.size(); i++) {
            for (int j = i + 1; j < intList.size(); j++) {
                if (intList.get(i) != intList.get(j)) {
                    System.out.print(str + " / ");
                    return false;
                }
            }
        }
        System.out.print(str + " / ");
        return true;
    }
}
