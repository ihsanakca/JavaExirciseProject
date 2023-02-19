package day6_IntQuestions_Arrays;

public class Question1 {
    public static void main(String[] args) {
        int[] arr={1,2,2,3,3,3,5,7,11,15};

        System.out.println("ratioExponentialAndFactorial(arr) = " + ratioExponentialAndFactorial(arr));

    }
    //1,2,2,3,3,3,5,7,11,15 arrayin formüle göre toplanması


    public static double ratioExponentialAndFactorial(int[] arr) {
        double result=0;
        double exponential = 0;
        double factorial = 1;

        for (int i = 0; i < arr.length; i++) {
            exponential = Math.pow(arr[i], i);
            if (i==0) {factorial=1;}
            else {
                factorial *= i;
            }
            result+=exponential/factorial;
        }
        return result;
    }
}
