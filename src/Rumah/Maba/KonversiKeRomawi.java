package Rumah.Maba;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import java.util.Scanner;

public class KonversiKeRomawi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan Angka 1 - 5000");
        int angka = scan.nextInt();

        if (angka<1 || angka>5000){
            System.out.println("masukkan Angka 1 - 5000");
        }else{
            while (angka>0){
                if (angka>=1000){
                    angka-=1000;
                    System.out.print("M");
                }else if (angka>=900){
                    angka-=900;
                    System.out.print("CM");
                }else if (angka>=500){
                    angka-=500;
                    System.out.print("D");
                }else if (angka>=400){
                    angka-=400;
                    System.out.print("CD");
                }else if (angka>=100){
                    angka-=100;
                    System.out.print("C");
                }else if (angka>=90){
                    angka-=90;
                    System.out.print("XC");
                }else if (angka>=10){
                    angka-=10;
                    System.out.print("X");
                }else if (angka>=9){
                    angka-=9;
                    System.out.print("IX");
                }else if (angka>=5){
                    angka-=5;
                    System.out.print("V");
                }else if (angka>=4){
                    angka-=4;
                    System.out.print("IV");
                }else if (angka >=1){
                    angka--;
                    System.out.print("I");
                }
            }
        }
    }
}
