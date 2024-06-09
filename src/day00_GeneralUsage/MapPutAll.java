package day00_GeneralUsage;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapPutAll {
    public static void main(String[] args) {

        Map<String,Integer> students=new HashMap<>();
        students.put("Hakan",88);
        students.put("Ali",90);
        students.put("Serap",75);
        students.put("Betül",98);
        students.put("İsa",77);

        Map<String,Integer> goodStudents=new LinkedHashMap<>();

/*
        students.forEach((k,v)->{
            if(v>80){
                goodStudents.put(k,v);
            }
        });*/
/*
        students.entrySet().stream()
                        .filter(entry->entry.getValue()>80)
                                .forEach(entry->goodStudents.put(entry.getKey(), entry.getValue()));
*/
        goodStudents.putAll(students.entrySet().stream().filter(entry -> entry.getValue() >= 80).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue)));

        System.out.println("goodStudents = " + goodStudents);
    }
}
