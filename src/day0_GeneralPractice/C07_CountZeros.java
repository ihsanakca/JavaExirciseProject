package day0_GeneralPractice;

public class C07_CountZeros {
    public static void main(String[] args) {
        String s = "10000001";
        System.out.println("countZeros(s) = " + countZeros(s));
    }

    // count zeros between 1's.
    public static int countZeros(String str){
        int counter = 0;

        int firstIndex = str.indexOf('1');
        int lastIndex = str.lastIndexOf('1');

        for (int i = firstIndex; i <lastIndex ; i++) {
            if (str.charAt(i) == '0'){
                counter++;
            }
        }
        return counter;
    }
}
