package Rumah;

public class queueBrewing {
    //masukkan barang 1  dan barang 2 dan menjadi sebuah potion
    //dan sebuah potion tersebut menjadi splash potion

    private String data[];
    private int tail;

    public queueBrewing(int jumlah) {
        data = new String[jumlah];
        tail = -1;
    }

    public void enqueue(String nilai) {
        if (tail < data.length-1) {
            data[++tail] = nilai;
        }
    }

    public String dequeue() {

        if(tail >= 0) {
            //Ambil data index 0
            String temp = data[0];
            //Geser
            for (int i = 0; i < data.length-1; i++) {
                data[i] = data[i+1];
            }
            //kurangi tail
            tail--;
            return temp;
        }
        return null;
    }


    public void print() {
        for (int i = 0; i < data.length ; i++) {
            System.out.print(data[i] + " ");
        }
    }
    public String craft(String a , String b){
        String output;

        switch ((a+b).toLowerCase()){
            case "torpedopepsi":output = "gingerale";break;
            case "gingeralemesiu":output = "SplashGingerAle";break;
            default:output = "Resep Tidak ada";break;
        }
        return output;
    }

}
