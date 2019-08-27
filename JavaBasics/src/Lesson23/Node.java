package Lesson23;

public class Node {
    int val;
    Node next;
    Node prev;
    Node(int val){
        this.val = val;
    }

    static Node getNodeByVal(int value, Node head){
        while (head != null) {
            if (head.val == value) return head;
            head = head.next;
        }
        return null;


    }}
