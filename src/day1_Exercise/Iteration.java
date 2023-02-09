package day1_Exercise;

import java.util.*;

public class Iteration {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Ahmet", 10);
        map.put("Baki", 20);
        map.put("Cemal", 30);
        map.put("Davut", 40);
        map.put("Engin", 50);

        //using iteration() method with map

        //key value lerini toplayalım
        int sum = 0;
        Iterator<String> iterator = map.keySet().iterator();

        while (iterator.hasNext()) {
            String s = iterator.next();
            sum+=map.get(s);
            //sum += map.get(iterator.hasNext());--->hata veriyor. kullanmayınız..
        }
        System.out.println("sum = " + sum);

        //values üzerinden yapalım...
        int sum2 = 0;

        Iterator<Integer> iterator1 = map.values().iterator();

        while (iterator1.hasNext()) {
            sum2 += iterator1.next();
        }
        System.out.println("sum2 = " + sum2);

        //list ile iteration
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        int sum3 = 0;
        Iterator<Integer> iterator2 = list.iterator();
        while (iterator2.hasNext()) {
            sum3 += iterator2.next();
        }

        System.out.println("sum3 = " + sum3);

    }
}
