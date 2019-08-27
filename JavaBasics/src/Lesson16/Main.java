package Lesson16;

public class Main {

    public static void main(String[] args) {
        System.out.println(compareAray(new int[]{1,2,3},new int[]{1,2,3}));
        System.out.println(compareAray(new int[]{1,6,3},new int[]{1,2,3}));
    }
   static boolean compareAray(int[] arr1, int [] arr2) {
        if (arr1.length != arr2.length){
            return false;
        }
        for(int i=0; i<arr1.length; i++){
            if (arr1[i]!=arr2[i]){
                return false;
            }
        }
       return true;
    }
}
