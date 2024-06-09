package day5_IntQuestions_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Question_11_RemovePalindromeFromArray {
    public static void main(String[] args) {
        //interview question
        //list içerisindeki polindrom kelimeleri list içerisinden silen metodu yazınız

        String []strings={"kayak","ali","kaya","kayak","kapak","masa","ama","adam","aya","yapay"};
        List<String> list=new ArrayList<>(Arrays.asList(strings));

        System.out.println("list = " + list);
     //   System.out.println("delete palindrome metodu"+deletePalindrome(list));
        System.out.println("removePalindrome_1(list) = " + removePalindrome_1(list));

        System.out.println("list = " + list);
      //  System.out.println("remove palindrome metodu"+removePalindrome(list));


        System.out.println("removePalindromeWithIterable(list) = " + removePalindromeWithIterable(list));
        System.out.println("list = " + list);

    }
    public static List<String>deletePalindrome(List<String>list){

        for (int i = 0; i < list.size(); i++) {
            String str="";
            for (int j = list.get(i).length()-1; j >=0 ; j--) {
                str+= list.get(i).charAt(j);

                if (list.get(i).equalsIgnoreCase(str)){
                    list.remove(list.get(i));
                }
            }
        }
        return list;

    }

    public static List<String> removePalindrome(List<String>list){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equalsIgnoreCase(reverseWord(list.get(i)))){
                list.remove(list.get(i));
            }
        }
        return list;
    }

    public static List<String> removePalindrome_1(List<String>list){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equalsIgnoreCase(reverseWord(list.get(i)))){
                list.set(i,"remove");
            }
        }
        list.removeIf(e->e.equals("remove"));
        return list;
    }
    public static String reverseWord(String string){

        String str="";
        for (int i = string.length()-1; i >=0; i--) {
            str+=string.charAt(i);
        }
        return str;
    }

    public static List<String> removePalindromeWithIterable(List<String>list){
        Iterator<String> iterator=list.iterator();
        while (iterator.hasNext()){
//            if (iterator.next().equalsIgnoreCase(reverseWord(iterator.next()))){
//                iterator.remove();
//            }  // hatalı olur çünkü her döngüde next yapacağı için hiçbir zaman doğru sonuç vermez bunun yerine
            String str=iterator.next();
            if (str.equalsIgnoreCase(reverseWord(str))){
                iterator.remove();
            }
        }
        return list;
    }


}
