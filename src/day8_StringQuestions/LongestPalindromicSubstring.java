package day8_StringQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {

        String str = "asdddsc";

        System.out.println("longestPalindrome(str) = " + longestPalindrome(str));
        System.out.println("largestPolidromicSubstring(str) = " + largestPolidromicSubstring(str));
        System.out.println("longestPalindrome2(str) = " + longestPalindrome2(str));
        System.out.println("polindromic(str) = " + polindromic(str));
        System.out.println("longestPalindrome3(str) = " + longestPalindrome3(str));
        System.out.println("palindromic(str) = " + palindromic(str));


    }

    /**
     * Given a string s, return the longest palindromic substring in s.
     * Example 1:
     * <p>
     * Input: s = "babad"
     * Output: "bab"
     * Explanation: "aba" is also a valid answer.
     * Example 2:
     * <p>
     * Input: s = "cbbd"
     * Output: "bb"
     */
    public static String longestPalindrome(String s) {
        if (s.length() == 0) {
            return "";
        }
        List<String> allSubs = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String newStr = s.substring(i, j);
                allSubs.add(newStr);
            }
        }
        //   System.out.println("allSubs = " + allSubs);
        List<String> allPalindromeSubs = new ArrayList<>();
        for (String allSub : allSubs) {
            if (isPalindrome(allSub)) {
                allPalindromeSubs.add(allSub);
            }
        }
        //    System.out.println("allPalindromeSubs = " + allPalindromeSubs);
        List<Integer> lengthOfSubs = new ArrayList<>();
        for (String allPalindromeSub : allPalindromeSubs) {
            lengthOfSubs.add(allPalindromeSub.length());
        }
        int max = Collections.max(lengthOfSubs);
        String result = allPalindromeSubs.get(lengthOfSubs.indexOf(max));
        return result;
    }

    public static boolean isPalindrome(String s) {
        return s.equals(new StringBuffer(s).reverse().toString());
    }

    public static String largestPolidromicSubstring(String str) {
        if (str.length() == 0) {
            return "";
        }
        ArrayList<String> substringList = new ArrayList<>();
        ArrayList<String> polidromeList = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                substringList.add(str.substring(i, j));
            }
        }
        for (String s : substringList) {
            if (isPolidrome(s)) {
                polidromeList.add(s);
            }
        }

        String polSubStr = polidromeList.get(0);
        for (int i = 0; i < polidromeList.size(); i++) {
            if (polSubStr.length() <= polidromeList.get(i).length()) {
                polSubStr = polidromeList.get(i);
            }
        }
        return polSubStr;
    }

    public static boolean isPolidrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - (i + 1))) {
                return false;
            }
        }
        return true;
    }

    public static String longestPalindrome2(String str) {
        int s = 0, e = 0;
        for (int i = 0; i < str.length(); i++) {
            int odd = pal(str, i, i);
            int even = pal(str, i, i + 1);
            int len = Math.max(odd, even);

            if (len > e - s) {
                s = i - (len - 1) / 2;
                e = i + len / 2;
            }
        }
        return str.substring(s, e + 1);
    }

    public static int pal(String str, int s, int e) {
        while (s >= 0 && e < str.length() && str.charAt(s) == str.charAt(e)) {
            s--;
            e++;
        }
        return e - s - 1;
    }

    public static String polindromic(String str) {
        String result = "";
        String polindrom = "";
        int max = 0;
        boolean bl = false;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                bl = reverse(str.substring(i, j + 1));
                polindrom = str.substring(i, j + 1);
                if (bl && polindrom.length() > max) {
                    max = polindrom.length();
                    result = polindrom;
                }
            }
        }
        return result;
    }

    public static boolean reverse(String str) {
        String revers = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            revers += str.charAt(i);
        }
        return revers.equals(str);
    }

    public static String longestPalindrome3(String str) {
        String result = "";
        int max=0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                String control=str.substring(i, j + 1);
                if(isAPalindrome(control)&&control.length()>max){
                    result=control;
                    max=Math.max(control.length(),max);
                }
            }
        }
        if (str.length()>0&&max==0){
            return str.substring(0,1);
        }

        return result;
    }

    static boolean isAPalindrome(String str) {
        return str.equals(new StringBuffer(str).reverse().toString());
    }

    public static String palindromic(String str) {
        if (str.length() == 0) {
            return "";
        }
        String str2 = str;
        String result = str.substring(0, 1);
        for (int i = 0; i < str2.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                if (reverse2(str2) && str2.length() >= result.length()) {
                    result = str2;
                    break;
                } else if (str2.length() > 0) {
                    str2 = str2.substring(1);
                }
            }
            str2 = str.substring(0, str.length() - i - 1);
        }
        return result;
    }
    public static boolean reverse2(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return str.equalsIgnoreCase(result);
    }
}

