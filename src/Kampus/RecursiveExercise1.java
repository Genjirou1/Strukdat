package Kampus;

public class RecursiveExercise1 {
    public static void main(String[] args) {
        cetak("Halo");
    }
    public static String cetak(String text) {
        int x = text.length();
        x--;
        if (x<0){
            return text;
        }else{
            System.out.println(text.substring(0,x+1));
            cetak(text.substring(0,x));
        }


        return text;
    }
}
