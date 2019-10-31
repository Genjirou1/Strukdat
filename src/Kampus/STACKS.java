package Kampus;

import java.util.Stack;

public class STACKS {
    public static void main(String[] args) {
        Stack<Persegi> a = new Stack<Persegi>();
        a.push(new Persegi(5));
        a.push(new Persegi(5));
        a.push(new Persegi(5));

        System.out.println(a.peek().luas());
    }
}
