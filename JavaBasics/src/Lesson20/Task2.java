package Lesson20;

public class Task2 {
    static long sumDigits(String s) {
        char[] arr = s.toCharArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i] - '0';
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumDigits("1234"));
    }
}
