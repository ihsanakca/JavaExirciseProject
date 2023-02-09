package day1_Exercise;

import java.util.Arrays;

public class DimensionalArray {
    public static void main(String[] args) {

        int [][] dim=new int[3][3];

        dim[0][0]=5;
        dim[0][1]=10;
        dim[0][2]=3;
        dim[1][0]=13;
        dim[1][1]=4;
        dim[2][0]=8;
        dim[2][1]=9;
        dim[2][2]=77;

        for (int di[]:dim ) {
            for (int d :di ) {
                System.out.print("d = " + d+" ");
            }
            System.out.println();
        }

        System.out.println("dim.length = " + dim.length);


        String s = Arrays.deepToString(dim);
        System.out.println("s.length() = " + s.length());
        System.out.println("s = " + s);


        int[][] arr3 = new int[2][4];
//        arr3[0] = new int[3];
//        arr3[1] = new int[4];

        arr3[0][0] = 100;
        arr3[0][1] = 100;
        arr3[0][2] = 100;

        arr3[1][0] = 200;
        arr3[1][1] = 200;
        arr3[1][2] = 200;
        arr3[1][3] = 200;

        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                System.out.print("arr3[i][j] = " + arr3[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Arrays.deepToString(arr3) = " + Arrays.deepToString(arr3));
        System.out.println("arr3.length = " + arr3.length);
        System.out.println("arr3[1].length = " + arr3[1].length);



    }
}
