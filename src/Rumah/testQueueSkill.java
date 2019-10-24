package Rumah;

public class testQueueSkill {
    public static void main(String[] args) {
        queueSkill a = new queueSkill(3);

        a.enqueue("moonslash");
        a.enqueue("forwardthrust");
        a.enqueue("moonblessings");

        String b = a.cast(a.dequeue(),a.dequeue());
        System.out.println(b);
        System.out.println(a.cast(b,a.dequeue()));
    }
}
