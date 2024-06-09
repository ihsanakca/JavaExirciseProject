package day4_IntQuestions_String;

import java.util.ArrayList;
import java.util.Arrays;

public class Q_6_RemoveEvenLength {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("This", "is", "a", "test"));

        System.out.println("removeEvenLength(list) = " + removeEvenLength(list));

    }

    /**
     * Write a method removeEvenLength that takes an ArrayList of Strings as a parameter
     * and that removes all of the strings of even length from the list.
     */

    public static ArrayList<String> removeEvenLength(ArrayList<String> list) {

        for (int i = 0; i < list.size(); i ++) {
            if (list.get(i).length()%2==0){
               list.set(i,"");
            }
        }
        ArrayList<String > result=new ArrayList<>(Arrays.asList(""));
        list.removeAll(result);
        return list;
    }


    public static ArrayList<String> removeEvenLength2(ArrayList<String> list) {
        ArrayList<String > result=new ArrayList<>();
        for (String s : list) {
            if (s.length() % 2 == 1)
                result.add(s);

        }
        return result;
    }
}
