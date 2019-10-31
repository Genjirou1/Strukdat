package Rumah;

public class LinkedListR {
    Node head;
    Node tail;
    class Node{
        int data;
        Node next;

        public int getData() {
            return data;
        }

        public Node getNext() {
            return next;
        }

        public Node(int data) {
            this.data = data;
        }

    }
    public void addfirst(int integer){
        if(head == null){
            head= new Node(integer);
        }
        else if(head != null){
            head.next= new Node(integer);

        }
    }
//    public void addafterhead(int integer){
//        Node temp;
//        if(head.next ==null){
//            head.next = new Node(integer);
//        }else if (head.next != null){
//            temp = new Node(head.next.getData());
//            head.next = new Node(integer);
//            head.next.next= temp;
//
//
//        }
//    }

    public static void main(String[] args) {
        LinkedListR a = new LinkedListR();
        a.addfirst(2);
        a.addfirst(4);
        System.out.println(a.head.getData());
        System.out.println(a.head.next.getData());
        System.out.println(a.head.next.next.getData());
    }
}
