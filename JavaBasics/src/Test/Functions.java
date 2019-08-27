package Test;

public class Functions {
    // KEEP TRACK ON pairs of '{', '}' and ';'
    // AVOID COMPILATION ERRORS
    // CHOOSE METHODS NAMES BY YOURSELF

    // 1) implement static method that checks if number (input argument) is odd, and return boolean result
    public static boolean isOdd (int a){
        if (a%2!=0) {
            return true;
        }
        else return false;
    }

    // 2) implement static method to add two decimal numbers (input arguments) and return result
    public static double sum(double a, double b){
        return a + b;
    }

    // 3) implement static method that iterates and prints array (input argument) of characters, return nothing
    public static void printArray (char [] arr){
        for (int i =0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {

        // invoke method from step 1 and print result
        System.out.println(isOdd(5));

        // invoke method from step 2 and print result
        System.out.println(sum(2.7, 5.6));

        // declare and initialize an array and invoke method 3 with it
        System.out.println();

        // Run current class, check output
        char[] myArr = {'a', 'b', 'c', 'd'};
        printArray(myArr);

        System.out.println(new VariablesAndFlowControl().toString());
        String s = "MyString";
        String s2 = new String("b");
        String s3 = "c";
        System.out.println(s.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());

    }

}
