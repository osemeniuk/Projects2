package Lesson8.HomeTaskLesson8;

public class Main {

    public static void main(String[] args) {
        Circle circ1 = new Circle();
        circ1.radius = 2;
        System.out.println(circ1.length());
        Rectangle rect1 = new Rectangle();
        rect1.heights = 2;
        rect1.width = 5;
        System.out.println(rect1.perimiter());
        System.out.println(rect1.area());
    }

}
