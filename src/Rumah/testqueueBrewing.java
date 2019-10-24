package Rumah;

public class testqueueBrewing {
    public static void main(String[] args) {
        queueBrewing a = new queueBrewing(3);
        a.enqueue("Torpedo");
        a.enqueue("pepsi");
        a.enqueue("mesiu");

        String b = a.craft(a.dequeue(),a.dequeue());

        System.out.println(b);
        System.out.println(a.craft(b,a.dequeue()));
    }

}
