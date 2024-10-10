package day18_errorsAndExceptions;

public class C05_DisadvantagesOfThrows {
    public static void main(String[] args)  {

     //   sleepSecond(2.8);
        sleepSecond_2(8.8);

    }

    public static void sleepSecond (double seconds) throws InterruptedException {
        Thread.sleep((long) (seconds*1000));
    }

    public static void sleepSecond_2 (double seconds)  {
        try {
            Thread.sleep((long) (seconds*1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
