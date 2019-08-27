package Lesson22;

import java.util.Arrays;

public class ArrayIntList {
    private int[] arr;

    public ArrayIntList() {
        this.arr = new int[0];
    }

    public void add(int value) {
        int[] arr1 = new int[arr.length + 1];
        System.arraycopy(arr, 0, arr1, 0, arr.length);
        arr1[arr1.length - 1] = value;
        arr = arr1;
    }

    public void addAll(int[] value) {
        for (int i : value) {
            add(i);

        }
    }

    public int removeLast() {
        int[] arr2 = new int[arr.length - 1];
        for (int i = 0; i < arr.length-1; i++) {
            arr2[i] = arr[i];
        }
        int val = arr[arr.length - 1];
        arr = arr2;
        return val;
    }

    public int get(int index) {
        return arr[index];

    }

    public int length() {
        return arr.length;
    }

    public boolean equals(Object o) {
        ArrayIntList that = (ArrayIntList) o;
        if (this.length() != that.length()) return false;

        for (int i = 0; i < that.length(); i++) {
            if (that.get(i) != this.get(i)) return false;

        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(this.arr);

    }

    public static void print(ArrayIntList arr) {
        for (int i = 0; i < arr.length(); i++) {
            System.out.print(arr.get(i) + " ");
        }

    }
    public static void print0(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        ArrayIntList arr1 = new ArrayIntList();
        arr1.add(5);
        arr1.add(6);
        arr1.add(4);
        print(arr1);


    }
}
