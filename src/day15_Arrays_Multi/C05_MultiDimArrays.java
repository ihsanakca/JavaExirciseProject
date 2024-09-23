package day15_Arrays_Multi;

public class C05_MultiDimArrays {
    public static void main(String[] args) {
        int [] arr = {2, 3, 4, 54};
        int [] arr2 = {2, 3, 4, 54};

        int [][] arrArr2 = {arr,arr2};


        String [] arrStr = {"Abı-Hayat", "3", "Kapıkulu","54"};

        Object [] objects = {3, true , "Ahmet"};



        int [][] multiArr ={
                {2, 3, 4, 54},
                {5, 5, 25, 255, 5},
                {2,8}
        };

        int [][] multiArr2 = new int [3] [2];

        System.out.println("multiArr.length = " + multiArr.length);

        System.out.println("multiArr[1].length = " + multiArr[1].length);

        System.out.println("multiArr[1][2] = " + multiArr[1][2]);

        System.out.println("-----------");

        //for each ile yazdırma

        for(int [] a : multiArr){
            for(int i : a) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
// verilen bir 2 boyutlu arraydaki tek sayıları toplayan metodu yazınız.