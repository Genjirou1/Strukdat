package Rumah;

public class queueSkill {

    private String data[];
    private int tail;

    public queueSkill(int jumlah) {
        data = new String[jumlah];
        tail = -1;
    }

    public void enqueue(String Skill) {
        if (tail < data.length-1) {
            data[++tail] = Skill;
        }
    }

    public String dequeue() {

        if(tail >= 0) {

            String temp = data[0];

            for (int i = 0; i < data.length-1; i++) {
                data[i] = data[i+1];
            }

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
    public String cast (String a,String b){
        String output;
        switch ((a+b).toLowerCase()){
            case "moonslashforwardthrust":output = "moonthrust";break;
            case "moonthrustmoonblessings":output = "moonlord";break;
            default:output = "Combo Tidak ada";break;
        }
        return output;
    }

}
