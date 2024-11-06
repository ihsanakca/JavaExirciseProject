package day0_GeneralPractice;

import java.util.Arrays;

public class C08_TeslaQuestion_BANANA {
    public static void main(String[] args) {
        System.out.println(countBanana("QABAAAWOBI"));

    }
    /**
     * A string S made of uppercase English letters is given. In one move, six letters forming the word "BANANA"
     * (one 'B', three 'A's and two 'N's) can be deleted from S. What is the maximum number of times such a move can be applied to S?
     * Write a function: class Solution { public int solution(String S); }
     * that, given a string S of length N, returns the maximum number of moves that can be applied.
     * Examples:
     * Given S = "NAABXXAN", the function should return 1.
     * Given S = "NAAAAXNAABYNBZN", the function should return 2.
     * Given S = "QABAAAWOBI", the function should return 0.
     */

    public static int countBanana(String str){
        // Count occurrences of each letter in S
        int countB = 0, countA = 0, countN = 0;

        for (char c : str.toCharArray()) {
            if (c == 'B') countB++;
            else if (c == 'A') countA++;
            else if (c == 'N') countN++;
        }

        // Calculate the number of "BANANA" words we can form
        // "BANANA" requires 1 B, 3 A's, and 2 N's
        int maxBANANA = 0;

        // Check how many complete "BANANA" sets we can make
        while (countB >= 1 && countA >= 3 && countN >= 2) {
            maxBANANA++;
            countB -= 1;
            countA -= 3;
            countN -= 2;
        }

        return maxBANANA;
    }
}
