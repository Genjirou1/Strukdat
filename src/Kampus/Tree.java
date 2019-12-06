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
        root.preOrder();
    }
    public void inOrder(){
        root.inOrder();
    }
    public void postOrder(){
        root.postOrder();
    }

}
