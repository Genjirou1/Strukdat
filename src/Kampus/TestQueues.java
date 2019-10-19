package Kampus;

import java.util.Queue;

public class TestQueues {
    public static void main(String[] args) {
        Queues a = new Queues(5);
        a.enqueue(10);
        a.enqueue(5);
        a.enqueue(2);
        a.enqueue(6);
        a.enqueue(9);

        System.out.println(a.dequeue());
        a.print();


    }
}
