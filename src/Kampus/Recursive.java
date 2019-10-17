package Kampus;

public class Recursive {
    // this is Week 2
    public static double luas (double p, double l){
        return p*l;
    }

    public static void main(String[] args) {
        System.out.println("luas = "+luas(10,8));
        int x  = 0;
        System.out.println(contoh(x));

    }
public static double contoh (int x){
        x++;
    if (x>=10){
        contoh(x);
    }
    else{
        return x;
    }
return x;

}
}
