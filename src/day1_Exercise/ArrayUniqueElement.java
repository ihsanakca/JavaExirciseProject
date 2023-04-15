package day1_Exercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ArrayUniqueElement {
    public static void main(String[] args) {

        int[] arr = {22, 42, 45, 40, 23, 49,25, 24, 22, 36,28, 47, 38, 38, 42, 45, 25, 23, 36, 40, 24, 47,28};
        System.out.println("findDifferentInArray(arr) = " + findDifferentInArray(arr));
        System.out.println("findDifferentInArray2(arr) = " + findDifferentInArray2(arr));
        System.out.println("findDifferentInArray2(arr) = " + findDifferentInArray2(arr));
    }

    public static boolean solution(String email) {
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static int findDifferentInArray(int[] A) {
        int result = 0;
        for (int i = 0; i < A.length; i++) {
            result ^= A[i];
        }
        return result;
    }

    public static int findDifferentInArray2(int[] A) {

        List<Integer> list = new ArrayList<>();
        for (int a : A) {
            list.add(a);
        }
        Collections.sort(list);

        for (int i = 0; i < list.size(); ) {
            if (list.size()==1){
                return list.get(0);
            }
            if (list.get(0) == list.get(1)) {
                list.remove(list.get(0));
                list.remove(list.get(0));
            } else {
                return list.get(0);
            }
        }
        return -1;
    }
    public static Integer findDifferentInArray3(int[] arr) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            Integer count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            map.put(count, arr[i]);
            //map.put(arr[i], count );
        }
        //System.out.println("map = " + map);

        return map.get(1);
    }


}
