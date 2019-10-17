package Kampus;

public class TestStackPersegi {
    public static void main(String[] args) {
        StackPersegi a = new StackPersegi(5);
        a.push(5);

        System.out.println(a.pop().luas());
    }

}

