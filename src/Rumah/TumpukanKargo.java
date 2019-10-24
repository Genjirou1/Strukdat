package Rumah;

public class TumpukanKargo {
    private String Kargo[];
    private int top;

    public TumpukanKargo(int jumlah)
    {
        Kargo = new String[jumlah];
        top = -1;
    }

    public void push(String nama)
    {
        if( top < Kargo.length-1 ) {
            Kargo[++top] = nama;
        }
    }

    public String pop() {
        if( top >= 0 ) {
            String temp = Kargo[top--];
            return temp;
        }
        return null;
    }

    public void print()
    {
        for (int i = top; i >= 0; i--) {
            System.out.println(Kargo[i]);
        }
    }

}
