package Lesson6;

public class Lesson6Functions {

    public static void main(String[] args) {
//        System.out.println(firstPositive(new int[] {5,5,5}));
//        System.out.println(firstPositive(new int[] {-5,-5,-5}));
//        System.out.println(firstPositive(new int[] {-5,0,10}));
//        System.out.println(firstPositive(new int[] {0,5,-5}));
//        System.out.println(maxAbc(new int[] {5,5,5}));
//        System.out.println(maxAbc(new int[] {-5,10,-20}));
//        System.out.println(maxAbc(new int[] {-5,0,10}));
//        System.out.println(maxAbc(new int[] {0,5,-5}));

        biggerNext(new int[] {5,5,5});
        biggerNext(new int[] {5,6,2});
    }

    static int firstPositive(int[] arr){
        int i = 0;
        int pos = 0;
        while ( i<arr.length) {
             if (arr[i] > 0) {
                 pos = arr[i];
                 return pos;
             }
             i ++;
            }
            return pos;
        }
     static int maxAbc (int[] arr)  {
         int max = 0;
         int i = 0;
         while(i < arr.length){
             if (Math.abs(arr[i]) > max) {
                 max = Math.abs(arr[i]);
             }
             i++;
         }
         return max;
     }

     static void biggerNext(int[] arr) {
        int i = 1;
        while (i < arr.length){
            if (arr[i] > arr[i-1]){
                System.out.println(arr[i]);
            }
            i++;
        }
     }

    }

