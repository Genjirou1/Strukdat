package Rumah.Daspro;

import java.util.Scanner;

public class ProgramBank {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int Saldo = 500000;
        int percobaan =0;
        while(percobaan<=3) {
            System.out.print("Menu ATM  \n1.Cek Saldo\n2.Simpan Saldo\n3.Ambil Uang \nPilih Menu:");
            int inputan = input.nextInt();
            switch (inputan){
                case 1:
                    System.out.print("Saldo Anda :"+Saldo);
                    return;
                case 2:
                    System.out.print("Masukkan Berapa Banyak yang akan Dimasukkan:");
                    int TambahSaldo= input.nextInt();
                    Saldo+=TambahSaldo;
                    System.out.println("Saldo Anda Sekarang :"+Saldo);
                    return;
                case 3:
                    System.out.print("Masukkan Berapa Banyak Uang yang Akan di ambil:");
                    int AmbilUang = input.nextInt();
                    Saldo-=AmbilUang;
                    System.out.println("Saldo Anda Sekarang : "+Saldo);
                    return;
                default:
                    System.out.println("Input Anda Salah Silahkan Coba Lagi "+percobaan);
                    break;
            }
            percobaan++;
        }

    }

}
