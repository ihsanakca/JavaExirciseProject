package day00_GeneralUsage;

public class ValidParentheses {
    public static void main(String[] args) {

        String str = "(((((()))())())(()))";
        String str2 = "()(()((()()))";
        String str3 = "()(())()";

        System.out.println(isValid(str2));

        System.out.println(isValid2(str2));

    }

    public static boolean isValid(String str){

        while(str.contains("()")){
            str = str.replace("()","");
        }

        return str.isEmpty();
    }

    public static boolean isValid2(String str){

        char[] chars = str.toCharArray();
        int count = 0;

        for (char ch : chars) {
            if (ch == '(')
                count++;
            if (ch == ')')
                count--;
            if (count < 0)
                break;
        }

        return count == 0;
    }
}
