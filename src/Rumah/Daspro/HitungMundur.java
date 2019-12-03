package Rumah.Daspro;

import java.util.Scanner;

public class HitungMundur {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int hitungmundur = 100;

        for (int i = hitungmundur; i >= 0; i--) {
            if (i == 0) {
                System.out.println(i+" Mission: Lets go to Moon.....\n ");
                System.out.println("Roket Telah Meluncur!");
            } else {
                System.out.println(i);
            }
        }
    }
}
