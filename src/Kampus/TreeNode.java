package Kampus;

public class TreeNode {
//this is a binary tree
    private int value;
    private TreeNode right;
    private TreeNode left;

    public TreeNode(int value) {
        this.value = value;
    }
    public void insertNode(TreeNode x) {
        if (x.value < this.value) {
            if (this.left == null) {
                this.left = new TreeNode(value);

            } else {
                this.left.insertNode(x);
            }

        }else {
            if (this.right == null){
                this.right = new TreeNode(value);

            }else  {
                this.right.insertNode(x);
            }
        }
    }
//    public void insert(int value){
//        if (value < this.value){
//            if (this.left == null){
//                this.left = new TreeNode(value);
//
//            }else  {
//                this.left.insert(value);
//            }
//        }else{
//            if (this.right == null){
//                this.right = new TreeNode(value);
//
//            }else  {
//                this.right.insert(value);
//
//            }
//        }
//    }
}

