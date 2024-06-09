package day10_GeneralQuestions;

public class CCCC extends BBBB{

   String s = "CCCC";

    protected void print(){
        System.out.println("CCCC");
    }

    public static void main(String[] args) {
        BBBB b = new CCCC();
        AAAA a = new CCCC();

        b.print();
        System.out.println(b.s);
        System.out.println("---------");

        a.print();
        System.out.println(a.s);
    }
}
