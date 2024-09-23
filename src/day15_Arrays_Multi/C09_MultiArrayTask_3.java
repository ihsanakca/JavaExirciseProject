package day15_Arrays_Multi;

import java.util.Arrays;

public class C09_MultiArrayTask_3 {
    public static void main(String[] args) {
        int[][] dimArr = {
                {2, 3, 4, 54},
                {5, 5, 25, 255, 5 ,11, 20},
                {2, 8, 22, 36, 3},
                {20, 22, 8}
        };

        int [][] sonuc = arrayKare(dimArr);

        System.out.println("Arrays.deepToString(sonuc) = " + Arrays.deepToString(sonuc));
    }

    /**
     * int[][] dimArr = {
     * {2, 3, 4, 54},
     * {5, 5, 25, 255, 5},
     * {2, 8, 22, 36, 3},
     * {20, 22, 8}
     * };
     * <p>
     * burdaki çift boyutlu arraydeki her bir elemanın karesini alıp yeni bir çift boyutlu
     * arraye koyan metodu yazınız.
     */

    public static int[][] arrayKare(int[][] dimArr) {
        int max = 0;
        for (int i = 0; i < dimArr.length; i++) {
            if (max < dimArr[i].length){
                max = Math.max(max,dimArr[i].length);
            }
        }

        int[][] sonucArr = new int[dimArr.length][max];

        for (int i = 0; i < dimArr.length; i++) {
            for (int j = 0; j < dimArr[i].length; j++) {
                sonucArr[i][j] = dimArr[i][j] * dimArr[i][j];
            }
        }
        return sonucArr;
    }


}
