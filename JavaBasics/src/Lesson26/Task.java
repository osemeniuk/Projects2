package Lesson26;

import java.util.*;

public class Task {

    public static void main(String[] args) {
        List<String> words = new LinkedList<>();
        words.add("Java");
        words.add("Hello");
        words.add("Hello");
        words.add("World");
        deduplicate(words);


    }

    public static List<String> deduplicate(List<String> words) {
        for (String element : words) {
            System.out.println(element);
        }
        Set<String> set = new HashSet<>();
        set.addAll(words);
        System.out.println("-----");
        for (String element : set) {
            System.out.println(element);
        }
        return new ArrayList<>(set);
    }

}
