package Lesson26;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        SimpleMap simpleMap = new SimpleMap();

        simpleMap.put("srgii", 18);
        simpleMap.put("ola", 250);
        simpleMap.put("ola", 30);

        Object o = simpleMap.get("ola");

        System.out.println(o);

        Map<String, Integer> hashMap = new HashMap<>();

        hashMap.put("srgii", 18);
        hashMap.put("ola", 250);
        hashMap.put("ola", 30);

        Integer olaAge = hashMap.get("ola");
        System.out.println(olaAge);
    }


}
