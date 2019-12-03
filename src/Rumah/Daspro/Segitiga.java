package Rumah.Daspro;

import java.util.Scanner;

public class Segitiga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Program Membuat Segitiga");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.print("Masukkan Besar Segitiga:");
        printSegitiga(input.nextInt());

    }
    public static void printSegitiga(int N){
        for (int i = 0; i <=N ; i++) {
            for (int j = 0; j <i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
