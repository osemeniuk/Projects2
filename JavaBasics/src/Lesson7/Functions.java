package Lesson7;

public class Functions {

    static void printArray(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            System.out.println(arr[i]);
            i++;
        }
    }

    static void printArray2(int[] arr) {
        for (int i = 0; i < arr.length; i+=2) {
            System.out.println(arr[i]);
        }
    }

    static void printArrayFromIndex(int[] arr, int n) {
        if (n >= 0) {
            while (n < arr.length) {
                System.out.println(arr[n]);
                n++;
            }
        } else {
            System.out.println("InvalidIndex");
        }
    }

    static void printArrayFromIndex2(int[] arr, int n) {
        if (n < 0) {
            return;
        }
        for (; n < arr.length; n++) {
            System.out.println(arr[n]);
        }
    }

    static void printReverse(int[] arr) {
        int i = arr.length - 1;
        while (i >= 0) {
            System.out.println(arr[i]);
            i--;
        }
    }

    static void printReverse2(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }

    static void printReverseFromIndex(int[] arr, int n) {
        if (n >= 0) {
            while (n >= 0) {
                System.out.println(arr[n]);
                n--;
            }
        } else {
            System.out.println("InvalidIndex");
        }
    }

    static void printReverseFromIndex2(int[] arr, int n) {
        if (n < 0) {
            return;
        }
        for (; n >= 0; n--) {
            System.out.println(arr[n]);

        }
    }

    static void printSubArray(int[] arr, int from, int to) {
        if (from < 0 || to < 0) {
            return;
        }
        if (from >= arr.length || to >= arr.length) {
            return;
        }
        while (from <= to) {
            System.out.println(arr[from]);
            from++;
        }


        return;
    }

    static void printSubArray2(int[] arr, int from, int to) {
        if (from < 0 || to < 0) {
            return;
        }
        if (from >= arr.length || to >= arr.length) {
            return;
        }
        for (; from <= to; from++) {
            System.out.println(arr[from]);
        }
    }

    static void ForEach(char[] arr) {
        for (char e: arr){
            System.out.println(e);
        }
    }


    public static void main(String[] args) {
        int[] arr = {100, -10, 14, 11};
        int[] arr2 = {1, 2, 3};
         char[] arr3 = {'h', 'e', 'l', 'k', 'o'};
//        printArray(arr);
        printArray2(arr);
//        printArrayFromIndex(arr, 1);
//        printArrayFromIndex2(arr, 1);
//        printReverse(arr);
//        printReverse2(arr);
//        printReverseFromIndex(arr, 3);
//        printReverseFromIndex2(arr, 3);
//        printSubArray(arr, 1, 2);
//        printSubArray(arr, 3, 2);
//        printSubArray2(arr, 1, 2);
//        printSubArray2(arr, 3, 2);
        ForEach(arr3);

    }
}
