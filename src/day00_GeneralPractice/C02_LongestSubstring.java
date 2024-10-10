package day00_GeneralPractice;

import java.util.*;

public class C02_LongestSubstring {
    public static void main(String[] args) {

        System.out.println(longestSub("pwwkew"));
        System.out.println(longestSubWithoutRepeat8("pwwkew"));


    }

    /**
     * Given a string s, find the length of the longest
     * substring
     * without repeating characters.
     * <p>
     * Example 1:
     * <p>
     * Input: s = "abcabcbb"
     * Output: 3
     * Explanation: The answer is "abc", with the length of 3.
     * Example 2:
     * <p>
     * Input: s = "bbbbb"
     * Output: 1
     * Explanation: The answer is "b", with the length of 1.
     * Example 3:
     * <p>
     * Input: s = "pwwkew"
     * Output: 3
     * Explanation: The answer is "wke", with the length of 3.
     * Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
     */

    public static int longestSub(String str) {
        int count = 1;
        int max = 0;

        Set<String > allSubs = new HashSet<>();

        for (int i = 0; i < str.length();i++ ) {
            for (int j = i+1; j < str.length(); j++) {
                String s = str.substring(i,j);
                allSubs.add(s);
            }
        }

        Set<String > uniqueSubs = new HashSet<>();

       for (String sub : allSubs){
           if (allUnique(sub)){
               uniqueSubs.add(sub);
           }
       }

       for (String unique : uniqueSubs){
           if (unique.length() > max) {
               max = unique.length();
           }
       }

        return max;
    }
    public static boolean allUnique(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i)) != str.lastIndexOf(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static int longestSubWithoutRepeat8(String s) {
        String result;
        int max=0;
        for (int i = 0; i < s.length(); i++) {
            result = s.substring(i, i + 1);
            for (int j = i + 1; j < s.length(); j++) {
                if (!result.contains(s.substring(j, j + 1))) {
                    result += s.substring(j, j + 1);
                }else break;
            }
            max=Math.max(max,result.length());
        }
        return max;
    }

    public static int longestSubWithoutRepeat3(String s) {
        if (s.length() == 0) return 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int max = 0;
        for (int i = 0, j = 0; i < s.length(); ++i) {
            if (map.containsKey(s.charAt(i))) {
                j = Math.max(j, map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i), i);
            max = Math.max(max, i - j + 1);
        }
        return max;
    }
}
