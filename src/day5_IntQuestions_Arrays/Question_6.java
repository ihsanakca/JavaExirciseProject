package day5_IntQuestions_Arrays;

import java.util.Arrays;

public class Question_6 {
    public static void main(String[] args) {

        int[] nums = {1,0,1,0,0,1,1,1,1,1,0,1};
        //System.out.println("Arrays.toString(separate0and1(nums)) = " + Arrays.toString(separate0and1(nums)));
        //System.out.println("Arrays.toString(separate0and1_2(nums)) = " + Arrays.toString(separate0and1_2(nums)));

        int[] clone = nums.clone();

        Arrays.sort(clone);
        System.out.println("Arrays.toString(clone) = " + Arrays.toString(clone));
    }
    public static int[] separate0and1(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }

    public static int[] separate0and1_2(int[] arr) {  //hatası var bir bak
        int[] result = new int[arr.length];
        int j = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                result[i] = 0;
            } else {
                result[j--] = 1;
            }
        }
        return result;
    }
}
