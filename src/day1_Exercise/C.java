package day1_Exercise;

import java.util.*;

public class C {
    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

        System.out.println("list = " + list);

        //list.removeIf(e->e<8);
        System.out.println("list = " + list);

        Map<String,Integer> map=new HashMap<>();

        map.put("Ahmet",10);
        map.put("Mehmet",20);
        map.put("Cafer",30);
        map.put("Davut",40);
        map.put("Engin",50);




    }
}
