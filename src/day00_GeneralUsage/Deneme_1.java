package day00_GeneralUsage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Deneme_1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(){
            {
                add(5);
                add(15);
                add(50);
                add(25);
            }
        };

        System.out.println("list = " + list);

        ArrayList<String> list1 = new ArrayList<>(List.of("1","3","5","8"));
        list1.add("55");

        System.out.println("list1 = " + list1);

    }


}


