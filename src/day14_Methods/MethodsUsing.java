package day14_Methods;

public class MethodsUsing {
    public static void main(String[] args) {
        System.out.println("formul(54,6) = " + formul(54, 6));
    }

    public static int formul (int zeminAlani , int kolonSayisi){
        int sonuc = (zeminAlani * zeminAlani) / kolonSayisi;
        return sonuc;
    }


}
