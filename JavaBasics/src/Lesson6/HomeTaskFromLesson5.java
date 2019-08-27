package Lesson6;

public class HomeTaskFromLesson5 {
    public static void main(String[] args) {
        System.out.println(exceeds(new int[]{5, 5, 5}, 20));
        System.out.println(avg(new int[]{5, 5, 5}));
        System.out.println(avg(new int[]{5, 5, 4}));
        System.out.println(max(new int[]{5, 5, 4}));
    }

    static boolean exceeds(int[] arr, long total) {

        int i = 0;
        long sum = 0;
        while (i < arr.length) {
            sum += arr[i++];
        }
        return sum > total;
    }

    static double avg(int[] arr) {

        int i = 0;
        double sum = 0;
        while (i < arr.length) {
            sum += arr[i++];
        }

        return sum / arr.length;
    }

    static int max(int[] arr) {
        int max = 0;
        int i = 0;
        while(i < arr.length){
            if (arr[i] > max) {
                max = arr[i];
            }
            i++;
        }
        return max;
    }

}
