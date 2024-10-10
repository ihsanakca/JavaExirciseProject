package day00_GeneralPractice;

public class C05_ReverseWord {

    public static void main(String[] args) {
        System.out.println(reverse("makedonya"));
    }
    
    public static String reverse(String str){
        String reverse = "";

        for (int i = str.length()-1 ; i >=0 ; i--) {
            reverse = reverse.concat(str.substring(i,i+1));
        }
        return reverse;
    }

    public static String reverse_1(String str) {
        StringBuilder reverse = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse.append(str.charAt(i)); // String'e ekleme yapılıyor
        }

        return reverse.toString(); // StringBuilder'ı String'e çeviriyoruz
    }

    public static String reverse_2(String str) {
        String reverse = "";

        for (int i = str.length()-1 ; i >=0 ; i--) {
            reverse += str.charAt(i);
        }
        return reverse;
    }
}
