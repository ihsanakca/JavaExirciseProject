package day15_Arrays_Multi;

public class C08_ArrayTask_3 {
    public static void main(String[] args) {
        String [] words = {"ata", "yatay", "katık", "bursa", "ada", "katak"};

        System.out.println("palindromeSayisi(words) = " + palindromeSayisi(words));
    }
    // Verilen bir string arraydeki palindrome kelimelerin sayısını veren metodu yazınız.
//örnek:
// String [] words = {"ata", "yatay", "katık", "bursa", "ada"}

    public static int palindromeSayisi(String [] kelimeler){
       int sayac = 0;

        for (int i = 0; i < kelimeler.length; i++) {
            if(kelimeler[i].equals(palindromeMu_1(kelimeler[i]))){
                sayac++;
            }
        }
        return sayac;
    }

    public static String palindromeMu(String str){
        String tersHali = "";
        for (int i = str.length()-1; i >=0 ; i--) {
           tersHali += str.charAt(i);
        }
        return  tersHali;
    }

    public static String palindromeMu_1(String str){
        StringBuilder sb = new StringBuilder(str);
        String ters = sb.reverse().toString();
        return ters;

    }

}
