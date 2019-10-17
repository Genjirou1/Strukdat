package Kampus;

public class RecursiveExercise {
    public static void cetak(int i ){
        i--;
        if(i<=0){

        }
        else{
            cetak(i);
            System.out.println("salam");
        }

    }
    public static void main(String[] args) {
        cetak(0);

    }
}
