package day00_GeneralUsage;

public class Stars {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < i+1; j++) {
                System.out.print(" ");
            }
            for (int j = 10; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 10; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
