package day01_Exircise;

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

        ArrayList<String> students = new ArrayList<String>();

        students.add("Ramazan");
        students.add("Musa");
        students.add("Sinan");
        students.add("Rabia");
        students.add("Simge");

        System.out.println("students = " + students);

        students.removeIf(n->n.indexOf("R")==0);

        System.out.println("students = " + students);

    }
}
