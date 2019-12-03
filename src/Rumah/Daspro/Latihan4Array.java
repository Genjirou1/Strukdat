package Rumah.Daspro;

public class Latihan4Array {
    public static void main(String[] args) {
        double [][] nilaiDaspro = {{50,60,70,95},{70,75,80,90},{85,90,90,100},{65,75,90,80},{65,70,85,80}};
        String[] namaMahasiswa = {"Andi","Budi","Cintia","Doni","Emon"};
        double [] rata = new double[nilaiDaspro.length];
        for (int i = 0; i <nilaiDaspro.length ; i++) {
            for (int j = 0; j <nilaiDaspro[i].length ; j++) {
                rata[i]+=nilaiDaspro[i][j];
            }
            rata[i]/=4.00;
        }
        cetaknilai(namaMahasiswa,rata);

    }
    public static void cetaknilai(String[] a,double[]b){
        for (int i = 0; i <b.length ; i++) {
            if (b[i]>80){
                System.out.println(a[i]+": A");
            }else if(b[i]>70&&b[i]<80){
                System.out.println(a[i]+": B");
            }else if (b[i]>60&&b[i]<70){
                System.out.println(a[i]+": C");
            }else if (b[i]>50&&b[i]<60){
                System.out.println(a[i]+": D");
            }else{
                System.out.println(a[i]+": E");

            }
        }
    }
}
