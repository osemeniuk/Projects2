package Lesson7;

public class HomeTaskLesson7 {

    public static void main(String[] args) {
//        mult(new int[]{1,2,0,-4},2);
//        mult(new int[]{-5,-1},-5);
//        replaceByZero(new int[]{10,2,2,7,8,3}, 2);
//        replaceByZero(new int[]{7,7,2},10);
//        System.out.println(contains(new int[]{7, 2, 7, 9, 3}, 2, 3));
//        System.out.println(contains(new int[]{7, 2, 7, 9, 3}, 2, 5));
//        System.out.println(contains(new int[]{7, 2, 7, 9, 3}, 11, 15));
//        System.out.println(negativeCount(new int[]{7, 2, 7, 9, 3}));
//        System.out.println(negativeCount(new int[]{-7, -2, -7, -9, -3}));
//        System.out.println(negativeCount(new int[]{-7, -2, 7, 9, 3}));
//        firstLastSwap(new int[]{7, 2, 7, 9, 3});
//        revert(new int[]{1, 2, 3, 4, 5});

    }

    static void mult(int[] arr, int n) {

        for (int item : arr) {
            item = item * n;
            System.out.println(item);
        }
    }

    static void replaceByZero(int[] arr, int n){
        for (int item : arr){
            if (item == n) {
                item = 0;
            }
            System.out.println(item);
        }
    }

    static boolean contains (int[] arr, int x, int y){
        boolean containsX = false;
        boolean containsY = false;
        for (int item : arr){
            if (item == x) {
                containsX = true;
            }
            else if (item == y) {
                containsY = true;
            }
            }
         if (containsX & containsY) {
             return true;
         }

         else {
             return false;
         }


    }

    static int negativeCount(int[] arr) {
        int count = 0;
        for (int item:arr){
            if (item<0){
                count +=1;
            }
        }
        return count;
    }

    static void firstLastSwap(int[] arr){
        int first = arr[0];
        int last = arr[arr.length-1];
        arr[0] = last;
        arr[arr.length-1] = first;
        for(int item : arr){
            System.out.println(item);
        }
    }

    static void revert(int[] arr){
        for (int i=arr.length-1; i>=0; i--){
            System.out.println(arr[i]);
        }
    }
}
