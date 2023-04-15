package day8_StringQuestions;

public class RemoveString {
    public static void main(String[] args) {

        String s="Hello there";
        System.out.println( withoutString(s, "x"));

    }
    /*
    Given two strings, base and remove, return a version of the base string where all instances of the remove string
    have been removed (not case sensitive). You may assume that the remove string is length 1 or more.
     Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".


withoutString("Hello there", "llo") → "He there"
withoutString("Hello there", "e") → "Hllo thr"
withoutString("Hello there", "x") → "Hello there"
     */
    public static String withoutString(String base, String remove) {
        String newBase=base;
        newBase=newBase.replaceFirst(remove,"");
        return newBase;
    }
}
