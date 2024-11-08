package day20_recursion;

public class C01_RecursionTutorial {


    public static void main(String[] args) {
        sayHi(5);
    }

    private static void sayHi(int count){

        System.out.println("Hi");
        if (count <=1){
            return;
        }
        sayHi(count -1);
    }
}
