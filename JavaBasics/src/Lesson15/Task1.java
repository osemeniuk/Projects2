package Lesson15;

public class Task1 {

    public static void main(String[] args) {
        String arr1 = "abba";
        String arr2 = "abbc";
        String arr3 = "abcba";
        System.out.println(isPalindrome(arr1));
        System.out.println(isPalindrome(arr2));
        System.out.println(isPalindrome(arr3));

    }

    static boolean  isPalindrome(String s){
        char[]ars = s.toCharArray();
        boolean result = true;
        int j = ars.length/2;
        int k = ars.length-1;
        for (int i = 0; i < j; i++){
            if (ars[i] != ars[k-i]){
                    result = false;
            }
        }
        return result;
    }

}
