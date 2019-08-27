package Lesson5;

public class HomeTask {
    public static void main(String[] args) {

        exceeds(new int[]{1, 1, 1}, 10);
        exceeds(new int[]{5, 10, 15}, 7);
        avg(new int[]{1, 2, 3});
        avg(new int[]{5, 10, 15, 10});
        max(new int[]{1, 2, 3});
        max(new int[]{5, 10, 15, 15});
        max(new int[]{40, 10, 15, 15});
    }

    static boolean exceeds (int [] arr, long total){

        int i = 0;
        int sum = 0;
        while (i <= arr.length-1) {
            sum = sum + arr[1];
            ++i;
        }

        boolean result = false;
        if (sum > total) {
            result = true;
            System.out.println(result);
        }
        else {
            result = false;
            System.out.println(result);
        }

        return result;
    }

    static double avg (int [] arr) {
        int i = 0;
        int sum = 0;
        while (i <= arr.length-1 ) {
            sum = sum + arr[1];
            ++i;
        }

        double avg = sum / arr.length;
        System.out.println(avg);
        return avg;
    }

    static int max (int [] arr) {
        int i = 0;
        int max = 0;
        while (i <= arr.length-1 ) {
            if (arr[i] > max) {
                max = arr[i];
            }
            ++i;
            }

        System.out.println(max);
        return max;
    }
}
