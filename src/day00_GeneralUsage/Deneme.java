package day00_GeneralUsage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Deneme {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
      // mystery3(list);   //şu java soruları var ya washington uni. onun çözümlerş

        //burası da stream denemeleri
       list.stream()
               .filter(e->e%2==0)
               .forEach(e-> System.out.print(e+" "));

        ArrayList<String> names = new ArrayList<>(Arrays.asList("Ali","Ahmet","Hasan","Osman"));

        List<String> result = names.stream()
                .filter(name -> !name.equals("Ali"))
                .collect(Collectors.toList());

        System.out.println("result = " + result);

        List<String> result2 = names.stream()
                .filter(name -> !name.equals("Ali"))
                .toList();
        System.out.println("result2 = " + result2);
    }

    static String maxLength(List<String> list) {
        if (list.size() == 0) return "0";
        int control = 0;
        String result = "";
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() >= control) {
                control=list.get(i).length();
                result = list.get(i);
            }
        }
        return result;
    }

    public static void mystery1(ArrayList<Integer> list){
        for (int i = list.size()-1; i >0 ; i--) {
            if (list.get(i)<list.get(i-1)){
                int element= list.get(i);
                list.remove(i);
                list.add(0,element);
            }
        }
        System.out.println(list);
    }

    public static void mystery2(ArrayList<Integer> list){
        for (int i = list.size()-1; i >=0 ; i--) {
            if (i%2==0){
                list.add(list.get(i));
            }else {
                list.add(0,list.get(i));
            }
        }
        System.out.println(list);
    }


    public static void mystery3(ArrayList<Integer> list){
        for (int i = list.size()-2; i >0 ; i--) {
           int a= list.get(i);
           int b= list.get(i+1);
           list.set(i,a+b);
        }
        System.out.println(list);
    }

}


