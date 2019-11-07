package Kampus;

public class StackInt {
    int data[];
    int top;

    public StackInt(int jumlah) {
        data = new int[jumlah];
        this.top = -1;
    }

    public void push(int input){
        if (top > data.length-1){
            top++;
            data[top]= input;
        }
    }
    public int pop(){
        if (top <0){
            System.out.println("STACK KOSONG SILAKAN ISI");
        }
        else {
            int temp = data[top--];
            return  temp;
        }
        return 0;
    }
}
