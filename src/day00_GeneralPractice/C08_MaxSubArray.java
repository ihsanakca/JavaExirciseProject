package day00_GeneralPractice;

public class C08_MaxSubArray {
    public static void main(String[] args) {
        int [] array = {2,1,5,1,3,9};
        System.out.println("maxSub(array) = " + maxSub(array,3));
        System.out.println("maxSubSlidingWindow(array,3) = " + maxSubSlidingWindow(array, 3));
    }

    public static int maxSub(int[] arr, int k) {
        int sonuc = 0;
        int geciciToplam = 0;

        for (int i = 0; i <= arr.length - k; i++) {
            geciciToplam = 0;
            for (int j = i; j <i+k ; j++) {
                geciciToplam += arr[j];
            }
            if (geciciToplam > sonuc){
                sonuc = geciciToplam;
            }
        }
        return sonuc;
    }

    public static int maxSubSlidingWindow(int[] arr, int k) {
        int sonuc = 0;
        for (int i = 0; i <k; i++) {
            sonuc += arr[i];
        }
        int geciciToplam = sonuc;

        for (int i = 1; i <=arr.length - k ; i++) {

            geciciToplam = geciciToplam + arr[i+k-1] - arr[i-1];

            if (geciciToplam > sonuc)
                sonuc = geciciToplam;
        }
        return sonuc;
    }
}
