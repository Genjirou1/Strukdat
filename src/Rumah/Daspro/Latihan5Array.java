package Rumah.Daspro;

import java.util.Scanner;

public class Latihan5Array {
     public static int c,d;
    public static void main(String[] args) {
        int[][] angka1,angka2;
        Scanner scan = new Scanner(System.in);
        System.out.print(" Seberapa Besar Array yang dibuat? baris:");
        int input = scan.nextInt();
        System.out.print(" Seberapa Besar Array yang dibuat? Kolom:");
        int input2 = scan.nextInt();
        angka1 = new int[input][input2];
        angka2 = new int[input][input2];
        c= input;
        d= input2;
        for (int i = 0; i <angka1.length ; i++) {
            for (int j = 0; j <angka1[i].length ; j++) {
                System.out.printf("Array Angka1[%d][%d]:",i,j);
                angka1[i][j]= scan.nextInt();

            }
        }
        for (int i = 0; i <angka2.length ; i++) {
            for (int j = 0; j <angka2[i].length ; j++) {
                System.out.printf("Array Angka2[%d][%d]:",i,j);
                angka2[i][j]= scan.nextInt();
            }
        }
        perkalian(angka1,angka2);
        penjumlahan(angka1,angka2);
        pengurangan(angka1,angka2);
    }
    public static void penjumlahan(int[][]a,int[][]b){
        int jumlah[][] = new int[c][d];
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j <a[i].length ; j++) {
                jumlah[i][j]=(a[i][j]+b[i][j]);
                System.out.println(jumlah[i][j]);
            }
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
    }
    public static void pengurangan(int[][]a,int[][]b){
        int jumlah[][] = new int[c][d];
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");

        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j <a[i].length ; j++) {
                jumlah[i][j]=(a[i][j]-b[i][j]);
                System.out.println(jumlah[i][j]);
            }
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
    }
    public static void perkalian(int[][]a,int[][]b){
        int jumlah[][] = new int[c][d];
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j <a[i].length ; j++) {
                jumlah[i][j] =(a[i][j]*b[i][j]);
                System.out.println(jumlah[i][j]);
            }
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
    }
}
