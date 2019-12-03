package Rumah.Daspro;

import java.util.ArrayList;

public class ArrayListLatihan {
    public static void main(String[] args) {
        ArrayList KarakterGames = new ArrayList();
        //add 5 karakter games
        KarakterGames.add("Steve");
        KarakterGames.add("Captain Price");
        KarakterGames.add("Soap MacTavish");
        KarakterGames.add("Simon Ghost Rilley");
        KarakterGames.add("Alex Mason");
        //output
        System.out.println(KarakterGames);
        //tambah di akhir array
        KarakterGames.add(5,"David Mason");
        //output
        System.out.println(KarakterGames);
        //tambahkan di indeks 2 dan 3
        KarakterGames.add(2,"Belov");
        KarakterGames.add(3,"Bruce Harris");
        //output
        System.out.println(KarakterGames);
        //ganti indeks 4 dengan karakter lain
        KarakterGames.set(4,"Carlos");
        //output
        System.out.println(KarakterGames);

    }
}
