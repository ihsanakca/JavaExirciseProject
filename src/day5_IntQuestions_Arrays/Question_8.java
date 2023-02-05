package day5_IntQuestions_Arrays;

import java.util.ArrayList;
import java.util.List;

public class Question_8 {
    public static void main(String[] args) {

        int[] nums={2,3,12};
        System.out.println("permutationOfArray(nums) = " + permutationOfArray(nums));
    }
    //Explain what a permutation is in an array.
    public static int permutationOfArray(int [] arr){
        int permutation=1;
        for (int i=1;i<=arr.length;i++){
            permutation*=i;
        }
        return permutation;
    }

//    public static List<int []> allPermutations(int [] arr){
//        List<int []> allList=new ArrayList<>();
//
//        for (int i = 0; i <arr.length ; i++) {
//            for (int j = i+1; j <arr.length ; j++) {
//                arr[j]=arr[j];
//            }
//        }
//    }
}
