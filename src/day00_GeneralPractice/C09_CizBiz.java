package day00_GeneralPractice;

public class C09_CizBiz {
    public static void main(String[] args) {
        cizzBizz(1,1000);
    }

    public static void cizzBizz(int baslangic, int bitis) {
        for (int i = baslangic; i <= bitis; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Cizz Bizz");
            } else if (i % 5 == 0) {
                System.out.println("Bizz");

            } else if (i % 3 == 0) {
                System.out.println("Cizz");
            } else {
                System.out.println(i);
            }
        }
    }
}