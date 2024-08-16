package day12_yasinHoca;

public class C001_Methods {
    public static void main(String[] args) {

        String hasanSifre = sifreOlustur("Hasan", "Akçay", 1976);
        System.out.println("hasanSifre = " + hasanSifre);

        String bulutSifre = sifreOlustur("Aras","Bulut", "Yılmaz", 1955);
        System.out.println("bulutSifre = " + bulutSifre);

    }
    public static String sifreOlustur(String name, String lastName, int dogumYil){
        String sifre = name.substring(0,2)+lastName.substring(0,2)+dogumYil;
        return  sifre;
    }

    public static String sifreOlustur(String name, String middleName, String lastName, int dogumYil){
        String sifre = name.substring(0,2)+middleName.substring(0,2)+lastName.substring(0,2)+dogumYil;
        return  sifre;
    }
}
