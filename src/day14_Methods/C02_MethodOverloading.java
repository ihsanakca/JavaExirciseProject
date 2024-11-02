package day14_Methods;

public class C02_MethodOverloading {

    public static void main(String[] args) {
        String id = employeeId("Hasan", "Ay", 23, 1, true);
        System.out.println(id);

        String id2 = employeeId("Tolga", "Başak", 10);
        System.out.println(id2);

        String id3 = employeeId("Nazan", "Yay", 25, 12, false);
        System.out.println(id3);

    }

    public static String employeeId(String ad, String soyad, int yas, int tecrube, boolean erkekMi) {
        String newId;
        if (erkekMi){
            newId = ad + soyad + yas +"--"+ (tecrube * 12);
        }else {
            newId = ad + soyad + yas + "--"+(tecrube * 15);
        }

        return newId;
    }

    public static String employeeId(String ad, String soyad, int tecrube) {
        String newId;
            newId = ad + soyad + "00" + "--"+(tecrube * 12);
        return newId;
    }

}
