import java.util.Scanner;

class Queue {
    int q[], f = 0, r = 0, size;

    void insert(int n) {
        Scanner in = new Scanner(System.in);
        q = new int[10];
        for (int i = 0; i < n; i++) {
            System.out.print("\nEnter " + i + " element: ");
            int ele = in.nextInt();
            if (r + 1 > 10) {
                System.out.println("\nQueue is full \nLost Packet: " + ele);
                break;
            } else {
                q[r] = ele;
                r++;
            }
        }
    }

    void delete() {
        Scanner in = new Scanner(System.in);
        if (r == 0)
            System.out.print("\nQueue empty ");
        else {
            for (int i = f; i < r; i++) {
                System.out.print("\nLeaked Packet: " + q[i]);
                f++;
            }
        }
        System.out.println();
    }
}

public class pro7 {
    public static void main(String ar[]) {
        Queue q = new Queue();
        Scanner src = new Scanner(System.in);
        System.out.println("\nEnter the packets to be sent:");
        int size = src.nextInt();
        q.insert(size);
        q.delete();
    }
}
