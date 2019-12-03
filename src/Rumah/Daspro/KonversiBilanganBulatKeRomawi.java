package Rumah.Daspro;

import java.util.Scanner;

public class KonversiBilanganBulatKeRomawi {

    public static void main(String[] args) {

            System.out.println ();
            System.out.print ("Masukkan Angka 1 - 5000 : ");
            int Number = new Scanner(System.in).nextInt();
           
            if (Number<1 || Number>5000){
                System.out.println ("Silahkan Masukkan Angka Dari 1-5000");
            }
           
            else{
                while (Number>=1000){
                    System.out.print ("M");
                    Number = Number - 1000;
                }
                if (Number>=500){
                    if(Number>=900){
                        System.out.print ("CM");
                        Number = Number - 900;
                    }
                    else{
                        System.out.print ("D");
                        Number = Number - 500;
                    }
                }
                while(Number>=100){
                    if (Number>=400){
                        System.out.print ("CD");
                        Number = Number - 400;
                    }
                    else{
                        System.out.print ("C");
                        Number = Number - 100;
                    }
                }
                if (Number>=50){
                    if (Number>=90){
                        System.out.print ("XC");
                        Number = Number - 90;
                    }
                    else{
                        System.out.print ("L");
                        Number = Number - 50;
                    }
                }
                while(Number>=10){
                    if (Number>=40){
                        System.out.print("XL");
                        Number = Number - 40;
                    }
                    else{
                        System.out.print ("X");
                        Number = Number - 10;
                    }
                }
                if (Number >=5){
                    if (Number == 9){
                        System.out.print ("IX");
                        Number = Number - 9;
                    }
                    else
                        System.out.print ("V");
                        Number = Number - 5;
                }
            }
            while(Number>=1){
                if (Number == 4){
                    System.out.print ("IV");
                    Number = Number - 4;
                }
                else
                    System.out.print ("I");
                    Number = Number - 1;
            }
    }
}
           
        
            
        
    

