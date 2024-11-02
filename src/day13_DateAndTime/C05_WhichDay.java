package day13_DateAndTime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class C05_WhichDay {
    public static void main(String[] args) throws ParseException {
        // Dogum gününüzü tespit eden bir program yaziniz
        // (YYYY-MM--DD
        // SimpleDateFormat ("EEEE")

        System.out.println("Lutfen dogum gununuzu (YYYY-MM-DD) formatta giriniz! : ");
        Scanner sc = new Scanner(System.in);
        String dateStr = sc.nextLine();

        SimpleDateFormat dateFormat =new SimpleDateFormat("yyyy-MM-dd");
        Date date = dateFormat.parse(dateStr);
        System.out.println(date);
        String dayOfWeek = getDayOfWeek(date);

        System.out.println("Your birthday " + dateStr + " is on " + dayOfWeek);

    }
    public static String getDayOfWeek(Date date){
        SimpleDateFormat dayFormat = new SimpleDateFormat("EEEE");
        return dayFormat.format(date);

    }
}
