package day10_GeneralQuestions;

import java.util.Arrays;

public class C04_InsertingArray {
    public static void main(String[] args) {
        String[] strings = {"A", "B", "C", "D", "E", "F"};

        String[] result = insertingElementToSpecificIndex_2(strings, "XOX", 3);

        System.out.println("Arrays.toString(result) = " + Arrays.toString(result));

    }

    public static String [] insertingElementToSpecificIndex(String [] arr, String element, int index){
        String [] resultArr = new String[arr.length+1];
        if (index<0 || index > arr.length) return arr;

        for (int i = 0; i < resultArr.length ; i++) {
            if (i == index){
                resultArr[i] = element;
            }else if (i>index){
                resultArr[i] = arr[i-1];
            }else {
                resultArr[i] = arr[i];
            }
        }

        return resultArr;
    }

    public static String [] insertingElementToSpecificIndex_2(String [] arr, String element, int index){
        String [] resultArr = new String[arr.length+1];
        if (index<0 || index > arr.length) return arr;

        for (int i = 0; i < resultArr.length ; i++) {
            if (i < index){
                resultArr[i] = arr[i];
            }else if (i == index){
                resultArr[i] = element;
            }else {
                resultArr[i] = arr[i-1];
            }
        }

        return resultArr;
    }

}
