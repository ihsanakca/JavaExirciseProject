package day8_StringQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class LongestSubstringWithoutRepeating {
    public static void main(String[] args) {
        String str = "atmaca";
        System.out.println("longestSubWithoutRepeat(str) = " + longestSubWithoutRepeat(str));
        System.out.println("longestSubWithoutRepeat2(str) = " + longestSubWithoutRepeat2(str));
        System.out.println("longestSubWithoutRepeat3(str) = " + longestSubWithoutRepeat3(str));
        System.out.println("longestSubWithoutRepeat5(str) = " + longestSubWithoutRepeat5(str));
        System.out.println("longestSubWithoutRepeat6(str) = " + longestSubWithoutRepeat6(str));
        System.out.println("longestSubWithoutRepeat7(str) = " + longestSubWithoutRepeat7(str));
        System.out.println("longestSubWithoutRepeat8(str) = " + longestSubWithoutRepeat8(str));
    }

    /**
     * Given a string s, find the length of the longest
     * substring
     * without repeating characters.
     * <p>
     * <p>
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

    public static int longestSubWithoutRepeat(String s) {
        if (s.length() == 0) return 0;
        List<String> allSubs = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String newStr = s.substring(i, j);
                allSubs.add(newStr);
            }
        }
        List<String> uniqueSubs = new ArrayList<>();

        for (String allSub : allSubs) {
            if (allUnique(allSub)) {
                uniqueSubs.add(allSub);
            }
        }
        List<Integer> lengthsOfSubs = new ArrayList<>();
        for (String uniqueSub : uniqueSubs) {
            lengthsOfSubs.add(uniqueSub.length());
        }

        return Collections.max(lengthsOfSubs);
    }

    public static boolean allUnique(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i)) != str.lastIndexOf(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static int longestSubWithoutRepeat2(String s) {
        if (s.length() == 0) return 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
           String newStr=s.substring(i,i+1);
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) != s.charAt(j)&&!newStr.contains(s.substring(j,j+1))) {
                    newStr+=s.charAt(j);
                } else {
                    break;
                }
            }
            list.add(newStr.length());
        }
        return Collections.max(list);
    }

    public static int longestSubWithoutRepeat3(String s) {
        if (s.length() == 0) return 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
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


    public static int longestSubWithoutRepeat5(String s) {
        if (s.length() == 0) return 0;
        String s1;
        int count1 = 1;
        for (int i = 0; i < s.length() - 1; i++) {
            int count2;
            s1 = s.substring(i, i + 1);
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) != s.charAt(j) && !s1.contains(s.substring(j, j + 1))) {
                    s1 += s.substring(j, j + 1);
                    count2 = s1.length();
                    count1 = Math.max(count2, count1);
                } else {
                    break;
                }
            }
        }
        return count1;
    }

    public static int longestSubWithoutRepeat6(String s) {
        String result = "";
        int lenght = 0;
        for (int i = 0; i < s.length(); i++) {
            result = "";
            for (int j = i; j < s.length(); j++) {
                if (!result.contains(s.substring(j, j + 1))) {
                    result += s.charAt(j);
                } else break;
            }
            int max = result.length();
            if (max > lenght) {
                lenght = max;
            }
        }
        return lenght;
    }

    public static int longestSubWithoutRepeat7(String s) {
        String newStr;
        int max=0;
        for (int i = 0; i < s.length(); i++) {
            newStr = s.substring(i, i + 1);
            for (int j = i + 1; j < s.length(); j++) {
                if (!s.substring(i, i + 1).equals(s.substring(j, j + 1)) && !newStr.contains(s.substring(j, j + 1))) {
                    newStr += s.substring(j, j + 1);
                }else break;
            }
            max=Math.max(max,newStr.length());
        }
        return max;
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
}
