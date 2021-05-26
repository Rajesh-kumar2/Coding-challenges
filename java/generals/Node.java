package generals;

public class Node {
    Node next;
    int data;
    public Node(int data) {
        this.data = data;
    }
}
class LinkedList {
    Node head;
    public void append(int data){
        if(head == null) {
            head = new Node(data); return; }
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = new Node(data);
    }
    public void prepend(int data) {
        Node newHead = new Node(data);
        newHead.next = head;
        head = newHead;
    }
    public void deleteWithValue(int data){
        if(head == null) return;
        if(head.data == data){ // if data to be deleted is head
            head = head.next;
            return;
        }
        Node current = head; //walk through the linkedList
        while(current.next !=null){
           if(current.next.data == data){
               current.next = current.next.next;
               return;
           }
           current = current.next;
        }
    }

    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.append(10);
        l.append(20);
        l.append(30);
        l.prepend(40);
        l.prepend(50);
        l.deleteWithValue(30);

    }

}