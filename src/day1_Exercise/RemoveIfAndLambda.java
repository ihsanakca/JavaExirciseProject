package day1_Exercise;

import java.util.*;

public class RemoveIfAndLambda {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Ahmet", 10);
        map.put("Baki", 20);
        map.put("Cemal", 30);
        map.put("Davut", 40);
        map.put("Engin", 50);

        map.forEach((z, c) -> System.out.println("3-B sınıfı öğrencisi " + z + " " + c));

        map.forEach((k,v)-> System.out.println(k+" "+v));
        System.out.println("map = " + map);

        map.keySet().removeIf(e -> e.substring(1,2).equals("a"));
        map.values().removeIf(e->e==20);

        System.out.println("map = " + map);

        List<String > list=new ArrayList<>();

        list.add("Ali");
        list.add("Veli");
        list.add("Binali");
        list.add("Cinali");

        list.removeIf(e->e.charAt(0)=='B');
        System.out.println("list = " + list);

        list.stream().forEach(System.out::println);
        list.forEach(System.out::println);

        int[] arr={1,3,5,8,8};
        int[] ints = Arrays.stream(arr).filter(e -> e > 4).toArray();
        long distinct = Arrays.stream(arr).distinct().count();
        System.out.println("distinct = " + distinct);

        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
        System.out.println("Arrays.toString(ints) = " + Arrays.toString(ints));

        Arrays.stream(arr).forEach(System.out::println);
        Arrays.stream(arr).forEach(e-> System.out.print(e+" "));
       // System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
        System.out.println("-----------------------------------");


        List<Integer> list1=new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10));

        list1.stream().filter(e -> e % 2 == 1).toList().forEach(n->{
            for (int i =9-n; i >=0 ; i--) {
                System.out.print(" ");
            }
            for (int i = 0; i <n; i++) {
                System.out.print("* ");
            }
            System.out.println();
        });

        System.out.println("--------------------------------");
        System.out.println("--------------------------------");
        System.out.println("--------------------------------");


        List<Integer> list3=new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10));

        list3.stream().filter(e -> e % 2 == 1).forEach(e->{
            for (int i = 9-e; i >=0 ; i--) {
                System.out.print(" ");
            }
            for (int i = 0; i < e; i++) {
                System.out.print("* ");
            }
            System.out.println();
        });


    }
}
