package day16_enums.enum1;

public class EnumTestClass {
    public static void main(String[] args) {
        DaysOfWeek day = DaysOfWeek.SATURDAY;
        System.out.println("day = " + day);

        PersonClass person = new PersonClass("Ahmet Ay" ,"1234", DaysOfWeek.THURSDAY);
       // PersonClass person1 = new PersonClass();



        System.out.println("DaysOfWeek.THURSDAY.ordinal() = " + DaysOfWeek.THURSDAY.ordinal());

        DaysOfWeek[] days = DaysOfWeek.values();
        for (DaysOfWeek myDay : days){
            System.out.println(myDay);
        }

        if (day == DaysOfWeek.SATURDAY) {
            System.out.println("Payment will be doubled.");
        }

        System.out.println("Cips.DORITOS.lezzetSeviyesi = " + Cips.DORITOS.lezzetSeviyesi);

        Cips cips = Cips.PATOS;

        System.out.println("cips.getLezzetSeviyesi() = " + cips.getLezzetSeviyesi());

    }
}
