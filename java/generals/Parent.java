package generals;

public class Parent {
    int id;

    public Parent() {
        System.out.println("parent default constructor");
    }

    public Parent(int id) {
        this();
        this.id = id;
        System.out.println("parent parameterized constructor " + id);
    }

    public void parentMethod(){
        System.out.println("parent -> method");
    }
}
