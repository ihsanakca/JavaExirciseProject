package day0_GeneralPractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C05_FirstRepeatedWord {
    public static void main(String[] args) {
        System.out.println("firstRepeatedWord(\"Ali hayatı, sev23\") = " + firstRepeatedWord("We work Hard because we hard work pays."));
    }

    /**
     * Bu metod bir cümledeki ilk tekrarlanan kelimeyi döner.
     * @param sentence
     * @return
     */
    public static String firstRepeatedWord(String sentence) {
        sentence = sentence.replaceAll("[^A-Za-z ]", "").toLowerCase();
        String[] words = sentence.split("\\s+");
        Set<String> set = new HashSet<>();
        for (String word : words) {
            if (!set.add(word)) {
                return word;
            }
        }
        return "None";
    }
}
