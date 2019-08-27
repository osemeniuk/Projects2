package Lesson23;

public class Main {
    public static void main(String[] args) {
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(5);

        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;

        five.prev = four;
        four.prev = three;
        three.prev = two;
        two.prev = one;

        Node n = Node.getNodeByVal(4, one);
    }

}
