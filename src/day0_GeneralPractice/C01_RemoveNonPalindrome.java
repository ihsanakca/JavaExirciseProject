package day0_GeneralPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C01_RemoveNonPalindrome {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(List.of("ata","elem","ama","kayak","aka","pako"));

        System.out.println(removeNonPalindrome(words));
    }

    public static List<String> removeNonPalindrome(List<String> list){
        list.removeIf(s -> isPalindrome(s));
        return list;
    }

    private static boolean isPalindrome(String str){
        return new StringBuilder(str).reverse().toString().equals(str);
    }
}
