package day5_IntQuestions_Arrays;

import java.util.Arrays;

public class Question_7 {
    public static void main(String[] args) {

        int[] nums={2,3,12,25,23,9,8,11,10,3,3,3};
        System.out.println("Arrays.toString(separateOddsAndEvens(nums)) = " + Arrays.toString(separateOddsAndEvens(nums)));
        //System.out.println("Arrays.toString(separateOddsAndEvens2(nums)) = " + Arrays.toString(separateOddsAndEvens2(nums)));
    }

    public static int[] separateOddsAndEvens(int[] arr) {
        int[] resultArr = new int[arr.length];
        int j = arr.length - 1, k = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                resultArr[k++] = arr[i];
            } else {
                resultArr[j--] = arr[i];
            }
        }
        return resultArr;
    }
    public static int[] separateOddsAndEvens2(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[i]%2==0&&arr[j]%2==1){
                    arr[i]=arr[i]+arr[j];
                    arr[j]=arr[i]-arr[j];
                    arr[i]=arr[i]-arr[j];
                }
            }
        }
        return arr;
    }
}
