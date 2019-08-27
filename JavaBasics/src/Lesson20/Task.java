package Lesson20;

public class Task {

    static public boolean isAscSorted(int[] arr){
        for (int i =0; i<arr.length-1; i++){
            if (arr[i] > arr[i+1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {3, 5, 6, 1};

        System.out.println(isAscSorted(arr));
        System.out.println(isAscSorted(arr2));
    }


}