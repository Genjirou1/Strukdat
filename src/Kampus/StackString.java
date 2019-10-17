package Kampus;

public class StackString {
    String data[];
    int top;
    String temp;

    public void push(String x){
        if(top>=0){
            data[++top] = x;
        }
    }
    public  String pop (){
        if (top<0){
            temp = data[top--];
            return   temp;
        }
        return null;
    }

}
