package Kampus;

public class Tree {
    private TreeNode root;

    public void insert(int value){
        TreeNode baru = new TreeNode(value);
        if (root == null){
            root = baru;
        }else{
            root.insertNode(baru);
        }
//        if (root == null){
//            root = new TreeNode(value);
//        }else{
//            root.insert(value);
//        }
    }

}
