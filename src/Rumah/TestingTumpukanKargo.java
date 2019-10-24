package Rumah;

public class TestingTumpukanKargo {
    public static void main(String[] args) {
        TumpukanKargo x = new TumpukanKargo(5);
        x.push("Kargo Cina");
        x.push("Kargo Amerika");
        x.push("Kargo Australia");
        x.push("Kargo Rusia");
        x.push("Kargo German");

        System.out.println("================");
        x.print();
        System.out.println("================");
        System.out.println(x.pop());
        System.out.println("================");
        x.print();
    }
}
