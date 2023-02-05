package day5_IntQuestions_Arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Question_4 {
    public static void main(String[] args) {
        int arr[] = {55, 101, 1, 28, 29, 2};
        System.out.println("sumOfArray(arr) = " + sumOfArray(arr));
        System.out.println("sumOfArray2(arr) = " + sumOfArray2(arr));
        System.out.println("sumOfArray3(arr) = " + sumOfArray3(arr));

    }
    //How would you write a program to determine the sum of elements in integer arrays?
    public static int sumOfArray(int []arr){
        int sum=0;
        for (int i : arr) {
            sum+=i;
        }
        return sum;
    }
    public static int sumOfArray2(int []arr){
        int sum=0;
        for (int i = 0; i <arr.length ; i++) {
            sum+=arr[i];
        }
        return sum;
    }
    public static int sumOfArray3(int []arr){
        return Arrays.stream(arr).sum();
    }
}
