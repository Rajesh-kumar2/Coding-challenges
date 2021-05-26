package generals;

public class Stack {
    private static class Node {
        private int data;
        private Node next;
        private Node(int data) {
            this.data = data;
        }
    }
    private Node top; // add and remove from top

    public boolean isEmpty(){
        return top ==null;
    }
    public int peek(){
        return top.data;
    }
    public void push(int data){
        Node node = new Node(data);
        node.next = top;
        top = node;
    }
    public int pop(){
        int data = top.data;
        top = top.next;
        return data;
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.peek());
        System.out.println(s.pop());
    }
}
