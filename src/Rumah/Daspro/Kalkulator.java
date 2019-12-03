package Rumah.Daspro;

import java.util.Scanner;


public class Kalkulator {
    public static void main(String[] args) {
        Start();
         }
    public static void Start(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Berapa kali Melakukan Perulangan:");
        int perulangan = input.nextInt();
        do {
            System.out.println("-------------------------------");
            System.out.print("Masukkan Angka 1:");
            int a = input.nextInt();
            System.out.print("Masukkan Angka 2:");
            int b = input.nextInt();
            System.out.println("-------------------------------");
            System.out.println("Operasi Aritmatika");
            System.out.println("1.Penjumlahan");
            System.out.println("2.Pengurangan");
            System.out.println("3.Perkalian");
            System.out.println("4.Pembagian");
            System.out.println("-------------------------------");
            System.out.print("Menu Pilihan:");
            int inputan = input.nextInt();

            switch (inputan){
                case 1:
                    System.out.println("Penjumlahan = "+a+"+"+b+" :"+(a+b));  break;
                case 2:
                    System.out.println("Pengurangan = "+a+"-"+b+" :"+(a-b));  break;
                case 3:
                    System.out.println("Perkalian = "+a+"*"+b+" :"+(a*b));  break;
                case 4:
                    System.out.println("Pembagian = "+a+"/"+b+" :"+(a/b));  break;
                default:
                    System.out.println("Inputan Salah Silahkan Coba lagi:");

            }
            perulangan--;
        }while (perulangan >0);
    }

}

