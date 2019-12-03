package Rumah.Daspro;

public class Latihan4 {
    public static void main(String[] args) {
        lagu(7);
    }
    public static void lagu(int N) {
        for (int i = N-1; i >0 ; i--) {
            System.out.println("Anak Ayam Turun "+N+", Mati Satu Tinggal "+--N);
        }
        System.out.println("Anak Ayam Turun "+N+", Mati Satu Tinggal Induknya");
    }
}
