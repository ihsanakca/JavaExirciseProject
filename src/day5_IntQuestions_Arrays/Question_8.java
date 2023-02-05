package day5_IntQuestions_Arrays;

public class Question_8 {
    public static void main(String[] args) {

        int[] nums={2,3,12,1};
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
}
