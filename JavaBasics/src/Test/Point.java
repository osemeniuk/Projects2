package Test;

public class Point {
    private int x;
    private int y;

    public Point (int x, int y){
        this.x = x;
        this.y = y;
    }

    public String toString(){
        return x+"-"+x;
    }

    public int hashCode(){
        return x+y;
    }

    public static void main(String[] args) {
//        Point p = new Point(1,2);
//        System.out.println(p.toString());
//        System.out.println(p.hashCode());

        Point a = new Point(1,2);
        Point b = new Point(3,4);
        Point c = b;
        System.out.println(a==b);
        System.out.println(c.equals(b));
    }
}
