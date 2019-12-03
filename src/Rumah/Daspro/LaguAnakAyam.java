package Rumah.Daspro;

import java.util.Scanner;

public class LaguAnakAyam {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Berapa Kali Perulangan?:");
        int perulangan = a.nextInt();

        for (int i = perulangan; i >0 ; i++) {
            if (i==1) {
                System.out.println("Anak Ayam Turun "+(i)+", Mati satu tinggal Induknya");
                i-=2;

            }else {
                System.out.println("Anak Ayam Turun " + (i) + ", Mati satu tinggal " + --i);
                i--;
            }
        }


    }
}
