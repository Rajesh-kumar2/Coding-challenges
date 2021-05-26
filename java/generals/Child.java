package generals;

public class Child extends Parent{
    int id;

    public Child() {
        super(30);
        System.out.println("generals.Child default constructor");
    }

    public Child(int id) {
        this();
        this.id = id;
        System.out.println("generals.Child parameterized constructor " + id);
    }

    @Override
    public void parentMethod(){
        System.out.println("parent - >child -> method");
    }
    public void childMethod(){
        System.out.println("child -> method");
    }
}
