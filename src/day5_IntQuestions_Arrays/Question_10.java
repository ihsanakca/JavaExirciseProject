package day5_IntQuestions_Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Question_10 {
    public static void main(String[] args) {

        List<Object> list=new ArrayList<>();
        list.add("Ali");
        list.add(5);
        list.add(5);
        list.add(8);
        list.add("Ayhan");
        list.add("Ahmet");

        System.out.println("containsUnique(list) = " + containsUnique(list));
        System.out.println("containsUnique2(list) = " + containsUnique2(list));
        System.out.println("containsUnique3(list) = " + containsUnique3(list));
        System.out.println("containsUnique4(list) = " + containsUnique4(list));
        System.out.println("containsUnique5(list) = " + containsUnique5(list));
        System.out.println("containsUnique6(list) = " + containsUnique6(list));
    }

    //write a java method which returns true if the list consist of unique elements.
    public static Object containsUnique6(List<Object> list) {
        Set<Object> set = new HashSet<>();
        for (Object l : list) {
            if (!set.add(l)) {
                return l;
            }
        }
        return -1;
    }
    public static boolean containsUnique5(List<Object> list) {
        Set<Object> set = new HashSet<>();
        for (Object l : list) {
            if (!set.add(l)) {
                return false;
            }
        }
        return true;
    }

    public static boolean containsUnique2(List<Object> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean containsUnique3(List<Object> list) {
        return list.size() == list.stream().distinct().count();
    }

    public static boolean containsUnique4(List<Object> list) {
        return list.stream().allMatch(new HashSet<>()::add);
    }

    public static <C> boolean containsUnique(List<C> list) {
        Set<C> set = new HashSet<>();
        for (C t : list) {
            if (!set.add(t))
                return false;
        }
        return true;
    }

}
