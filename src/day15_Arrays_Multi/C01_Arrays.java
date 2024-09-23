package day15_Arrays_Multi;

import java.util.Arrays;

public class C01_Arrays {
    public static void main(String[] args) {
        int[] nums = new int[5];
        nums[0] = 5;
        nums[1] = 6;
      //  nums[2] = 16;  // default değer 0 dır.
        nums[3] = 88;
        nums[4] = 5;

        System.out.println(Arrays.toString(nums));

        int sayilar[] = {55, 36, 2, 3, 21, 20};

        String str = "Ahmet";
        System.out.println("str.length() = " + str.length());

        System.out.println("sayilar.length = " + sayilar.length);

        System.out.println("nums.length = " + nums.length);

        String[] adlar = {"Ali", "Ayşe", "Mehmet", "Nahit"};

        System.out.println(Arrays.toString(adlar));

        String[] adlar2 = adlar;
        String[] adlarClone = adlar.clone();

        adlar[3] = "Yeşim";

        System.out.println("2 "+Arrays.toString(adlar2));
        System.out.println("clone "+ Arrays.toString(adlarClone));

    //    System.out.println(Arrays.toString(adlar));

        System.out.println("Arrays.toString(sayilar) = " + Arrays.toString(sayilar));

        Arrays.sort(sayilar);

        System.out.println("Arrays.toString(sayilar) = " + Arrays.toString(sayilar));



    }


}
