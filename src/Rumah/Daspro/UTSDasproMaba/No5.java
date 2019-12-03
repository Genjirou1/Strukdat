package Rumah.Daspro.UTSDasproMaba;

import java.util.Scanner;

public class No5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int saldo = 500000;
        int pin = 123456;
        System.out.print("Masukkan Pin Anda");
        int inputPin = scan.nextInt();
        if (pin != inputPin){
            for (int i = 0; i <=3 ; i++) {
                System.out.print("Masukkan Pin Anda");
               inputPin = scan.nextInt();
                if (pin == inputPin){

                    System.out.println("Authentation Success");
                    System.out.printf("Pilih Option :\n1. Cek Saldo\n2. Simpan Uang\n3. Ambil Uang\n");
                    int pilihan= scan.nextInt();
                    switch (pilihan){
                        case 1:
                            System.out.println("Saldo Saat ini: "+saldo);break;
                        case 2:
                            System.out.print("Tuliskan Berapa Banyak Simpan Uang:");
                            int inputSaldo= scan.nextInt();
                            saldo+=inputSaldo;
                            System.out.println("Saldo Sekarang: "+ saldo); break;
                        case 3:
                            System.out.print("Berapa Banyak Ambil Uang :");
                            int ambilSaldo= scan.nextInt();
                            saldo-=ambilSaldo;
                            System.out.println("Saldo Sekarang: "+ saldo); break;
                        default:
                            System.out.println("Input Salah Silahkan Jalankan Ulang "); break;
                    }
                    break;
                }else{

                }
            }

        }else {
            System.out.println("Authentation Success");
            System.out.printf("Pilih Option :\n1. Cek Saldo\n2. Simpan Uang\n3. Ambil Uang\n");
            int pilihan= scan.nextInt();
            switch (pilihan){
                case 1:
                    System.out.println("Saldo Saat ini: "+saldo);break;
                case 2:
                    System.out.print("Tuliskan Berapa Banyak Simpan Uang:");
                    int inputSaldo= scan.nextInt();
                    saldo+=inputSaldo;
                    System.out.println("Saldo Sekarang: "+ saldo); break;
                case 3:
                    System.out.print("Berapa Banyak Ambil Uang :");
                    int ambilSaldo= scan.nextInt();
                    saldo-=ambilSaldo;
                    System.out.println("Saldo Sekarang: "+ saldo); break;
                default:
                    System.out.println("Input Salah Silahkan Jalankan Ulang "); break;
            }



        }
    }
}
