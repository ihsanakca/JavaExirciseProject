package day00_GeneralUsage;

public class GeneralPurpose {
    enum Seasons{
        ILKBAHAR,KIS,SONBAHAR,YAZ
    }
    public static void main(String[] args) {
        System.out.println(Seasons.YAZ);
        for (Seasons value : Seasons.values()) {
            System.out.println(value);
        }
        Seasons[] values = Seasons.values();
        System.out.println("values = " + values);

        System.out.println(Seasons.ILKBAHAR +Seasons.YAZ.toString());

        System.out.println("Device.Redmi_Note_8.udid = " + Device.Redmi_Note_8.udid);

        System.out.println("Device.PIXEL2.toString() = " + Device.PIXEL2);
    }
}
