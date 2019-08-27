package Lesson19;

public class Main {
    static boolean isBalancePoint(int[] arr, int p) {
        int firstSum = 0;
        int secondSum = 0;
        if (p > arr.length || p < 0) {
            return false;
        }
        int i = 0;
        while (i < arr.length) {
            firstSum += i < p ? arr[i++] : 0;
            secondSum += i > p ? arr[i++] : 0;
        }

        return firstSum == secondSum;
    }

    public static void main(String[] args) {
        int arr[] = {-1, 1, 5, -2, 2};
        int arr2[] = {1, 5, -2, 2};
        System.out.println(isBalancePoint(arr, 2));
        System.out.println(isBalancePoint(arr2, 2));
        System.out.println(isBalancePoint(arr2, 0));
        System.out.println(isBalancePoint(arr2, 4));
        System.out.println(isBalancePoint(arr2, 10));
        System.out.println(isBalancePoint(arr2, -1));
    }
}
