package Lesson8.HomeTaskLesson8;

public class Rectangle {
    double width;
    double heights;

    double perimiter(){
        double perimiter = 2 * width + 2 * heights;
        return perimiter;
    }

    double area(){
        double area = width * heights;
        return area;
    }
}
