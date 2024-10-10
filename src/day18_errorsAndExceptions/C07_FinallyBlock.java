package day18_errorsAndExceptions;

public class C07_FinallyBlock {
    public static void main(String[] args) {
        System.out.println("Test Başladı");

        String [] names = {"Ali","Ahmet","Jale"};

        try {
            System.out.println(names[10]);
            System.out.println("try çalıştı");
        } catch (StringIndexOutOfBoundsException e) {
            System.err.println(e.getMessage());
            System.out.println("catch çalıştı");
        }finally {
            System.out.println("Database kapandı...");
        }

        System.out.println("Test Bitti");
    }
}
