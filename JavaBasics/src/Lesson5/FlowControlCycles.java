package Lesson5;

import java.util.Scanner;

public class FlowControlCycles {

   static void sth (int n) {
       int [] a = new int [n];
       int i = a.length-1;
       while (i>=0){
          a[i] = i;
           System.out.println(a[i]);
          i--;
       }
   }


    static void sumArray (int[] arr) {
        int accumulator = 0;
        int i = arr.length-1;
        while (i>=0){
            accumulator = accumulator + arr[i];
            System.out.println(accumulator);
            i--;
        }
    }

    static void printArray (int[] arr) {
        int i = arr.length-1;
        while (i>=0){
            System.out.println(arr[i]);
            i--;
              }
    }

    static void evenNumbers(int n) {

        if (n < 0) {
            System.out.println("less then zero");
            return;
        }
        while (n >= 0) {
            if (n % 2 == 0) {
                System.out.println(n);
            }
            n--;
        }

    }

    static void sumOddNumbers(int n) {

        if (n < 0) {
            System.out.println("less then zero");
            return;
        }
        int sum = 0;
        while (n >= 0) {
            if (n % 2 != 0) {
                sum = sum + n;
            }
            n--;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {

//       evenNumbers(5);
//       evenNumbers(6);
//       evenNumbers(8);
//       evenNumbers(10);

//        sumOddNumbers(1);
//        sumOddNumbers(2);
//        sumOddNumbers(3);
//        sumOddNumbers(5);

        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 10;
        arr[2] = 100;
        arr[3] = 1000;
        arr[4] = 10000;

//        sumArray(arr);

//        printArray(arr);

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        sth(n);

//        // times = 10;
//        while(times>0) {
//            System.out.println(times);
//            times--;
//        }
//
//        System.out.println("end");
    }

}
