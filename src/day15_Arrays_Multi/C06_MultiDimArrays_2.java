package day15_Arrays_Multi;

public class C06_MultiDimArrays_2 {
    public static void main(String[] args) {

        int[][] multiArr = {
                {2, 3, 4, 54},    //0         00 01 02 03
                {5, 5, 25, 255, 5},  // 1     10 11 12 13 14
                {2, 8}  //2                    20 21
        };


        System.out.println("multiArr[1][3] = " + multiArr[1][3]);

        int[][] multiArr2 = {
                {2, 3, 4, 54},
                {5, 5, 25, 255, 5},
                {2, 8, 22, 36, 3},
                {20, 22, 8}
        };

        //for - i ile çift boyutlu array yazdırma..
        for (int i = 0; i < multiArr2.length; i++) {
            for (int j = 0; j <multiArr2[i].length ; j++) {
                System.out.print(multiArr2[i][j]+" ");
            }
            System.out.println();
        }

        //for-each
        String [] arrStr = {"Abı-Hayat", "98", "Kapıkulu","54"};

        for (String sepet : arrStr){
            System.out.println(sepet.charAt(0));
        }

        //çift boyutlu arrayi for-each ile yazdırmak...
        int[][] dimArr = {
                {2, 3, 4, 54},
                {5, 5, 25, 255, 5},
                {2, 8, 22, 36, 3},
                {20, 22, 8}
        };

        System.out.println("------------------");
        for (int [] arr : dimArr){
            for (int a : arr){
                System.out.print(a+" ");
            }
            System.out.println();
        }



    }
}
