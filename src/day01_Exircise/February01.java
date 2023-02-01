package day01_Exircise;

import java.util.*;

public class February01 {
    public static void main(String[] args) {

        List<Integer> nums=new ArrayList<>();
        nums.add(2);
        nums.add(44);
        nums.add(3);
        nums.add(2);
        nums.add(27);
        nums.add(9);
        nums.add(270);

//        System.out.println("sortList(nums) = " + sortList(nums));
//        System.out.println("sortList2(nums) = " + sortList2(nums));
//        System.out.println("sortList3(nums) = " + sortList3(nums));



//        System.out.println("sortedList(nums) = " + sortedList(nums));
//        System.out.println("sortedList2(nums) = " + sortedList2(nums));
//        System.out.println("sortedList3(nums) = " + sortedList3(nums));

        List<Object> nums2=new ArrayList<>();
        nums2.add(2);
        nums2.add(44);
        nums2.add(3);
        nums2.add(2);
        nums2.add(27);
        nums2.add(9);
        nums2.add(270);

        Iterator<Integer> iterator = nums.iterator();

//        while(iterator.hasNext()) {
//           // System.out.println("(iterator.next()+10) = " + (iterator.next() + 10));
//        }

            Map<String ,Integer> map=new HashMap<>();
            map.put("A",1);
            map.put("B",2);
            map.put("C",3);
            map.put("D",4);
            map.put("E",5);

            Collection<Integer> values = map.values();
            int sum=0;
        for (String s: map.keySet()) {
            sum+=map.get(s);
        }

        System.out.println("sum = " + sum);

        int sum2=0;
        Iterator<String> iterator1 = map.keySet().iterator();

            while (iterator1.hasNext()){
                sum2+=map.get(iterator1.next());
            }
        System.out.println("sum2 = " + sum2);

        int a=4;
        int b=3;

        a = a ^ b ^ (b = a);
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);

        int temp = a; // temporary variable
        a = b; b = temp;

//        System.out.println("a = " + a);
//        System.out.println("b = " + b);

        for (int i = 0; i < 3; i++) {
            for (int j = 3; j >= 0; j--) {
                if (i == j){
                continue ;
                }
               // System.out.println(i + " " + j);
            }
        }



        // System.out.println("containsUnique(nums) = " + containsUnique(nums2));

//        String str="Ahmet";
//        System.out.println("reverseWord(str) = " + reverseWord(str));
//        System.out.println("reverseWord2(str) = " + reverseWord2(str));


    }
//    public static List<Integer> sortedList(List<Integer> list){
//        int temp=0;
//        for (int i = 0; i < list.size(); i++) {
//            for (int j = i+1; j < list.size(); j++) {
//                if (list.get(i)>list.get(j)){
//                    temp= list.get(j);
//                    list.set(j,list.get(i));
//                    list.set(i,temp);
//                }
//            }
//        }
//        return list;
//    }
//    public static List<Integer> sortedList2(List<Integer> list){
//    Collections.sort(list);
//        return list;
//    }
//    public static List<Integer> sortedList3(List<Integer> list){
//        Collections.sort(list);
//        list.sort(Comparator.naturalOrder());
//        return list;
//    }
    public static boolean containsUnique(List <Object> list){
        Set<Object> set=new HashSet<>();
        for (Object l:list) {
            if (!set.add(l)){
                return false;
            }
        }
        return true;
    }

    public static List<Integer> sortList(List <Integer> list){
       list.sort(Comparator.naturalOrder());
        return list;
    }
    public static List<Integer> sortList2(List <Integer> list){
        Collections.sort(list);
        //Arrays.sort(arr)-->Arrayler için
        return list;
    }

    public static List<Integer> sortList3(List <Integer> list){
    int temp=0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j < list.size(); j++) {
                if (list.get(i)> list.get(j)){
                    temp=list.get(j);            //temp=arr[j];  arr[j]=arr[i];  //arr[i]=temp;
                    list.set(j,list.get(i));
                    list.set(i,temp);
                }
            }
        }

        return list;
    }
    public static String reverseWord(String str){
        StringBuffer sb=new StringBuffer(str);
        sb.reverse();
        str=sb.toString();
        return str;
    }
    public static String reverseWord2(String str){
        String result="";
        for (int i = str.length()-1; i >=0 ; i--) {
            result+=str.charAt(i);
        }
        return result;
    }



}
