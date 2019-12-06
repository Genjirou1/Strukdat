package Kampus;

public class TestTree {
    public static void main(String[] args) {
        Tree a = new Tree();
        a.insert(4);
        a.insert(2);
        a.insert(5);
        a.insert(10);
        a.insert(30);
        a.insert(11);
        a.insert(12);

        a.preOrder();
        a.inOrder();
        a.postOrder();
    }
}
