package day9_Salyangoz;

import java.util.Arrays;

public class SalyangozTest {
    public static void main(String[] args) {
        int [][] arr={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int[] ints = convertToArray(arr);
        System.out.println("Arrays.toString(ints) = " + Arrays.toString(ints));
    }

    public static int[] convertToArray(int twoDim[][]){
        int []arr=new int[twoDim.length* twoDim.length];
        int j=0;
        for (int i = 0; i < twoDim.length; i++) {
            for (int k = 0; k < twoDim[i].length; k++) {
                arr[j]=twoDim[i][k];
                j++;
            }
        }
        return arr;
    }
}
