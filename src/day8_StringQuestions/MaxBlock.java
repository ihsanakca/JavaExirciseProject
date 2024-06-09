package day8_StringQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxBlock {
    public static void main(String[] args) {

        String str="asssa";

        System.out.println("maxBlock(str) = " + maxBlock(str));
        System.out.println("maxBlock2(str) = " + maxBlock2(str));
        System.out.println("maxBlock3(str) = " + maxBlock3(str));
        System.out.println("Blocksstr(str) = " + Blocksstr(str));


    }

    /*
    Given a string, return the length of the largest "block" in the string.
    A block is a run of adjacent chars that are the same.

    maxBlock("hoopla") → 2
    maxBlock("abbCCCddBBBxx") → 3
    maxBlock("") → 0
     */
    public static int maxBlock(String str) {
        if (str.length() == 0) return 0;
        if (str.length() == 1) return 1;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            int count = 1;
            for (int j = i + 1; j < str.length(); j++) {
                if (str.substring(i, (i + 1)).equals(str.substring(j, (j + 1)))) {
                    count++;
                } else break;

            }
            list.add(count);
        }
        return Collections.max(list);
    }


    public static int maxBlock2(String str) {
        int max = 0;
        for (int i = 0; i < str.length(); i++) {
            String control = str.substring(i, i + 1);
            String result="";
            for (int j = i ; j < str.length(); j++) {
                if (control.equals(str.substring(j, j + 1))) {
                    result+= str.substring(j, j + 1);
                } else break;
                max = Math.max(max, result.length());
            }
        }
        return max;
    }

    public static int maxBlock3(String str){
        int max=0;
        for (int i = 0; i <str.length() ; i++) {
            String result="";
            for (int j = i; j <str.length(); j++) {
                if(str.substring(i,i+1).equals(str.substring(j,j+1))){
                    result+=str.charAt(j);
                }else break;
            }
            max=Math.max(result.length(),max);
        }
        return max;
    }

    public static int Blocksstr (String str){
        int max=1;
        int maxNew=1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i)==str.charAt(i-1)){
                maxNew++;

                if (maxNew>max){
                    max = maxNew;
                }
            } else {
                maxNew=1;
            }
        }
        return max;
    }
}
