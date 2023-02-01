package day01_Exircise;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        Map<String ,Integer> map=new HashMap<>();
        map.put("Ahmet",10);
        map.put("Baki",20);
        map.put("Cemal",30);
        map.put("Davut",40);
        map.put("Engin",50);

        int sum=0;
        for (String s: map.keySet()) {
            sum+= map.get(s);
        }
        System.out.println("sum = " + sum);

//        for (String s: map.keySet()) {
//            if (map.get(s)<30){
//                map.remove(s);
//            }
//        }

        System.out.println("map = " + map);

        Iterator<String> iterator = map.keySet().iterator();
        int sum2=0;

        while (iterator.hasNext()){
            String s=iterator.next();
            sum2+= map.get(s);
        }
        System.out.println("sum2 = " + sum2);
        System.out.println("iterator.hasNext() = " + iterator.hasNext());

//        Iterator<String> iterator1 = map.keySet().iterator();
//
//        while (iterator1.hasNext()){
//            String s= iterator1.next();
//            if (map.get(s)<=30){
//                iterator1.remove();
//            }
//
//        }
        System.out.println("map = " + map);

        Iterator<Integer> iterator2 = map.values().iterator();

        while (iterator2.hasNext()){
            int next=iterator2.next();
            if (next>30){
                iterator2.remove();
            }
        }
        System.out.println("map = " + map);


        List<Integer> intList=new ArrayList<>();
        intList.add(3);
        intList.add(13);
        intList.add(35);
        intList.add(22);
        intList.add(8);

        System.out.println("intList = " + intList);
        Iterator<Integer> iterator4 = intList.iterator();

        while (iterator4.hasNext()){
            if (iterator4.next()>20){
                iterator4.remove();
            }
        }

        for (Integer i : intList) {
            if (i<20){
               intList.set(intList.indexOf(i),i+11);
                //intList.remove(i);
            }
        }
        System.out.println("intList = " + intList);
    }

}
