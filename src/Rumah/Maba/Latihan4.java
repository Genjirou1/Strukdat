package Rumah.Maba;

public class Latihan4 {
    public static void main(String[] args) {
        int N = 5;
        int i =0;
        do {
            if (N<2){
                System.out.println("Anak Ayam Turun "+N+", Mati 1 tinggal Induknya ");
                N--;

            }else{
                System.out.println("Anak Ayam Turun "+N+", Mati 1 tinggal "+(--N));

            }
        }while (i<N);
    }
}
