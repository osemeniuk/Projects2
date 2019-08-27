package Lesson4;

// Full name 'Lesson4.FlowControl'

import java.sql.SQLOutput;
import java.util.Scanner;

public class FlowControl {

     void greatOrNot(){


     }

//    static void dayOfTheWeek(int day){
//
//        switch(day) {
//            case 1:
//                System.out.println("Sunday");
//                break;
//            case 2:
//                System.out.println("Monday");
//                break;
//            case 3:
//                System.out.println("Tuesday");
//                break;
//            case 4:
//                System.out.println("Wednesday");
//                break;
//            case 5:
//                System.out.println("Thursday");
//                break;
//            case 6:
//                System.out.println("Friday");
//                break;
//            case 7:
//                System.out.println("Saturday");
//                break;
//            default:
//                if (day<=0) {
//                    System.out.println("Negative OR ZERO");
//                } else {
//                    System.out.println("Not a WeekDay");
//                }
//             }
//    }

    public static void main(String[] args) {
        //if -else

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input day number: ");

        //int number = scanner.nextInt();
        //String stc = scanner.nextLine();
        int dayNumber = scanner.nextInt();
//        dayOfTheWeek(dayNumber);

        // Ternary Operator

        String out = dayNumber > 1000 ? "GREATER" : "NOT GREAT";
        String out2 = dayNumber < 1000 ? (dayNumber < 1000 ? "LESS THAT ZERO" : "NOT GREAT") : "GREAT";


        if (dayNumber > 1000) {
            System.out.println("GREAT IF");
        }

        // long, int, short, char, byte, String, enum

//        switch(stc) {
//            case "10":
//                System.out.println("this is 10");
//            case "100":
//                System.out.println("100 !");
//            case "-1":
//                System.out.println("-1");
//                break;
//            default:
//                System.out.println("some other");
//        }

//        int number = scanner.nextInt();
//
//        if(number > 0) {
//            System.out.println("POSITIVE");
//        } else if (number < 0) {
//            System.out.println("NEGATIVE");
//
//        } else {
//            System.out.println("ZERO");
//        }

    }

}
