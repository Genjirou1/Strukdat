package Rumah;

public class LinkedlistWindy {
    static class Node {
        String nama;
        Node next;
        Node previous;
    }


        public static void main(String[] args) {
            Node current = null;
            Node first = new Node();   //Create Node first
            Node second = new Node();  //Create Node second
            Node third = new Node();   //Create node third
            /*
             * Isi node dengan data kemudian tautkan ke node berikutnya
             *
             */
            first.nama = "Bayu Kanigoro";
            first.next = second;
            first.previous=null;
            second.nama = "D3366";
            second.previous =first;
            second.next = third;
            third.nama = "Teknik Informatika Bina Nusantara";
            third.next = null;
            third.previous=second;
            current = first; //Set pointer to node first
            while(current != null) {
                System.out.println(current.nama);
                current = current.next;
            }
            System.out.println("Print Dari Belakang / Double Linkedlist");
            current=third;
            while (current!=null){
                System.out.println(current.nama);
                current = current.previous;
            }
        }

    }

