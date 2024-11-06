package day0_GeneralPractice;

import java.util.Arrays;

public class C06_OrderDigits {
    public static void main(String[] args) {

        System.out.println(ascOrder(-73952));

        System.out.println("sortDigits(73952) = " + sortDigits(-73952));

    }
    public static int ascOrder(int n){
        n = Math.abs(n);
        String [] strNum = String.valueOf(n).split("");
        for (int i = 0; i < strNum.length; i++) {
            for (int j = i+1; j < strNum.length; j++) {
                if (Integer.parseInt(strNum[i]) > Integer.parseInt(strNum[j])){
                    String temp = strNum[j];
                    strNum[j] = strNum[i];
                    strNum[i] = temp;
                }
            }
        }

        String str ="";
        for (String s : strNum){
            str += s;
        }

        return Integer.parseInt(str);
    }

    public static int sortDigits(int num){
        char[] digits = String.valueOf(num).toCharArray();

        // Sort the character array
        Arrays.sort(digits);
        System.out.println("Arrays.toString(digits) = " + Arrays.toString(digits));
        // Build the sorted number back as an integer
        return Integer.parseInt(new String(digits));
    }
}
