package Kampus;

import java.util.Scanner;

public class RecursiveExercise2 {
    // BUAT PROGRAM MENGGUNAKAN RECURSIVE TETAPI UBAH SALAM MENJADI MALAS
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Tuliskan Tulisan Yang ingin di Reverse:");
        String kata =a.nextLine().toLowerCase();
        System.out.println("Kata Reserved");
        cetak(kata);

    }
    public static String cetak (String text){
        int x = text.length();
        x--;
        String a="";
        if (x<0){

        }else{
            System.out.print(text.substring(x));
            cetak(text.substring(0,x));
        }
        return a;
    }
}
