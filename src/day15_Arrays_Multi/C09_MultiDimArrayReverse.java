package day15_Arrays_Multi;

public class C09_MultiDimArrayReverse {
    public static void main(String[] args) {
        int[][] dimArr = {
                {2, 3, 4, 54},
                {5, 5, 25, 255, 5},
                {2, 8, 22, 36, 3},
                {20, 22, 8}
        };
        int[][] reversed = reverseMultiDimArray(dimArr);

        for (int [] ints : reversed){
            for (int i : ints){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    /**
     * int[][] dimArr = {
     * {2, 3, 4, 54},
     * {5, 5, 25, 255, 5},
     * {2, 8, 22, 36, 3},
     * {20, 22, 8}
     * };
     * <p>
     * burdaki çift boyutlu arrayin tersini veren kodu yazınız.
     * sonuç :
     * int[][] dimArr = {
     * {8,22, 20},
     * {3, 36, 22, 8, 2},
     * {5, 255, 25, 5, 5},
     * {54, 4, 3, 2}
     * * };
     */


    public static int[][] reverseMultiDimArray(int[][] multiDimArr) {
        int max = 0;
        for (int[] ints : multiDimArr) {
            if (max < ints.length) {
                max = ints.length;
            }
        }
        int[][] reverseArr = new int[multiDimArr.length][max];

        for (int i = multiDimArr.length - 1, k = 0; i >= 0; i--, k++) {
            for (int j = multiDimArr[i].length - 1, l = 0; j >= 0; j--, l++) {
                reverseArr[k][l] = multiDimArr[i][j];
            }
        }

        return reverseArr;
    }
}
