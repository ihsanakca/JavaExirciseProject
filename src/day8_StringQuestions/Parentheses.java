package day8_StringQuestions;

import java.util.Stack;

public class Parentheses {
    public static void main(String[] args) {
        String str = "({)}";
        System.out.println("1->"+isValid(str));

        System.out.println("2->"+isValid2(str));

        System.out.println("3->"+isValid3(str));

        System.out.println("4->"+isValid4(str));
        System.out.println("isValid5(str) = " + isValid5(str));
        System.out.println("isValid6(str) = " + isValid6(str));

    }

    private static boolean isValid(String str) {
        for (int i = 0; i < str.length();) {
            if (str.charAt(0) != '(') return false;
            if (str.length() % 2 == 1) return false;
            str = str.replaceFirst("[(]", "");
            str = str.replaceFirst("[)]", "");
        }
       return true;
    }


    public static boolean isValid2(String str) {
        int count = 0;
        char[] chars = str.toCharArray();
        for (char c : chars) {
            if (c == '(') {
                count++;
            } else if (c == ')') {
                count--;
            }
            if (count < 0 ) {
                return false;
            }
        }
        return count == 0 ;
    }

    public static String isValid3(String str) {
        Stack<String> stack = new Stack<>();

        if (str.length() % 2 != 0) {
            return "INVALID";
        }
        String[] charArr = str.split("");
        for (String ch : charArr) {
            if (ch.equalsIgnoreCase("(")) {
                stack.push(ch);
            } else if (ch.equalsIgnoreCase(")") && !stack.isEmpty()) {
                stack.pop();
            }
        }
        return stack.isEmpty() ? "VALID" : "INVALID";
    }

    public static boolean isValid4(String str) {
       while (str.contains("()")){
           str=str.replace("()","");
       }
       return str.isEmpty();
    }
    public static boolean isValid5(String str){
        while (str.contains("[]") || str.contains("()") ||str.contains("{}")){
            str= str.replace("[]","");
            str= str.replace("()","");
            str= str.replace("{}","");
        }
        return str.isEmpty();
    }

    public static boolean isValid6(String str) {
        Stack<Character> stack = new Stack<>();
        if (str.length() % 2 != 0) {
            return false;
        }
        for (char ch : str.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (ch == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (ch == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else if (ch == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            }
        }
        return stack.isEmpty();
    }



}

