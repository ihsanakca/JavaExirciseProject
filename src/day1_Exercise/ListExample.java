package day1_Exercise;

import java.util.*;

public class ListExample {
    public static void main(String[] args) {

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

        intList.removeIf(i->i<20);
        System.out.println("intList = " + intList);

        // intList.removeIf(integer -> integer > 20);
        System.out.println("\"------------------------------\" = " + "------------------------------");

       List<String> students = new ArrayList<>();

        students.add("Ramazan");
        students.add("Musa");
        students.add("Sinan");
        students.add("Rabia");
        students.add("Simge");

        System.out.println("students = " + students);

        Iterator<String> iterator2 = students.iterator();
        String sum3="";
        while (iterator2.hasNext()){
            String s=iterator2.next();
            sum3+=s;
        }
        System.out.println("sum3 = " + sum3);

        //students.removeIf(n->n.indexOf("R")==0);
        //students.removeIf(d->d.substring(0,1).equals("S"));
        students.removeIf(a->a.length()==4);

        students.removeIf(student->student.substring(student.length()-1).equals("n"));

        students.removeIf(s->s.charAt(s.length()-1)=='e');

        System.out.println("students = " + students);

        Map<String ,Integer> map=new HashMap<>();
        map.put("Ahmet",10);
        map.put("Baki",20);
        map.put("Cemal",30);
        map.put("Davut",40);
        map.put("Engin",50);

       Set<String> stringSet = map.keySet();
        Iterator<String> iterator = map.keySet().iterator();
        int sum=0;
        while (iterator.hasNext()){
            String  s=  iterator.next();
             sum+=map.get(s);

        }

        Iterator<Integer> iterator1 = map.values().iterator();
        int sum2=0;
        while (iterator1.hasNext()){
           int i= iterator1.next();
           sum2+=i;
        }

        System.out.println("sum = " + sum);
        System.out.println("sum2 = " + sum2);


        System.out.println("map.keySet().size() = " + map.keySet().size());
        System.out.println("map.values().size() = " + map.values().size());
        System.out.println("map.size() = " + map.size());

        System.out.println("map = " + map);
        map.values().removeIf(f->f>30);
        System.out.println("map = " + map);
        map.keySet().removeIf(i->i.charAt(0)=='B');
        System.out.println("map = " + map);

        String str="Ahmet";
        String str1="Ahmet";
        String str2="Ahmeta";

        System.out.println("(str==str1) = " + (str == str1));
        System.out.println("str2.substring(0, 5) = " + str2.substring(0, 5));
        System.out.println("(str==str2.substring(0,5)) = " + (str.equals(str2.substring(0, 5)) ));


        //array içinde beşe tam bölünenleri 0 ile değiştirme...
         int[] intArr={1,3,5,7,9,15,23};


        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i]%5==0){
                intArr[i]=0;
            }
        }

        System.out.println("Arrays.toString(intArr) = " + Arrays.toString(intArr));

    }
}
