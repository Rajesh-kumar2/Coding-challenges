package generals;

public class Queue {
    private static class Node {
        private int data;
        private Node next;
        private Node(int data) {
            this.data = data;
        }
    }
    private Node head; // remove from head
    private Node tail; // add things here

    public boolean isEmpty(){
        return head == null;
    }
    public int peek() {
        return head.data;
    }
    public void add(int data){
        Node node = new Node(data);
        if(tail !=null){
            tail.next = node;
        }
        tail = node;
        if(head==null){
            head = node;
        }

    }
    public int remove(){
        int data = head.data;
        head = head.next;
        if(head==null){
            tail = null;
        }
        return data;
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(10);
        q.add(20);
        q.add(30);
        System.out.println(q.peek());
        System.out.println(q.remove());
    }
}
