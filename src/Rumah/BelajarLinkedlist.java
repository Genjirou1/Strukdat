package Rumah;

import java.util.LinkedList;
// trying to make my algorithm ,-,
public class BelajarLinkedlist {
    int data;
    BelajarLinkedlist next;
    static BelajarLinkedlist prev;
    static int previous;
    static int length =1;

    public BelajarLinkedlist(int data) {
        previous = this.data ;
        this.data = data;

    }
    public static BelajarLinkedlist previous (BelajarLinkedlist node){
       if (node.previous != 0){
           prev = new BelajarLinkedlist(previous);
            return prev;
       }
       else {
           return null;
       }
    }

    public static  int hitungNode(BelajarLinkedlist node){
            if (node.next == null)return 1;
            else{
                length++;
                hitungNode(node.next);
                return length;
            }

    }

    public static void main(String[] args) {


        BelajarLinkedlist head = new BelajarLinkedlist(4);
        BelajarLinkedlist nodeB = new BelajarLinkedlist(2);
        BelajarLinkedlist nodeC = new BelajarLinkedlist(3);
        BelajarLinkedlist nodeD = new BelajarLinkedlist(10);
        BelajarLinkedlist nodeE = new BelajarLinkedlist(2);

        head.next = nodeB;
        nodeB.next = nodeC;
        nodeC.next = nodeD;
        nodeD.next = nodeE;
        System.out.println(BelajarLinkedlist.previous(nodeB));

        System.out.println(BelajarLinkedlist.hitungNode(head));
    }
}
