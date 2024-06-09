package day9_Salyangoz;

public class TestNanoTime {
    public static void main(String[] args) {
        String str="Ahmet";
        var str2="Mehmet";




        long start1 = System.nanoTime();
        System.out.println("str = " + str);
        long end1 = System.nanoTime();
        long result1 = end1 - start1;
        System.out.println("result1 = " + result1);

        long start = System.nanoTime();
        System.out.println("str2 = " + str2);
        long end = System.nanoTime();
        long result = end - start;
        System.out.println("result = " + result);
    }
}
