package Rumah.Maba;

import java.util.Scanner;

public class LatihanPerulangan2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan Batas Angka:");
        int batas = scan.nextInt();
        int i = 1;
        System.out.print("Bilangan Genap dari 1 sampai "+batas+" :");
        while (i<batas){
            if (i%2 == 0){
                System.out.print(i+" ");
            }
            i++;
        }
        System.out.println();
    }
}
