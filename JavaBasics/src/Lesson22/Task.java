package Lesson22;

import java.util.Arrays;

public class Task {

    public static String capitalize(String str) {
        char[] arr = str.toCharArray();
        arr[0] = Character.toUpperCase(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            arr[i] = Character.toLowerCase(arr[i]);
        }
        return Arrays.toString(arr);


    }

    public static String capitalize2(String str) {

        String newStr = str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
        return newStr;


    }

    public static void main(String[] args) {
        System.out.println(capitalize("abc"));
        System.out.println(capitalize("aBc"));
        System.out.println(capitalize("ABC"));
        System.out.println(capitalize2("abc"));
        System.out.println(capitalize2("aBc"));
        System.out.println(capitalize2("ABC"));
    }
}
