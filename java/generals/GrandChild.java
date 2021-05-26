package generals;

public class GrandChild extends Child {
    int id;

    {
        System.out.println("Initaialize block");
    }

    public GrandChild() {
        this(10);
        System.out.println("Grandchild default constructor");
    }

    public GrandChild(int id) {
        super(20);
        this.id = id;
        System.out.println("Grandchild parameterized constructor " + id);
    }

   // @Override
    public void childMethod(){
        //super.childMethod();
        System.out.println("Grandchild -> child -> method");
    }

    public void m1(int num){
        System.out.println(num);
    }
    public int m1(float num){
        System.out.println(num);
        return 0;
    }

    public static void main(String[] args) {
       // generals.Parent p = new generals.GrandChild();
       // p.parentMethod();
        Child c = new GrandChild();
        c.parentMethod();
        c.childMethod();
        /*generals.GrandChild g = new generals.GrandChild();
        g.parentMethod();
        g.childMethod();
        g.m1(10.0f);*/

        //generals.Parent p1 = new generals.GrandChild(10);

    }
}
