package day2_InterviewQuestions_String;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Challenge3 {
    public static void main(String[] args) {
        System.out.println(isValid("mumuukkppp"));
    }
    /**
     *  In this challenge, we want to iterate through on the characters of the input string and check whether the number of the
     *     occurrences for each characters are equal. For example, "abcde" is a valid string, on the other hand,
     *     "abcdeee" is not because count of 'e' is 3, not 1 as the others.
     *     Moreover, we have chance to remove only one character from the string in order to make it valid.
     *     Think of a scenario: "xyzz" is given to us and we should remove one of these 'z' characters.
     *     In this case, we can assume that the string is valid since each existing characters exist only single
     *     time after the removal operation.
     *     Specification
     *
     *     .isValid(str)--->Method Name
     *     Decide the given string is valid in terms of character counts including possibility of one character removal
     *     Parameters
     *     str: String - input to be searched
     *     Return Value
     *     boolean - final decision about that string, true or false
     *     Constraints
     *     •    Input string consists of English alphabet characters
     *     •    All of the characters are lowercase
     *     Examples   aaabbbssss
     *     "cac" => true - we can get rid of one these 'c' chars
     *     "aabcc" => true - if we remove 'b', then it is ok
     *     "efgh" => true - we even don't need to use remove operation
     *     "mumukkpp" => true - all of them occurred twice
     *     "pppenm" => false - even tough we delete one 'p', thats not enough, still one more 'p' exists
     *     "ekekua" => false - we can either remove 'u' or 'a', but in any case, the remaining one breaks the rule
     */

    public static boolean isValid(String input){
        String str = input;
        List<Integer> occurrences = new ArrayList<>();

        for (int i = 0; i < str.length(); ) {
            String firstLetter = str.substring(0,1);
            int count = str.length() - str.replace(firstLetter,"").length();
            occurrences.add(count);
            str = str.replace(firstLetter,"");
        }
        System.out.println(occurrences);

        if (occurrences.stream().distinct().count() == 1) {
            return true;
        }

        Collections.sort(occurrences);

        if (occurrences.get(occurrences.size()-1) - occurrences.get(occurrences.size()-2) == 1) {
            return true;
        }

        return false;
    }
}
