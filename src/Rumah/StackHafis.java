package Rumah;

public class StackHafis {

    private String[] stack;
    private int max;
    private int top;

    public StackHafis(int size) {
        max = size;
        stack = new String[max];
        top = -1;
    }

    public void push(String value) {
        stack[++top] = value;
    }

    public String pop() {
        return stack[top--];
    }

    public String peek() {
        return stack[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == max-1;
    }

    public static void main(String[] args) {
        StackHafis s = new StackHafis(5);

        // push data
        s.push("FISIKA");
        s.push("KIMIA");
        s.push("MATEMATIKA");
        s.peek();
        s.push("B.INDONESIA");
        s.push("BIOLOGI");
        s.isEmpty();
        s.isFull();
        s.pop();
        s.isFull();
    }
}
