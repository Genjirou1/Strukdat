package Kampus;

public class TestLinkedList {
    //THere Is AnothEr
    public static void main(String[] args) {
        Node a = new Node();
        Node b = new Node();
        a.setValue(5);
        b.setValue(10);

        a.setNext(b);

        System.out.println(a.getValue()+""+ a.getNext());
    }
}
