package day7_ListQuestion;

import java.util.*;

public class SharedElements {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(List.of(1, 5, 3, 4, 5, 7, 2,77,77,77, 9));
        List<Integer> list2 = new ArrayList<>(List.of(6, 4, 6, 2, 8, 1, 4, 7, 5,77,77,77, 9, 5));
        List<Integer> list3 = new ArrayList<>(List.of(4, 2, 3,77,77,77, 2, 5, 1, 9, 7, 9, 5));

        System.out.println(intersectionNoDublicate(list1, list2, list3));
        System.out.println("----------------");
        System.out.println(intersectionAll(list1, list2, list3));
    }

    public static List<Integer> intersectionNoDublicate(List<Integer> list1, List<Integer> list2, List<Integer> list3) {
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < list1.size(); i++) {
            for (int j = 0; j < list2.size(); j++) {
                if (list1.get(i) == list2.get(j)) {
                    for (int k = 0; k < list3.size(); k++) {
                        if (list2.get(j) == list3.get(k)) {
                            set.add(list3.get(k));
                        }
                    }
                }
            }
        }

        return set.stream().toList();
    }


    public static List<Integer> intersectionAll(List<Integer> list1, List<Integer> list2, List<Integer> list3) {
        List<Integer> commonElements = new ArrayList<>(list1);
        commonElements.retainAll(list2);
        commonElements.retainAll(list3);

        //Set<Integer>set=new HashSet<>(commonElements);
       // return set.stream().toList();
        return commonElements;
    }
}
