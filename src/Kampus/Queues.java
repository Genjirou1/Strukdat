package Kampus;

public class Queues {
    // QUEUE = First in First out
    // there is enqueue < Entering or inserting value into queue
    // there is dequeue < get out the first array number out of queue
    private int data[];
    private int tail;

    public Queues(int jumlah)
    {
        data = new int[jumlah];
        tail = -1;
    }

    public void enqueue(int nilai)
    {
        if( tail < data.length-1 ) {
            data[++tail] = nilai;
        }
    }

    public int dequeue() {
        int temp;
        if( tail >= 0 ) {
            temp = data[0];
            for (int i = 0; i <data.length-1 ; i++) {
                data[i]=data[++i];

            }
            tail--;
            return temp;
        }
        return 0;
    }

    public void print()
    {
        for (int i = 0; i <= data.length; i++) {
            System.out.print(data[i]+" ");
        }
        System.out.println();
    }

}
