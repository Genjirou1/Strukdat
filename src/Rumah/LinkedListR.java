package Rumah;

import sun.awt.image.ImageWatched;

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

    public void insert (int integer){
        Node temp = new Node (integer);
        temp.next = null;
        if (head==null){
            head=temp;
            return;
        }else{
            Node last = head;
            while (last.next!=null){
                last = last.next;
            }
            last.next= temp;
            return;
        }
    }
   static public void print(LinkedListR a){
        Node current = a.head;
        if (current==null){
            System.out.println("linked list Kosong Silahkan isi dulu");
        }else {
            while (current!=null){
                System.out.print(current.data);
                current = current.next;
            }
            System.out.println();
        }
    }
//    public void addfirst(int integer){
//        if(head == null){
//            head= new Node(integer);
//        }
//        else if (head!=null){
//            while (head!=null){
//                Node temp = head.next;
//                head.next =new Node(integer);
//            }
//        }
//    }
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
    a.insert(2);
    a.insert(3);
    a.insert(5);
    a.insert(1);
    a.insert(7);
   LinkedListR.print(a);
}

}
