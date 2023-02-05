package day5_IntQuestions_Arrays;

import java.util.Arrays;

public class Question_1_2 {
    public static void main(String[] args) {
        int arr[] = {55, 268, 1, 28, 29, 3};

//        System.out.println("minOfArr(arr) = " + minOfArr(arr));
//        System.out.println("maxOfArr(arr) = " + maxOfArr(arr));
//        System.out.println("maxOfArr2(arr) = " + maxOfArr2(arr));
        System.out.println("minOfArr2(arr) = " + minOfArr2(arr));

    }

    /*
    How would you find the smallest element in an array?
    How would you find the largest element in an array?
     */
    public static int minOfArr(int[] arr) {
        Arrays.sort(arr);
        return arr[0];
    }

    public static int maxOfArr(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }

    public static int maxOfArr2(int[] arr) {
        int temp=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    arr[i]=arr[i]-arr[j];
                    arr[j]=arr[i]+arr[j];
                    arr[i]=arr[j]-arr[i];
                }
            }
        }
        return arr[arr.length-1];
    }

    public static int minOfArr2(int[] arr) {
        int temp=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    arr[i]=arr[i]-arr[j];
                    arr[j]=arr[i]+arr[j];
                    arr[i]=arr[j]-arr[i];
                }
            }
        }
        return arr[0];
    }

}
