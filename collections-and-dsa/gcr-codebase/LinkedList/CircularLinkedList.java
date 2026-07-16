class Node{

    int data;
    Node next;

    Node(int data){
        this.data = data;
        next = null;
    }
}

public class CircularLinkedList {

    public static void main(String[] args){

        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        first.next = second;
        second.next = third;
        third.next = first;

        Node temp = first;

        do{
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }while(temp != first);

        System.out.println("(Back to First)");
    }
}
