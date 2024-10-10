package day00_GeneralPractice;

public class C03_ErrorHandling {
    public static void main(String[] args) {
        String str = "Merhaba Java.";
        System.out.println(str);

        int sayac = 0;

        while (sayac < 1000){
            System.out.println(sayac);
            sayac++;

            try {
                str += str;
            } catch (Error hata) {
                System.out.println("Bir hata oluştu...");
                System.out.println("Hata : "+hata.getMessage());
                hata.printStackTrace();
                break;
            }

        }

        System.out.println("Program Bitti...");
    }
}
