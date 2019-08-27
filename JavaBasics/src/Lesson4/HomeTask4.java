package Lesson4;

public class HomeTask4 {

    public static void main(String[] args) {
//    teaParty(6,8);
//    teaParty(3,8);
//    teaParty(20,6);
//
//    twoAsOne(1,2,3);
//    twoAsOne(3,1,2);
//    twoAsOne(3,2,2);

    alarmClock(1,false);
    alarmClock(0,false);
    alarmClock(2,true);
    alarmClock(0,true);
    alarmClock(8,true);
    }

    public static int teaParty(int tea, int candy){
        int res = -1;

        if (tea<5 || candy<5) {
            res = 0;
            System.out.println(res);
        }
        else if (candy>=tea*2 || tea>=candy*2){
            res = 2;
            System.out.println(res);
        }
        else if (tea>=5 && candy>=5){
            res =1;
            System.out.println(res);
        }
        return res;
    }

    public static boolean twoAsOne(int a, int b, int c){
        boolean res = false;
        if (a==b+c || b==a+c || c==a+b) {
            res = true;
            System.out.println(res);
        }
        else {
            System.out.println(res);
        }
        return res;
    }

    public static String alarmClock(int day, boolean vacation){
        String time=" ";
        switch (day) {
            case 0: case 6:
                if (vacation == true) {
                    time = "off";
                    System.out.println(time);
                }
                else {
                    time = "10:00";
                    System.out.println(time);
                }
                break;
            case 1: case 2: case 3: case 4: case 5:
                if (vacation == true) {
                    time = "10:00";
                    System.out.println(time);
                }
                else {
                    time = "7:00";
                    System.out.println(time);
                }
                break;
            default:
                System.out.println("Wrong day index");
        }
        return time;
    }


}

