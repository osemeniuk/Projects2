package Test;

import com.sun.tools.corba.se.idl.constExpr.Not;

public class VariablesAndFlowControl {
    public static void main(String[] args) {

        // KEEP TRACK ON pairs of '{', '}' and ';'
        // AVOID COMPILATION ERRORS
        // KEEP EVERYTHING INSIDE main METHOD

        // LOCAL VARIABLES

        // 1) declare and initialize integer variable
        int a = 1;

        // 2) declare and initialize decimal variable
        double b = 3.0;

        // 3) declare and initialize boolean constant
        boolean c = true;

        // 4) declare and initialize String object
        String d = "myString";

        // 5) declare integer array of size 10
        int [] arr = new int[10];

        // OPERATORS


        // 6) add 10 to variable from step 1, result should be assigned to new variable
        int a1 = a + 10;

        // 7) increment by 1 variable from step 2
        b++;

        // 8) subtract by 10 variable from step 6
        a1-=10;

        // 9) multiply variables from step 7 and 8, result should be assigned to new variable
        double b2 = b*a1;

        // 10) apply 'NOT' operation to variable from step 3, result should be assigned to new variable
        boolean c1 = !c;

        // 11) apply 'AND' operation for variable from step 3 and 10, result should be assigned to new variable
        boolean c2 = c&&c1;

        // FLOW CONTROL

        // 12) write if-statement (use variable from step 3), put inside: System.out.println("if-block");
        if (c) {
            System.out.println("if-block");
        }

        // 13) write switch-statement with default section, switch on variable from step 1,
        //     for case 1 put System.out.println("case-1");
        //     for default case put System.out.println("default");
        switch (a) {
            case 1:
                System.out.println("case-1");
            default:
                System.out.println("default");
        }

//        // 14) write while-loop (use variable from step 3), put inside: System.out.println("while-block");
//        while (c) {
//            System.out.println("while-block");
//            c = false;
//        }
//
//        // 15) write do-while-loop (use variable from step 3), put inside: System.out.println("do-while-block");
//        do {
//            System.out.println("do-while-block");
//            c=false;
//        } while (c);

        // 16) write for-loop, initialize all elements of array (from step 5) by current value of i
        for (int i=0; i<arr.length; i++) {
            arr[i] = i;
        }

        // 17) iterate over array from step 5, print only values bigger then 10
        for (int i=0; i<arr.length; i++) {
            if (arr[i]>10) {
                System.out.println(arr[i]);
            }
        }

        // 18) iterate over array from step 5, increase each value by 100
        for (int i=0; i<arr.length; i++) {
            arr[i] += 100;
        }

        // 19) swap first and last elements from array from step 5
            int first = arr[0];
            int last = arr[arr.length-1];
            arr[0] = last;
            arr[arr.length-1] = first;

        // 20) calculate average of array from step 5
        int sum = 0;
        for (int i=0; i<arr.length; i++) {
            sum+=arr[i];

        }

        System.out.println(sum/arr.length);

        // comment sections 14, 15
        // Run current class, check output

    }

}
