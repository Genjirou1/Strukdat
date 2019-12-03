package Rumah.Maba;

import java.util.Scanner;

public class BilanganPrima {
    public static void main(String[] args) {
        System.out.println("Masukkan Batas Bilangan Prima");
        int batas = new Scanner(System.in).nextInt();
        int i =2;
        System.out.print("Bilangan Prima dari 2 sampai "+batas+" :");
        while (i<batas){
            if (i%2 ==1){
                System.out.print(i+" ");
            }
            i++;
        }
    }
}
