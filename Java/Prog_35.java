import java.util.Scanner;

public class Prog_35 {
    static class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            prev = null;
            next = null;
        }
    }

    Node head;
    Node tail;


    Prog_35() {
        head = null;
        tail = null;
    }

    void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Prog_35 dll = new Prog_35();
        dll.insert(10);
        dll.insert(20);
        dll.insert(30);
        dll.insert(40);
        dll.insert(50);
        dll.insert(60);
        dll.insert(70);
        for(int i = 0; i <= 10; i++){
            dll.insert(i + 10);
        }

        System.out.print("Doubly linked list: ");
        dll.print();
        int[] number = { 90, 10, 21, 70, 90, 40, 10 };
        for( int i = 0; i <= number.length - 1; i++ ){
            for( int j = 0; j <= number.length; j++ ){
                if(number[i] == number[j]){
                    System.out.println("Mach");
                    System.out.println( "I " + number[i]);
                    System.out.println( "J " + number[j]);
                    break;
                }
            }
        }
    }
}