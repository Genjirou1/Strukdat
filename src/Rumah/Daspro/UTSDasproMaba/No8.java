package Rumah.Daspro.UTSDasproMaba;

import java.util.Scanner;

public class No8 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Berapa Lama Anda Berkerja:");
        int jamkerja =a.nextInt();
        int upah,denda,gaji;

        if (jamkerja>=50 && jamkerja<=60){
            upah =5000;
            gaji = jamkerja*upah;
            System.out.println("Gaji Anda :Rp. "+gaji);
        }else if(jamkerja>60){
            upah=7500;
            gaji = jamkerja*upah;
            System.out.println("Gaji Anda :Rp. "+gaji);
        }else if(jamkerja<50){
            upah =5000;
            denda=2500;
            int kurang = jamkerja-50;
            gaji = (upah*jamkerja) - (denda*kurang);
            System.out.println("Gaji Anda :Rp. "+gaji);
        }
    }
}
