package day20_recursion;

public class C02_ReverseStringWithRecursion {

static String result = "";

    public static void main(String[] args) {
        System.out.println("Reverse = " + reverseWithRecursion("avalon"));

        System.out.println(reverseString("avalon"));
    }

    private static String reverse(String str) {
        String result = "";
        while (!str.isEmpty()) {
            result += str.charAt(str.length() - 1);
            str = str.substring(0, str.length() - 1);
        }
        return result;
    }

    private static String reverseWithRecursion(String str) {
       result += str.charAt(str.length()-1);
       str = str.substring(0,str.length()-1);
       if (!str.isEmpty()){
           reverseWithRecursion(str);
       }

       return result;
    }

    public static String reverseString(String str) {
        // Base case: Eğer string boşsa veya tek bir karakterden oluşuyorsa, doğrudan kendini döndür.
        if (str.length() <= 1) {
            return str;
        }

        // Recursive case: String'in ilk karakterini atla ve geri kalan kısmını reküsif olarak ters çevir.
        // Sonra, ters çevrilen kısmın başına ilk karakteri ekle.
        return reverseString(str.substring(1)) + str.charAt(0);
    }
}
