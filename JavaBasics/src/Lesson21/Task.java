package Lesson21;

import java.util.Arrays;

public class Task {

    static int[] runningSumOf(int[] arr) {
        int newArr[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                newArr[i] = arr[i];
            } else {
                newArr[i] = arr[i] + newArr[i - 1];
            }
        }
        return newArr;
    }

    public static void main(String[] args) {
//        int[] arr1 = new int[]{1, 7, 2, 3, 0, 10};
//        System.out.println(Arrays.toString(runningSumOf(arr1)));
        byte b = 1;
        int i = 2;
        short s = 3;
        long  l = 4;
        double d = 5.0;
        float f = 6;
        char c = 'a';
        boolean bool = true;

        Byte b1 = 1;                /*autoboxing*/
        //Byte bn = Byte.valueOf(1);
        byte b2 = b1;               /*autoUnboxing*/

        Integer i1 = 2;
        Short s1 = 3;
        Long l1 = 4L;
        Double d1 = 5.0;
        Float f1 = 6F;
        Character c1 = 'a';
        Boolean bool1 = true;

        String sn = "abc";
        String s2 = "abc";
        String s3 = new String ("abc");

    }
}
