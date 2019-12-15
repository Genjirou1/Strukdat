package Kampus;

public class Tree {
     TreeNode root;

    public void insertNode(int value){
        TreeNode baru = new TreeNode(value);
        if (root == null){
            root = baru;
        }else{
            root.insertNode(baru);
        }
    }
    public void insert(int value){
        if (root == null){
            root = new TreeNode(value);
        }else{
            root.insert(value);
        }
    }
    public void preOrder(){
        if (root != null){
            root.preOrder();
        }else {
            System.out.println("Data Kosong");
        }

    }
    public void inOrder(){
        if (root != null){
            root.inOrder();
        }else{
            System.out.println("Data Kosong");
        }
    }
    public void postOrder(){
       if (root != null){
           root.postOrder();
       }
       else {
           System.out.println("Data Kosong");
       }
    }

}
