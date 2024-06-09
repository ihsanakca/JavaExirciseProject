package day9_Salyangoz;

import java.security.KeyStore;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestDFG {
    public static void main(String[] args) {
        Map <String,Integer> map=new HashMap<>();
        map.put("Ahmet",28);
        map.put("Ali",29);
        map.put("Ayşe",47);
        map.put("Serap",32);
        map.put("Melek",21);

        Set<Map.Entry<String, Integer>> entries = map.entrySet();

        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println( entry.getKey()+"-->"+entry.getValue());

        }

        Iterator<String> iterator = map.keySet().iterator();
        while (iterator.hasNext()){
            String key=iterator.next();
            System.out.println(key+"-->"+map.get(key));
        }

        Set<String> setKey = map.keySet();
        for (String s : setKey) {
            System.out.println(s+"-->"+map.get(s));
        }

    }
}
