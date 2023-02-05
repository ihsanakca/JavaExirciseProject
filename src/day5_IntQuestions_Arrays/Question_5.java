package day5_IntQuestions_Arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Question_5 {
    public static void main(String[] args) {
        //How would you shuffle arrays in Java?  karıştırırsın...

        Integer[] array = {1, 2, 3, 4, 5};
        List<Integer> list = Arrays.asList(array);
        Collections.shuffle(list);
        list.toArray(array);
        System.out.println(Arrays.toString(array));
    }
}
