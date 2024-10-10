package day00_GeneralPractice;

public class C07_OneHundredFactorial {
    public static void main(String[] args) {
        System.out.println(countZero(15));
    }
    /*
    15! de kaç tane sıfır vardır?
     */

    public static int countZero(int n){
        long result = 1;
        for (int i = 1; i <=n ; i++) {
            result *= i;
        }

        String s = String.valueOf(result);
        int counter = 0;

        for (int i = s.length()-1; i >=0 ; i--) {
            if (s.charAt(i) == '0')
                counter++;
            else
                break;
        }

        return counter;
    }
}
