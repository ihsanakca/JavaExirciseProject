import java.util.Arrays;

public class C10_SubArraySum {

    public static void main(String[] args) {
        int arr[] = { 1, 4, 1, 3, 3, 10, 5};
        int toplam = 7;

        System.out.println(Arrays.toString(subArraySum(arr, toplam)));
    }
    /**
     * Tamsayılardan oluşan 1 tabanlı bir dizinleme dizisi arr[] ve bir tamsayı toplamı verildiğinde .
     * Esas olarak, bu alt dizinin sol ve sağ dizinlerini ( 1 tabanlı dizinleme ) döndürmeniz gerekir.
     * Birden fazla alt dizi olması durumunda, soldan sağa hareket ederken ilk gelen alt dizi dizinlerini döndürün.
     * Böyle bir alt dizi yoksa,  -1 öğesinden oluşan bir dizi döndürün .
     *
     * Örnekler:
     *
     * Giriş : arr[] = { 15, 2, 4, 8, 9, 5, 10, 23}, toplam = 23
     * Çıkış : 2 5
     * Açıklama: 2 ve 5 dizinleri arasındaki elemanların toplamı 2 + 4 + 8 + 9 = 23'tür
     *
     *
     * Giriş : arr[] = {1, 4, 0, 0, 3, 10, 5}, toplam = 7
     * Çıkış : 2 5
     * Açıklama: 2 ve 5 dizinleri arasındaki elemanların toplamı 4 + 0 + 0 + 3 = 7'dir
     *
     *
     * Giriş : arr[] = {1, 4}, toplam = 0
     * Çıkış : -1
     * Açıklama: 0 toplamı olan alt dizi yok
     */

    private static int [] subArraySum(int [] nums, int target){
        for (int i = 0; i < nums.length; i++) {
            int sum = nums[i];
            for (int j = i+1; j <nums.length ; j++) {
                sum += nums[j];
                if (sum == target){
                    return new int [] {i+1,j+1};
                }
            }
        }
        return new int [] {-1,-1};
    }
}
