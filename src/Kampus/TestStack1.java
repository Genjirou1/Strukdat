package Kampus;

public class TestStack1 {
    public static void main(String[] args) {
//        Stacks a = new Stacks(5);
//        a.push(10);
//        a.push(10);
//        a.push(10);
//        a.push(10);
//
//
//        System.out.println(a.pop());
//        StackString a = new StackString();
//        a.push("1");
//        System.out.println(a.top);
        StackInt a = new StackInt(5);
        a.push(4);
        a.push(5);
        a.print();
        System.out.println(a.pop());
    }

}
