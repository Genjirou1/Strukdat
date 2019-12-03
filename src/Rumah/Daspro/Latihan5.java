package Rumah.Daspro;

public class Latihan5 {
    public static void main(String[] args) {
    countdown(100);
    }
    public static  void countdown(int N){
        for (int i = N+1; i >0 ; i--) {
            System.out.println(N--);
        }
        System.out.println("Roket Meluncur!!!");
    }
}
