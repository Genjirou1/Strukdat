package Kampus;

public class TreeNode {
//this is a binary tree
     int value;
     TreeNode right;
     TreeNode left;

    public TreeNode(int value) {
        this.value = value;
    }
    public void insertNode(TreeNode x) {
        if (x.value < this.value) {
            if (this.left == null) {
                this.left = new TreeNode(x.value);

            } else {
                this.left.insertNode(x);
            }

        }else {
            if (this.right == null){
                this.right = new TreeNode(x.value);

            }else  {
                this.right.insertNode(x);
            }
        }
    }
    public void insert(int value){
        if (value < this.value){
            if (this.left == null){
                this.left = new TreeNode(value);
            }else  {
                this.left.insert(value);
            }
        }else{
            if (this.right == null){
                this.right = new TreeNode(value);

            }else  {
                this.right.insert(value);

            }
        }
    }
    public void preOrder(){
        //XAB
        System.out.println(this.value);
        if (this.left !=null){
            left.preOrder();
        }
        if (this.right!=null){
            right.preOrder();
        }




//        System.out.println(this.value);//X
//        this.left.preOrder();//A
//        this.right.preOrder();//B
//        System.out.println(this.value);
//        System.out.println(this.left.value);
//        System.out.println(this.right.value);
    }
    public void inOrder(){
        //AXB

        if (this.left !=null){
            left.preOrder();
        }
        System.out.println(this.value);
        if (this.right!=null){
            right.preOrder();
        }
//        this.left.inOrder();//A
//        System.out.println(this.value);//X
//        this.right.inOrder();//B
    }
    public void postOrder(){
        //ABX
        if (this.left !=null){
            left.preOrder();
        }
        if (this.right!=null){
            right.preOrder();
        }
        System.out.println(this.value);
//        this.left.postOrder();//A
//        this.right.postOrder();//B
//        System.out.println(this.value);//X
    }
}

