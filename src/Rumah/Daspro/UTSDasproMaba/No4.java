package Rumah.Daspro.UTSDasproMaba;

import java.util.Scanner;

public class No4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int saldo = 500000;
        int pin = 123456;
        System.out.print("Masukkan Pin Anda");
        int inputPin = scan.nextInt();
        if (pin != inputPin){
            for (int i = 0; i <=3 ; i++) {
                if (pin == inputPin){
                    System.out.println("Authentation Success");
                    break;
                }
            }

        }else {
            System.out.println("Authentation Success");
            System.out.println("Saldo Saat ini: "+saldo);
            System.out.print("Tuliskan Berapa Banyak Simpan Uang:");
            int inputSaldo= scan.nextInt();
            saldo+=inputSaldo;
            System.out.println("Saldo Sekarang: "+ saldo
            );
        }
    }
}
