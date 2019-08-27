package Lesson22;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        ArrayIntList arrayIntList = new ArrayIntList();

        arrayIntList.add(10);
        arrayIntList.add(20);
        arrayIntList.add(30);
        arrayIntList.add(40);
        arrayIntList.add(50);

        System.out.println("size" + arrayIntList.length());

        for (int i = 0; i < arrayIntList.length(); i++) {
            System.out.println(" " + arrayIntList.get(i));
        }

        System.out.println();
        System.out.println("remove last" + arrayIntList.removeLast());
        System.out.println("remove last" + arrayIntList.removeLast());

        for (int i = 0; i < arrayIntList.length(); i++) {
            System.out.println(" " + arrayIntList.get(i));

        }
        System.out.println();

        System.out.println("size" + arrayIntList.length());
    }
}
