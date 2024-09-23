package day15_Arrays_Multi;

public class C03_ArrayTasks_2 {
    public static void main(String[] args) {

        int [] nums = {20,12,23,25,300,1,0};
        int[] donusturulmus = donustur(nums);

        for (int herEleman : donusturulmus) {
            System.out.print(herEleman+"+");
        }



    }
    // n elemanlı bir arrayin tek elemanlarını alıp başka bir arraye atın
    // eğer sayı çiftse oraya 100 yazın.

    public static int [] donustur(int [] sayilar){
        int [] sonuc = new int[sayilar.length];

        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i] % 2 == 1){
                sonuc[i] = sayilar[i];
            }else {
                sonuc[i] = 100;
            }
        }
        return sonuc;
    }
}
