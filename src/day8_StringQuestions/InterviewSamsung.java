package day8_StringQuestions;

import java.util.Map;
import java.util.TreeMap;

public class InterviewSamsung {
    public static void main(String[] args) {
        String str="samsung,'OEM Samsung Washing Machine Pulsator Washplate Cap Shipped With WA48J7700AW, WA48J7700AW/A2, WA48J7700AW/AA', 20916," +
                "samsung,'OEM Samsung Chrome Washing Machine Washplate Pulsator Cap Shipped With WA52M7750AV, WA52M7750AV/A4, WA52M7750AW, WA52M7750AW/A4', 91995," +
                "samsung,'SAMSUNG Washing Machine Spring Hanger, DC61-01257M', 22970," +
                "samsung,'Samsung DC97-17022B Assy Detergent', 32959," +
                "samsung,'Samsung DC66-00470A DAMPER SHOCK', 29981," +
                "samsung,'DC64-00519D Samsung Washing Machine Door Lock Washer Dryer Dishwashe -MP#GH4498 349Y49HBRG9109150', 52000," +
                "samsung,'Samsung DC97-16991A Assembly Filter', 13000";

        Map<String,String> mapStr=new TreeMap<>();

        String[] strArr1 = str.split("samsung,'");

        for (int i = 1; i < strArr1.length; i++) {
            String[] strArr2 = strArr1[i].split("',");
            mapStr.put(strArr2[1],strArr2[0]);
        }
         mapStr.forEach((k,v)-> System.out.println("samsung,'"+v+"',"+k));

       // System.out.println(mapStr);
    }
}
