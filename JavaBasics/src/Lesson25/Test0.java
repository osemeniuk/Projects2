package Lesson25;

import java.util.*;

public class Test0 {

    public static void main(String[] args) {
//        Queue<String> queue = new LinkedList<>();
//        queue.add("Hello");
//        queue.add("Java");
//        queue.add("World");
//        System.out.println(queue.size());
//        for (String element : queue) {
//            System.out.println(element);
//
//        }
//        System.out.println(queue.poll());
//        System.out.println(queue.poll());
//        System.out.println(queue.poll());
//        System.out.println(queue.size());
//
//        Stack<String> s = new Stack<>();
//        s.push("Hello");
//        s.push("Java");
//        s.push("World");
//        System.out.println(s.size());
//        for (String element : s) {
//            System.out.println(element);
//
//        }
//        System.out.println(s.pop());
//        System.out.println(s.pop());
//        System.out.println(s.pop());
//        System.out.println(s.size());

        Set<String> hs = new HashSet<>();
        hs.add("Hello");
        hs.add("Java");
        hs.add("World");
        hs.add("Java");
        System.out.println(hs.size());
        for (String element : hs) {
            System.out.println(element);
        }
    }

}
